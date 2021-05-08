package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;

public class Gyeonggi2 {
	public boolean flag;

	public void Gyeonggi2City(ActionEvent e) {
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

		case "���絿":
			Albamoncrolling.area += ",B2300010";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B0%A1%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2300020";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B0%A1%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�赿":
			Albamoncrolling.area += ",B2300030";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += "B2300040";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B0%ED%BB%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2300050";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B0%F8%B5%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2300060";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B1%B8%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݱ���":
			Albamoncrolling.area += ",B2300070";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B1%DD%B1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݻ굿":
			Albamoncrolling.area += "B2300080";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B1%DD%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ���":
			Albamoncrolling.area += ",B2300090";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B1%DD%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2300100";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B3%AB%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��յ�":
			Albamoncrolling.area += ",B2300110";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B4%E7%BF%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��յ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",B2300120";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B4%EB%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += "B2300130";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B4%EB%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���⵿":
			Albamoncrolling.area += ",B2300140";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B5%B5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2300150";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B5%BF%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",B2300160";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B8%ED%B7%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̾��":
			Albamoncrolling.area += "B2300170";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B9%CC%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̾��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			Albamoncrolling.area += ",B2300180";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B9%DF%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2300190";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BA%B8%B0%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2300200";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BA%C0%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",B2300210";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BA%C0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",B2300220";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BB%E7%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׸�":
			Albamoncrolling.area += ",B2300230";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BB%EF%C1%D7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���׸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",B2300240";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BC%AD%BF%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",B2300250";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BC%AD%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2300260";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BC%AE%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2300270";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BC%BA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",B2300280";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BC%FE%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű�����":
			Albamoncrolling.area += ",B2300290";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BD%C5%B0%C7%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ű�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ÿ�굿":
			Albamoncrolling.area += ",B2300300";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BD%C5%B8%F0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ÿ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż�����":
			Albamoncrolling.area += ",B2300310";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BD%C5%BC%D2%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ż�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",B2300320";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ƾ絿":
			Albamoncrolling.area += ",B2300330";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BE%C6%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ƾ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȼ�1��":
			Albamoncrolling.area += ",B2300460";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BE%C8%BC%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȼ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȼ�2��":
			Albamoncrolling.area += ",B2300470";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BE%C8%BC%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȼ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȼ�3��":
			Albamoncrolling.area += ",B2300480";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BE%C8%BC%BA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȼ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�缺��":
			Albamoncrolling.area += ",��B2300480";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BE%E7%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�缺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2300350";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BF%AC%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",B2300360";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",B2300370";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BF%C1%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",B2300380";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BF%C1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",B2300390";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BF%F8%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2300400";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%C0%CE%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׸�":
			Albamoncrolling.area += ",B2300410";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%C0%CF%C1%D7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���׸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׻��":
			Albamoncrolling.area += ",B2300420";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%C1%D7%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�׻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߸���":
			Albamoncrolling.area += ",B2300430";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%C1%DF%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߸���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����":
			Albamoncrolling.area += ",B2300440";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%C3%A2%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2300450";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%C7%F6%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",B2400010";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B0%A5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",B2400040";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B0%FC%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",B2400020";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B0%FC%BE%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",B2400030";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B0%FC%BE%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",B2400050";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B1%CD%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�޾ȵ�":
			Albamoncrolling.area += ",B2400060";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B4%DE%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�޾ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			Albamoncrolling.area += ",B2400070";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B9%FC%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�θ���":
			Albamoncrolling.area += ",B2400080";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BA%CE%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�θ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",B2400090";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BA%CE%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",B2400130";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BA%F1%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			Albamoncrolling.area += ",B2400100";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BA%F1%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			Albamoncrolling.area += ",B2400110";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BA%F1%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			Albamoncrolling.area += ",B2400120";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BA%F1%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",B2400140";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BD%C5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			Albamoncrolling.area += ",B2400150";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%C6%F2%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",B2400160";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%C6%F2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ�赿":
			Albamoncrolling.area += ",B2400200";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%C8%A3%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ�赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ��1��":
			Albamoncrolling.area += ",B2400170";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%C8%A3%B0%E81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ��2��":
			Albamoncrolling.area += ",B2400180";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%C8%A3%B0%E82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ��3��":
			Albamoncrolling.area += "B2400190";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%C8%A3%B0%E83%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ڴ޵�":
			Albamoncrolling.area += ",B2500030";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%B9%DA%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ڴ޵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ڴ�1��":
			Albamoncrolling.area += ",B2500010";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%B9%DA%B4%DE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ڴ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ڴ�2��":
			Albamoncrolling.area += ",B2500020";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%B9%DA%B4%DE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ڴ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2500070";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BC%AE%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",B2500040";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BC%AE%BC%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",B2500050";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BC%AE%BC%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			Albamoncrolling.area += ",B2500060";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BC%AE%BC%F63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ絿":
			Albamoncrolling.area += ",B2500170";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ�1��":
			Albamoncrolling.area += ",B2500080";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ�2��":
			Albamoncrolling.area += ",B2500090";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ�3��":
			Albamoncrolling.area += ",B2500100";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ�4��":
			Albamoncrolling.area += ",B2500110";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ�5��":
			Albamoncrolling.area += ",B2500120";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E75%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ�5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ�6��":
			Albamoncrolling.area += ",B2500130";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E76%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ�6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ�7��":
			Albamoncrolling.area += ",B2500140";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E77%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ�7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ�8��":
			Albamoncrolling.area += ",B2500150";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E78%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ�8��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ�9��":
			Albamoncrolling.area += ",B2500160";
			AlbaHeavencrolling.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E79%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ�9��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			Albamoncrolling.area += ",B2600010";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B0%ED%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2600020";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B0%ED%C0%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",B2600030";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B1%A4%BB%E7%B5%B";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2600040";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B1%A4%C0%FB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",B2600050";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			Albamoncrolling.area += ",B2600060";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B3%B2%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			Albamoncrolling.area += ",B2600070";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B4%F6%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2600080";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B4%F6%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += "B2600090";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B8%B6%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���۵�":
			Albamoncrolling.area += ",B2600100";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B8%B8%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�鼮��":
			Albamoncrolling.area += ",B2600110";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B9%E9%BC%AE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�鼮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",B2600120";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%BA%C0%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			Albamoncrolling.area += ",B2600130";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%BB%EA%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",B2600140";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%BB%EF%BC%FE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��е�":
			Albamoncrolling.area += ",B2600150";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%BE%EE%B5%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2600160";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%BF%C1%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",B2600170";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%C0%AF%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2600180";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%C0%B2%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2600190";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%C0%BA%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",B2600200";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%C0%E5%C8%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ�ϵ�":
			Albamoncrolling.area += ",B2600210";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%C8%B8%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȸ�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����":
			Albamoncrolling.area += ",B2600220";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%C8%B8%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",B2700010";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%B0%AD%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			Albamoncrolling.area += ",B2700020";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%B0%AD%C7%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2700030";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%B0%B3%B1%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܿ���":
			Albamoncrolling.area += ",B2700040";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%B4%DC%BF%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ܿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2700050";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%BC%AD%C1%BE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�絿��":
			Albamoncrolling.area += ",B2700060";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%BE%E7%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�絿��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�缭��":
			Albamoncrolling.area += ",B2700070";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%BE%E7%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�缭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2700080";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%BE%E7%C6%F2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",B2700090";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%BF%C1%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�빮��":
			Albamoncrolling.area += ",B2700100";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%BF%EB%B9%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�빮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",B2700110";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%C1%F6%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û���":
			Albamoncrolling.area += ",B2700120";
			AlbaHeavencrolling.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%C3%BB%BF%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2800010";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B0%A1%B3%B2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2800140";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B0%A1%BE%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",B2800020";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B0%AD%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",B2800150";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݻ��":
			Albamoncrolling.area += ",B2800030";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B1%DD%BB%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ɼ���":
			Albamoncrolling.area += ",B2800040";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B4%C9%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ɼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2800160";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B4%C9%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2800170";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B4%DC%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ÿ�":
			Albamoncrolling.area += ",B2800050";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B4%EB%BD%C5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��Ÿ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŷ浿":
			Albamoncrolling.area += ",B2800180";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B8%C5%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ŷ浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",B2800190";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B8%E8%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϳ���":
			Albamoncrolling.area += ",B2800060";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BA%CF%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ϳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϸ�":
			Albamoncrolling.area += ",B2800070";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BB%EA%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﱳ��":
			Albamoncrolling.area += ",B2800200";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BB%EF%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ﱳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			Albamoncrolling.area += ",B2800210";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BB%F3%B0%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",B2800220";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2800230";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BD%C5%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",B2800110";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",B2800240";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BF%AC%B6%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",B2800250";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BF%AC%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ݵ�":
			Albamoncrolling.area += ",B2800260";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BF%C0%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			Albamoncrolling.area += ",B2800120";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BF%C0%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�츸��":
			Albamoncrolling.area += ",B2800270";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BF%EC%B8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�츸��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���۵�":
			Albamoncrolling.area += ",B2800280";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BF%F9%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2800090";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C1%A1%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2800290";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C1%A1%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�":
			Albamoncrolling.area += ",B2800130";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â��":
			Albamoncrolling.area += ",B2800300";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ�۵�":
			Albamoncrolling.area += ",B2800310";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C3%B5%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õ�۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϰŵ�":
			Albamoncrolling.area += ",B2800320";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C7%CF%B0%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϰŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϵ�":
			Albamoncrolling.area += ",B2800330";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",B2800340";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C7%F6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ����":
			Albamoncrolling.area += ",B2800350";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C8%AB%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȫ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",B2800100";
			AlbaHeavencrolling.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C8%EF%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2900010";
			AlbaHeavencrolling.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%B1%BA%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̻��":
			Albamoncrolling.area += ",B2900020";
			AlbaHeavencrolling.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%B9%CC%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���и�":
			Albamoncrolling.area += ",B2900030";
			AlbaHeavencrolling.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%B9%E9%C7%D0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���и�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż���":
			Albamoncrolling.area += ",B2900040";
			AlbaHeavencrolling.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%BD%C5%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ż���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",B2900050";
			AlbaHeavencrolling.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%BF%AC%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��¡��":
			Albamoncrolling.area += ",B2900060";
			AlbaHeavencrolling.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%BF%D5%C2%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��¡��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�峲��":
			Albamoncrolling.area += ",B2900070";
			AlbaHeavencrolling.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%C0%E5%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�峲��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B2900080";
			AlbaHeavencrolling.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%C0%FC%B0%EE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߸�":
			Albamoncrolling.area += ",B2900090";
			AlbaHeavencrolling.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%C1%DF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�߸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û���":
			Albamoncrolling.area += ",B2900100";
			AlbaHeavencrolling.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%C3%BB%BB%EA%B8%E";
			Mainpage.Filtering[Mainpage.index].setText("û���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3000010";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B0%A1%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			Albamoncrolling.area += ",B3000020";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B0%A1%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3000030";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B0%A5%B0%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3000040";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B0%ED%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȵ�":
			Albamoncrolling.area += ",B3000050";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B1%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݾϵ�":
			Albamoncrolling.area += ",B3000060";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B1%DD%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݾϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����̵�":
			Albamoncrolling.area += ",B3000070";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B3%BB%BB%EF%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3000080";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B4%A9%C0%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ":
			Albamoncrolling.area += ",B3000090";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B5%CE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3000100";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B9%FA%C0%BD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�λ굿":
			Albamoncrolling.area += ",B3000110";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BA%CE%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�λ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",B3000120";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3000130";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BC%AD%B6%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3000140";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BC%BC%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��û��":
			Albamoncrolling.area += ",B3000150";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BC%F6%C3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��û��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",B3000160";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BE%E7%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",B3000170";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BF%C0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܻ�̵�":
			Albamoncrolling.area += ",B3000180";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BF%DC%BB%EF%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܻ�̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",B3000190";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			Albamoncrolling.area += ",B3000200";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%C0%BA%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3000210";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%C1%F6%B0%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�е�":
			Albamoncrolling.area += ",B3000220";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%C3%BB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ûȣ��":
			Albamoncrolling.area += ",B3000230";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%C3%BB%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ûȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ž��":
			Albamoncrolling.area += ",B3000240";
			AlbaHeavencrolling.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%C5%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ž��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			Albamoncrolling.area += ",B3100010";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%B0%ED%B8%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3100020";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%B0%F8%BC%BC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3100030";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%B1%B8%B0%A5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3100190";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",B3100200";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󼭵�":
			Albamoncrolling.area += ",B3100040";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%B3%F3%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�󼭵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���鵿":
			Albamoncrolling.area += ",B3100050";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%B5%BF%B9%E9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���鵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",B3100060";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%B8%B6%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",B3100070";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BA%B8%B6%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3100080";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BA%B8%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󰥵�":
			Albamoncrolling.area += ",B3100090";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BB%F3%B0%A5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�󰥵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",B3100100";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BB%F3%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",B3100210";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",B3100110";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BC%AD%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű���":
			Albamoncrolling.area += ",B3100120";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BD%C5%B0%A5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ű���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�𳲵�":
			Albamoncrolling.area += ",B3100130";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BE%F0%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�𳲵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3100140";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BF%B5%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ�":
			Albamoncrolling.area += ",B3100150";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",B3100160";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%C1%F6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			Albamoncrolling.area += ",B3100170";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%C3%BB%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϰ���":
			Albamoncrolling.area += ",B3100180";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%C7%CF%B0%A5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϰ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��⵿":
			Albamoncrolling.area += ",B3110010";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%B0%ED%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",B3110020";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%B5%BF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",B3110030";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%BB%F3%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",B3110040";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%BB%F3%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3110050";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%BB%F3%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3110060";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%BC%BA%BA%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ź���":
			Albamoncrolling.area += ",B3110070";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%BD%C5%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ź���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3110100";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%C1%D7%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",B3110080";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%C1%D7%C0%FC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",B3110090";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%C1%D7%C0%FC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ��õ��":
			Albamoncrolling.area += ",B3110130";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%C7%B3%B4%F6%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ��õ1��":
			Albamoncrolling.area += ",B3110110";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%C7%B3%B4%F6%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ��õ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ��õ2��":
			Albamoncrolling.area += ",B3110120";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%C7%B3%B4%F6%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ��õ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",B3120010";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B0%ED%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�跮�嵿":
			Albamoncrolling.area += ",B3120020";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B1%E8%B7%AE%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�跮�嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",B3120030";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",B3120040";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B3%B2%BB%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			Albamoncrolling.area += ",B3120180";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",B3120050";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B8%B6%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3120060";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B8%F0%C7%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϸ�":
			Albamoncrolling.area += ",B3120070";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B9%E9%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﰡ��":
			Albamoncrolling.area += ",B3120080";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%BB%EF%B0%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ﰡ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3120090";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%BE%E7%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",B3120100";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%BF%AA%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",B3120190";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			Albamoncrolling.area += ",B3120110";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%BF%EE%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",B3120120";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%BF%F8%BB%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3120200";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			Albamoncrolling.area += ",B3120130";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%C0%AF%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̵���":
			Albamoncrolling.area += ",B3120140";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�̵���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ν��߾ӵ�":
			Albamoncrolling.area += ",B3120210";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("���ν��߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3120150";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%C6%F7%B0%EE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ذ":
			Albamoncrolling.area += ",B3120160";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%C7%D8%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ذ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ��":
			Albamoncrolling.area += ",B3120170";
			AlbaHeavencrolling.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",B3200010";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%B0%ED%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���յ�":
			Albamoncrolling.area += ",B3200040";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%B3%BB%BC%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���յ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",B3200020";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%B3%BB%BC%D51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",B3200030";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%B3%BB%BC%D52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ":
			Albamoncrolling.area += ",B3200140";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﵿ":
			Albamoncrolling.area += ",B3200050";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%BB%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3200060";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%BF%C0%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�հ":
			Albamoncrolling.area += ",B3200070";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%BF%D5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�հ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",B3200080";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%BF%F9%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̵�":
			Albamoncrolling.area += ",B3200090";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�赿":
			Albamoncrolling.area += ",B3200100";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%C3%BB%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",B3200110";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%C3%CA%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",B3200120";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%C6%F7%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			Albamoncrolling.area += ",B3200130";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%C7%D0%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ɵ�":
			Albamoncrolling.area += ",B3300040";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B0%A1%B4%C9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ɵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",B3300010";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B0%A1%B4%C91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",B3300050";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B0%ED%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݿ���":
			Albamoncrolling.area += ",B3300060";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B1%DD%BF%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",B3300070";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B3%AB%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			Albamoncrolling.area += ",B3300080";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B3%EC%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ζ���":
			Albamoncrolling.area += ",B3300090";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B9%CE%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ζ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",B3300100";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%BB%EA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۻ�1��":
			Albamoncrolling.area += ",B3300240";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�ۻ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۻ�2��":
			Albamoncrolling.area += ",B3300250";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�ۻ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű":
			Albamoncrolling.area += ",B3300130";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%BD%C5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ű");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű�1��":
			Albamoncrolling.area += ",B3300110";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%BD%C5%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ű�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű�2��":
			Albamoncrolling.area += ",B3300120";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%BD%C5%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ű�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3300140";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%BF%EB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ε�":
			Albamoncrolling.area += ",B3300180";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C0%C7%C1%A4%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			Albamoncrolling.area += ",B3300150";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C0%C7%C1%A4%BA%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			Albamoncrolling.area += ",B3300160";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C0%C7%C1%A4%BA%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			Albamoncrolling.area += ",B3300170";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C0%C7%C1%A4%BA%CE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ڱݵ�":
			Albamoncrolling.area += ",B3300260";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�ڱݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",B3300190";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C0%DA%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			Albamoncrolling.area += ",B3300200";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C0%E5%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ����":
			Albamoncrolling.area += ",B3300230";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C8%A3%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ��1��":
			Albamoncrolling.area += ",B3300210";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C8%A3%BF%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ��2��":
			Albamoncrolling.area += ",B3300220";
			AlbaHeavencrolling.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C8%A3%BF%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ｑ��":
			Albamoncrolling.area += ",B3300270";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�Ｑ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",B3400010";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B0%A5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��㵿":
			Albamoncrolling.area += ",B3400020";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B0%ED%B4%E3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��㵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",B3400030";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B0%FC%B0%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܿ���":
			Albamoncrolling.area += ",B3400040";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B4%DC%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",B3400050";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B4%EB%BF%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3400060";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B4%EB%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",B3400070";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B8%B6%C0%E5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�𰡸�":
			Albamoncrolling.area += ",B3400080";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B8%F0%B0%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�𰡸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",B3400090";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B9%E9%BB%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ι���":
			Albamoncrolling.area += ",B3400100";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%BA%CE%B9%DF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ι���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3400110";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%BB%E7%C0%BD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3400120";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%BC%B3%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3400130";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵи�":
			Albamoncrolling.area += ",B3400140";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%BD%C5%B5%D0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ŵи�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			Albamoncrolling.area += ",B3400150";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%BE%C8%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",B3400160";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C0%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3400170";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C0%B2%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			Albamoncrolling.area += ",B3400180";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C0%E5%B7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ����":
			Albamoncrolling.area += ",B3400190";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C0%E5%C8%A3%BF%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ���߸���":
			Albamoncrolling.area += ",B3400200";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C1%DF%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ���߸���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",B3400210";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C1%F5%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3400220";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C1%F5%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3400230";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C1%F8%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��â����":
			Albamoncrolling.area += ",B3400240";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C3%A2%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��â����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ����":
			Albamoncrolling.area += ",B3400250";
			AlbaHeavencrolling.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C8%A3%B9%FD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�˻굿":
			Albamoncrolling.area += ",B3500010";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B0%CB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�˻굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź��":
			Albamoncrolling.area += ",B3500020";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%A4%C5%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ź��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",B3500030";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%B3%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3500040";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%BA%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݴɵ�":
			Albamoncrolling.area += "B3500050";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%DD%B4%C9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݴɵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",B3500080";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%DD%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",B3500060";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%DD%C3%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",B3500070";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%DD%C3%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3500230";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B4%D9%C0%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",B3500240";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B4%E7%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			Albamoncrolling.area += ",B3500250";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B5%BF%C6%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ʊݵ�":
			Albamoncrolling.area += ",B3500090";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B8%C6%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ʊݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�񵿵�":
			Albamoncrolling.area += ",B3500260";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B8%F1%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�񵿵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			Albamoncrolling.area += ",B3500270";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B9%AE%B9%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3500100";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B9%AE%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3500110";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B9%FD%BF%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ų���":
			Albamoncrolling.area += ",B3500280";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BB%EA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ų���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			Albamoncrolling.area += ",B3500290";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BB%F3%C1%F6%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			Albamoncrolling.area += ",B3500300";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BC%AD%C6%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",B3500310";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BC%DB%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֽý��̵�":
			Albamoncrolling.area += ",B3500320";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BD%C5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֽý��̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ƶ���":
			Albamoncrolling.area += ",B3500120";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BE%C6%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ƶ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߴ絿":
			Albamoncrolling.area += ",B3500330";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BE%DF%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߴ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ���":
			Albamoncrolling.area += ",B3500130";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BE%DF%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ٻ굿":
			Albamoncrolling.area += ",B3500340";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BF%AC%B4%D9%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ٻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3500350";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BF%C0%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�͵���":
			Albamoncrolling.area += ",B3500360";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BF%CD%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�͵���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ո�":
			Albamoncrolling.area += ",B3500330";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BF%F9%B7%D5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ո�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ܸ�":
			Albamoncrolling.area += ",B3500130";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C0%E5%B4%DC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ܸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3500340";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C0%FB%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3500170";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C1%B6%B8%AE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ź����":
			Albamoncrolling.area += ",B3500200";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C5%BA%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ź����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3500210";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C6%C4%C1%D6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",B3500220";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C6%C4%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			Albamoncrolling.area += ",B3500370";
			AlbaHeavencrolling.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C7%CF%C1%F6%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			Albamoncrolling.area += ",B3600010";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B0%A1%C0%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",B3600020";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B0%ED%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3600030";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B1%BA%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",B3600040";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B5%B5%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",B3600050";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B5%B6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			Albamoncrolling.area += ",B3600060";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B5%BF%BB%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",B3600070";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B8%F0%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3600100";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BA%F1%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",B3600080";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BA%F1%C0%FC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",B3600090";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BA%F1%C0%FC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3600110";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BC%AD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź��":
			Albamoncrolling.area += ",B3600120";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BC%AD%C5%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ź��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ýü�����":
			Albamoncrolling.area += ",B3600130";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BC%BC%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ýü�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�һ絿":
			Albamoncrolling.area += ",B3600140";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BC%D2%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�һ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ뵿":
			Albamoncrolling.area += ",B3600150";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BD%C5%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			Albamoncrolling.area += ",B3600180";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BD%C5%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",B3600160";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BD%C5%C0%E51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",B3600170";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BD%C5%C0%E52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3600190";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BE%C8%C1%DF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3600200";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BF%C0%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",B3600210";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BF%EB%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",B3600220";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BF%F9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",B3600230";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C0%AF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			Albamoncrolling.area += ",B3600240";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C0%CC%C3%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			Albamoncrolling.area += ",B3600250";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C0%E5%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			Albamoncrolling.area += ",B3600260";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C0%E5%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׹鵿":
			Albamoncrolling.area += ",B3600270";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C1%D7%B9%E9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�׹鵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",B3600280";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C1%F6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3600290";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C1%F6%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3600300";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C1%F8%C0%A7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�浿":
			Albamoncrolling.area += ",B3600310";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C3%BB%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�ϸ�":
			Albamoncrolling.area += ",B3600320";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C3%BB%BA%CF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("û�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ����":
			Albamoncrolling.area += ",B3600330";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C4%A5%B1%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ĥ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ����":
			Albamoncrolling.area += ",B3600340";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C4%A5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ĥ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뺹��":
			Albamoncrolling.area += ",B3600350";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C5%EB%BA%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뺹��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ؼ���":
			Albamoncrolling.area += ",B3600360";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C6%D8%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ؼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���õ�":
			Albamoncrolling.area += ",B3600370";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C6%F2%C5%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���õ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3600380";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C6%F7%BD%C2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3600390";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C7%D5%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3600400";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C7%F6%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",B3700010";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%B0%A1%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���θ�":
			Albamoncrolling.area += ",B3700020";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%B0%FC%C0%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�ñ�����":
			Albamoncrolling.area += ",B3700030";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%B1%BA%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ�ñ�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			Albamoncrolling.area += ",B3700040";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%B3%BB%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3700050";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%B5%BF%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ܵ�":
			Albamoncrolling.area += ",B3700060";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BC%B1%B4%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ܵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",B3700070";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BC%B3%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3700080";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BC%D2%C8%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�źϸ�":
			Albamoncrolling.area += ",B3700090";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BD%C5%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�źϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3700100";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BD%C5%C0%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��浿":
			Albamoncrolling.area += ",B3700110";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BE%EE%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			Albamoncrolling.area += ",B3700120";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BF%B5%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���߸�":
			Albamoncrolling.area += ",B3700130";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BF%B5%C1%DF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���߸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̵���":
			Albamoncrolling.area += ",B3700140";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%C0%CC%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̵���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϵ���":
			Albamoncrolling.area += ",B3700150";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%C0%CF%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ϵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���۵�":
			Albamoncrolling.area += ",B3700160";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%C0%DA%C0%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ڰ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����":
			Albamoncrolling.area += ",B3700170";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%C3%A2%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("â����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",B3700190";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			Albamoncrolling.area += ",B3700180";
			AlbaHeavencrolling.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%C8%AD%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",B3800010";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B0%A8%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",B3800020";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B0%A8%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",B3800030";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B0%A8%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",B3800040";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B1%A4%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			Albamoncrolling.area += ",B3800050";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B1%B3%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3800290";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ��":
			Albamoncrolling.area += ",B3800090";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B4%F6%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ1��":
			Albamoncrolling.area += ",B3800060";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B4%F6%C7%B31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ2��":
			Albamoncrolling.area += ",B3800070";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B4%F6%C7%B32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ3��":
			Albamoncrolling.area += ",B3800080";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B4%F6%C7%B33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3800100";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B8%C1%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̻絿":
			Albamoncrolling.area += ",B3800110";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B9%CC%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̻絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̻�1��":
			Albamoncrolling.area += ",B3800300";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�̻�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̻�2��":
			Albamoncrolling.area += ",B3800310";
			AlbaHeavencrolling.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�̻�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��˹̵�":
			Albamoncrolling.area += ",B3800120";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B9%E8%BE%CB%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��˹̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���â��":
			Albamoncrolling.area += ",B3800130";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%BB%F3%BB%E7%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			Albamoncrolling.area += ",B3800140";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%BB%F3%BB%EA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			Albamoncrolling.area += ",B3800150";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϳ��ý��嵿":
			Albamoncrolling.area += ",B3800180";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%BD%C5%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϳ��ý��嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϳ��ý���1��":
			Albamoncrolling.area += ",B3800160";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%BD%C5%C0%E51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϳ��ý���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϳ��ý���2��":
			Albamoncrolling.area += ",B3800170";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%BD%C5%C0%E52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϳ��ý���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ʵ�":
			Albamoncrolling.area += ",B3800320";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C0%A7%B7%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ʵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â�쵿":
			Albamoncrolling.area += ",B3800190";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C3%A2%BF%EC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â�쵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ����":
			Albamoncrolling.area += ",B3800200";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C3%B5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			Albamoncrolling.area += ",B3800210";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C3%CA%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			Albamoncrolling.area += ",B3800220";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C3%CA%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�":
			Albamoncrolling.area += ",B3800230";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C3%E1%B1%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ�굿":
			Albamoncrolling.area += ",B3800240";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C7%B3%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ�â��":
			Albamoncrolling.area += ",B3800250";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C7%CF%BB%E7%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ�â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ�":
			Albamoncrolling.area += ",B3800260";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C7%CF%BB%EA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�оϵ�":
			Albamoncrolling.area += ",B3800270";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C7%D0%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�оϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׵�":
			Albamoncrolling.area += ",B3800280";
			AlbaHeavencrolling.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C7%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ":
			Albamoncrolling.area += ",B3900520";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B1%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��赿":
			Albamoncrolling.area += ",B3900430";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B1%E2%B9%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			Albamoncrolling.area += ",B3900010";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B1%E2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			Albamoncrolling.area += ",B3900020";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B1%E2%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3900030";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B3%B2%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ɵ�":
			Albamoncrolling.area += ",B3900040";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B4%C9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ɵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź1��":
			Albamoncrolling.area += ",B3900440";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź2��":
			Albamoncrolling.area += ",B3900450";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź3��":
			Albamoncrolling.area += ",B3900460";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź4��":
			Albamoncrolling.area += ",B3900470";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź5��":
			Albamoncrolling.area += ",B3900530";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ƾ6��":
			Albamoncrolling.area += ",B3900540";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ƾ6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź7��":
			Albamoncrolling.area += ",B3900640";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź8��":
			Albamoncrolling.area += ",B3900650";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź8��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3900060";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B8%B6%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż۸�":
			Albamoncrolling.area += ",B3900070";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B8%C5%BC%DB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ż۸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			Albamoncrolling.area += ",B3900550";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ۵�":
			Albamoncrolling.area += ",B3900100";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B9%DD%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݿ���":
			Albamoncrolling.area += ",B3900110";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B9%DD%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3900120";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B9%DD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�汳��":
			Albamoncrolling.area += ",B3900560";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B9%E6%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�汳��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			Albamoncrolling.area += ",B3900130";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B9%E8%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3900140";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BA%B4%C1%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			Albamoncrolling.area += ",B3900570";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BA%B4%C1%A11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			Albamoncrolling.area += ",B3900580";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BA%B4%C1%A12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3900150";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BA%C0%B4%E3%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			Albamoncrolling.area += ",B3900170";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BA%F1%BA%C0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ô��":
			Albamoncrolling.area += ",B3900590";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BB%EA%C3%B4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ô��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֵ�":
			Albamoncrolling.area += ",B3900510";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BB%F5%BC%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ÿ�":
			Albamoncrolling.area += ",B3900180";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BC%AD%BD%C5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���Ÿ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���쵿":
			Albamoncrolling.area += ",B3900190";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BC%AE%BF%EC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���쵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۵�":
			Albamoncrolling.area += ",B3900600";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۻ굿":
			Albamoncrolling.area += ",B3900210";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BC%DB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ۻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۻ��":
			Albamoncrolling.area += ",B3900220";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BC%DB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ۻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ�":
			Albamoncrolling.area += ",B3900610";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȳ絿":
			Albamoncrolling.area += ",B3900270";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BE%C8%B3%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȳ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�簨��":
			Albamoncrolling.area += ",B3900290";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BE%E7%B0%A8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�簨��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			Albamoncrolling.area += ",B3900480";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BF%B5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ���ÿ��굿":
			Albamoncrolling.area += ",B3900490";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BF%C0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ���ÿ��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3900310";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BF%EC%C1%A4%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȸ�":
			Albamoncrolling.area += ",B3900340";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C0%E5%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3900620";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C0%E5%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			Albamoncrolling.area += ",B3900360";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C1%A4%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�����ߵ�":
			Albamoncrolling.area += ",B3900360";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�����ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȵ�":
			Albamoncrolling.area += ",B3900630";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C1%F8%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����û�赿":
			Albamoncrolling.area += ",B3900420";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C3%BB%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����û�赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź��":
			Albamoncrolling.area += ",B3900380";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C6%C8%C5%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ź��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⳳ��":
			Albamoncrolling.area += ",B3900390";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C7%E2%B3%B2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�Ⳳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�굿":
			Albamoncrolling.area += ",B3900500";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C8%AD%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ�赿":
			Albamoncrolling.area += ",B3900410";
			AlbaHeavencrolling.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C8%B2%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ�赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		}
	}
}
