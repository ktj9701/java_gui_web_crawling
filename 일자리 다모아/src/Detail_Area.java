//��,��,�� �޺��ڽ� ����

import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class Detail_Area {

	// �����
	static String[] Detail_Seoul = { "��ü", "������", "������", "���ϱ�", "������", "���Ǳ�", "������", "���α�", "��õ��", "�����", "������", "���빮��",
			"���۱�", "������", "���빮��", "���ʱ�", "������", "���ϱ�", "���ı�", "��õ��", "��������", "��걸", "����", "���α�", "�߱�", "�߶���" };

	// ��⵵
	static String[] Detail_Gyeonggi = { "��ü", "����", "���� ���౸", "���� �ϻ굿��", "���� �ϻ꼭��", "��õ��", "�����", "���ֽ�", "������",
			"������", "������", "�����ֽ�", "����õ��", "��õ��", "������ �д籸", "������ ������", "������ �߿���", "������ �Ǽ���", "������ ���뱸", "������ ��ȱ�",
			"������ �ȴޱ�", "�����", "�Ȼ�� �ܿ���", "�Ȼ�� ��ϱ�", "������ �Ǽ���", "������ ���뱸", "������ ��ȱ�", "������ �ȴޱ�", "�����", "�Ȼ�� �ܿ���",
			"�Ȼ�� ��ϱ�", "�ȼ���", "�Ⱦ�� ���ȱ�", "�Ⱦ�� ���ȱ�", "���ֽ�", "����", "���ֽ�", "��õ��", "�����", "���ν� ���ﱸ", "���ν� ������", "���ν� ó�α�",
			"�ǿս�", "�����ν�", "��õ��", "���ֽ�", "���ý�", "��õ��", "�ϳ���", "ȭ����" };

	// ��õ
	static String[] Detail_Incheon = { "��ü", "��ȭ��", "��籸", "������", "����", "����Ȧ��", "����", "����", "������", "������", "�߱�" };

	// ����
	static String[] Detail_Gangwon = { "��ü", "������", "����", "���ؽ�", "��ô��", "���ʽ�", "�籸��", "��籺", "������", "���ֽ�", "������",
			"������", "ö����", "��õ��", "�¹��", "��â��", "ȫõ��", "ȭõ��", "Ⱦ����" };

	// ����
	static String[] Detail_Daejeon = { "��ü", "�����", "����", "����", "������", "�߱�" };

	// ����
	static String[] Detail_Sejong = { "��ü", "������" };

	// �泲
	static String[] Detail_Chungnam = { "��ü", "����", "���ֽ�", "�ݻ걺", "����", "������", "���ɽ�", "�ο���", "�����", "��õ��", "�ƻ��",
			"���걺", "õ�Ƚ� ������", "õ�Ƚ� ���ϱ�", "û�籺", "�¾ȱ�", "ȫ����" };

	// ���
	static String[] Detail_Chungbuk = { "��ü", "���걺", "�ܾ籺", "������", "������", "��õ��", "������", "��õ��", "����", "��õ��", "û�ֽ� ��籸",
			"û�ֽ� ������", "û�ֽ� û����", " û�ֽ� �����", "���ֽ�" };

	// �λ�
	static String[] Detail_Busan = { "��ü", "������", "������", "���屺", "����", "����", "������", "�λ�����", "�ϱ�", "���", "���ϱ�", "����",
			"������", "������", "������", "�߱�", "�ؿ�뱸" };

	// ���
	static String[] Detail_Ulsan = { "��ü", "����", "����", "�ϱ�", "���ֱ�", "�߱�" };

	// �泲
	static String[] Detail_Gyeongnam = { "��ü", "������", "��â��", "����", "���ؽ�", "���ر�", "�о��", "��õ��", "��û��", "����", "�Ƿɱ�",
			"���ֽ�", "â�籺", "â���� ����������", "â���� ����ȸ����", "â���� ���걸", "â���� ��â��", "â���� ���ر�", "�뿵��", "�ϵ���", "�Ծȱ�", "�Ծ籺",
			"��õ��" };

	// ���
	static String[] Detail_Gyeongbuk = { "��ü", "����", "���ֽ�", "��ɱ�", "���̽�", "������", "��õ��", "�����", "��ȭ��", "���ֽ�", "���ֱ�",
			"�ȵ���", "������", "���籺", "���ֽ�", "��õ��", "��õ��", "�︪��", "������", "�Ǽ���", "û����", "û�۱�", "ĥ�", "���׽� ����", "���׽� �ϱ�" };
	// �뱸
	static String[] Detail_Dae_gu = { "��ü", "����", "�޼���", "�޼���", "����", "�ϱ�", "����", "������", "�߱�" };
	// ����
	static String[] Detail_Gwangju = { "��ü", "���걸", "����", "����", "�ϱ�", "����" };
	// ����
	static String[] Detail_Jeonnam = { "��ü", "������", "���ﱺ", "���", "�����", "���ʱ�", "���ֽ�", "��籺", "������", "���ȱ�", "������",
			"��õ��", "�žȱ�", "������", "������", "���ϱ�", "�ϵ���", "�强��", "���ﱺ", "������", "����", "�س���", "ȭ����" };
	// ����
	static String[] Detail_Jeonbuk = { "��ü", "��â��", "�����", "������", "������", "���ֱ�", "�ξȱ�", "��â��", "���ֱ�", "�ͻ��", "�ӽǱ�",
			"�����", "���ֽ� ������", "���ֽ� �ϻ걸", "������", "���ȱ�" };
	// ����
	static String[] Detail_Jeju = { "��ü", "��������", "���ֽ�" };

	public void changeComboBox(ActionEvent e) {
		JComboBox cb = (JComboBox) e.getSource();
		switch ((String) cb.getSelectedItem()) {
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(Detail_Seoul);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "I000";
			break;
		case "���":
			Mainpage.ComboModel= new DefaultComboBoxModel(Detail_Gyeonggi);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "B000";
			break;
		case "��õ":
			Mainpage.ComboModel= new DefaultComboBoxModel(Detail_Incheon);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "K000";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(Detail_Gangwon);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "A000";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(Detail_Daejeon);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "G000";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(Detail_Sejong);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "1000";
			break;
		case "�泲":
			Mainpage.ComboModel= new DefaultComboBoxModel(Detail_Chungnam);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "O000";
			break;
		case "���":
			Mainpage.ComboModel= new DefaultComboBoxModel(Detail_Chungbuk);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "P000";
			break;
		case "�λ�":
			Mainpage.ComboModel= new DefaultComboBoxModel(Detail_Busan);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "H000";
			break;
		case "���":
			Mainpage.ComboModel= new DefaultComboBoxModel(Detail_Ulsan);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "J000";
			break;
		case "�泲":
			Mainpage.ComboModel= new DefaultComboBoxModel(Detail_Gyeongnam);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "C000";
			break;
		case "���":
			Mainpage.ComboModel= new DefaultComboBoxModel(Detail_Gyeongbuk);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "D000";
			break;
		case "�뱸":
			Mainpage.ComboModel= new DefaultComboBoxModel(Detail_Dae_gu);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "F000";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(Detail_Gwangju);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "E000";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(Detail_Jeonnam);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "L000";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(Detail_Jeonbuk);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "M000";
			break;
		case "����":
			Mainpage.ComboModel= new DefaultComboBoxModel(Detail_Jeju);
			Mainpage.Detail_Area.setModel(Mainpage.ComboModel);
			crolling.area = "N000";
			break;
		default:
			
			crolling.area = "";
			break;

		}

	}

}
