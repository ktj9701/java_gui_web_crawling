import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

public class Gyeonggi {
	boolean flag;

	public void Gyeonggi(ActionEvent e) {
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
			crolling.area += ",I1800030";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϸ�":
			crolling.area += ",I1800010";
			Mainpage.Filtering[Mainpage.index].setText("�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",I1800020";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ǹ�":
			crolling.area += "I1800040";
			Mainpage.Filtering[Mainpage.index].setText("���Ǹ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I1800070";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",I1800050";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ŵ�":
			crolling.area += ",I1800060";
			Mainpage.Filtering[Mainpage.index].setText("���ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			crolling.area += "I1800100";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",I1800080";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",I1800090";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I1800130";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ɰ":
			crolling.area += ",I1800110";
			Mainpage.Filtering[Mainpage.index].setText("�ɰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += "I1800120";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ڵ�":
			crolling.area += ",I1800160";
			Mainpage.Filtering[Mainpage.index].setText("���ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			crolling.area += ",I1800140";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I1800150";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += "I1800170";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",I1800180";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I1800210";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ѵ�":
			crolling.area += ",I1800190";
			Mainpage.Filtering[Mainpage.index].setText("���ѵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��۵�":
			crolling.area += ",I1800200";
			Mainpage.Filtering[Mainpage.index].setText("��۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I1800220";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",I1800230";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I1800240";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I1800380";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ���":
			crolling.area += ",I1800320";
			Mainpage.Filtering[Mainpage.index].setText("�ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I1800260";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ݵ�":
			crolling.area += ",I1800270";
			Mainpage.Filtering[Mainpage.index].setText("���ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ε�":
			crolling.area += ",I1800280";
			Mainpage.Filtering[Mainpage.index].setText("��ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",I1800300";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ŵ�":
			crolling.area += ",I1800310";
			Mainpage.Filtering[Mainpage.index].setText("���ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",I1800330";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֱ���":
			crolling.area += ",I1800340";
			Mainpage.Filtering[Mainpage.index].setText("�ֱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ൿ":
			crolling.area += ",I1800370";
			Mainpage.Filtering[Mainpage.index].setText("���ൿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����":
			crolling.area += ",I1800350";
			Mainpage.Filtering[Mainpage.index].setText("â����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			crolling.area += ",I1800360";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			crolling.area += ",I1900070";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			crolling.area += ",I1900010";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			crolling.area += ",I1900020";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			crolling.area += ",I1900030";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֳ���":
			crolling.area += ",I1900040";
			Mainpage.Filtering[Mainpage.index].setText("���ֳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֵ�":
			crolling.area += ",I1900050";
			Mainpage.Filtering[Mainpage.index].setText("���ֵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֿܵ�":
			crolling.area += ",I1900150";
			Mainpage.Filtering[Mainpage.index].setText("���ֿܵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�⵿��":
			crolling.area += ",I1900080";
			Mainpage.Filtering[Mainpage.index].setText("�⵿��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",I1900090";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",I1900100";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",I1900110";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��1��":
			crolling.area += ",I1900120";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��2��":
			crolling.area += ",I1900130";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ�ڵ�":
			crolling.area += ",I1900140";
			Mainpage.Filtering[Mainpage.index].setText("ȿ�ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﵵ��":
			crolling.area += ",I1900230";
			Mainpage.Filtering[Mainpage.index].setText("�ﵵ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",I1900160";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",I1900170";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I1900180";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I1900190";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I1900210";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�鼮��":
			crolling.area += ",I1900220";
			Mainpage.Filtering[Mainpage.index].setText("�鼮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�鼮1��":
			crolling.area += ",I2000010";
			Mainpage.Filtering[Mainpage.index].setText("�鼮1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�鼮2��":
			crolling.area += ",I2000020";
			Mainpage.Filtering[Mainpage.index].setText("�鼮2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�縮����":
			crolling.area += ",I2000030";
			Mainpage.Filtering[Mainpage.index].setText("�縮����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ȳ��":
			crolling.area += ",I2000040";
			Mainpage.Filtering[Mainpage.index].setText("��Ȳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2000050";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2000060";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ļ絿":
			crolling.area += ",I2000070";
			Mainpage.Filtering[Mainpage.index].setText("�Ļ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׵�":
			crolling.area += ",I2000110";
			Mainpage.Filtering[Mainpage.index].setText("���׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2000080";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2000090";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���߻굿":
			crolling.area += "I2000100";
			Mainpage.Filtering[Mainpage.index].setText("���߻굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߻굿":
			crolling.area += ",I2000140";
			Mainpage.Filtering[Mainpage.index].setText("�߻굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2000150";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ��":
			crolling.area += ",I2000160";
			Mainpage.Filtering[Mainpage.index].setText("ǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ�굿":
			crolling.area += ",I2000170";
			Mainpage.Filtering[Mainpage.index].setText("ǳ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���µ�":
			crolling.area += ",I2000180";
			Mainpage.Filtering[Mainpage.index].setText("���µ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",I2000190";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",I2000200";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",I2000210";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2000290";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۻ굿":
			crolling.area += ",I2000220";
			Mainpage.Filtering[Mainpage.index].setText("�ۻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2000240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ굿":
			crolling.area += ",I2000250";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ�1��":
			crolling.area += ",I2000260";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ�2��":
			crolling.area += ",I2000270";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ�3��":
			crolling.area += ",I2000280";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֿ���":
			crolling.area += ",I2000300";
			Mainpage.Filtering[Mainpage.index].setText("�ֿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֿ�1��":
			crolling.area += ",I2000310";
			Mainpage.Filtering[Mainpage.index].setText("�ֿ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֿ�2��":
			crolling.area += ",I2000320";
			Mainpage.Filtering[Mainpage.index].setText("�ֿ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ź����":
			crolling.area += ",I2000330";
			Mainpage.Filtering[Mainpage.index].setText("ź����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2000340";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",I2000350";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2000360";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			crolling.area += ",I2000370";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2000380";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",I2000390";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�θ���":
			crolling.area += ",I2000400";
			Mainpage.Filtering[Mainpage.index].setText("�θ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2000410";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�־ϵ�":
			crolling.area += ",I2000420";
			Mainpage.Filtering[Mainpage.index].setText("�־ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�":
			crolling.area += ",I2000430";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",I2000440";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2000450";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2000460";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2000470";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",I2000230";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			crolling.area += ",I2100010";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����5��":
			crolling.area += ",I2100020";
			Mainpage.Filtering[Mainpage.index].setText("����5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����6��":
			crolling.area += ",I2100030";
			Mainpage.Filtering[Mainpage.index].setText("����6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����7��":
			crolling.area += ",I2100040";
			Mainpage.Filtering[Mainpage.index].setText("����7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��»絿":
			crolling.area += ",I2100050";
			Mainpage.Filtering[Mainpage.index].setText("��»絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",I2100060";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2100070";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += "I2100080";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",I2100090";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2100100";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ö�굿":
			crolling.area += ",I2100110";
			Mainpage.Filtering[Mainpage.index].setText("ö�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ö��1��":
			crolling.area += ",I2100120";
			Mainpage.Filtering[Mainpage.index].setText("ö��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ö��2��":
			crolling.area += ",I2100130";
			Mainpage.Filtering[Mainpage.index].setText("ö��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ö��3��":
			crolling.area += ",I2100140";
			Mainpage.Filtering[Mainpage.index].setText("ö��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ö��4��":
			crolling.area += ",I2100150";
			Mainpage.Filtering[Mainpage.index].setText("ö��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͼȵ�":
			crolling.area += ",I2100160";
			Mainpage.Filtering[Mainpage.index].setText("�Ͼȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͼ�1��":
			crolling.area += ",I2100170";
			Mainpage.Filtering[Mainpage.index].setText("�Ͼ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͼ�2��":
			crolling.area += ",I2100180";
			Mainpage.Filtering[Mainpage.index].setText("�Ͼ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͼ�3��":
			crolling.area += ",I2100190";
			Mainpage.Filtering[Mainpage.index].setText("�Ͼ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ͼ�4��":
			crolling.area += ",I2100200";
			Mainpage.Filtering[Mainpage.index].setText("�Ͼ�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			crolling.area += ",I2100210";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			crolling.area += ",I2100220";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2100230";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ѻ꼺��":
			crolling.area += ",I2100260";
			Mainpage.Filtering[Mainpage.index].setText("���ѻ꼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ô��":
			crolling.area += ",I2100240";
			Mainpage.Filtering[Mainpage.index].setText("��ô��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",I2100250";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2100290";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﵿ":
			crolling.area += ",I2100270";
			Mainpage.Filtering[Mainpage.index].setText("�ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2100280";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ַɵ�":
			crolling.area += ",I2100300";
			Mainpage.Filtering[Mainpage.index].setText("�ַɵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2100310";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2100320";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2100330";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߴ뵿":
			crolling.area += ",I2100340";
			Mainpage.Filtering[Mainpage.index].setText("�ߴ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2100350";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ʿ���":
			crolling.area += ",I2100360";
			Mainpage.Filtering[Mainpage.index].setText("�ʿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ź����":
			crolling.area += ",I2100370";
			Mainpage.Filtering[Mainpage.index].setText("ź����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2100400";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			crolling.area += ",I2100410";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����":
			crolling.area += ",I2100420";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ŵ�":
			crolling.area += ",I2200030";
			Mainpage.Filtering[Mainpage.index].setText("���ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2200010";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2200020";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2200040";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2200060";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��뵿":
			crolling.area += ",I2200070";
			Mainpage.Filtering[Mainpage.index].setText("��뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���õ�":
			crolling.area += ",I2200110";
			Mainpage.Filtering[Mainpage.index].setText("���õ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2200080";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2200090";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",I2200120";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",I2200150";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",I2200130";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2200140";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2200180";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2200230";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2200190";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ó���":
			crolling.area += ",I2200200";
			Mainpage.Filtering[Mainpage.index].setText("�ó���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2200210";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�絿":
			crolling.area += ",I2200240";
			Mainpage.Filtering[Mainpage.index].setText("�絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2200250";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��߹̵�":
			crolling.area += ",I2300010";
			Mainpage.Filtering[Mainpage.index].setText("��߹̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			crolling.area += ",I2300020";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�д뵿":
			crolling.area += ",I2300030";
			Mainpage.Filtering[Mainpage.index].setText("�д뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ":
			crolling.area += ",I2300040";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�꺻��":
			crolling.area += ",I2300050";
			Mainpage.Filtering[Mainpage.index].setText("�꺻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�꺻1��":
			crolling.area += ",I2300060";
			Mainpage.Filtering[Mainpage.index].setText("�꺻1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�꺻2��":
			crolling.area += ",I2300070";
			Mainpage.Filtering[Mainpage.index].setText("�꺻2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ӵ޵�":
			crolling.area += ",I2300080";
			Mainpage.Filtering[Mainpage.index].setText("�Ӵ޵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300090";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ÿ��ݵ�":
			crolling.area += ",I2300100";
			Mainpage.Filtering[Mainpage.index].setText("�����ÿ��ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�":
			crolling.area += ",I2300110";
			Mainpage.Filtering[Mainpage.index].setText("��õ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300120";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300130";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300140";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300150";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			crolling.area += ",I2300160";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",I2300170";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",I2300180";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϻ���":
			crolling.area += ",I2300190";
			Mainpage.Filtering[Mainpage.index].setText("�Ϻ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��쵿":
			crolling.area += ",I2300200";
			Mainpage.Filtering[Mainpage.index].setText("��쵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300210";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			crolling.area += ",I2300220";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300230";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��⵿":
			crolling.area += ",I2300240";
			Mainpage.Filtering[Mainpage.index].setText("��⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��⺻��":
			crolling.area += ",I2300250";
			Mainpage.Filtering[Mainpage.index].setText("��⺻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300260";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ����":
			crolling.area += ",I2300270";
			Mainpage.Filtering[Mainpage.index].setText("ǳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϼ���":
			crolling.area += ",I2300280";
			Mainpage.Filtering[Mainpage.index].setText("�ϼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",I2300290";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ":
			crolling.area += ",I2300300";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٻ굿":
			crolling.area += ",I2300310";
			Mainpage.Filtering[Mainpage.index].setText("�ٻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٻ�1��":
			crolling.area += ",I2300320";
			Mainpage.Filtering[Mainpage.index].setText("�ٻ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ٻ�2��":
			crolling.area += ",I2300330";
			Mainpage.Filtering[Mainpage.index].setText("�ٻ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2300340";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300350";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300360";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",I2300370";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300380";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300390";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300420";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300400";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ͺ���":
			crolling.area += ",I2300410";
			Mainpage.Filtering[Mainpage.index].setText("�ͺ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",I2300430";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",I2300440";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȸ�":
			crolling.area += ",I2300450";
			Mainpage.Filtering[Mainpage.index].setText("���ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ݵ�":
			crolling.area += ",I2300460";
			Mainpage.Filtering[Mainpage.index].setText("���ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += "I2300470";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300480";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300490";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�򳻵�":
			crolling.area += ",I2300500";
			Mainpage.Filtering[Mainpage.index].setText("�򳻵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ��":
			crolling.area += ",I2300510";
			Mainpage.Filtering[Mainpage.index].setText("ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",I2300520";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ɻ굿":
			crolling.area += ",I2300530";
			Mainpage.Filtering[Mainpage.index].setText("�ɻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",I2300540";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����õ��":
			crolling.area += ",I2300550";
			Mainpage.Filtering[Mainpage.index].setText("����õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",I2300560";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300570";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����ϵ�":
			crolling.area += ",I2300580";
			Mainpage.Filtering[Mainpage.index].setText("����ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",I2300590";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2300600";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2300610";
			Mainpage.Filtering[Mainpage.index].setText("�絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300620";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ҿ䵿":
			crolling.area += ",I2300630";
			Mainpage.Filtering[Mainpage.index].setText("�ҿ䵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۳���":
			crolling.area += ",I2300640";
			Mainpage.Filtering[Mainpage.index].setText("�۳���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",I2300650";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����õ�߾ӵ�":
			crolling.area += ",I2300660";
			Mainpage.Filtering[Mainpage.index].setText("����õ�߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ൿ":
			crolling.area += ",I2300670";
			Mainpage.Filtering[Mainpage.index].setText("���ൿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ž����":
			crolling.area += ",I2300680";
			Mainpage.Filtering[Mainpage.index].setText("ž����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ϻ��ϵ�":
			crolling.area += ",I2300690";
			Mainpage.Filtering[Mainpage.index].setText("�Ϻ��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",I2300700";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2300740";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			crolling.area += ",I2300710";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300720";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȵ�":
			crolling.area += ",I2300730";
			Mainpage.Filtering[Mainpage.index].setText("���ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2300750";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�ô��嵿":
			crolling.area += ",I2300760";
			Mainpage.Filtering[Mainpage.index].setText("��õ�ô��嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",I2300770";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ڵ�":
			crolling.area += ",I2300780";
			Mainpage.Filtering[Mainpage.index].setText("���ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2300790";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",I2300800";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			crolling.area += ",I2300810";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			crolling.area += ",I2300820";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��3��":
			crolling.area += ",I2300830";
			Mainpage.Filtering[Mainpage.index].setText("��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",I2300840";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�һ絿":
			crolling.area += ",I2300850";
			Mainpage.Filtering[Mainpage.index].setText("�һ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�һ纻��":
			crolling.area += ",I2300860";
			Mainpage.Filtering[Mainpage.index].setText("�һ纻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�һ纻3��":
			crolling.area += ",I2300870";
			Mainpage.Filtering[Mainpage.index].setText("�һ纻3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�ü۳���":
			crolling.area += ",I2300880";
			Mainpage.Filtering[Mainpage.index].setText("��õ�ü۳���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۳�1��":
			crolling.area += ",I2300890";
			Mainpage.Filtering[Mainpage.index].setText("�۳�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۳�2��":
			crolling.area += ",I2300900";
			Mainpage.Filtering[Mainpage.index].setText("�۳�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",I2300910";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ɰ":
			crolling.area += ",I2300920";
			Mainpage.Filtering[Mainpage.index].setText("�ɰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ɰ�1��":
			crolling.area += ",I2400010";
			Mainpage.Filtering[Mainpage.index].setText("�ɰ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ɰ�2��":
			crolling.area += ",I2400020";
			Mainpage.Filtering[Mainpage.index].setText("�ɰ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ɰ�3��":
			crolling.area += ",I2400030";
			Mainpage.Filtering[Mainpage.index].setText("�ɰ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ɰ��":
			crolling.area += ",I2400040";
			Mainpage.Filtering[Mainpage.index].setText("�ɰ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ɰ1��":
			crolling.area += ",I2400050";
			Mainpage.Filtering[Mainpage.index].setText("�ɰ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��뵿":
			crolling.area += ",I2400060";
			Mainpage.Filtering[Mainpage.index].setText("��뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���췯��":
			crolling.area += ",I2400070";
			Mainpage.Filtering[Mainpage.index].setText("���췯��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",I2400080";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2400090";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2400100";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",I2400110";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2400120";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�ÿ��浿":
			crolling.area += ",I2400130";
			Mainpage.Filtering[Mainpage.index].setText("��õ�ÿ��浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",I2400330";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2400370";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2400140";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2400150";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2400160";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2400170";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۵�":
			crolling.area += ",I2400180";
			Mainpage.Filtering[Mainpage.index].setText("�۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ�":
			crolling.area += ",I2400190";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			crolling.area += ",I2400200";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			crolling.area += ",I2400210";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��3��":
			crolling.area += ",I2400220";
			Mainpage.Filtering[Mainpage.index].setText("��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��4��":
			crolling.area += ",I2400230";
			Mainpage.Filtering[Mainpage.index].setText("��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",I2400240";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",I2400250";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2400260";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ñó���":
			crolling.area += ",I2400270";
			Mainpage.Filtering[Mainpage.index].setText("�����ñó���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ñݰ":
			crolling.area += ",I2400280";
			Mainpage.Filtering[Mainpage.index].setText("�����ñݰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ô��嵿":
			crolling.area += ",I2400290";
			Mainpage.Filtering[Mainpage.index].setText("�����ô��嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2400300";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2400310";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�д絿":
			crolling.area += ",I2400380";
			Mainpage.Filtering[Mainpage.index].setText("�д絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2400320";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2400360";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2400390";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2400340";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",I2400400";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2400410";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2400420";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2400430";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",I2400440";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ž��":
			crolling.area += ",I2400450";
			Mainpage.Filtering[Mainpage.index].setText("��ž��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ž1��":
			crolling.area += ",I2400460";
			Mainpage.Filtering[Mainpage.index].setText("��ž1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ž2��":
			crolling.area += ",I2400470";
			Mainpage.Filtering[Mainpage.index].setText("��ž2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ž3��":
			crolling.area += ",I2400480";
			Mainpage.Filtering[Mainpage.index].setText("��ž3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			crolling.area += ",I2400490";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2400500";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̸ŵ�":
			crolling.area += ",I2400510";
			Mainpage.Filtering[Mainpage.index].setText("�̸ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̸�1��":
			crolling.area += ",I2400520";
			Mainpage.Filtering[Mainpage.index].setText("�̸�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̸�2��":
			crolling.area += ",I2400530";
			Mainpage.Filtering[Mainpage.index].setText("�̸�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ڵ�":
			crolling.area += ",I2400540";
			Mainpage.Filtering[Mainpage.index].setText("���ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2400550";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2400560";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",I2400570";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ǳ���":
			crolling.area += "I2400580";
			Mainpage.Filtering[Mainpage.index].setText("�Ǳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ�":
			crolling.area += ",I2400590";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",I2400600";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���䵿":
			crolling.area += ",I2400610";
			Mainpage.Filtering[Mainpage.index].setText("���䵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܴ뵿":
			crolling.area += ",I2400620";
			Mainpage.Filtering[Mainpage.index].setText("�ܴ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2400630";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2400350";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��۵�":
			crolling.area += ",I2400640";
			Mainpage.Filtering[Mainpage.index].setText("��۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�꼺��":
			crolling.area += ",I2400650";
			Mainpage.Filtering[Mainpage.index].setText("�꼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2400660";
			Mainpage.Filtering[Mainpage.index].setText("�꼺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2400670";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2400680";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2400690";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",I2400700";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",I2400710";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ý��ﵿ":
			crolling.area += ",I2400720";
			Mainpage.Filtering[Mainpage.index].setText("�����ý��ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2400730";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2400740";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",I2400750";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",I2400760";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2400770";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			crolling.area += ",I2400780";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ʵ�":
			crolling.area += ",I2400790";
			Mainpage.Filtering[Mainpage.index].setText("���ʵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â�":
			crolling.area += ",I2400800";
			Mainpage.Filtering[Mainpage.index].setText("â�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2500040";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2500030";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2500010";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",I2500130";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			crolling.area += ",I2500060";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ð�����":
			crolling.area += ",I2500070";
			Mainpage.Filtering[Mainpage.index].setText("�����ð�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݱ���":
			crolling.area += ",I2500080";
			Mainpage.Filtering[Mainpage.index].setText("�ݱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݱ�1��":
			crolling.area += ",I2500090";
			Mainpage.Filtering[Mainpage.index].setText("�ݱ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݱ�2��":
			crolling.area += ",I2500110";
			Mainpage.Filtering[Mainpage.index].setText("�ݱ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",I2500050";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500160";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2500140";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2500150";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",I2500190";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500170";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500180";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ൿ":
			crolling.area += ",I2500220";
			Mainpage.Filtering[Mainpage.index].setText("���ൿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2500200";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2500210";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�������߾ӵ�":
			crolling.area += ",I2500260";
			Mainpage.Filtering[Mainpage.index].setText("�������߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϴ����":
			crolling.area += ",I2500230";
			Mainpage.Filtering[Mainpage.index].setText("�ϴ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ǽ���":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�Ǽ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ñݰ":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�����ñݰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ȳ����":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��Ȳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����õ��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ժϵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�Ժϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ž��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("ž��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�򸮵�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�򸮵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ�Žǵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("ȣ�Žǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��ź��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź1��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��ź1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź2��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��ź2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź3��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��ź3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź4��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��ź4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���뵿":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󱤱���":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�󱤱���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׵�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̸�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�������ڵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�������ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������1��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������2��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������3��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õõ��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("õõ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϱ�����":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�ϱ�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ð�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�����ð�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű���":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�ű���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ż��1��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�Ż��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ż��2��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�Ż��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ż��3��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�Ż��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���⵿":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϼ���":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�ϼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�츸��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�츸��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�츸1��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�츸1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�츸2��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�츸2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ赿":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�������ߵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�������ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȴ޷�1��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�ȴ޷�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȴ޷�2��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�ȴ޷�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȴ޷�3��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�ȴ޷�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��1��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��2��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ÿ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�Ÿ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����ð����":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����ð����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ڵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���ڵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����ôɰ":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����ôɰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ߵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�񰨵�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�񰨵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���յ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���յ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̻굿":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�̻굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������ൿ":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��������ൿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���յ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���յ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���պ���":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���պ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ȭ����":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�����ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ܵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���ܵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��γ���":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��γ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ε�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ε���":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��ε���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��κϵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��κϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�񳻵�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�񳻵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ȼ�ü��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�Ȼ�ü��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ű浿":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�ű浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�͵�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�͵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���õ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���õ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ȼ���߾ӵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�Ȼ���߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ����":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("ǳ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ����":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ȼ��ȭ����":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�Ȼ��ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ǰǵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�ǰǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݿ���":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�ݿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ȼ�úΰ":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�Ȼ�úΰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�絿":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ȼ굿":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�Ȼ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̵�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ȱ��̵�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�Ȱ��̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ȱ��ϵ�":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�Ȱ��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ؾ絿":
			crolling.area += ",I2500240";
			Mainpage.Filtering[Mainpage.index].setText("�ؾ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		}
	}
}
