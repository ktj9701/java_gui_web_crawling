package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.crolling;
import Function.wewe;

public class Seoul2 {
	public boolean flag;

	public void Seoul2City(ActionEvent e) {
		if (Mainpage.index == 0) {
			crolling.area = "";
			wewe.area = "";
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
			crolling.area += ",I1800030";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%A1%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I1800010";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%A1%B6%F41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I1800020";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%A1%B6%F42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			crolling.area += "I1800040";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%A1%B6%F4%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ���":
			crolling.area += ",I1800070";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%C5%BF%A9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ�1��":
			crolling.area += ",I1800050";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%C5%BF%A91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ�2��":
			crolling.area += ",I1800060";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B0%C5%BF%A92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += "I1800100";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B8%B6%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ1��":
			crolling.area += ",I1800080";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B8%B6%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ2��":
			crolling.area += ",I1800090";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B8%B6%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I1800130";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%AE%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I1800110";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%AE%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += "I1800120";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%AE%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",I1800160";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%E6%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I1800140";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%E6%C0%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I1800150";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%B9%E6%C0%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += "I1800170";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BB%EF%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",I1800180";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BC%AE%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ĵ�":
			crolling.area += ",I1800210";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BC%DB%C6%C4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ĵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I1800190";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BC%DB%C6%C41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I1800200";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BC%DB%C6%C42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",I1800220";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BD%C5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ݵ�":
			crolling.area += ",I1800230";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BF%C0%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I1800240";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%BF%C0%B7%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ʵ�":
			crolling.area += ",I1800380";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%A7%B7%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ʵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǵ�":
			crolling.area += ",I1800320";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			crolling.area += ",I1800260";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			crolling.area += ",I1800270";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���4��":
			crolling.area += ",I1800280";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���6��":
			crolling.area += ",I1800300";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C76%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���7��":
			crolling.area += ",I1800310";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C77%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ǻ���":
			crolling.area += ",I1800330";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E1%BD%C7%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��Ǻ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I1800340";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C0%E5%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ����":
			crolling.area += ",I1800370";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C7%B3%B3%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ��1��":
			crolling.area += ",I1800350";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C7%B3%B3%B31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ��2��":
			crolling.area += ",I1800360";
			wewe.area += "02%7C%7C%BC%DB%C6%C4%B1%B8%7C%7C%C7%B3%B3%B32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",I1900070";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			crolling.area += ",I1900010";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			crolling.area += ",I1900020";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��3��":
			crolling.area += ",I1900030";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F13%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��4��":
			crolling.area += ",I1900040";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F14%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��5��":
			crolling.area += ",I1900050";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%B8%F15%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ���":
			crolling.area += ",I1900150";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ�1��":
			crolling.area += ",I1900080";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ�2��":
			crolling.area += ",I1900090";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ�3��":
			crolling.area += ",I1900100";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F93%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ�4��":
			crolling.area += ",I1900110";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F94%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ�5��":
			crolling.area += ",I1900120";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F95%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ�5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ�6��":
			crolling.area += ",I1900130";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F96%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ�6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ�7��":
			crolling.area += ",I1900140";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%BF%F97%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ�7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��������":
			crolling.area += ",I1900230";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I1900160";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I1900170";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",I1900180";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A43%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			crolling.area += ",I1900190";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A44%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����6��":
			crolling.area += ",I1900210";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A46%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����7��":
			crolling.area += ",I1900220";
			wewe.area += "02%7C%7C%BE%E7%C3%B5%B1%B8%7C%7C%BD%C5%C1%A47%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",I2000010";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿1��":
			crolling.area += ",I2000020";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿2��":
			crolling.area += ",I2000030";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿3��":
			crolling.area += ",I2000040";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿4��":
			crolling.area += ",I2000050";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿5��":
			crolling.area += ",I2000060";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿6��":
			crolling.area += ",I2000070";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%E7%BB%EA%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�븲��":
			crolling.area += ",I2000110";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%EB%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�븲��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�븲1��":
			crolling.area += ",I2000080";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%EB%B8%B21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�븲1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�븲2��":
			crolling.area += ",I2000090";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%EB%B8%B22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�븲2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�븲3��":
			crolling.area += "I2000100";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B4%EB%B8%B23%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�븲3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2000140";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B5%B5%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2000150";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			crolling.area += ",I2000160";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			crolling.area += ",I2000170";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			crolling.area += ",I2000180";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������4��":
			crolling.area += ",I2000190";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������5��":
			crolling.area += ",I2000200";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������6��":
			crolling.area += ",I2000210";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%B9%AE%B7%A1%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű浿":
			crolling.area += ",I2000290";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű�1��":
			crolling.area += ",I2000220";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű�3��":
			crolling.area += ",I2000240";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű�4��":
			crolling.area += ",I2000250";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E64%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű�5��":
			crolling.area += ",I2000260";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E65%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű�5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű�6��":
			crolling.area += ",I2000270";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E66%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű�6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű�7��":
			crolling.area += ",I2000280";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BD%C5%B1%E67%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű�7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2000300";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2000310";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2000320";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",I2000330";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			crolling.area += ",I2000340";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����5��":
			crolling.area += ",I2000350";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����6��":
			crolling.area += ",I2000360";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C6%F2%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",I2000370";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BE%E7%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ���":
			crolling.area += ",I2000380";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%A9%C0%C7%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			crolling.area += ",I2000390";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������1��":
			crolling.area += ",I2000400";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������2��":
			crolling.area += ",I2000410";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������3��":
			crolling.area += ",I2000420";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������4��":
			crolling.area += ",I2000430";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������5��":
			crolling.area += ",I2000440";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��������5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������6��":
			crolling.area += ",I2000450";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��������6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������7��":
			crolling.area += ",I2000460";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF7%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��������7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������8��":
			crolling.area += ",I2000470";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%B5%BF8%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��������8��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����������":
			crolling.area += ",I2000230";
			wewe.area += "02%7C%7C%BF%B5%B5%EE%C6%F7%B1%B8%7C%7C%BF%B5%B5%EE%C6%F7%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2100010";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B0%A5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2100020";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B3%B2%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2100030";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B5%B5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2100040";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B5%BF%BA%F9%B0%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ڵ�":
			crolling.area += ",I2100050";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B5%BF%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			crolling.area += ",I2100060";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%B9%AE%B9%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2100070";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BA%B8%B1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += "I2100080";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BB%EA%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			crolling.area += ",I2100090";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BC%AD%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2100100";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BC%AD%BA%F9%B0%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű赿":
			crolling.area += ",I2100110";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BD%C5%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ű赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",I2100120";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BD%C5%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�빮��":
			crolling.area += ",I2100130";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�빮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿1��":
			crolling.area += ",I2100140";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿2��":
			crolling.area += ",I2100150";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿3��":
			crolling.area += ",I2100160";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿4��":
			crolling.area += ",I2100170";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿5��":
			crolling.area += ",I2100180";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿6��":
			crolling.area += ",I2100190";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��굿6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȿ��1��":
			crolling.area += ",I2100200";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%F8%C8%BF%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��ȿ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȿ��2��":
			crolling.area += ",I2100210";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%F8%C8%BF%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��ȿ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȿ��3��":
			crolling.area += ",I2100220";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%F8%C8%BF%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��ȿ��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȿ��4��":
			crolling.area += ",I2100230";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%BF%F8%C8%BF%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��ȿ��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",I2100260";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2100240";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C3%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2100250";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C3%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���¿���":
			crolling.area += ",I2100290";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C5%C2%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���¿���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���¿�1��":
			crolling.area += ",I2100270";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C5%C2%BF%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���¿�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���¿�2��":
			crolling.area += ",I2100280";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C0%CC%C5%C2%BF%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���¿�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ּ���":
			crolling.area += ",I2100300";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C1%D6%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ּ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�ϵ�":
			crolling.area += ",I2100310";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C3%BB%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�ĵ�1��":
			crolling.area += ",I2100320";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C3%BB%C6%C4%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("û�ĵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�ĵ�2��":
			crolling.area += ",I2100330";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C3%BB%C6%C4%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("û�ĵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�ĵ�3��":
			crolling.area += ",I2100340";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C3%BB%C6%C4%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("û�ĵ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ѱ���1��":
			crolling.area += ",I2100350";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C7%D1%B0%AD%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ѱ���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ѱ���2��":
			crolling.area += ",I2100360";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C7%D1%B0%AD%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ѱ���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ѱ���3��":
			crolling.area += ",I2100370";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C7%D1%B0%AD%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ѱ���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ѳ���":
			crolling.area += ",I2100400";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C7%D1%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ѳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿâ��":
			crolling.area += ",I2100410";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C8%BF%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿâ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ľϵ�":
			crolling.area += ",I2100420";
			wewe.area += "02%7C%7C%BF%EB%BB%EA%B1%B8%7C%7C%C8%C4%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ľϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2200030";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B0%A5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2200010";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B0%A5%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2200020";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B0%A5%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",I2200040";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B1%B8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",I2200060";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B3%EC%B9%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2200070";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%B4%EB%C1%B6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ұ���":
			crolling.area += ",I2200110";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BA%D2%B1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ұ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ұ�1��":
			crolling.area += ",I2200080";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BA%D2%B1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ұ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ұ�2��":
			crolling.area += ",I2200090";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BA%D2%B1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ұ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2200120";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BC%F6%BB%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���򱸽Ż絿":
			crolling.area += ",I2200150";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BD%C5%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���򱸽Ż絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���򱸽Ż�1��":
			crolling.area += ",I2200130";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BD%C5%BB%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���򱸽Ż�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���򱸽Ż�2��":
			crolling.area += ",I2200140";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BD%C5%BB%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���򱸽Ż�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",I2200180";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%BF%AA%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",I2200230";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C0%C0%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2200190";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C0%C0%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2200200";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C0%C0%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",I2200210";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C0%C0%BE%CF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",I2200240";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C1%F5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2200250";
			wewe.area += "02%7C%7C%C0%BA%C6%F2%B1%B8%7C%7C%C1%F8%B0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȸ��":
			crolling.area += ",I2300010";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%A1%C8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȸ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300020";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%DF%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",I2300030";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%E6%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�赿":
			crolling.area += ",I2300040";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2300050";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%F8%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300060";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%FC%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ö��":
			crolling.area += ",I2300070";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%FC%C3%B6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ö��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ƶ�":
			crolling.area += ",I2300080";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B0%FC%C8%C6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���Ƶ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300090";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%B3%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",I2300100";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%B3%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���⵿":
			crolling.area += ",I2300110";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%B8%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300120";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%C3%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ǳ�":
			crolling.area += ",I2300130";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B1%C7%B3%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ǳ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300140";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B3%AB%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300150";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B3%BB%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ڵ�":
			crolling.area += ",I2300160";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B3%BB%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2300170";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B4%A9%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",I2300180";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B4%A9%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֵ�":
			crolling.area += ",I2300190";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B4%E7%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ŵ�":
			crolling.area += ",I2300200";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B5%B5%B7%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",I2300210";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B5%B7%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300220";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B5%BF%BC%FE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			crolling.area += ",I2300230";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B8%ED%B7%FB1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			crolling.area += ",I2300240";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B8%ED%B7%FB2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			crolling.area += ",I2300250";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B8%ED%B7%FB3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���4��":
			crolling.area += ",I2300260";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B8%ED%B7%FB4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2300270";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B9%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",I2300280";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%B9%AB%BE%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���͵�":
			crolling.area += ",I2300290";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BA%C0%C0%CD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���͵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ξϵ�":
			crolling.area += ",I2300300";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BA%CE%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ξϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�簣��":
			crolling.area += ",I2300310";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BB%E7%B0%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�簣��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300320";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BB%E7%C1%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��û��":
			crolling.area += ",I2300330";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BB%EF%C3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��û��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300340";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%AD%B8%B0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300350";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%BC%C1%BE%B7%CE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ұݵ�":
			crolling.area += ",I2300360";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%D2%B0%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ұݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۿ���":
			crolling.area += ",I2300370";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%DB%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ۿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300380";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%DB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���۵�":
			crolling.area += ",I2300390";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%F6%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",I2300420";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%FE%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2300400";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%FE%C0%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2300410";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BC%FE%C0%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű���":
			crolling.area += ",I2300430";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BD%C5%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ź���1��":
			crolling.area += ",I2300440";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BD%C5%B9%AE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ź���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ź���2��":
			crolling.area += ",I2300450";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BD%C5%B9%AE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�Ź���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ���":
			crolling.area += ",I2300460";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BD%C5%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȱ���":
			crolling.area += "I2300470";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BE%C8%B1%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",I2300480";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%AC%B0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300490";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%AC%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300500";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%B9%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",I2300510";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%C1%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ͷ浿":
			crolling.area += ",I2300520";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%CD%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ͷ浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",I2300530";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%EE%B4%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300540";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%F8%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300550";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%BF%F8%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",I2300560";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%CC%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ͼ���":
			crolling.area += ",I2300570";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%CD%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ͼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�λ絿":
			crolling.area += ",I2300580";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%CE%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�λ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",I2300590";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%CE%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			crolling.area += ",I2300600";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%E5%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�絿":
			crolling.area += ",I2300610";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300620";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C0%FB%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2300630";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2300640";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",I2300650";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			crolling.area += ",I2300660";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����5��":
			crolling.area += ",I2300670";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����6��":
			crolling.area += ",I2300680";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%BE%B7%CE6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",I2300690";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C1%DF%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����":
			crolling.area += ",I2300700";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â�ŵ�":
			crolling.area += ",I2300740";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â�ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â��1��":
			crolling.area += ",I2300710";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BD%C51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â��2��":
			crolling.area += ",I2300720";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BD%C52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â��3��":
			crolling.area += ",I2300730";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%A2%BD%C53%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�":
			crolling.area += ",I2300750";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%BB%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			crolling.area += ",I2300760";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%BB%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ü�ε�":
			crolling.area += ",I2300770";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%BC%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ü�ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			crolling.area += ",I2300780";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C3%E6%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",I2300790";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C5%EB%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",I2300800";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C5%EB%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",I2300810";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C6%C8%C6%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",I2300820";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",I2300830";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C6%F2%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʿ":
			crolling.area += ",I2300840";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C7%CA%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ʿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",I2300850";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C7%E0%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",I2300860";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C7%FD%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ����":
			crolling.area += ",I2300870";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%AB%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȫ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ�ĵ�":
			crolling.area += ",I2300880";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%AB%C6%C4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȫ�ĵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��":
			crolling.area += ",I2300890";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ�ڵ�":
			crolling.area += ",I2300900";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%BF%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ�ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ����":
			crolling.area += ",I2300910";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%BF%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300920";
			wewe.area += "02%7C%7C%C1%BE%B7%CE%B1%B8%7C%7C%C8%C6%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2400010";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B1%A4%C8%F1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2400020";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B1%A4%C8%F1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���빮��1��":
			crolling.area += ",I2400030";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���빮��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���빮��2��":
			crolling.area += ",I2400040";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���빮��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���빮��3��":
			crolling.area += ",I2400050";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���빮��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���빮��4��":
			crolling.area += ",I2400060";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���빮��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���빮��5��":
			crolling.area += ",I2400070";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%B4%EB%B9%AE%B7%CE5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���빮��5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿1��":
			crolling.area += ",I2400080";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���굿1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿2��":
			crolling.area += ",I2400090";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���굿2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿3��":
			crolling.area += ",I2400100";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���굿3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",I2400110";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",I2400120";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B3%B2%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٵ�":
			crolling.area += ",I2400130";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B4%D9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ٵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٻ굿":
			crolling.area += ",I2400330";
			Mainpage.Filtering[Mainpage.index].setText("�ٻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",I2400370";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			crolling.area += ",I2400140";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B8%B8%B8%AE%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			crolling.area += ",I2400150";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B8%B8%B8%AE%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			crolling.area += ",I2400160";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B8%ED%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			crolling.area += ",I2400170";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B8%ED%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2400180";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B9%AB%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",I2400190";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B9%AB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2400200";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B9%AC%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",I2400210";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%B9%E6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			crolling.area += ",I2400220";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BA%C0%B7%A1%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			crolling.area += ",I2400230";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BA%C0%B7%A1%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",I2400240";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BA%CF%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�긲��":
			crolling.area += ",I2400250";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BB%EA%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�긲��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﰢ��":
			crolling.area += ",I2400260";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BB%EF%B0%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ﰢ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ҹ���":
			crolling.area += ",I2400270";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%AD%BC%D2%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ҹ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ұ���":
			crolling.area += ",I2400280";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%D2%B0%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ұ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǥ��":
			crolling.area += ",I2400290";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%F6%C7%A5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ǥ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",I2400300";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%F6%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",I2400310";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BC%F8%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ絿":
			crolling.area += ",I2400380";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ�1��":
			crolling.area += ",I2400320";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%B4%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ�5��":
			crolling.area += ",I2400360";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BD%C5%B4%E75%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ�5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ָ���":
			crolling.area += ",I2400390";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BD%D6%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ָ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",I2400340";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2400400";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BF%B9%B0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			crolling.area += ",I2400410";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BF%B9%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			crolling.area += ",I2400420";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%BF%C0%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			crolling.area += ",I2400430";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			crolling.area += ",I2400440";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			crolling.area += ",I2400450";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������4��":
			crolling.area += ",I2400460";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������5��":
			crolling.area += ",I2400470";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������6��":
			crolling.area += ",I2400480";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE6%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������7��":
			crolling.area += ",I2400490";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%BB%C1%F6%B7%CE7%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ַ�1��":
			crolling.area += ",I2400500";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%C7%C1%D6%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ַ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ַ�2��":
			crolling.area += ",I2400510";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%C7%C1%D6%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���ַ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			crolling.area += ",I2400520";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%CE%C7%F6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			crolling.area += ",I2400530";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%CE%C7%F6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2400540";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%D4%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�屳��":
			crolling.area += ",I2400550";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%E5%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�屳��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿1��":
			crolling.area += ",I2400560";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%E5%C3%E6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���浿1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿2��":
			crolling.area += ",I2400570";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%E5%C3%E6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("���浿2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += "I2400580";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%FA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2400590";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C0%FA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2400600";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֱ���":
			crolling.area += ",I2400610";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C1%D6%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ֱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ڵ�":
			crolling.area += ",I2400620";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C1%D6%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߸���":
			crolling.area += ",I2400630";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C1%DF%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߸���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			crolling.area += ",I2400350";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʵ�":
			crolling.area += ",I2400640";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ʵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�湫��1��":
			crolling.area += ",I2400650";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�湫��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�湫��2��":
			crolling.area += ",I2400660";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�湫��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�湫��3��":
			crolling.area += ",I2400670";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�湫��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�湫��4��":
			crolling.area += ",I2400680";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�湫��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�湫��5��":
			crolling.area += ",I2400690";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%B9%AB%B7%CE5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�湫��5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			crolling.area += ",I2400700";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C3%E6%C1%A4%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����1��":
			crolling.area += ",I2400710";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F2%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����2��":
			crolling.area += ",I2400720";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C5%C2%C6%F2%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʵ�1��":
			crolling.area += ",I2400730";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C7%CA%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ʵ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʵ�2��":
			crolling.area += ",I2400740";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C7%CA%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ʵ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʵ�3��":
			crolling.area += ",I2400750";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C7%CA%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ʵ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ�е�":
			crolling.area += ",I2400760";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%B2%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ�е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����1��":
			crolling.area += ",I2400770";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%B8%C7%F6%B5%BF1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����2��":
			crolling.area += ",I2400780";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%B8%C7%F6%B5%BF2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����3��":
			crolling.area += ",I2400790";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%B8%C7%F6%B5%BF3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",I2400800";
			wewe.area += "02%7C%7C%C1%DF%B1%B8%7C%7C%C8%EF%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���쵿":
			crolling.area += ",I2500040";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%C1%BF%EC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���쵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",I2500030";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%C1%BF%EC3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���캻��":
			crolling.area += ",I2500010";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%C1%BF%EC%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���캻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",I2500130";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			crolling.area += ",I2500060";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3.8��":
			crolling.area += ",I2500070";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F13.8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3.8��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���4��":
			crolling.area += ",I2500080";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F14%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���5��":
			crolling.area += ",I2500090";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F15B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���7��":
			crolling.area += ",I2500110";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F17%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��񺻵�":
			crolling.area += ",I2500050";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B8%E9%B8%F1%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��񺻵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2500160";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B9%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			crolling.area += ",I2500140";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B9%AC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			crolling.area += ",I2500150";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%B9%AC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",I2500190";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BB%F3%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			crolling.area += ",I2500170";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BB%F3%BA%C01%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			crolling.area += ",I2500180";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BB%F3%BA%C02%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ų���":
			crolling.area += ",I2500220";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BD%C5%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ų���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ų�1��":
			crolling.area += ",I2500200";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BD%C5%B3%BB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ų�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ų�2��":
			crolling.area += ",I2500210";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%BD%C5%B3%BB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ų�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",I2500260";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%C1%DF%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ1��":
			crolling.area += ",I2500230";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%C1%DF%C8%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ2��":
			crolling.area += ",I2500240";
			wewe.area += "02%7C%7C%C1%DF%B6%FB%B1%B8%7C%7C%C1%DF%C8%AD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
