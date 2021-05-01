package region;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import GUI.Mainpage;
import Function.crolling;
import Function.wewe;

public class Gyeonggi2 {
	public boolean flag;

	public void Gyeonggi2City(ActionEvent e) {
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

		case "���絿":
			crolling.area += ",B2300010";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B0%A1%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2300020";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B0%A1%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�赿":
			crolling.area += ",B2300030";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += "B2300040";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B0%ED%BB%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2300050";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B0%F8%B5%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2300060";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B1%B8%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݱ���":
			crolling.area += ",B2300070";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B1%DD%B1%A4%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݱ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݻ굿":
			crolling.area += "B2300080";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B1%DD%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ���":
			crolling.area += ",B2300090";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B1%DD%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2300100";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B3%AB%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��յ�":
			crolling.area += ",B2300110";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B4%E7%BF%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��յ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",B2300120";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B4%EB%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += "B2300130";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B4%EB%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���⵿":
			crolling.area += ",B2300140";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B5%B5%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2300150";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B5%BF%BA%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",B2300160";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B8%ED%B7%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̾��":
			crolling.area += "B2300170";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B9%CC%BE%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̾��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȭ��":
			crolling.area += ",B2300180";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%B9%DF%C8%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȭ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2300190";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BA%B8%B0%B3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2300200";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BA%C0%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",B2300210";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BA%C0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",B2300220";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BB%E7%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׸�":
			crolling.area += ",B2300230";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BB%EF%C1%D7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���׸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",B2300240";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BC%AD%BF%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",B2300250";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BC%AD%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2300260";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BC%AE%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2300270";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BC%BA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",B2300280";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BC%FE%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű�����":
			crolling.area += ",B2300290";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BD%C5%B0%C7%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ű�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ÿ�굿":
			crolling.area += ",B2300300";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BD%C5%B8%F0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ÿ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż�����":
			crolling.area += ",B2300310";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BD%C5%BC%D2%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ż�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",B2300320";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BD%C5%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ƾ絿":
			crolling.area += ",B2300330";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BE%C6%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ƾ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȼ�1��":
			crolling.area += ",B2300460";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BE%C8%BC%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȼ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȼ�2��":
			crolling.area += ",B2300470";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BE%C8%BC%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȼ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȼ�3��":
			crolling.area += ",B2300480";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BE%C8%BC%BA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȼ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�缺��":
			crolling.area += ",��B2300480";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BE%E7%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�缺��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2300350";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BF%AC%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",B2300360";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BF%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",B2300370";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BF%C1%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",B2300380";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BF%C1%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",B2300390";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%BF%F8%B0%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2300400";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%C0%CE%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���׸�":
			crolling.area += ",B2300410";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%C0%CF%C1%D7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���׸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׻��":
			crolling.area += ",B2300420";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%C1%D7%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�׻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߸���":
			crolling.area += ",B2300430";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%C1%DF%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�߸���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����":
			crolling.area += ",B2300440";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%C3%A2%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2300450";
			wewe.area += "031%7C%7C%BE%C8%BC%BA%BD%C3%7C%7C%C7%F6%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",B2400010";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B0%A5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",B2400040";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B0%FC%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",B2400020";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B0%FC%BE%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",B2400030";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B0%FC%BE%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",B2400050";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B1%CD%C0%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�޾ȵ�":
			crolling.area += ",B2400060";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B4%DE%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�޾ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			crolling.area += ",B2400070";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%B9%FC%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�θ���":
			crolling.area += ",B2400080";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BA%CE%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�θ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",B2400090";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BA%CE%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",B2400130";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BA%F1%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���1��":
			crolling.area += ",B2400100";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BA%F1%BB%EA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���2��":
			crolling.area += ",B2400110";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BA%F1%BB%EA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���3��":
			crolling.area += ",B2400120";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BA%F1%BB%EA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",B2400140";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%BD%C5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			crolling.area += ",B2400150";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%C6%F2%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",B2400160";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%C6%F2%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ�赿":
			crolling.area += ",B2400200";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%C8%A3%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ�赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ��1��":
			crolling.area += ",B2400170";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%C8%A3%B0%E81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ��2��":
			crolling.area += ",B2400180";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%C8%A3%B0%E82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ��3��":
			crolling.area += "B2400190";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B5%BF%BE%C8%B1%B8%7C%7C%C8%A3%B0%E83%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ��3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ڴ޵�":
			crolling.area += ",B2500030";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%B9%DA%B4%DE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ڴ޵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ڴ�1��":
			crolling.area += ",B2500010";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%B9%DA%B4%DE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ڴ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ڴ�2��":
			crolling.area += ",B2500020";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%B9%DA%B4%DE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ڴ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2500070";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BC%AE%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",B2500040";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BC%AE%BC%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",B2500050";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BC%AE%BC%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����3��":
			crolling.area += ",B2500060";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BC%AE%BC%F63%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ絿":
			crolling.area += ",B2500170";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ�1��":
			crolling.area += ",B2500080";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E71%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ�2��":
			crolling.area += ",B2500090";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E72%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ�3��":
			crolling.area += ",B2500100";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E73%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ�3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ�4��":
			crolling.area += ",B2500110";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E74%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ�4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ�5��":
			crolling.area += ",B2500120";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E75%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ�5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ�6��":
			crolling.area += ",B2500130";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E76%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ�6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ�7��":
			crolling.area += ",B2500140";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E77%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ�7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ�8��":
			crolling.area += ",B2500150";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E78%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ�8��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⱦ�9��":
			crolling.area += ",B2500160";
			wewe.area += "031%7C%7C%BE%C8%BE%E7%BD%C3+%B8%B8%BE%C8%B1%B8%7C%7C%BE%C8%BE%E79%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ⱦ�9��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",B2600010";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B0%ED%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2600020";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B0%ED%C0%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",B2600030";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B1%A4%BB%E7%B5%B";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2600040";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B1%A4%C0%FB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",B2600050";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",B2600060";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B3%B2%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			crolling.area += ",B2600070";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B4%F6%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2600080";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B4%F6%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += "B2600090";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B8%B6%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���۵�":
			crolling.area += ",B2600100";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B8%B8%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�鼮��":
			crolling.area += ",B2600110";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%B9%E9%BC%AE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�鼮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",B2600120";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%BA%C0%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",B2600130";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%BB%EA%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",B2600140";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%BB%EF%BC%FE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��е�":
			crolling.area += ",B2600150";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%BE%EE%B5%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2600160";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%BF%C1%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",B2600170";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%C0%AF%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2600180";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%C0%B2%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2600190";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%C0%BA%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",B2600200";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%C0%E5%C8%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ�ϵ�":
			crolling.area += ",B2600210";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%C8%B8%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȸ�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȸ����":
			crolling.area += ",B2600220";
			wewe.area += "031%7C%7C%BE%E7%C1%D6%BD%C3%7C%7C%C8%B8%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȸ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",B2700010";
			wewe.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%B0%AD%BB%F3%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",B2700020";
			wewe.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%B0%AD%C7%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2700030";
			wewe.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%B0%B3%B1%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܿ���":
			crolling.area += ",B2700040";
			wewe.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%B4%DC%BF%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ܿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2700050";
			wewe.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%BC%AD%C1%BE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�絿��":
			crolling.area += ",B2700060";
			wewe.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%BE%E7%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�絿��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�缭��":
			crolling.area += ",B2700070";
			wewe.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%BE%E7%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�缭��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2700080";
			wewe.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%BE%E7%C6%F2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",B2700090";
			wewe.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%BF%C1%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�빮��":
			crolling.area += ",B2700100";
			wewe.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%BF%EB%B9%AE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�빮��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",B2700110";
			wewe.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%C1%F6%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û���":
			crolling.area += ",B2700120";
			wewe.area += "031%7C%7C%BE%E7%C6%F2%B1%BA%7C%7C%C3%BB%BF%EE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("û���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2800010";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B0%A1%B3%B2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2800140";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B0%A1%BE%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",B2800020";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B0%AD%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",B2800150";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݻ��":
			crolling.area += ",B2800030";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B1%DD%BB%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ݻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ɼ���":
			crolling.area += ",B2800040";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B4%C9%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ɼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2800160";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B4%C9%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2800170";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B4%DC%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��Ÿ�":
			crolling.area += ",B2800050";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B4%EB%BD%C5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��Ÿ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŷ浿":
			crolling.area += ",B2800180";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B8%C5%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ŷ浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",B2800190";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%B8%E8%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϳ���":
			crolling.area += ",B2800060";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BA%CF%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ϳ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϸ�":
			crolling.area += ",B2800070";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BB%EA%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﱳ��":
			crolling.area += ",B2800200";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BB%EF%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ﱳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			crolling.area += ",B2800210";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BB%F3%B0%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",B2800220";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BB%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2800230";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BD%C5%C1%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",B2800110";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",B2800240";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BF%AC%B6%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",B2800250";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BF%AC%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ݵ�":
			crolling.area += ",B2800260";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BF%C0%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",B2800120";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BF%C0%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�츸��":
			crolling.area += ",B2800270";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BF%EC%B8%B8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�츸��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���۵�":
			crolling.area += ",B2800280";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%BF%F9%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2800090";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C1%A1%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2800290";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C1%A1%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߾ӵ�":
			crolling.area += ",B2800130";
			Mainpage.Filtering[Mainpage.index].setText("�߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â��":
			crolling.area += ",B2800300";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ�۵�":
			crolling.area += ",B2800310";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C3%B5%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õ�۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϰŵ�":
			crolling.area += ",B2800320";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C7%CF%B0%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϰŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϵ�":
			crolling.area += ",B2800330";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",B2800340";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C7%F6%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȫ����":
			crolling.area += ",B2800350";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C8%AB%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȫ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",B2800100";
			wewe.area += "031%7C%7C%BF%A9%C1%D6%BD%C3%7C%7C%C8%EF%C3%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2900010";
			wewe.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%B1%BA%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̻��":
			crolling.area += ",B2900020";
			wewe.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%B9%CC%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̻��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���и�":
			crolling.area += ",B2900030";
			wewe.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%B9%E9%C7%D0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���и�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż���":
			crolling.area += ",B2900040";
			wewe.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%BD%C5%BC%AD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ż���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",B2900050";
			wewe.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%BF%AC%C3%B5%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��¡��":
			crolling.area += ",B2900060";
			wewe.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%BF%D5%C2%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��¡��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�峲��":
			crolling.area += ",B2900070";
			wewe.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%C0%E5%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�峲��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B2900080";
			wewe.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%C0%FC%B0%EE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�߸�":
			crolling.area += ",B2900090";
			wewe.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%C1%DF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�߸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û���":
			crolling.area += ",B2900100";
			wewe.area += "031%7C%7C%BF%AC%C3%B5%B1%BA%7C%7C%C3%BB%BB%EA%B8%E";
			Mainpage.Filtering[Mainpage.index].setText("û���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3000010";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B0%A1%BC%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			crolling.area += ",B3000020";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B0%A1%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3000030";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B0%A5%B0%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3000040";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B0%ED%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȵ�":
			crolling.area += ",B3000050";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B1%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݾϵ�":
			crolling.area += ",B3000060";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B1%DD%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݾϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����̵�":
			crolling.area += ",B3000070";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B3%BB%BB%EF%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3000080";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B4%A9%C0%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ":
			crolling.area += ",B3000090";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B5%CE%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3000100";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%B9%FA%C0%BD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�λ굿":
			crolling.area += ",B3000110";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BA%CE%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�λ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",B3000120";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3000130";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BC%AD%B6%FB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3000140";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BC%BC%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��û��":
			crolling.area += ",B3000150";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BC%F6%C3%BB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��û��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",B3000160";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BE%E7%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",B3000170";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BF%C0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܻ�̵�":
			crolling.area += ",B3000180";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BF%DC%BB%EF%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܻ�̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",B3000190";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			crolling.area += ",B3000200";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%C0%BA%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3000210";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%C1%F6%B0%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�е�":
			crolling.area += ",B3000220";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%C3%BB%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ûȣ��":
			crolling.area += ",B3000230";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%C3%BB%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ûȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ž��":
			crolling.area += ",B3000240";
			wewe.area += "031%7C%7C%BF%C0%BB%EA%BD%C3%7C%7C%C5%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ž��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ŵ�":
			crolling.area += ",B3100010";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%B0%ED%B8%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3100020";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%B0%F8%BC%BC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3100030";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%B1%B8%B0%A5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3100190";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",B3100200";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󼭵�":
			crolling.area += ",B3100040";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%B3%F3%BC%AD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�󼭵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���鵿":
			crolling.area += ",B3100050";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%B5%BF%B9%E9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���鵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",B3100060";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%B8%B6%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",B3100070";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BA%B8%B6%F3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3100080";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BA%B8%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�󰥵�":
			crolling.area += ",B3100090";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BB%F3%B0%A5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�󰥵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",B3100100";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BB%F3%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",B3100210";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",B3100110";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BC%AD%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű���":
			crolling.area += ",B3100120";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BD%C5%B0%A5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ű���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�𳲵�":
			crolling.area += ",B3100130";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BE%F0%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�𳲵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3100140";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%BF%B5%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ�":
			crolling.area += ",B3100150";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",B3100160";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%C1%F6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û����":
			crolling.area += ",B3100170";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%C3%BB%B4%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϰ���":
			crolling.area += ",B3100180";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%B1%E2%C8%EF%B1%B8%7C%7C%C7%CF%B0%A5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϰ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��⵿":
			crolling.area += ",B3110010";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%B0%ED%B1%E2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��⵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",B3110020";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%B5%BF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",B3110030";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%BB%F3%C7%F61%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",B3110040";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%BB%F3%C7%F62%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3110050";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%BB%F3%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3110060";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%BC%BA%BA%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ź���":
			crolling.area += ",B3110070";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%BD%C5%BA%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ź���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3110100";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%C1%D7%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",B3110080";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%C1%D7%C0%FC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",B3110090";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%C1%D7%C0%FC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ��õ��":
			crolling.area += ",B3110130";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%C7%B3%B4%F6%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ��õ1��":
			crolling.area += ",B3110110";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%C7%B3%B4%F6%C3%B51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ��õ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ��õ2��":
			crolling.area += ",B3110120";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%BC%F6%C1%F6%B1%B8%7C%7C%C7%B3%B4%F6%C3%B52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ��õ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",B3120010";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B0%ED%B8%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�跮�嵿":
			crolling.area += ",B3120020";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B1%E8%B7%AE%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�跮�嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",B3120030";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",B3120040";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B3%B2%BB%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ε�":
			crolling.area += ",B3120180";
			Mainpage.Filtering[Mainpage.index].setText("���ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",B3120050";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B8%B6%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3120060";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B8%F0%C7%F6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϸ�":
			crolling.area += ",B3120070";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%B9%E9%BE%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﰡ��":
			crolling.area += ",B3120080";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%BB%EF%B0%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ﰡ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3120090";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%BE%E7%C1%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",B3120100";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%BF%AA%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",B3120190";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",B3120110";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%BF%EE%C7%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",B3120120";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%BF%F8%BB%EF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3120200";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",B3120130";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%C0%AF%B9%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̵���":
			crolling.area += ",B3120140";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�̵���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ν��߾ӵ�":
			crolling.area += ",B3120210";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("���ν��߾ӵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3120150";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%C6%F7%B0%EE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ذ":
			crolling.area += ",B3120160";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%C7%D8%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ذ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ��":
			crolling.area += ",B3120170";
			wewe.area += "031%7C%7C%BF%EB%C0%CE%BD%C3+%C3%B3%C0%CE%B1%B8%7C%7C%C8%A3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",B3200010";
			wewe.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%B0%ED%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���յ�":
			crolling.area += ",B3200040";
			wewe.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%B3%BB%BC%D5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���յ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",B3200020";
			wewe.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%B3%BB%BC%D51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",B3200030";
			wewe.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%B3%BB%BC%D52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ΰ":
			crolling.area += ",B3200140";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�ΰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ﵿ":
			crolling.area += ",B3200050";
			wewe.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%BB%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3200060";
			wewe.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%BF%C0%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�հ":
			crolling.area += ",B3200070";
			wewe.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%BF%D5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�հ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",B3200080";
			wewe.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%BF%F9%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̵�":
			crolling.area += ",B3200090";
			wewe.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�赿":
			crolling.area += ",B3200100";
			wewe.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%C3%BB%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",B3200110";
			wewe.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%C3%CA%C6%F2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",B3200120";
			wewe.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%C6%F7%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ǵ�":
			crolling.area += ",B3200130";
			wewe.area += "031%7C%7C%C0%C7%BF%D5%BD%C3%7C%7C%C7%D0%C0%C7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ǵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ɵ�":
			crolling.area += ",B3300040";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B0%A1%B4%C9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ɵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",B3300010";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B0%A1%B4%C91%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",B3300050";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B0%ED%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݿ���":
			crolling.area += ",B3300060";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B1%DD%BF%C0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",B3300070";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B3%AB%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			crolling.area += ",B3300080";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B3%EC%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ζ���":
			crolling.area += ",B3300090";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%B9%CE%B6%F4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ζ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",B3300100";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%BB%EA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۻ�1��":
			crolling.area += ",B3300240";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�ۻ�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۻ�2��":
			crolling.area += ",B3300250";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�ۻ�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű":
			crolling.area += ",B3300130";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%BD%C5%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ű");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű�1��":
			crolling.area += ",B3300110";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%BD%C5%B0%EE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ű�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ű�2��":
			crolling.area += ",B3300120";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%BD%C5%B0%EE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ű�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3300140";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%BF%EB%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����ε�":
			crolling.area += ",B3300180";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C0%C7%C1%A4%BA%CE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�����ε�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������1��":
			crolling.area += ",B3300150";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C0%C7%C1%A4%BA%CE1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������2��":
			crolling.area += ",B3300160";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C0%C7%C1%A4%BA%CE2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������3��":
			crolling.area += ",B3300170";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C0%C7%C1%A4%BA%CE3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ڱݵ�":
			crolling.area += ",B3300260";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�ڱݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",B3300190";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C0%DA%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",B3300200";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C0%E5%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ����":
			crolling.area += ",B3300230";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C8%A3%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ��1��":
			crolling.area += ",B3300210";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C8%A3%BF%F81%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ��1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ��2��":
			crolling.area += ",B3300220";
			wewe.area += "031%7C%7C%C0%C7%C1%A4%BA%CE%BD%C3%7C%7C%C8%A3%BF%F82%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȣ��2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ｑ��":
			crolling.area += ",B3300270";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�Ｑ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",B3400010";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B0%A5%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��㵿":
			crolling.area += ",B3400020";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B0%ED%B4%E3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��㵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",B3400030";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B0%FC%B0%ED%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ܿ���":
			crolling.area += ",B3400040";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B4%DC%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ܿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",B3400050";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B4%EB%BF%F9%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3400060";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B4%EB%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",B3400070";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B8%B6%C0%E5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�𰡸�":
			crolling.area += ",B3400080";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B8%F0%B0%A1%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�𰡸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",B3400090";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%B9%E9%BB%E7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ι���":
			crolling.area += ",B3400100";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%BA%CE%B9%DF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ι���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3400110";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%BB%E7%C0%BD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3400120";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%BC%B3%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3400130";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%BC%DB%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵи�":
			crolling.area += ",B3400140";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%BD%C5%B5%D0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ŵи�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ﵿ":
			crolling.area += ",B3400150";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%BE%C8%C8%EF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ﵿ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",B3400160";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C0%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3400170";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C0%B2%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ϵ�":
			crolling.area += ",B3400180";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C0%E5%B7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȣ����":
			crolling.area += ",B3400190";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C0%E5%C8%A3%BF%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("��ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ���߸���":
			crolling.area += ",B3400200";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C1%DF%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ���߸���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",B3400210";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C1%F5%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3400220";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C1%F5%C6%F7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3400230";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C1%F8%B8%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��â����":
			crolling.area += ",B3400240";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C3%A2%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��â����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȣ����":
			crolling.area += ",B3400250";
			wewe.area += "031%7C%7C%C0%CC%C3%B5%BD%C3%7C%7C%C8%A3%B9%FD%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȣ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�˻굿":
			crolling.area += ",B3500010";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B0%CB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�˻굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź��":
			crolling.area += ",B3500020";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%A4%C5%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ź��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",B3500030";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%B3%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3500040";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%BA%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݴɵ�":
			crolling.area += "B3500050";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%DD%B4%C9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݴɵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",B3500080";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%DD%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",B3500060";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%DD%C3%CC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",B3500070";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B1%DD%C3%CC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3500230";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B4%D9%C0%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",B3500240";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B4%E7%C7%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",B3500250";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B5%BF%C6%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ʊݵ�":
			crolling.area += ",B3500090";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B8%C6%B1%DD%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ʊݵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�񵿵�":
			crolling.area += ",B3500260";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B8%F1%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�񵿵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ߵ�":
			crolling.area += ",B3500270";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B9%AE%B9%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3500100";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B9%AE%BB%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3500110";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%B9%FD%BF%F8%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ų���":
			crolling.area += ",B3500280";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BB%EA%B3%B2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ų���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			crolling.area += ",B3500290";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BB%F3%C1%F6%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���е�":
			crolling.area += ",B3500300";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BC%AD%C6%D0%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���е�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",B3500310";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BC%DB%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֽý��̵�":
			crolling.area += ",B3500320";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BD%C5%C3%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֽý��̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ƶ���":
			crolling.area += ",B3500120";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BE%C6%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ƶ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߴ絿":
			crolling.area += ",B3500330";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BE%DF%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߴ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ߵ���":
			crolling.area += ",B3500130";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BE%DF%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ߵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ٻ굿":
			crolling.area += ",B3500340";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BF%AC%B4%D9%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ٻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3500350";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BF%C0%B5%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�͵���":
			crolling.area += ",B3500360";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BF%CD%B5%BF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�͵���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ո�":
			crolling.area += ",B3500330";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%BF%F9%B7%D5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ո�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ܸ�":
			crolling.area += ",B3500130";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C0%E5%B4%DC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ܸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3500340";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C0%FB%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3500170";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C1%B6%B8%AE%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ź����":
			crolling.area += ",B3500200";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C5%BA%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ź����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3500210";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C6%C4%C1%D6%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",B3500220";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C6%C4%C6%F2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��������":
			crolling.area += ",B3500370";
			wewe.area += "031%7C%7C%C6%C4%C1%D6%BD%C3%7C%7C%C7%CF%C1%F6%BC%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���絿":
			crolling.area += ",B3600010";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B0%A1%C0%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",B3600020";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B0%ED%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3600030";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B1%BA%B9%AE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",B3600040";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B5%B5%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",B3600050";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B5%B6%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���赿":
			crolling.area += ",B3600060";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B5%BF%BB%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",B3600070";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%B8%F0%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3600100";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BA%F1%C0%FC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",B3600080";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BA%F1%C0%FC1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",B3600090";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BA%F1%C0%FC2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3600110";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BC%AD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź��":
			crolling.area += ",B3600120";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BC%AD%C5%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ź��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ýü�����":
			crolling.area += ",B3600130";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BC%BC%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ýü�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�һ絿":
			crolling.area += ",B3600140";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BC%D2%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�һ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ŵ뵿":
			crolling.area += ",B3600150";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BD%C5%B4%EB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�Ŵ뵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���嵿":
			crolling.area += ",B3600180";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BD%C5%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",B3600160";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BD%C5%C0%E51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",B3600170";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BD%C5%C0%E52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3600190";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BE%C8%C1%DF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3600200";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BF%C0%BC%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",B3600210";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BF%EB%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",B3600220";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%BF%F9%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",B3600230";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C0%AF%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���浿":
			crolling.area += ",B3600240";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C0%CC%C3%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			crolling.area += ",B3600250";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C0%E5%B4%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			crolling.area += ",B3600260";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C0%E5%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׹鵿":
			crolling.area += ",B3600270";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C1%D7%B9%E9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�׹鵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",B3600280";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C1%F6%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3600290";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C1%F6%C1%A6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3600300";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C1%F8%C0%A7%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�浿":
			crolling.area += ",B3600310";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C3%BB%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("û�浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "û�ϸ�":
			crolling.area += ",B3600320";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C3%BB%BA%CF%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("û�ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ����":
			crolling.area += ",B3600330";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C4%A5%B1%AB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ĥ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ĥ����":
			crolling.area += ",B3600340";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C4%A5%BF%F8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ĥ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�뺹��":
			crolling.area += ",B3600350";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C5%EB%BA%B9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�뺹��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ؼ���":
			crolling.area += ",B3600360";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C6%D8%BC%BA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�ؼ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���õ�":
			crolling.area += ",B3600370";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C6%F2%C5%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���õ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3600380";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C6%F7%BD%C2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3600390";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C7%D5%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3600400";
			wewe.area += "031%7C%7C%C6%F2%C5%C3%BD%C3%7C%7C%C7%F6%B4%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",B3700010";
			wewe.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%B0%A1%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���θ�":
			crolling.area += ",B3700020";
			wewe.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%B0%FC%C0%CE%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���θ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�ñ�����":
			crolling.area += ",B3700030";
			wewe.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%B1%BA%B3%BB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��õ�ñ�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̸�":
			crolling.area += ",B3700040";
			wewe.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%B3%BB%C3%CC%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���̸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3700050";
			wewe.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%B5%BF%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ܵ�":
			crolling.area += ",B3700060";
			wewe.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BC%B1%B4%DC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ܵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",B3700070";
			wewe.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BC%B3%BF%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3700080";
			wewe.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BC%D2%C8%EA%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�źϸ�":
			crolling.area += ",B3700090";
			wewe.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BD%C5%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�źϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3700100";
			wewe.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BD%C5%C0%BE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��浿":
			crolling.area += ",B3700110";
			wewe.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BE%EE%B7%E6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��浿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϸ�":
			crolling.area += ",B3700120";
			wewe.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BF%B5%BA%CF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���ϸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���߸�":
			crolling.area += ",B3700130";
			wewe.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%BF%B5%C1%DF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���߸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̵���":
			crolling.area += ",B3700140";
			wewe.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%C0%CC%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�̵���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϵ���":
			crolling.area += ",B3700150";
			wewe.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%C0%CF%B5%BF%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ϵ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���۵�":
			crolling.area += ",B3700160";
			wewe.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%C0%DA%C0%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ڰ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â����":
			crolling.area += ",B3700170";
			wewe.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%C3%A2%BC%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("â����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",B3700190";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����":
			crolling.area += ",B3700180";
			wewe.area += "031%7C%7C%C6%F7%C3%B5%BD%C3%7C%7C%C8%AD%C7%F6%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",B3800010";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B0%A8%BA%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",B3800020";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B0%A8%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",B3800030";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B0%A8%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",B3800040";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B1%A4%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���굿":
			crolling.area += ",B3800050";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B1%B3%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3800290";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ��":
			crolling.area += ",B3800090";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B4%F6%C7%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ1��":
			crolling.area += ",B3800060";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B4%F6%C7%B31%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ2��":
			crolling.area += ",B3800070";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B4%F6%C7%B32%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ǳ3��":
			crolling.area += ",B3800080";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B4%F6%C7%B33%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ǳ3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3800100";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B8%C1%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̻絿":
			crolling.area += ",B3800110";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B9%CC%BB%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�̻絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̻�1��":
			crolling.area += ",B3800300";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�̻�1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�̻�2��":
			crolling.area += ",B3800310";
			wewe.area += "";
			Mainpage.Filtering[Mainpage.index].setText("�̻�2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��˹̵�":
			crolling.area += ",B3800120";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%B9%E8%BE%CB%B9%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��˹̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���â��":
			crolling.area += ",B3800130";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%BB%F3%BB%E7%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���":
			crolling.area += ",B3800140";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%BB%F3%BB%EA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����":
			crolling.area += ",B3800150";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%BC%B1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϳ��ý��嵿":
			crolling.area += ",B3800180";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%BD%C5%C0%E5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϳ��ý��嵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϳ��ý���1��":
			crolling.area += ",B3800160";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%BD%C5%C0%E51%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϳ��ý���1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϳ��ý���2��":
			crolling.area += ",B3800170";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%BD%C5%C0%E52%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϳ��ý���2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ʵ�":
			crolling.area += ",B3800320";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C0%A7%B7%CA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ʵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "â�쵿":
			crolling.area += ",B3800190";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C3%A2%BF%EC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("â�쵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "õ����":
			crolling.area += ",B3800200";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C3%B5%C7%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("õ����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���̵�":
			crolling.area += ",B3800210";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C3%CA%C0%CC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���̵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ϵ�":
			crolling.area += ",B3800220";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C3%CA%C0%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ�":
			crolling.area += ",B3800230";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C3%E1%B1%C3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ǳ�굿":
			crolling.area += ",B3800240";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C7%B3%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ǳ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ�â��":
			crolling.area += ",B3800250";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C7%CF%BB%E7%C3%A2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ�â��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ϻ�":
			crolling.area += ",B3800260";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C7%CF%BB%EA%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ϻ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�оϵ�":
			crolling.area += ",B3800270";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C7%D0%BE%CF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�оϵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�׵�":
			crolling.area += ",B3800280";
			wewe.area += "031%7C%7C%C7%CF%B3%B2%BD%C3%7C%7C%C7%D7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�׵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݰ":
			crolling.area += ",B3900520";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B1%DD%B0%EE%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݰ");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��赿":
			crolling.area += ",B3900430";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B1%E2%B9%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��굿":
			crolling.area += ",B3900010";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B1%E2%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȵ�":
			crolling.area += ",B3900020";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B1%E2%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3900030";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B3%B2%BE%E7%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ɵ�":
			crolling.area += ",B3900040";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B4%C9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ɵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź1��":
			crolling.area += ",B3900440";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź2��":
			crolling.area += ",B3900450";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA2%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź3��":
			crolling.area += ",B3900460";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź3��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź4��":
			crolling.area += ",B3900470";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź4��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź5��":
			crolling.area += ",B3900530";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź5��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ƾ6��":
			crolling.area += ",B3900540";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ƾ6��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź7��":
			crolling.area += ",B3900640";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź7��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź8��":
			crolling.area += ",B3900650";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B5%BF%C5%BA8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ź8��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3900060";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B8%B6%B5%B5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ż۸�":
			crolling.area += ",B3900070";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B8%C5%BC%DB%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ż۸�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��":
			crolling.area += ",B3900550";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B8%F1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݼ۵�":
			crolling.area += ",B3900100";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B9%DD%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݼ۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ݿ���":
			crolling.area += ",B3900110";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B9%DD%BF%F9%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ݿ���");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3900120";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B9%DD%C1%A4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�汳��":
			crolling.area += ",B3900560";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B9%E6%B1%B3%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�汳��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��絿":
			crolling.area += ",B3900130";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%B9%E8%BE%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3900140";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BA%B4%C1%A1%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����1��":
			crolling.area += ",B3900570";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BA%B4%C1%A11%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����1��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "����2��":
			crolling.area += ",B3900580";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BA%B4%C1%A12%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("����2��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3900150";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BA%C0%B4%E3%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�����":
			crolling.area += ",B3900170";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BA%F1%BA%C0%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�����");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ô��":
			crolling.area += ",B3900590";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BB%EA%C3%B4%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��ô��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ֵ�":
			crolling.area += ",B3900510";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BB%F5%BC%D6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ֵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���Ÿ�":
			crolling.area += ",B3900180";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BC%AD%BD%C5%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("���Ÿ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���쵿":
			crolling.area += ",B3900190";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BC%AE%BF%EC%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���쵿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�۵�":
			crolling.area += ",B3900600";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BC%DB%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�۵�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۻ굿":
			crolling.area += ",B3900210";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BC%DB%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ۻ굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ۻ��":
			crolling.area += ",B3900220";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BC%DB%BB%EA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�ۻ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ŵ�":
			crolling.area += ",B3900610";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BD%C5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ŵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�ȳ絿":
			crolling.area += ",B3900270";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BE%C8%B3%E7%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("�ȳ絿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�簨��":
			crolling.area += ",B3900290";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BE%E7%B0%A8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("�簨��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��õ��":
			crolling.area += ",B3900480";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BF%B5%C3%B5%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("��õ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ���ÿ��굿":
			crolling.area += ",B3900490";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BF%C0%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ���ÿ��굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3900310";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%BF%EC%C1%A4%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ȸ�":
			crolling.area += ",B3900340";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C0%E5%BE%C8%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ȸ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3900620";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C0%E5%C1%F6%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "������":
			crolling.area += ",B3900360";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C1%A4%B3%B2%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("������");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�����ߵ�":
			crolling.area += ",B3900360";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C1%DF%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�����ߵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "���ȵ�":
			crolling.area += ",B3900630";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C1%F8%BE%C8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("���ȵ�");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ����û�赿":
			crolling.area += ",B3900420";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C3%BB%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ����û�赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "��ź��":
			crolling.area += ",B3900380";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C6%C8%C5%BA%B8%E9";
			Mainpage.Filtering[Mainpage.index].setText("��ź��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "�Ⳳ��":
			crolling.area += ",B3900390";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C7%E2%B3%B2%C0%BE";
			Mainpage.Filtering[Mainpage.index].setText("�Ⳳ��");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "ȭ�굿":
			crolling.area += ",B3900500";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C8%AD%BB%EA%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("ȭ�굿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;
		case "Ȳ�赿":
			crolling.area += ",B3900410";
			wewe.area += "031%7C%7C%C8%AD%BC%BA%BD%C3%7C%7C%C8%B2%B0%E8%B5%BF";
			Mainpage.Filtering[Mainpage.index].setText("Ȳ�赿");
			Mainpage.Filtering[Mainpage.index].setVisible(true);
			Mainpage.delete[Mainpage.index++].setVisible(true);
			break;

		}
	}
}
