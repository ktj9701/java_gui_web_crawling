package region;
//��,��,�� �޺��ڽ� ����

import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import Function.Albamoncrolling;
import Function.AlbaHeavencrolling;
import GUI.AlbaHeavenpage;
import GUI.Mainpage;
public class Detail_Area {

	// �����
	static String[] ���� = { "��ü", "������", "������", "���ϱ�", "������", "���Ǳ�", "������", "���α�", "��õ��", "�����", "������", "���빮��",
			"���۱�", "������", "���빮��", "���ʱ�", "������", "���ϱ�", "���ı�","��õ��", "��������", "��걸", "����", "���α�", "�߱�", "�߶���" };

	// ��⵵
	static String[] ��� = { "��ü", "����", "���� ���籸", "���� �ϻ굿��", "���� �ϻ꼭��", "��õ��", "�����", "���ֽ�", "������",
			"������", "������", "�����ֽ�", "����õ��", "��õ��", "������ �д籸", "������ ������", "������ �߿���", "������ �Ǽ���", "������ ���뱸", "������ ��ȱ�",
			"������ �ȴޱ�", "�����", "�Ȼ�� �ܿ���", "�Ȼ�� ��ϱ�", "�ȼ���", "�Ⱦ�� ���ȱ�", "�Ⱦ�� ���ȱ�", "���ֽ�", "����", "���ֽ�", "��õ��", "�����", "���ν� ���ﱸ", "���ν� ������", "���ν� ó�α�",
			"�ǿս�", "�����ν�", "��õ��", "���ֽ�", "���ý�", "��õ��", "�ϳ���", "ȭ����" };

	// ��õ
	static String[] ��õ = { "��ü", "��ȭ��", "��籸", "������", "��õ����", "����Ȧ��", "����", "��õ����", "������", "������", "��õ�߱�" };

	// ����
	static String[] ����= { "��ü", "������", "����", "���ؽ�", "��ô��", "���ʽ�", "�籸��", "��籺", "������", "���ֽ�", "������",
			"������", "ö����", "��õ��", "�¹��", "��â��", "ȫõ��", "ȭõ��", "Ⱦ����" };

	// ����
	static String[] ���� = { "��ü", "�����", "��������", "��������", "������", "�����߱�" };

	// ����
	static String[] ���� = { "��ü", "������" };

	// �泲
	static String[] �泲 = { "��ü", "����", "���ֽ�", "�ݻ걺", "����", "������", "���ɽ�", "�ο���", "�����", "��õ��", "�ƻ��",
			"���걺", "õ�Ƚ� ������", "õ�Ƚ� ���ϱ�", "û�籺", "�¾ȱ�", "ȫ����" };

	// ���
	static String[] ��� = { "��ü", "���걺", "�ܾ籺", "������", "������", "��õ��", "������", "��õ��", "����", "��õ��", "û�ֽ� ��籸",
			"û�ֽ� ������", "û�ֽ� û����", "û�ֽ� �����", "���ֽ�" };

	// �λ�
	static String[] �λ� = { "��ü", "�λ갭����", "������", "���屺", "�λ곲��", "�λ굿��", "������", "�λ�����", "�λ굿��", "���", "���ϱ�", "�λ꼭��",
			"������", "������", "������", "�λ��߱�", "�ؿ�뱸" };

	// ���
	static String[] ��� = { "��ü", "��곲��", "��굿��", "���ϱ�", "���ֱ�", "����߱�" };

	// �泲
	static String[] �泲 = { "��ü", "������", "��â��", "�泲����", "���ؽ�", "���ر�", "�о��", "��õ��", "��û��", "����", "�Ƿɱ�",
			"���ֽ�", "â�籺", "â���� ����������", "â���� ����ȸ����", "â���� ���걸", "â���� ��â��", "â���� ���ر�", "�뿵��", "�ϵ���", "�Ծȱ�", "�Ծ籺",
			"��õ��" };

	// ���
	static String[] ��� = { "��ü", "����", "���ֽ�", "��ɱ�", "���̽�", "������", "��õ��", "�����", "��ȭ��", "���ֽ�", "���ֱ�",
			"�ȵ���", "������", "���籺", "���ֽ�", "��õ��", "��õ��", "�︪��", "������", "�Ǽ���", "û����", "û�۱�", "ĥ�", "���׽� ����", "���׽� �ϱ�" };
	// �뱸
	static String[] �뱸 = { "��ü", "�뱸����", "�޼���", "�޼���", "�뱸����", "�뱸�ϱ�", "�뱸����", "������", "�뱸�߱�" };
	// ����
	static String[] ���� = { "��ü", "���걸", "���ֳ���", "���ֵ���", "���ֺϱ�", "���ּ���" };
	// ����
	static String[] ���� = { "��ü", "������", "���ﱺ", "���", "�����", "���ʱ�", "���ֽ�", "��籺", "������", "���ȱ�", "������",
			"��õ��", "�žȱ�", "������", "������", "���ϱ�", "�ϵ���", "�强��", "���ﱺ", "������", "����", "�س���", "ȭ����" };
	// ����
	static String[] ���� = { "��ü", "��â��", "�����", "������", "������", "���ֱ�", "�ξȱ�", "��â��", "���ֱ�", "�ͻ��", "�ӽǱ�",
			"�����", "���ֽ� ������", "���ֽ� �ϻ걸", "������", "���ȱ�" };
	// ����
	static String[] ���� = { "��ü", "��������", "���ֽ�" };

