package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import Function.crolling;
import Function.wewe;
import GUI.Mainpage;

public class Gyeongbuk2 {
	public boolean flag;

	public void Gyeongbuk2City(ActionEvent e) {
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
		// ���ֱ�
		case "��õ��":
			crolling.area += ",D1000010";
			wewe.area += "054%7C%7C%BC%BA%C1%D6%B1%BA%7C%7C%B0%A1%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ���":
			crolling.area += ",D1000020";
			wewe.area += "054%7C%7C%BC%BA%C1%D6%B1%BA%7C%7C%B1%DD%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�밡��":
			crolling.area += ",D1000030";
			wewe.area += "054%7C%7C%BC%BA%C1%D6%B1%BA%7C%7C%B4%EB%B0%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�밡��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1000040";
			wewe.area += "054%7C%7C%BC%BA%C1%D6%B1%BA%7C%7C%BA%AE%C1%F8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1000050";
			wewe.area += "054%7C%7C%BC%BA%C1%D6%B1%BA%7C%7C%BC%B1%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1000060";
			wewe.area += "054%7C%7C%BC%BA%C1%D6%B1%BA%7C%7C%BC%BA%C1%D6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1000070";
			wewe.area += "054%7C%7C%BC%BA%C1%D6%B1%BA%7C%7C%BC%F6%B7%FB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϸ�":
			crolling.area += ",D1000080";
			wewe.area += "054%7C%7C%BC%BA%C1%D6%B1%BA%7C%7C%BF%EB%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׸�":
			crolling.area += ",D1000090";
			wewe.area += "054%7C%7C%BC%BA%C1%D6%B1%BA%7C%7C%BF%F9%C7%D7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���׸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1000100";
			wewe.area += "054%7C%7C%BC%BA%C1%D6%B1%BA%7C%7C%C3%CA%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// �ȵ���
		case "������":
			crolling.area += ",D1100010";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%B1%A4%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ":
			crolling.area += ",D1100020";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%B1%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȸ�":
			crolling.area += ",D1100030";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%B1%E6%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1100040";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%B3%B2%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",D1100050";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%B3%B2%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1100060";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%B3%B2%BC%B1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ĸ�":
			crolling.area += ",D1100070";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%B3%B2%C8%C4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ĸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",D1100080";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%B3%EB%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1100090";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%B3%EC%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",D1100100";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%B4%E7%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뼮��":
			crolling.area += ",D1100110";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%B4%EB%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뼮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",D1100120";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%B5%B5%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1100130";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%B5%BF%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",D1100140";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%B5%BF%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",D1100150";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%B8%ED%B7%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�񼺵�":
			crolling.area += ",D1100160";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%B8%F1%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�񼺵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",D1100170";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%B9%FD%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",D1100180";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%B9%FD%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϲ���":
			crolling.area += ",D1100190";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BA%CF%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ϲ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ĸ�":
			crolling.area += ",D1100200";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BA%CF%C8%C4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ĸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",D1100210";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BB%EF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ƶ�":
			crolling.area += ",D1100220";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BB%F3%BE%C6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��Ƶ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",D1100230";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BC%AD%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ĸ�":
			crolling.area += ",D1100240";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BC%AD%C8%C4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ĸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1100250";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BC%AE%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",D1100260";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BC%BA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",D1100270";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BC%DB%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1100280";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BC%DB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",D1100290";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BC%F6%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",D1100300";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BC%F6%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż���":
			crolling.area += ",D1100310";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BD%C5%BC%BC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ż���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�žȵ�":
			crolling.area += ",D1100320";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BD%C5%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�žȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȱ⵿":
			crolling.area += ",D1100330";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BE%C8%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȱ⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȸ���":
			crolling.area += ",D1100340";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BE%C8%B8%B7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȸ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",D1100350";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BE%C8%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȸ�":
			crolling.area += ",D1100360";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BF%B9%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",D1100370";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BF%C1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			crolling.area += ",D1100380";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BF%C1%BE%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1100390";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BF%C1%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ͷ��":
			crolling.area += ",D1100400";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BF%CD%B7%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ͷ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",D1100410";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BF%EB%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			crolling.area += ",D1100420";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BF%EE%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",D1100430";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%BF%EE%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1100440";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%C0%B2%BC%BC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",D1100450";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%C0%CC%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1100460";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%C0%CF%C1%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ӵ���":
			crolling.area += ",D1100470";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%C0%D3%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ӵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",D1100480";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%C0%D3%C7%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",D1100490";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%C1%A4%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",D1100500";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%C1%A4%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ����":
			crolling.area += ",D1100510";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%C3%B5%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",D1100520";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%C5%C2%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",D1100530";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%C6%F2%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ����":
			crolling.area += ",D1100540";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%C7%B3%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("ǳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳõ��":
			crolling.area += ",D1100550";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%C7%B3%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ǳõ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",D1100560";
			wewe.area += "054%7C%7C%BE%C8%B5%BF%BD%C3%7C%7C%C8%AD%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ������
		case "������":
			crolling.area += ",D1200010";
			wewe.area += "054%7C%7C%BF%B5%B4%F6%B1%BA%7C%7C%B0%AD%B1%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1200020";
			wewe.area += "054%7C%7C%BF%B5%B4%F6%B1%BA%7C%7C%B3%B2%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�޻��":
			crolling.area += ",D1200030";
			wewe.area += "054%7C%7C%BF%B5%B4%F6%B1%BA%7C%7C%B4%DE%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�޻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",D1200040";
			wewe.area += "054%7C%7C%BF%B5%B4%F6%B1%BA%7C%7C%BA%B4%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1200050";
			wewe.area += "054%7C%7C%BF%B5%B4%F6%B1%BA%7C%7C%BF%B5%B4%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ظ�":
			crolling.area += ",D1200060";
			wewe.area += "054%7C%7C%BF%B5%B4%F6%B1%BA%7C%7C%BF%B5%C7%D8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ظ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǰ��":
			crolling.area += ",D1200070";
			wewe.area += "054%7C%7C%BF%B5%B4%F6%B1%BA%7C%7C%C1%F6%C7%B0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ǰ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����":
			crolling.area += ",D1200080";
			wewe.area += "054%7C%7C%BF%B5%B4%F6%B1%BA%7C%7C%C3%A2%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("â����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",D1200090";
			wewe.area += "054%7C%7C%BF%B5%B4%F6%B1%BA%7C%7C%C3%E0%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ���籺
		case "������":
			crolling.area += ",D1300010";
			wewe.area += "054%7C%7C%BF%B5%BE%E7%B1%BA%7C%7C%BC%AE%BA%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",D1300020";
			wewe.area += "054%7C%7C%BF%B5%BE%E7%B1%BA%7C%7C%BC%F6%BA%F1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1300030";
			wewe.area += "054%7C%7C%BF%B5%BE%E7%B1%BA%7C%7C%BF%B5%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͽ���":
			crolling.area += ",D1300040";
			wewe.area += "054%7C%7C%BF%B5%BE%E7%B1%BA%7C%7C%C0%CF%BF%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ͽ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ծϸ�":
			crolling.area += ",D1300050";
			wewe.area += "054%7C%7C%BF%B5%BE%E7%B1%BA%7C%7C%C0%D4%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ծϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û���":
			crolling.area += ",D1300060";
			wewe.area += "054%7C%7C%BF%B5%BE%E7%B1%BA%7C%7C%C3%BB%B1%E2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ���ֽ�
		case "���ﵿ":
			crolling.area += ",D1400030";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%B0%A1%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",D1400010";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%B0%A1%C8%EF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",D1400020";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%B0%A1%C8%EF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1400040";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%B0%ED%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܻ��":
			crolling.area += ",D1400050";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%B4%DC%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ܻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1400060";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%B9%AE%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1400070";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%B9%AE%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1400080";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%BA%C0%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�μ���":
			crolling.area += ",D1400090";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%BA%CE%BC%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�μ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",D1400100";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%BB%F3%B8%C1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ٵ�":
			crolling.area += ",D1400110";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%BB%F3%C1%D9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ٵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",D1400120";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%BC%F8%C8%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1400130";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%BE%C6%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1400140";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%BE%C8%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֵ�":
			crolling.area += ",D1400170";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%BF%B5%C1%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",D1400150";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%BF%B5%C1%D61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",D1400160";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%BF%B5%C1%D62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̻��":
			crolling.area += ",D1400180";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%C0%CC%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",D1400190";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%C0%E5%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1400200";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%C0%FB%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",D1400210";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%C1%B6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���͵�":
			crolling.area += ",D1400220";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%C1%B6%BF%CD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���͵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����":
			crolling.area += ",D1400230";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%C3%A2%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1400240";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%C6%F2%C0%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ����":
			crolling.area += ",D1400250";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%C7%B3%B1%E2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("ǳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϸ���":
			crolling.area += ",D1400260";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%C7%CF%B8%C1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϸ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",D1400300";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%C8%DE%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ1��":
			crolling.area += ",D1400270";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%C8%DE%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ2��":
			crolling.area += ",D1400280";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%C8%DE%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ3��":
			crolling.area += ",D1400290";
			wewe.area += "054%7C%7C%BF%B5%C1%D6%BD%C3%7C%7C%C8%DE%C3%B53%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ��õ��
		case "����":
			crolling.area += ",D1500010";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%B0%ED%B0%E6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1500020";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%B0%FA%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1500030";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%B1%AB%BF%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",D1500040";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%B1%B3%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݳ뵿":
			crolling.area += ",D1500050";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%B1%DD%B3%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݳ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",D1500060";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%B1%DD%C8%A3%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1500070";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%B3%EC%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1500080";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%B4%EB%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",D1500090";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%B4%EB%C3%A2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1500100";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%B5%B5%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",D1500110";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1500120";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%B5%B5%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1500130";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%B8%C1%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ż굿":
			crolling.area += ",D1500140";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%B8%C5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ż굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1500150";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%B9%AE%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ܵ�":
			crolling.area += ",D1500160";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%B9%AE%BF%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ܵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",D1500170";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%B9%FC%BE%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",D1500180";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%BA%BB%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",D1500190";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͼȸ�":
			crolling.area += ",D1500200";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%BA%CF%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ͼȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",D1500210";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%BC%AD%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1500220";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%BC%BA%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű⵿":
			crolling.area += ",D1500230";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%BD%C5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ű⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ų��":
			crolling.area += ",D1500240";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%BD%C5%B3%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ų��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ְ赿":
			crolling.area += ",D1500250";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%BD%D6%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ְ赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߻絿":
			crolling.area += ",D1500260";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%BE%DF%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߻絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",D1500270";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%BE%F0%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",D1500280";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%BF%C0%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1500290";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%BF%C0%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ굿":
			crolling.area += ",D1500300";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%BF%CF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ӱ��":
			crolling.area += ",D1500310";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%C0%D3%B0%ED%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ӱ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ھ��":
			crolling.area += ",D1500320";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%C0%DA%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ھ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۻ굿":
			crolling.area += ",D1500330";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%C0%DB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ۻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1500340";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%C1%B6%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����":
			crolling.area += ",D1500350";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%C3%A2%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ä�ŵ�":
			crolling.area += ",D1500360";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%C3%A4%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ä�ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û���":
			crolling.area += ",D1500370";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%C3%BB%C5%EB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",D1500380";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%C8%AD%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�浿":
			crolling.area += ",D1500390";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%C8%AD%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�ϸ�":
			crolling.area += ",D1500400";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%C8%AD%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ���":
			crolling.area += ",D1500410";
			wewe.area += "054%7C%7C%BF%B5%C3%B5%BD%C3%7C%7C%C8%AD%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ��õ��
		case "��õ��":
			crolling.area += ",D1600010";
			wewe.area += "054%7C%7C%BF%B9%C3%B5%B1%BA%7C%7C%B0%A8%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1600020";
			wewe.area += "054%7C%7C%BF%B9%C3%B5%B1%BA%7C%7C%B0%B3%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1600030";
			wewe.area += "054%7C%7C%BF%B9%C3%B5%B1%BA%7C%7C%BA%B8%B9%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",D1600050";
			wewe.area += "054%7C%7C%BF%B9%C3%B5%B1%BA%7C%7C%BF%B9%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ø�":
			crolling.area += ",D1600060";
			wewe.area += "054%7C%7C%BF%B9%C3%B5%B1%BA%7C%7C%BF%EB%B1%C3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ø�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�빮��":
			crolling.area += ",D1600070";
			wewe.area += "054%7C%7C%BF%B9%C3%B5%B1%BA%7C%7C%BF%EB%B9%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�빮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",D1600080";
			wewe.area += "054%7C%7C%BF%B9%C3%B5%B1%BA%7C%7C%C0%AF%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ��":
			crolling.area += ",D1600110";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1600090";
			wewe.area += "054%7C%7C%BF%B9%C3%B5%B1%BA%7C%7C%C1%F6%BA%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ���":
			crolling.area += ",D1600100";
			wewe.area += "054%7C%7C%BF%B9%C3%B5%B1%BA%7C%7C%C7%B3%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ǳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ���":
			crolling.area += ",D1600120";
			wewe.area += "054%7C%7C%BF%B9%C3%B5%B1%BA%7C%7C%C7%CF%B8%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȣ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ�ڸ�":
			crolling.area += ",D1600040";
			wewe.area += "054%7C%7C%BF%B9%C3%B5%B1%BA%7C%7C%C8%A3%B8%ED%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȿ�ڸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// �︪��
		case "�ϸ�":
			crolling.area += ",D1700010";
			wewe.area += "054%7C%7C%BF%EF%B8%AA%B1%BA%7C%7C%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",D1700020";
			wewe.area += "054%7C%7C%BF%EF%B8%AA%B1%BA%7C%7C%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�︪��":
			crolling.area += ",D1700030";
			wewe.area += "054%7C%7C%BF%EF%B8%AA%B1%BA%7C%7C%BF%EF%B8%AA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�︪��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ������
		case "�ٳ���":
			crolling.area += ",D1800010";
			wewe.area += "054%7C%7C%BF%EF%C1%F8%B1%BA%7C%7C%B1%D9%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ٳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ��۸�":
			crolling.area += ",D1800040";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ��۸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�⼺��":
			crolling.area += ",D1800020";
			wewe.area += "054%7C%7C%BF%EF%C1%F8%B1%BA%7C%7C%B1%E2%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�⼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�������ϸ�":
			crolling.area += ",D1800030";
			wewe.area += "054%7C%7C%BF%EF%C1%F8%B1%BA%7C%7C%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�������ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1800050";
			wewe.area += "054%7C%7C%BF%EF%C1%F8%B1%BA%7C%7C%BF%C2%C1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1800060";
			wewe.area += "054%7C%7C%BF%EF%C1%F8%B1%BA%7C%7C%BF%EF%C1%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1800070";
			wewe.area += "054%7C%7C%BF%EF%C1%F8%B1%BA%7C%7C%BF%F8%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׺���":
			crolling.area += ",D1800080";
			wewe.area += "054%7C%7C%BF%EF%C1%F8%B1%BA%7C%7C%C1%D7%BA%AF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�׺���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1800090";
			wewe.area += "054%7C%7C%BF%EF%C1%F8%B1%BA%7C%7C%C6%F2%C7%D8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D1800100";
			wewe.area += "054%7C%7C%BF%EF%C1%F8%B1%BA%7C%7C%C8%C4%C6%F7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// �Ǽ���
		case "������":
			crolling.area += ",D1900010";
			wewe.area += "054%7C%7C%C0%C7%BC%BA%B1%BA%7C%7C%B0%A1%C0%BD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",D1900020";
			wewe.area += "054%7C%7C%C0%C7%BC%BA%B1%BA%7C%7C%B1%B8%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ���":
			crolling.area += ",D1900030";
			wewe.area += "054%7C%7C%C0%C7%BC%BA%B1%BA%7C%7C%B1%DD%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���θ�":
			crolling.area += ",D1900040";
			wewe.area += "054%7C%7C%C0%C7%BC%BA%B1%BA%7C%7C%B4%D9%C0%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܹи�":
			crolling.area += ",D1900050";
			wewe.area += "054%7C%7C%C0%C7%BC%BA%B1%BA%7C%7C%B4%DC%B9%D0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ܹи�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܺϸ�":
			crolling.area += ",D1900060";
			wewe.area += "054%7C%7C%C0%C7%BC%BA%B1%BA%7C%7C%B4%DC%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ܺϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			crolling.area += ",D1900070";
			wewe.area += "054%7C%7C%C0%C7%BC%BA%B1%BA%7C%7C%B4%DC%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",D1900080";
			wewe.area += "054%7C%7C%C0%C7%BC%BA%B1%BA%7C%7C%BA%C0%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȸ�":
			crolling.area += ",D1900090";
			wewe.area += "054%7C%7C%C0%C7%BC%BA%B1%BA%7C%7C%BA%F1%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",D1900100";
			wewe.area += "054%7C%7C%C0%C7%BC%BA%B1%BA%7C%7C%BB%E7%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",D1900110";
			wewe.area += "054%7C%7C%C0%C7%BC%BA%B1%BA%7C%7C%BD%C5%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ȱ��":
			crolling.area += ",D1900120";
			wewe.area += "054%7C%7C%C0%C7%BC%BA%B1%BA%7C%7C%BE%C8%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ȱ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ȼ��":
			crolling.area += ",D1900130";
			wewe.area += "054%7C%7C%C0%C7%BC%BA%B1%BA%7C%7C%BE%C8%BB%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�Ȼ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",D1900140";
			wewe.area += "054%7C%7C%C0%C7%BC%BA%B1%BA%7C%7C%BE%C8%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",D1900150";
			wewe.area += "054%7C%7C%C0%C7%BC%BA%B1%BA%7C%7C%BF%C1%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ǽ���":
			crolling.area += ",D1900160";
			wewe.area += "054%7C%7C%C0%C7%BC%BA%B1%BA%7C%7C%C0%C7%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�Ǽ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",D1900170";
			wewe.area += "054%7C%7C%C0%C7%BC%BA%B1%BA%7C%7C%C1%A1%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",D1900180";
			wewe.area += "054%7C%7C%C0%C7%BC%BA%B1%BA%7C%7C%C3%E1%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// û����
		case "������":
			crolling.area += ",D2000010";
			wewe.area += "054%7C%7C%C3%BB%B5%B5%B1%BA%7C%7C%B0%A2%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",D2000020";
			wewe.area += "054%7C%7C%C3%BB%B5%B5%B1%BA%7C%7C%B0%A2%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",D2000030";
			wewe.area += "054%7C%7C%C3%BB%B5%B5%B1%BA%7C%7C%B1%DD%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D2000040";
			wewe.area += "054%7C%7C%C3%BB%B5%B5%B1%BA%7C%7C%B8%C5%C0%FC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",D2000050";
			wewe.area += "054%7C%7C%C3%BB%B5%B5%B1%BA%7C%7C%BF%EE%B9%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̼���":
			crolling.area += ",D2000060";
			wewe.area += "054%7C%7C%C3%BB%B5%B5%B1%BA%7C%7C%C0%CC%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̼���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			crolling.area += ",D2000070";
			wewe.area += "054%7C%7C%C3%BB%B5%B5%B1%BA%7C%7C%C3%BB%B5%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ����":
			crolling.area += ",D2000080";
			wewe.area += "054%7C%7C%C3%BB%B5%B5%B1%BA%7C%7C%C7%B3%B0%A2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ǳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",D2000090";
			wewe.area += "054%7C%7C%C3%BB%B5%B5%B1%BA%7C%7C%C8%AD%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// û�۱�
		case "�γ���":
			crolling.area += ",D2100010";
			wewe.area += "054%7C%7C%C3%BB%BC%DB%B1%BA%7C%7C%BA%CE%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�γ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ε���":
			crolling.area += ",D2100020";
			wewe.area += "054%7C%7C%C3%BB%BC%DB%B1%BA%7C%7C%BA%CE%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ε���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȴ���":
			crolling.area += ",D2100030";
			wewe.area += "054%7C%7C%C3%BB%BC%DB%B1%BA%7C%7C%BE%C8%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ȴ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D2100040";
			wewe.area += "054%7C%7C%C3%BB%BC%DB%B1%BA%7C%7C%C1%F8%BA%B8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			crolling.area += ",D2100050";
			wewe.area += "054%7C%7C%C3%BB%BC%DB%B1%BA%7C%7C%C3%BB%BC%DB%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",D2100060";
			wewe.area += "054%7C%7C%C3%BB%BC%DB%B1%BA%7C%7C%C6%C4%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D2100070";
			wewe.area += "054%7C%7C%C3%BB%BC%DB%B1%BA%7C%7C%C7%F6%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D2100080";
			wewe.area += "054%7C%7C%C3%BB%BC%DB%B1%BA%7C%7C%C7%F6%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ĥ�
		case "�����":
			crolling.area += ",D2200010";
			wewe.area += "054%7C%7C%C4%A5%B0%EE%B1%BA%7C%7C%B0%A1%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",D2200020";
			wewe.area += "054%7C%7C%C4%A5%B0%EE%B1%BA%7C%7C%B1%E2%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",D2200030";
			wewe.area += "054%7C%7C%C4%A5%B0%EE%B1%BA%7C%7C%B5%BF%B8%ED%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ���":
			crolling.area += ",D2200040";
			wewe.area += "054%7C%7C%C4%A5%B0%EE%B1%BA%7C%7C%BA%CF%BB%EF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D2200050";
			wewe.area += "054%7C%7C%C4%A5%B0%EE%B1%BA%7C%7C%BC%AE%C0%FB%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",D2200060";
			wewe.area += "054%7C%7C%C4%A5%B0%EE%B1%BA%7C%7C%BE%E0%B8%F1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ְ���":
			crolling.area += ",D2200070";
			wewe.area += "054%7C%7C%C4%A5%B0%EE%B1%BA%7C%7C%BF%D6%B0%FC%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ְ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",D2200080";
			wewe.area += "054%7C%7C%C4%A5%B0%EE%B1%BA%7C%7C%C1%F6%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ���׽� ����
		case "������":
			crolling.area += ",D2300010";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%B1%AB%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			crolling.area += ",D2300020";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%B1%B8%B7%E6%C6%F7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뵵��":
			crolling.area += ",D2300030";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%B4%EB%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뵵��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��۸�":
			crolling.area += ",D2300050";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%B4%EB%BC%DB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��۸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ᵿ":
			crolling.area += ",D2300060";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%B4%EB%C0%E1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ᵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",D2300070";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%B5%BF%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ظ�":
			crolling.area += ",D2300080";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%B5%BF%C7%D8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ظ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󵵵�":
			crolling.area += ",D2300090";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%BB%F3%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�󵵵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۳���":
			crolling.area += ",D2300100";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%BC%DB%B3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�۳���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۵���":
			crolling.area += ",D2300110";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%BC%DB%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�۵���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D2300120";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D2300130";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%BF%AC%C0%CF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",D2300140";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%BF%C0%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̵�":
			crolling.area += ",D2300150";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�δ���":
			crolling.area += ",D2300160";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%C0%CE%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�δ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͽ���":
			crolling.area += ",D2300170";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%C0%CF%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ͽ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",D2300180";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%C0%E5%B1%E2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",D2300190";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%C0%E5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",D2300200";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%C1%F6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			crolling.area += ",D2300210";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%C3%BB%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ص���":
			crolling.area += ",D2300240";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%C7%D8%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ص���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ��":
			crolling.area += ",D2300250";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ�̰���":
			crolling.area += ",D2300040";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%C8%A3%B9%CC%B0%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȣ�̰���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ�ڵ�":
			crolling.area += ",D2300260";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%B3%B2%B1%B8%7C%7C%C8%BF%C0%DA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ�ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		// ���׽� �ϱ�
		case "����":
			crolling.area += ",D2400010";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%B1%E2%B0%E8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϸ�":
			crolling.area += ",D2400020";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%B1%E2%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",D2400030";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%B3%B2%BA%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			crolling.area += ",D2400040";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%B4%EB%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",D2400050";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%B4%EB%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",D2400060";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%B4%F6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D2400070";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%B4%F6%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",D2400080";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%B5%BF%BA%F31%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",D2400090";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%B5%BF%BA%F32%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			crolling.area += ",D2400110";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%B5%CE%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�淮��":
			crolling.area += ",D2400120";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%B5%E6%B7%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�淮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",D2400130";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%BB%F3%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۶��":
			crolling.area += ",D2400140";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%BC%DB%B6%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�۶��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű���":
			crolling.area += ",D2400150";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%BD%C5%B1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ű���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",D2400160";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",D2400170";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%BE%E7%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D2400180";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%BF%A9%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",D2400190";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%BF%A9%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",D2400200";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%BF%EB%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D2400210";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%BF%EC%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�强��":
			crolling.area += ",D2400220";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%C0%E5%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�强��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׵���":
			crolling.area += ",D2400250";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%C1%D7%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�׵���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",D2400260";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%C1%D7%C0%E5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�":
			crolling.area += ",D2400270";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%C1%DF%BE%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����":
			crolling.area += ",D2400280";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%C3%A2%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�ϸ�":
			crolling.area += ",D2400290";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%C3%BB%C7%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�л굿":
			crolling.area += ",D2400300";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%C7%D0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�л굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ᵿ":
			crolling.area += ",D2400310";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%C7%D0%C0%E1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ᵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ױ���":
			crolling.area += ",D2400320";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%C7%D7%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ױ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȯȣ��":
			crolling.area += ",D2400330";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%C8%AF%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȯȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",D2400340";
			wewe.area += "054%7C%7C%C6%F7%C7%D7%BD%C3+%BA%CF%B1%B8%7C%7C%C8%EF%C7%D8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}