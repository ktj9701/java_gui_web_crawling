//��,��,�� �޺��ڽ� ����

import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class Detail_Area {

	// �����
	static String[] ���� = { "��ü", "������", "������", "���ϱ�", "������", "���Ǳ�", "������", "���α�", "��õ��", "�����", "������", "���빮��",
			"���۱�", "������", "���빮��", "���ʱ�", "������", "���ϱ�", "���ı�", "��õ��", "��������", "��걸", "����", "���α�", "�߱�", "�߶���" };

	// ��⵵
	static String[] ��� = { "��ü", "����", "���ô��౸", "���� �ϻ굿��", "���� �ϻ꼭��", "��õ��", "�����", "���ֽ�", "������",
			"������", "������", "�����ֽ�", "����õ��", "��õ��", "������ �д籸", "������ ������", "������ �߿���", "������ �Ǽ���", "������ ���뱸", "������ ��ȱ�",
			"������ �ȴޱ�", "�����", "�Ȼ�� �ܿ���", "�Ȼ�� ��ϱ�", "������ �Ǽ���", "������ ���뱸", "������ ��ȱ�", "������ �ȴޱ�", "�����", "�Ȼ�� �ܿ���",
			"�Ȼ�� ��ϱ�", "�ȼ���", "�Ⱦ�� ���ȱ�", "�Ⱦ�� ���ȱ�", "���ֽ�", "����", "���ֽ�", "��õ��", "�����", "���ν� ���ﱸ", "���ν� ������", "���ν� ó�α�",
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
			"û�ֽ� ������", "û�ֽ� û����", " û�ֽ� �����", "���ֽ�" };

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
	static String[] �뱸 = { "��ü", "����", "�޼���", "�޼���", "����", "�ϱ�", "����", "������", "�߱�" };
	// ����
	static String[] ���� = { "��ü", "���걸", "����", "����", "�ϱ�", "����" };
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
			crolling.area = "I000";
			break;
		case "���":
			Mainpage.ComboModel= new DefaultComboBoxModel(���);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "B000";
			break;
		case "��õ":
			Mainpage.ComboModel= new DefaultComboBoxModel(��õ);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "K000";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(����);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "A000";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(����);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "G000";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(����);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "1000";
			break;
		case "�泲":
			Mainpage.ComboModel= new DefaultComboBoxModel(�泲);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "O000";
			break;
		case "���":
			Mainpage.ComboModel= new DefaultComboBoxModel(���);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "P000";
			break;
		case "�λ�":
			Mainpage.ComboModel= new DefaultComboBoxModel(�λ�);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "H000";
			break;
		case "���":
			Mainpage.ComboModel= new DefaultComboBoxModel(���);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "J000";
			break;
		case "�泲":
			Mainpage.ComboModel= new DefaultComboBoxModel(�泲);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "C000";
			break;
		case "���":
			Mainpage.ComboModel= new DefaultComboBoxModel(���);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "D000";
			break;
		case "�뱸":
			Mainpage.ComboModel= new DefaultComboBoxModel(�뱸);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "F000";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(����);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "E000";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(����);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "L000";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(����);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "M000";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(����);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "N000";
			break;
		default:
			
			crolling.area = "";
			break;

		}

	}

}
