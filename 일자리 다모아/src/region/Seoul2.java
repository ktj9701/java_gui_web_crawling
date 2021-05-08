package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;

public class Seoul2 {
	public boolean flag;

	public void Seoul2City(ActionEvent e) {
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
			Albamoncrolling.area += ",I1800030";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%A1%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I1800010";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%A1%B6%F41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I1800020";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%A1%B6%F42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			Albamoncrolling.area += "I1800040";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%A1%B6%F4%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ���":
			Albamoncrolling.area += ",I1800070";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%C5%BF%A9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ�1��":
			Albamoncrolling.area += ",I1800050";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%C5%BF%A91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ�2��":
			Albamoncrolling.area += ",I1800060";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%C5%BF%A92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += "I1800100";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B8%B6%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ1��":
			Albamoncrolling.area += ",I1800080";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B8%B6%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ2��":
			Albamoncrolling.area += ",I1800090";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B8%B6%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1800130";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%AE%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I1800110";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%AE%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += "I1800120";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%AE%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",I1800160";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%E6%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I1800140";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%E6%C0%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I1800150";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%E6%C0%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += "I1800170";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BB%EF%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",I1800180";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BC%AE%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ĵ�":
			Albamoncrolling.area += ",I1800210";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BC%DB%C6%C4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ĵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I1800190";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BC%DB%C6%C41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I1800200";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BC%DB%C6%C42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",I1800220";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BD%C5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ݵ�":
			Albamoncrolling.area += ",I1800230";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BF%C0%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1800240";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BF%C0%B7%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ʵ�":
			Albamoncrolling.area += ",I1800380";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%A7%B7%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ʵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǵ�":
			Albamoncrolling.area += ",I1800320";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",I1800260";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			Albamoncrolling.area += ",I1800270";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���4��":
			Albamoncrolling.area += ",I1800280";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���6��":
			Albamoncrolling.area += ",I1800300";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C76%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���7��":
			Albamoncrolling.area += ",I1800310";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C77%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ǻ���":
			Albamoncrolling.area += ",I1800330";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C7%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��Ǻ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I1800340";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E5%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ����":
			Albamoncrolling.area += ",I1800370";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C7%B3%B3%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ��1��":
			Albamoncrolling.area += ",I1800350";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C7%B3%B3%B31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ��2��":
			Albamoncrolling.area += ",I1800360";
			AlbaHeavencrolling.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C7%B3%B3%B32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",I1900070";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			Albamoncrolling.area += ",I1900010";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			Albamoncrolling.area += ",I1900020";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��3��":
			Albamoncrolling.area += ",I1900030";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F13%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��4��":
			Albamoncrolling.area += ",I1900040";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F14%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��5��":
			Albamoncrolling.area += ",I1900050";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F15%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ���":
			Albamoncrolling.area += ",I1900150";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ�1��":
			Albamoncrolling.area += ",I1900080";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ�2��":
			Albamoncrolling.area += ",I1900090";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ�3��":
			Albamoncrolling.area += ",I1900100";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F93%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ�4��":
			Albamoncrolling.area += ",I1900110";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F94%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ�5��":
			Albamoncrolling.area += ",I1900120";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F95%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ�5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ�6��":
			Albamoncrolling.area += ",I1900130";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F96%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ�6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ�7��":
			Albamoncrolling.area += ",I1900140";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F97%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ�7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��������":
			Albamoncrolling.area += ",I1900230";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I1900160";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I1900170";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",I1900180";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A43%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",I1900190";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A44%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����6��":
			Albamoncrolling.area += ",I1900210";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A46%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����7��":
			Albamoncrolling.area += ",I1900220";
			AlbaHeavencrolling.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A47%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",I2000010";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿1��":
			Albamoncrolling.area += ",I2000020";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿2��":
			Albamoncrolling.area += ",I2000030";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿3��":
			Albamoncrolling.area += ",I2000040";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿4��":
			Albamoncrolling.area += ",I2000050";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿5��":
			Albamoncrolling.area += ",I2000060";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿6��":
			Albamoncrolling.area += ",I2000070";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�븲��":
			Albamoncrolling.area += ",I2000110";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%EB%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�븲��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�븲1��":
			Albamoncrolling.area += ",I2000080";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%EB%B8%B21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�븲1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�븲2��":
			Albamoncrolling.area += ",I2000090";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%EB%B8%B22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�븲2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�븲3��":
			Albamoncrolling.area += "I2000100";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%EB%B8%B23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�븲3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2000140";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B5%B5%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2000150";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",I2000160";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",I2000170";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			Albamoncrolling.area += ",I2000180";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������4��":
			Albamoncrolling.area += ",I2000190";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������5��":
			Albamoncrolling.area += ",I2000200";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������6��":
			Albamoncrolling.area += ",I2000210";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű浿":
			Albamoncrolling.area += ",I2000290";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű�1��":
			Albamoncrolling.area += ",I2000220";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű�3��":
			Albamoncrolling.area += ",I2000240";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű�4��":
			Albamoncrolling.area += ",I2000250";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E64%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű�5��":
			Albamoncrolling.area += ",I2000260";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E65%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű�5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű�6��":
			Albamoncrolling.area += ",I2000270";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E66%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű�6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű�7��":
			Albamoncrolling.area += ",I2000280";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E67%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű�7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",I2000300";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I2000310";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I2000320";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",I2000330";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",I2000340";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����5��":
			Albamoncrolling.area += ",I2000350";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����6��":
			Albamoncrolling.area += ",I2000360";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",I2000370";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ���":
			Albamoncrolling.area += ",I2000380";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%A9%C0%C7%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			Albamoncrolling.area += ",I2000390";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������1��":
			Albamoncrolling.area += ",I2000400";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������2��":
			Albamoncrolling.area += ",I2000410";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������3��":
			Albamoncrolling.area += ",I2000420";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������4��":
			Albamoncrolling.area += ",I2000430";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������5��":
			Albamoncrolling.area += ",I2000440";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��������5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������6��":
			Albamoncrolling.area += ",I2000450";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��������6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������7��":
			Albamoncrolling.area += ",I2000460";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF7%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��������7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������8��":
			Albamoncrolling.area += ",I2000470";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF8%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��������8��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����������":
			Albamoncrolling.area += ",I2000230";
			AlbaHeavencrolling.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2100010";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B0%A5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2100020";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B3%B2%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2100030";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B5%B5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2100040";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B5%BF%BA%F9%B0%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ڵ�":
			Albamoncrolling.area += ",I2100050";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B5%BF%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			Albamoncrolling.area += ",I2100060";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B9%AE%B9%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2100070";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BA%B8%B1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += "I2100080";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BB%EA%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			Albamoncrolling.area += ",I2100090";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BC%AD%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2100100";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BC%AD%BA%F9%B0%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű赿":
			Albamoncrolling.area += ",I2100110";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BD%C5%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ű赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			Albamoncrolling.area += ",I2100120";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BD%C5%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�빮��":
			Albamoncrolling.area += ",I2100130";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�빮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿1��":
			Albamoncrolling.area += ",I2100140";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿2��":
			Albamoncrolling.area += ",I2100150";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿3��":
			Albamoncrolling.area += ",I2100160";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿4��":
			Albamoncrolling.area += ",I2100170";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿5��":
			Albamoncrolling.area += ",I2100180";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿6��":
			Albamoncrolling.area += ",I2100190";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȿ��1��":
			Albamoncrolling.area += ",I2100200";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%F8%C8%BF%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��ȿ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȿ��2��":
			Albamoncrolling.area += ",I2100210";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%F8%C8%BF%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��ȿ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȿ��3��":
			Albamoncrolling.area += ",I2100220";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%F8%C8%BF%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��ȿ��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȿ��4��":
			Albamoncrolling.area += ",I2100230";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%F8%C8%BF%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��ȿ��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",I2100260";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I2100240";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C3%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I2100250";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C3%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���¿���":
			Albamoncrolling.area += ",I2100290";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C5%C2%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���¿���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���¿�1��":
			Albamoncrolling.area += ",I2100270";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C5%C2%BF%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���¿�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���¿�2��":
			Albamoncrolling.area += ",I2100280";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C5%C2%BF%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���¿�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ּ���":
			Albamoncrolling.area += ",I2100300";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C1%D6%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ּ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�ϵ�":
			Albamoncrolling.area += ",I2100310";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C3%BB%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�ĵ�1��":
			Albamoncrolling.area += ",I2100320";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C3%BB%C6%C4%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("û�ĵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�ĵ�2��":
			Albamoncrolling.area += ",I2100330";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C3%BB%C6%C4%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("û�ĵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�ĵ�3��":
			Albamoncrolling.area += ",I2100340";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C3%BB%C6%C4%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("û�ĵ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ѱ���1��":
			Albamoncrolling.area += ",I2100350";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C7%D1%B0%AD%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ѱ���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ѱ���2��":
			Albamoncrolling.area += ",I2100360";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C7%D1%B0%AD%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ѱ���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ѱ���3��":
			Albamoncrolling.area += ",I2100370";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C7%D1%B0%AD%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ѱ���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ѳ���":
			Albamoncrolling.area += ",I2100400";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C7%D1%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ѳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿâ��":
			Albamoncrolling.area += ",I2100410";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C8%BF%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿâ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ľϵ�":
			Albamoncrolling.area += ",I2100420";
			AlbaHeavencrolling.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C8%C4%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ľϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2200030";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B0%A5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I2200010";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B0%A5%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I2200020";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B0%A5%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",I2200040";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B1%B8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",I2200060";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B3%EC%B9%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2200070";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B4%EB%C1%B6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ұ���":
			Albamoncrolling.area += ",I2200110";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BA%D2%B1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ұ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ұ�1��":
			Albamoncrolling.area += ",I2200080";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BA%D2%B1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ұ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ұ�2��":
			Albamoncrolling.area += ",I2200090";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BA%D2%B1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ұ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2200120";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BC%F6%BB%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���򱸽Ż絿":
			Albamoncrolling.area += ",I2200150";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BD%C5%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���򱸽Ż絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���򱸽Ż�1��":
			Albamoncrolling.area += ",I2200130";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BD%C5%BB%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���򱸽Ż�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���򱸽Ż�2��":
			Albamoncrolling.area += ",I2200140";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BD%C5%BB%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���򱸽Ż�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",I2200180";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BF%AA%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",I2200230";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C0%C0%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I2200190";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C0%C0%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I2200200";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C0%C0%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",I2200210";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C0%C0%BE%CF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",I2200240";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C1%F5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2200250";
			AlbaHeavencrolling.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C1%F8%B0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȸ��":
			Albamoncrolling.area += ",I2300010";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%A1%C8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȸ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2300020";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%DF%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",I2300030";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%E6%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�赿":
			Albamoncrolling.area += ",I2300040";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",I2300050";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%F8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2300060";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%FC%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ö��":
			Albamoncrolling.area += ",I2300070";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%FC%C3%B6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ö��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ƶ�":
			Albamoncrolling.area += ",I2300080";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%FC%C8%C6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���Ƶ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2300090";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%B3%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",I2300100";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%B3%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���⵿":
			Albamoncrolling.area += ",I2300110";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%B8%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2300120";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%C3%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ǳ�":
			Albamoncrolling.area += ",I2300130";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%C7%B3%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ǳ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2300140";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B3%AB%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2300150";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B3%BB%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ڵ�":
			Albamoncrolling.area += ",I2300160";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B3%BB%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",I2300170";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B4%A9%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",I2300180";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B4%A9%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֵ�":
			Albamoncrolling.area += ",I2300190";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B4%E7%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ŵ�":
			Albamoncrolling.area += ",I2300200";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B5%B5%B7%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			Albamoncrolling.area += ",I2300210";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B5%B7%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2300220";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B5%BF%BC%FE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",I2300230";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B8%ED%B7%FB1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",I2300240";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B8%ED%B7%FB2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			Albamoncrolling.area += ",I2300250";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B8%ED%B7%FB3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���4��":
			Albamoncrolling.area += ",I2300260";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B8%ED%B7%FB4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",I2300270";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B9%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			Albamoncrolling.area += ",I2300280";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B9%AB%BE%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���͵�":
			Albamoncrolling.area += ",I2300290";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BA%C0%C0%CD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���͵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ξϵ�":
			Albamoncrolling.area += ",I2300300";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BA%CE%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ξϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�簣��":
			Albamoncrolling.area += ",I2300310";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BB%E7%B0%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�簣��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2300320";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BB%E7%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��û��":
			Albamoncrolling.area += ",I2300330";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BB%EF%C3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��û��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2300340";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%AD%B8%B0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2300350";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%BC%C1%BE%B7%CE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ұݵ�":
			Albamoncrolling.area += ",I2300360";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%D2%B0%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ұݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۿ���":
			Albamoncrolling.area += ",I2300370";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%DB%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ۿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2300380";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%DB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���۵�":
			Albamoncrolling.area += ",I2300390";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%F6%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",I2300420";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%FE%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I2300400";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%FE%C0%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I2300410";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%FE%C0%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű���":
			Albamoncrolling.area += ",I2300430";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BD%C5%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ź���1��":
			Albamoncrolling.area += ",I2300440";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BD%C5%B9%AE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ź���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ź���2��":
			Albamoncrolling.area += ",I2300450";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BD%C5%B9%AE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ź���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ���":
			Albamoncrolling.area += ",I2300460";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BD%C5%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȱ���":
			Albamoncrolling.area += "I2300470";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BE%C8%B1%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			Albamoncrolling.area += ",I2300480";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%AC%B0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2300490";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%AC%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2300500";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%B9%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",I2300510";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%C1%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ͷ浿":
			Albamoncrolling.area += ",I2300520";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%CD%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ͷ浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			Albamoncrolling.area += ",I2300530";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%EE%B4%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2300540";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%F8%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2300550";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%F8%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",I2300560";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%CC%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ͼ���":
			Albamoncrolling.area += ",I2300570";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%CD%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ͼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�λ絿":
			Albamoncrolling.area += ",I2300580";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%CE%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�λ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			Albamoncrolling.area += ",I2300590";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%CE%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			Albamoncrolling.area += ",I2300600";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%E5%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�絿":
			Albamoncrolling.area += ",I2300610";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2300620";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%FB%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I2300630";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I2300640";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",I2300650";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",I2300660";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����5��":
			Albamoncrolling.area += ",I2300670";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����6��":
			Albamoncrolling.area += ",I2300680";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			Albamoncrolling.area += ",I2300690";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%DF%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����":
			Albamoncrolling.area += ",I2300700";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â�ŵ�":
			Albamoncrolling.area += ",I2300740";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â�ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â��1��":
			Albamoncrolling.area += ",I2300710";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BD%C51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â��2��":
			Albamoncrolling.area += ",I2300720";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BD%C52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â��3��":
			Albamoncrolling.area += ",I2300730";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BD%C53%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�":
			Albamoncrolling.area += ",I2300750";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%BB%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			Albamoncrolling.area += ",I2300760";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%BB%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ü�ε�":
			Albamoncrolling.area += ",I2300770";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%BC%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ü�ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			Albamoncrolling.area += ",I2300780";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%E6%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			Albamoncrolling.area += ",I2300790";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C5%EB%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",I2300800";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C5%EB%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			Albamoncrolling.area += ",I2300810";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C6%C8%C6%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",I2300820";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			Albamoncrolling.area += ",I2300830";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C6%F2%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʿ":
			Albamoncrolling.area += ",I2300840";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C7%CA%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ʿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",I2300850";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C7%E0%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",I2300860";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C7%FD%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ����":
			Albamoncrolling.area += ",I2300870";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%AB%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȫ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ�ĵ�":
			Albamoncrolling.area += ",I2300880";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%AB%C6%C4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȫ�ĵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��":
			Albamoncrolling.area += ",I2300890";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ�ڵ�":
			Albamoncrolling.area += ",I2300900";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%BF%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ�ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ����":
			Albamoncrolling.area += ",I2300910";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%BF%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2300920";
			AlbaHeavencrolling.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%C6%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I2400010";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B1%A4%C8%F1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I2400020";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B1%A4%C8%F1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���빮��1��":
			Albamoncrolling.area += ",I2400030";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���빮��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���빮��2��":
			Albamoncrolling.area += ",I2400040";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���빮��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���빮��3��":
			Albamoncrolling.area += ",I2400050";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���빮��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���빮��4��":
			Albamoncrolling.area += ",I2400060";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���빮��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���빮��5��":
			Albamoncrolling.area += ",I2400070";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���빮��5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿1��":
			Albamoncrolling.area += ",I2400080";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���굿1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿2��":
			Albamoncrolling.area += ",I2400090";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���굿2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿3��":
			Albamoncrolling.area += ",I2400100";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���굿3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			Albamoncrolling.area += ",I2400110";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			Albamoncrolling.area += ",I2400120";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٵ�":
			Albamoncrolling.area += ",I2400130";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B4%D9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ٵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٻ굿":
			Albamoncrolling.area += ",I2400330";
			Mainpage.Filtering[Mainpage.index].setText("�ٻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",I2400370";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",I2400140";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B8%B8%B8%AE%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",I2400150";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B8%B8%B8%AE%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			Albamoncrolling.area += ",I2400160";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B8%ED%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			Albamoncrolling.area += ",I2400170";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B8%ED%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2400180";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B9%AB%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			Albamoncrolling.area += ",I2400190";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B9%AB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2400200";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B9%AC%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",I2400210";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B9%E6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",I2400220";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BA%C0%B7%A1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",I2400230";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BA%C0%B7%A1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			Albamoncrolling.area += ",I2400240";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�긲��":
			Albamoncrolling.area += ",I2400250";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BB%EA%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�긲��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﰢ��":
			Albamoncrolling.area += ",I2400260";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BB%EF%B0%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ﰢ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ҹ���":
			Albamoncrolling.area += ",I2400270";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%BC%D2%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ҹ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ұ���":
			Albamoncrolling.area += ",I2400280";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%D2%B0%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ұ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǥ��":
			Albamoncrolling.area += ",I2400290";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%F6%C7%A5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ǥ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",I2400300";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%F6%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",I2400310";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%F8%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ絿":
			Albamoncrolling.area += ",I2400380";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ�1��":
			Albamoncrolling.area += ",I2400320";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%B4%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ�5��":
			Albamoncrolling.area += ",I2400360";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%B4%E75%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ�5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ָ���":
			Albamoncrolling.area += ",I2400390";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BD%D6%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ָ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",I2400340";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2400400";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BF%B9%B0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			Albamoncrolling.area += ",I2400410";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BF%B9%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			Albamoncrolling.area += ",I2400420";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BF%C0%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",I2400430";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",I2400440";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			Albamoncrolling.area += ",I2400450";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������4��":
			Albamoncrolling.area += ",I2400460";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������5��":
			Albamoncrolling.area += ",I2400470";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������6��":
			Albamoncrolling.area += ",I2400480";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������7��":
			Albamoncrolling.area += ",I2400490";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE7%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ַ�1��":
			Albamoncrolling.area += ",I2400500";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%C7%C1%D6%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ַ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ַ�2��":
			Albamoncrolling.area += ",I2400510";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%C7%C1%D6%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ַ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",I2400520";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%CE%C7%F6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",I2400530";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%CE%C7%F6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I2400540";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%D4%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�屳��":
			Albamoncrolling.area += ",I2400550";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%E5%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�屳��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿1��":
			Albamoncrolling.area += ",I2400560";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%E5%C3%E6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���浿1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿2��":
			Albamoncrolling.area += ",I2400570";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%E5%C3%E6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���浿2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += "I2400580";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%FA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I2400590";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%FA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",I2400600";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֱ���":
			Albamoncrolling.area += ",I2400610";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C1%D6%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ֱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ڵ�":
			Albamoncrolling.area += ",I2400620";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C1%D6%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߸���":
			Albamoncrolling.area += ",I2400630";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߸���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			Albamoncrolling.area += ",I2400350";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʵ�":
			Albamoncrolling.area += ",I2400640";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ʵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�湫��1��":
			Albamoncrolling.area += ",I2400650";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�湫��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�湫��2��":
			Albamoncrolling.area += ",I2400660";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�湫��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�湫��3��":
			Albamoncrolling.area += ",I2400670";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�湫��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�湫��4��":
			Albamoncrolling.area += ",I2400680";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�湫��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�湫��5��":
			Albamoncrolling.area += ",I2400690";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�湫��5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",I2400700";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%C1%A4%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����1��":
			Albamoncrolling.area += ",I2400710";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F2%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����2��":
			Albamoncrolling.area += ",I2400720";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F2%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʵ�1��":
			Albamoncrolling.area += ",I2400730";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C7%CA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ʵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʵ�2��":
			Albamoncrolling.area += ",I2400740";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C7%CA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ʵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʵ�3��":
			Albamoncrolling.area += ",I2400750";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C7%CA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ʵ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ�е�":
			Albamoncrolling.area += ",I2400760";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%B2%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ�е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����1��":
			Albamoncrolling.area += ",I2400770";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%B8%C7%F6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����2��":
			Albamoncrolling.area += ",I2400780";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%B8%C7%F6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����3��":
			Albamoncrolling.area += ",I2400790";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%B8%C7%F6%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",I2400800";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%EF%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���쵿":
			Albamoncrolling.area += ",I2500040";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%C1%BF%EC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���쵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",I2500030";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%C1%BF%EC3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���캻��":
			Albamoncrolling.area += ",I2500010";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%C1%BF%EC%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���캻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",I2500130";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",I2500060";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3.8��":
			Albamoncrolling.area += ",I2500070";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F13.8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3.8��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���4��":
			Albamoncrolling.area += ",I2500080";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F14%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���5��":
			Albamoncrolling.area += ",I2500090";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F15B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���7��":
			Albamoncrolling.area += ",I2500110";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F17%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��񺻵�":
			Albamoncrolling.area += ",I2500050";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F1%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��񺻵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",I2500160";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B9%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			Albamoncrolling.area += ",I2500140";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B9%AC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			Albamoncrolling.area += ",I2500150";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B9%AC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",I2500190";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BB%F3%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",I2500170";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BB%F3%BA%C01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",I2500180";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BB%F3%BA%C02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ų���":
			Albamoncrolling.area += ",I2500220";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BD%C5%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ų���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ų�1��":
			Albamoncrolling.area += ",I2500200";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BD%C5%B3%BB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ų�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ų�2��":
			Albamoncrolling.area += ",I2500210";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BD%C5%B3%BB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ų�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",I2500260";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%C1%DF%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ1��":
			Albamoncrolling.area += ",I2500230";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%C1%DF%C8%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ2��":
			Albamoncrolling.area += ",I2500240";
			AlbaHeavencrolling.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%C1%DF%C8%AD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
