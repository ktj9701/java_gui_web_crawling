package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;

public class Gwangju {
	public boolean flag;

	public void GwangjuCity(ActionEvent e) {
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
		case "��浿":
			Albamoncrolling.area += ",E0100010";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%B0%ED%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",E0100020";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%B1%A4%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",E0100030";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%B3%B2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",E0100040";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%B3%BB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",E0100050";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%B4%EB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0100060";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%B4%F6%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0100070";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%B5%B5%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",E0100080";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%B5%B5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",E0100090";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%B5%B5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",I0100100";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%B5%B5%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0100110";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%B5%BF%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",E0100120";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%B5%BF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",E0100130";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%B5%BF%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0100140";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%B5%CE%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ӵ�":
			Albamoncrolling.area += ",E0100150";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%B5%EE%C0%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",E0100160";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%B8%ED%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += "E0100170";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%B8%ED%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",E0100180";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%B9%DA%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			Albamoncrolling.area += ",E0100190";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BA%B9%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0100200";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BA%BB%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ굿":
			Albamoncrolling.area += ",E0100210";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BA%CF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ƶ�":
			Albamoncrolling.area += ",E0100220";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BA%F1%BE%C6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��Ƶ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",E0100230";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BB%E7%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�긷��":
			Albamoncrolling.area += ",E0100240";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BB%EA%B8%B7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�긷��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",E0100250";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BB%EA%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",E0100260";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BB%EA%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0100270";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BB%EA%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﵵ��":
			Albamoncrolling.area += ",E0100280";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BB%EF%B0%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ﵵ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			Albamoncrolling.area += ",E0100290";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BB%EF%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0100300";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BC%AD%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",E0100310";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ӵ�":
			Albamoncrolling.area += ",E0100320";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BC%B1%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",E0100330";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BC%D2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۴뵿":
			Albamoncrolling.area += ",E0100340";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BC%DB%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�۴뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۻ굿":
			Albamoncrolling.area += ",E0100350";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BC%DB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ۻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",E0100360";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BC%DB%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",E0100370";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BC%DB%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0100380";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",E0100390";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BC%DB%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ġ��":
			Albamoncrolling.area += ",E0100400";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BC%DB%C4%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ġ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			Albamoncrolling.area += ",E0100410";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BC%DB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",E0100420";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BC%F6%BF%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű���":
			Albamoncrolling.area += ",E0100430";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BD%C5%B0%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ű���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ�":
			Albamoncrolling.area += ",E0100450";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŷ浿":
			Albamoncrolling.area += ",E0100460";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BD%C5%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ŷ浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			Albamoncrolling.area += ",E0100470";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BD%C5%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",E0100480";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BD%C5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		case "�־ϵ�":
			Albamoncrolling.area += ",E0100490";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BD%D6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�־ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��û��":
			Albamoncrolling.area += ",E0100500";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BE%C8%C3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��û��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�絿":
			Albamoncrolling.area += ",E0100510";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",E0100520";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BE%E7%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��浿":
			Albamoncrolling.area += ",E0100530";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("��浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",E0100540";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BF%AC%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",E0100540";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BF%C0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0100560";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BF%C0%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",E0100560";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BF%C0%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",E0100570";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BF%C1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�յ�":
			Albamoncrolling.area += ",E0100580";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BF%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�յ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��⵿":
			Albamoncrolling.area += ",E0100590";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BF%E4%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",E0100600";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BF%EB%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뵿":
			Albamoncrolling.area += ",E0100610";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",E0100620";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BF%EB%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",E0100630";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BF%EC%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",E0100640";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BF%EE%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",E0100650";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BF%EE%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			Albamoncrolling.area += ",E0100660";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BF%F9%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",E0100670";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BF%F9%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",E0100680";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BF%F9%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",E0100685";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BF%F9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0100690";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%BF%F9%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			Albamoncrolling.area += ",E0100700";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%C0%AF%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ӱ":
			Albamoncrolling.area += ",E0100710";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%C0%D3%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ӱ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",E0100720";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%C0%E5%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			Albamoncrolling.area += ",E0100730";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%C0%E5%B7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",E0100740";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%C0%E5%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",E0100750";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%C1%F6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0100760";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%C1%F6%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׵�":
			Albamoncrolling.area += ",E0100770";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%C1%F6%C1%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",E0100780";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%C1%F6%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",E0100790";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%C1%F8%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϳ���":
			Albamoncrolling.area += ",E0100800";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%C7%CF%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ굿":
			Albamoncrolling.area += ",E0100810";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%C7%CF%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ�浿":
			Albamoncrolling.area += ",E0100820";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%C8%B2%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ�浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�漮��":
			Albamoncrolling.area += ",E0100830";
			AlbaHeavencrolling.area += "062%7C%7C%B1%A4%BB%EA%B1%B8%7C%7C%C8%E6%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�漮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",E0200010";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%B1%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ҵ�":
			Albamoncrolling.area += ",E020020";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%B1%B8%BC%D2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ҵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��뵿":
			Albamoncrolling.area += ",E0200030";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%B3%EB%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0200040";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%B4%EB%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0200050";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%B4%F6%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ݵ�":
			Albamoncrolling.area += ",E0200060";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%B5%B5%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�渲1��":
			Albamoncrolling.area += ",E0200100";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%B9%E6%B8%B21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�渲1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�渲2��":
			Albamoncrolling.area += ",E0200110";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%B9%E6%B8%B22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�渲2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�渲��":
			Albamoncrolling.area += ",E0200120";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%B9%E6%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�渲��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",E0200130";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%B9%E9%BF%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",E0200140";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%B9%E9%BF%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",E0200150";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%B9%E9%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",E0200160";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BA%C0%BC%B11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",E0200170";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BA%C0%BC%B12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0200180";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BA%C0%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�絿":
			Albamoncrolling.area += ",E0200190";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			Albamoncrolling.area += ",E0200200";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BC%AD1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			Albamoncrolling.area += ",E0200210";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BC%AD2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",E0200220";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0200230";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BC%AE%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",E0200240";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BC%DB%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",E0200250";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BD%C2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			Albamoncrolling.area += ",E0200260";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BD%C5%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",E0200270";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BE%D0%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",E0200280";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BE%E7%B0%FA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�縲��":
			Albamoncrolling.area += ",E0200290";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BE%E7%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�縲��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",E0200300";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BE%E7%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",E0200310";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BF%F8%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����4��":
			Albamoncrolling.area += ",E0200320";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BF%F9%BB%EA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����5��":
			Albamoncrolling.area += ",E0200330";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BF%F9%BB%EA5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",E0200340";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BF%F9%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0200350";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%BF%F9%BC%BA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			Albamoncrolling.area += ",E0200360";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%C0%CC%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ӿϵ�":
			Albamoncrolling.area += ",E0200370";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%C0%D3%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ӿϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֿ�1��":
			Albamoncrolling.area += ",E0200380";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%C1%D6%BF%F91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ֿ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֿ�2��":
			Albamoncrolling.area += ",E0200390";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%C1%D6%BF%F92%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ֿ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ֿ���":
			Albamoncrolling.area += ",E020040";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%C1%D6%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ֿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0200410";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%C1%F6%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0200420";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%C1%F8%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ����":
			Albamoncrolling.area += ",E0200430";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%C4%A5%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ĥ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			Albamoncrolling.area += ",E0200440";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%C7%E0%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�嵿":
			Albamoncrolling.area += ",E0200450";
			AlbaHeavencrolling.area += "062%7C%7C%B3%B2%B1%B8%7C%7C%C8%AD%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�踲1��":
			Albamoncrolling.area += ",E0300010";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%B0%E8%B8%B21%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�踲1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�踲2��":
			Albamoncrolling.area += ",E0300020";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%B0%E8%B8%B22%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�踲2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�踲��":
			Albamoncrolling.area += ",I0600150";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%B0%E8%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�踲��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�������굿":
			Albamoncrolling.area += ",I0600120";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%B1%A4%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�������굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�õ�":
			Albamoncrolling.area += ",I0600130";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%B1%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�õ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݳ���1��":
			Albamoncrolling.area += ",I0600140";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%B1%DD%B3%B2%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ݳ���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݳ���2��":
			Albamoncrolling.area += ",I0600070";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%B1%DD%B3%B2%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ݳ���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݳ���3��":
			Albamoncrolling.area += ",I0600200";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%B1%DD%B3%B2%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ݳ���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݳ���4��":
			Albamoncrolling.area += ",I0600160";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%B1%DD%B3%B2%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ݳ���4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݳ���5��":
			Albamoncrolling.area += ",I0600170";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%B1%DD%B3%B2%B7%CE5%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�ݳ���5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݵ�":
			Albamoncrolling.area += ",I0600180";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",I0600190";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I0600210";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%B3%BB%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			Albamoncrolling.area += ",I0700030";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%B4%EB%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",I0700070";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%B4%EB%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",I0700040";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%B5%BF%B8%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ҷε�":
			Albamoncrolling.area += ",I0700050";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%BA%D2%B7%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ҷε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",I0700060";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%BB%EA%BC%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",I0700110";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%BB%EA%BC%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���������":
			Albamoncrolling.area += ",I0700090";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%BB%EA%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I0700100";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%BC%AD%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I0700180";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%BC%B1%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���µ�":
			Albamoncrolling.area += ",I0700120";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%BC%D2%C5%C2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���µ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���⵿":
			Albamoncrolling.area += ",I0700130";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%BC%F6%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",I0700140";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%BF%EB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뿬��":
			Albamoncrolling.area += ",I0700150";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%BF%EB%BF%AC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뿬��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",I0700160";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%BF%EE%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",I0700200";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%BF%F9%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�嵿":
			Albamoncrolling.area += ",I0700210";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",I0700240";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%C1%F6%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",I0700220";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%C1%F6%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�������굿":
			Albamoncrolling.area += ",I0700230";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%C1%F6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�������굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����1��":
			Albamoncrolling.area += ",E0300340";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%C3%E6%C0%E5%B7%CE1%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����2��":
			Albamoncrolling.area += ",E0300350";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%C3%E6%C0%E5%B7%CE2%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����3��":
			Albamoncrolling.area += ",E0300360";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%C3%E6%C0%E5%B7%CE3%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����4��":
			Albamoncrolling.area += ",E0300370";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%C3%E6%C0%E5%B7%CE4%B0%A1";
			Mainpage.Filtering[Mainpage.index].setText("�����4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�е�":
			Albamoncrolling.area += ",E0300380";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ����":
			Albamoncrolling.area += ",E0300390";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%C8%A3%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ�ݵ�":
			Albamoncrolling.area += ",E0300400";
			AlbaHeavencrolling.area += "062%7C%7C%B5%BF%B1%B8%7C%7C%C8%B2%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ�ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += "E0400020";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%B0%A2%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ":
			Albamoncrolling.area += ",E0400030";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%B1%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0400040";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%B4%A9%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",E0400050";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%B4%EB%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			Albamoncrolling.area += ",E0400060";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%B4%F6%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϱ�������":
			Albamoncrolling.area += ",E0400070";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%B5%BF%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϱ�������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ξ�1��":
			Albamoncrolling.area += ",E0400080";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%B5%CE%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ξ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ξ�2��":
			Albamoncrolling.area += ",E0400090";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%B5%CE%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ξ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ξ�3��":
			Albamoncrolling.area += ",E0400100";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%B5%CE%BE%CF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ξ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ξϵ�":
			Albamoncrolling.area += ",E0400110";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%B5%CE%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ξϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0400120";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%B8%C1%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű":
			Albamoncrolling.area += ",E0400130";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%B8%C5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ű");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",E0400140";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%B9%AE%C8%EF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",E0400150";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%B9%AE%C8%EF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",E0400160";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BA%BB%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϵ�":
			Albamoncrolling.area += ",E0400170";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﰢ��":
			Albamoncrolling.area += ",E0400180";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BB%EF%B0%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ﰢ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���뵿":
			Albamoncrolling.area += ",E0400190";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BB%FD%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",E0400200";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BC%F6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�žȵ�":
			Albamoncrolling.area += ",E0400210";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BD%C5%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�žȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ뵿":
			Albamoncrolling.area += ",E0400220";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BD%C5%BF%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϱ���굿":
			Albamoncrolling.area += ",E0400230";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BE%E7%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϱ���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0400240";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BF%AC%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			Albamoncrolling.area += ",E0400250";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BF%C0%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ġ1��":
			Albamoncrolling.area += ",E0400260";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BF%C0%C4%A11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ġ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ġ2��":
			Albamoncrolling.area += ",E0400270";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BF%C0%C4%A12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ġ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ġ��":
			Albamoncrolling.area += ",E0400280";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BF%C0%C4%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ġ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�밭��":
			Albamoncrolling.area += ",E0400290";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BF%EB%B0%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�밭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ε�":
			Albamoncrolling.area += ",E0400300";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BF%EB%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϱ������":
			Albamoncrolling.area += ",E0400310";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BF%EB%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϱ������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0400320";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BF%EB%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϱ���굿":
			Albamoncrolling.area += ",E0400330";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BF%EC%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϱ���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",E0400340";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BF%EE%BE%CF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",E0400350";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BF%EE%BE%CF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			Albamoncrolling.area += ",E0400360";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BF%EE%BE%CF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			Albamoncrolling.area += ",E0400370";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BF%EE%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0400380";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BF%EE%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���⵿":
			Albamoncrolling.area += ",E0400390";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%BF%F9%C3%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",E0400400";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%C0%AF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϰ":
			Albamoncrolling.area += ",E0400410";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%C0%CF%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ӵ�":
			Albamoncrolling.area += ",E0400420";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%C0%D3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",E0400430";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%C0%E5%B5%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",E0400440";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%C1%DF%C8%EF1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",E0400450";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%C1%DF%C8%EF2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",E0400460";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%C1%DF%C8%EF3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",E0400470";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%C1%DF%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			Albamoncrolling.area += ",E0400480";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%C1%F6%BE%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ûǳ��":
			Albamoncrolling.area += ",E0400490";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%C3%BB%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ûǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȿ��":
			Albamoncrolling.area += ",E0400500";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%C3%E6%C8%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȿ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�·ɵ�":
			Albamoncrolling.area += ",E0400510";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%C5%C2%B7%C9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�·ɵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ�⵿":
			Albamoncrolling.area += ",E0400520";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%C7%B3%C7%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ�⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�ϵ�":
			Albamoncrolling.area += ",E0400530";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%C8%AD%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȿ�ɵ�":
			Albamoncrolling.area += ",E0400540";
			AlbaHeavencrolling.area += "062%7C%7C%BA%CF%B1%B8%7C%7C%C8%BF%B7%C9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȿ�ɵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",E0500020";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%B1%A4%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ��":
			Albamoncrolling.area += ",E0500030";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%B1%DD%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			Albamoncrolling.area += ",E0500040";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%B3%BB%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			Albamoncrolling.area += ",E0500050";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%B3%F3%BC%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			Albamoncrolling.area += ",E0500060";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%B3%F3%BC%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󼺵�":
			Albamoncrolling.area += ",E0500070";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%B4%F6%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�󼺵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",E0500080";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%B5%BF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",E0500090";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%B8%B6%B8%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0500100";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%B8%B6%B8%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ſ���":
			Albamoncrolling.area += ",E0500110";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%B8%C5%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ſ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",E0500120";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%BA%AE%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��1��":
			Albamoncrolling.area += ",E0500130";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%BB%F3%B9%AB1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��2��":
			Albamoncrolling.area += ",E0500140";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%BB%F3%B9%AB2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󹫵�":
			Albamoncrolling.area += ",E0500150";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%BB%F3%B9%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�󹫵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��â��":
			Albamoncrolling.area += ",E0500160";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%BC%AD%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",E0500170";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%BC%BC%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",E0500180";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%BD%D6%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��3��":
			Albamoncrolling.area += ",E0500190";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%BE%E73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����絿":
			Albamoncrolling.area += ",E0500200";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������ε�":
			Albamoncrolling.area += ",E0500210";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%BF%EB%B5%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",E0500220";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%C0%AF%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ġ��":
			Albamoncrolling.area += ",E0500230";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%C4%A1%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ġ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ�ϵ�":
			Albamoncrolling.area += ",E0500240";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%C7%B3%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��1��":
			Albamoncrolling.area += ",E0500250";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%C8%AD%C1%A41%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��2��":
			Albamoncrolling.area += ",E0500260";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%C8%AD%C1%A42%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��3��":
			Albamoncrolling.area += ",E0500270";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%C8%AD%C1%A43%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ��4��":
			Albamoncrolling.area += ",E0500280";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%C8%AD%C1%A44%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ��4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			Albamoncrolling.area += ",E0500290";
			AlbaHeavencrolling.area += "062%7C%7C%BC%AD%B1%B8%7C%7C%C8%AD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		}
	}
}