	public void changeComboBox(ActionEvent e) {
		JComboBox cb = (JComboBox) e.getSource();
		switch ((String) cb.getSelectedItem()) {
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(����);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			Albamoncrolling.area = "I000";
			AlbaHeavencrolling.area="02%7C%7C%C0%FC%C3%BC%7C%7C";
			break;
		case "���":
			Mainpage.ComboModel= new DefaultComboBoxModel(���);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			Albamoncrolling.area = "B000";
			AlbaHeavencrolling.area="031%7C%7C%C0%FC%C3%BC%7C%7C";
			break;
		case "��õ":
			Mainpage.ComboModel= new DefaultComboBoxModel(��õ);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			Albamoncrolling.area = "K000";
			AlbaHeavencrolling.area="032%7C%7C%C0%FC%C3%BC%7C%7C";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(����);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			Albamoncrolling.area = "A000";
			AlbaHeavencrolling.area="033%7C%7C%C0%FC%C3%BC%7C%7C";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(����);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			Albamoncrolling.area = "G000";
			AlbaHeavencrolling.area="042%7C%7C%C0%FC%C3%BC%7C%7C";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(����);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			Albamoncrolling.area = "1000";
			AlbaHeavencrolling.area="044%7C%7C%C0%FC%C3%BC%7C%7C";
			break;
		case "�泲":
			Mainpage.ComboModel= new DefaultComboBoxModel(�泲);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			Albamoncrolling.area = "O000";
			AlbaHeavencrolling.area="041%7C%7C%C0%FC%C3%BC%7C%7C";
			break;
		case "���":
			Mainpage.ComboModel= new DefaultComboBoxModel(���);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			Albamoncrolling.area = "P000";
			AlbaHeavencrolling.area="043%7C%7C%C0%FC%C3%BC%7C%7C";
			break;
		case "�λ�":
			Mainpage.ComboModel= new DefaultComboBoxModel(�λ�);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			Albamoncrolling.area = "H000";
			AlbaHeavencrolling.area="051%7C%7C%C0%FC%C3%BC%7C%7C";
			break;
		case "���":
			Mainpage.ComboModel= new DefaultComboBoxModel(���);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			Albamoncrolling.area = "J000";
			AlbaHeavencrolling.area="052%7C%7C%C0%FC%C3%BC%7C%7C";
			break;
		case "�泲":
			Mainpage.ComboModel= new DefaultComboBoxModel(�泲);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			Albamoncrolling.area = "C000";
			AlbaHeavencrolling.area="055%7C%7C%C0%FC%C3%BC%7C%7C";
			break;
		case "���":
			Mainpage.ComboModel= new DefaultComboBoxModel(���);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			Albamoncrolling.area = "D000";
			AlbaHeavencrolling.area="054%7C%7C%C0%FC%C3%BC%7C%7C";
			break;
		case "�뱸":
			Mainpage.ComboModel= new DefaultComboBoxModel(�뱸);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			Albamoncrolling.area = "F000";
			AlbaHeavencrolling.area="053%7C%7C%C0%FC%C3%BC%7C%7C";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(����);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			Albamoncrolling.area = "E000";
			AlbaHeavencrolling.area="062%7C%7C%C0%FC%C3%BC%7C%7C";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(����);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			Albamoncrolling.area = "L000";
			AlbaHeavencrolling.area="061%7C%7C%C0%FC%C3%BC%7C%7C";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(����);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			Albamoncrolling.area = "M000";
			AlbaHeavencrolling.area="063%7C%7C%C0%FC%C3%BC%7C%7C";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(����);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			Albamoncrolling.area = "N000";
			AlbaHeavencrolling.area="064%7C%7C%C0%FC%C3%BC%7C%7C";
			break;
		default:
			Mainpage.Detail_Area.setVisible(false);
			Mainpage.City.setVisible(false);
			Albamoncrolling.area = "";
			AlbaHeavencrolling.area="";
			break;

		}

	}

}
