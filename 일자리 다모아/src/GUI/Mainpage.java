package GUI;
// ���� ȭ��

import java.awt.Button;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URISyntaxException;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Function.crolling;
import Function.wewe;
import region.Busan;
import region.Chungbuk;
import region.Chungnam;
import region.City;
import region.Daejeon_AND_Sejong;
import region.Deagu;
import region.Detail_Area;
import region.Gangwon;
import region.Gwangju;
import region.Gyeongbuk;
import region.Gyeongbuk2;
import region.Gyeonggi;
import region.Gyeonggi2;
import region.Gyeongnam;
import region.Gyeongnam2;
import region.Incheon;
import region.Jeju;
import region.Jeonbuk;
import region.Seoul;
import region.Seoul2;
import region.Ulsan;
import region.Jeonnam;

public class Mainpage extends JFrame {
	Object temp, temp2;

	Detail_Area Detail = new Detail_Area(); // �������� ���� ���� Ŭ����
	City city = new City();
	Seoul ����1���� = new Seoul();
	Seoul2 ����2���� = new Seoul2();
	Gyeonggi ���1���� = new Gyeonggi();
	Gyeonggi2 ���2���� = new Gyeonggi2();
	Incheon ��õ���� = new Incheon();
	Gangwon �������� = new Gangwon();
	Daejeon_AND_Sejong ����_�������� = new Daejeon_AND_Sejong();
	Chungbuk ��ϵ��� = new Chungbuk();
	Chungnam �泲���� = new Chungnam();
	Busan �λ굵�� = new Busan();
	Ulsan ��굵�� = new Ulsan();
	Gyeongnam �泲���� = new Gyeongnam();
	Gyeongnam2 �泲2���� = new Gyeongnam2();
	Gyeongbuk ��ϵ��� = new Gyeongbuk();
	Gyeongbuk2 ���2���� = new Gyeongbuk2();
	Deagu �뱸���� = new Deagu();
	Gwangju ���ֵ��� = new Gwangju();
	Jeonbuk ���ϵ��� = new Jeonbuk();
	Jeonnam �������� = new Jeonnam();
	Jeju ���ֵ��� = new Jeju();

	public static int index = 0; // ����� ���� ����
	JTable table; // ���̺�
	static Button Search = new Button("�˻�");
	static Button Reset = new Button("����");
	static Button Calculator = new Button("���� ����");
	static Button AlbaHeaven = new Button("�˹�õ��");
	static Button JobKorea = new Button("���ڸ���");
	static DefaultTableModel TableModel = new DefaultTableModel() {// ���̺� ���� ���� �Ұ�
		public boolean isCellEditable(int rowIndex, int mCollndex) {
			return false;
		}
	}; // ���� ���� �Ұ�
	public static DefaultComboBoxModel ComboModel = new DefaultComboBoxModel();

	static String head[] = { "����", "�޿�", "ȸ���", "����", "��� �ð�" };
	static TextField SerchField = new TextField();
	public static JScrollPane scroll;

	crolling crolling = new crolling();
	static Vector<Albatext> Alba;
	static Object arr[][];

	static JComboBox Area; // ��, �� �޺��ڽ�

	public static JComboBox Detail_Area;

	public static JComboBox City;

	// ����� ���͸� Ȯ�� �� ���͸� ���� ��ư-----------------------------------------------
	public static JLabel[] Filtering = new JLabel[5];
	public static JButton[] delete = new JButton[5];

//-------------------------------------�̺�Ʈ ---------------------------
	Buttonlistener listener = new Buttonlistener();
	MouseListener MouseListener = new MouseListener();

	public Mainpage() {
		setTitle("���ڸ� �ٸ�� - ����");
		setSize(1500, 800);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // ���α׷� ũ�� ���� �Ұ� ����
		setLocationRelativeTo(null); // ȭ�� �߾ӿ� ������ �ϴ� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//----------------------------------------------------------���� ���̺� ------------------------------------------------------
		table = new JTable(TableModel);
		table.addMouseListener(MouseListener);
		Search_Albamon();
		scroll = new JScrollPane(table);
		scroll.setBounds(160, 130, 1325, 633);
		scroll.setVisible(true);
		add(scroll);

// ----------------------------------------------------------�˻� ��ư�� �˻� �ؽ�Ʈ �ʵ�
		Search.setBounds(900, 30, 60, 60);
		Search.setVisible(true);
		add(Search);
		Search.addActionListener(listener);

		SerchField.setBounds(30, 40, 850, 40);
		SerchField.setFont(new Font("���� ���", Font.BOLD, 30));
		SerchField.setVisible(true);
		add(SerchField);

		Calculator.setBounds(1000, 30, 60, 60);
		Calculator.setVisible(true);
		add(Calculator);
		Calculator.addActionListener(listener);

		Reset.setBounds(1100, 30, 60, 60);
		Reset.setVisible(true);
		add(Reset);
		Reset.addActionListener(listener);
// ------------------------------------���� �޺��ڽ�-------------------

		JLabel Province = new JLabel("����");
		Province.setBounds(40, 90, 50, 30);
		Province.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Province);
		String[] Korea_Province = { "����", "����", "���", "��õ", "����", "����", "����", "�泲", "���", "�λ�", "���", "�泲", "���", "�뱸",
				"����", "����", "����", "����" };
		Area = new JComboBox(Korea_Province);
		Area.setSelectedIndex(0);
		Area.setBounds(100, 90, 70, 30);
		Area.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Area);
		combolistener Combolistener = new combolistener();
		Area.addActionListener(Combolistener);
		// ------------------------------------�������� ���� �޺��ڽ�-------------------

		Detail_Area = new JComboBox();

		Detail_Area.setBounds(200, 90, 150, 30);
		Detail_Area.setFont(new Font("���� ���", Font.BOLD, 15));
		Detail_Area.setVisible(false);
		add(Detail_Area);

		Detail_Area.addActionListener(Combolistener);

		City = new JComboBox();
		City.setBounds(400, 90, 150, 30);
		City.setFont(new Font("���� ���", Font.BOLD, 15));
		City.setVisible(false);
		add(City);
		City.addActionListener(Combolistener);

		// �˹�õ���� ���ڸ��� �˾�â

		AlbaHeaven.setBounds(1300, 30, 60, 60);
		AlbaHeaven.setVisible(true);
		add(AlbaHeaven);
		AlbaHeaven.addActionListener(listener);

		JobKorea.setBounds(1400, 30, 60, 60);
		JobKorea.setVisible(true);
		add(JobKorea);
		JobKorea.addActionListener(listener);

		// -------------------------------���͸� ���̺�� ���͸� ����
		// ��ư----------------------------------------
		for (int i = 0; i < 5; i++) {
			Filtering[i] = new JLabel();
			delete[i] = new JButton();
		}
		Filtering[0].setBounds(20, 150, 100, 20);
		Filtering[0].setVisible(false);
		add(Filtering[0]);
		Filtering[1].setBounds(20, 180, 100, 20);
		Filtering[1].setVisible(false);
		add(Filtering[1]);
		Filtering[2].setBounds(20, 210, 100, 20);
		Filtering[2].setVisible(false);
		add(Filtering[2]);
		Filtering[3].setBounds(20, 240, 100, 20);
		Filtering[3].setVisible(false);
		add(Filtering[3]);
		Filtering[4].setBounds(20, 270, 100, 20);
		Filtering[4].setVisible(false);
		add(Filtering[4]);

		delete[0].setBounds(130, 150, 20, 20);
		delete[0].setVisible(false);
		add(delete[0]);
		delete[0].addActionListener(listener);
		delete[1].setBounds(130, 180, 20, 20);
		delete[1].setVisible(false);
		add(delete[1]);
		delete[1].addActionListener(listener);
		delete[2].setBounds(130, 210, 20, 20);
		delete[2].setVisible(false);
		add(delete[2]);
		delete[2].addActionListener(listener);
		delete[3].setBounds(130, 240, 20, 20);
		delete[3].setVisible(false);
		add(delete[3]);
		delete[3].addActionListener(listener);
		delete[4].setBounds(130, 270, 20, 20);
		delete[4].setVisible(false);
		add(delete[4]);
		delete[4].addActionListener(listener);

	}

	// ------------------ ���� Ŭ���� �� �޼ҵ� ����

	class Buttonlistener implements ActionListener { // ��ư �̺�Ʈ
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == Calculator) {
				Calculatorpage calculator = new Calculatorpage();
				calculator.setVisible(true);
			}
			if (e.getSource() == Search) {
				Search_Albamon();
				AlbaHeavenpage.Search_AlbaHeaven();
			}
			if (e.getSource() == Reset) {                //���� ��ư �̺�Ʈ---------------------------------
				index = 0;
				for (int i = 0; i < 5; i++) {
					Filtering[i].setText("");
					Filtering[i].setVisible(false);
					delete[i].setText("");
					delete[i].setVisible(false);
				}
				try {
					Area.setSelectedIndex(0);
					Detail_Area.setSelectedIndex(0);
					City.setSelectedIndex(0);
					Detail_Area.setVisible(false);
					City.setVisible(false);
					crolling.area = "";
					wewe.area="";
					Search_Albamon();
					AlbaHeavenpage.Search_AlbaHeaven();
				} catch (IllegalArgumentException e1) {

				}
			}
			if (e.getSource() == delete[0]) {
				for (int i = 0; i < index; i++) {
					if ((index == 5) || i == 4)
						break;

					else
						Filtering[i].setText(Filtering[i + 1].getText());
				}
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				crolling.area = crolling.area.substring(9);
				Search_Albamon();
			}
			if (e.getSource() == delete[1]) {
				for (int i = 1; i < index; i++) {
					if ((index == 5) || i == 4)
						break;

					else
						Filtering[i].setText(Filtering[i + 1].getText());
				}
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				crolling.area = crolling.area.substring(0, 9) + crolling.area.substring(18);
				Search_Albamon();
			}
			if (e.getSource() == delete[2]) {
				for (int i = 2; i < index; i++) {
					if ((index == 5) || i == 4)
						break;
					else
						Filtering[i].setText(Filtering[i + 1].getText());
				}
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				crolling.area = crolling.area.substring(0, 18) + crolling.area.substring(27);
				Search_Albamon();
			}
			if (e.getSource() == delete[3]) {
				for (int i = 3; i < index; i++) {
					if ((index == 5) || i == 4)
						break;

					else
						Filtering[i].setText(Filtering[i + 1].getText());
				}
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				crolling.area = crolling.area.substring(0, 27) + crolling.area.substring(36);
				Search_Albamon();
			}
			if (e.getSource() == delete[4]) {
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				crolling.area = crolling.area.substring(0, 36);
				Search_Albamon();
			}
			if (e.getSource() == AlbaHeaven) {
				AlbaHeavenpage popup = new AlbaHeavenpage();
			}
			if (e.getSource() == JobKorea) {

			}
		}
	}

	public class combolistener implements ActionListener { // �޺��ڽ� ���ý� �̺�Ʈ �߻� Ŭ����
		public void actionPerformed(ActionEvent e) {
			if (index != 5) {
				if (e.getSource() == Area) {
					for (int i = 0; i < 5; i++) {
						Filtering[i].setText("");
						Filtering[i].setVisible(false);
						delete[i].setText("");
						delete[i].setVisible(false);
					}
					Detail_Area.setVisible(true);
					Detail.changeComboBox(e); // �޺��ڽ��� �´� ����Ʈ ���
					// Search_Albamon();
					temp = Area.getSelectedItem();
				} else if (e.getSource() == Detail_Area) {
					index = 0;
					for (int i = 0; i < 5; i++) {
						Filtering[i].setText("");
						Filtering[i].setVisible(false);
						delete[i].setText("");
						delete[i].setVisible(false);
					}
					City.setVisible(true);
					city.changeComboBox(e);
					// Search_Albamon();
					temp2 = Detail_Area.getSelectedItem();
				}
				// ------------------------------���� 1--------------------------------
				else if (e.getSource() == City) {
					if (temp2.equals("������") || temp2.equals("������") || temp2.equals("���ϱ�") || temp2.equals("������")
							|| temp2.equals("���Ǳ�") || temp2.equals("������") || temp2.equals("���α�") || temp2.equals("��õ��")
							|| temp2.equals("�����") || temp2.equals("������") || temp2.equals("���빮��") || temp2.equals("���۱�")
							|| temp2.equals("������") || temp2.equals("���빮��") || temp2.equals("���ʱ�") || temp2.equals("������")
							|| temp2.equals("���ϱ�")) {
						����1����.SeoulCity(e);
						// f (����1����.flag != true)
						// Search_Albamon();
						if(index!= 5)
						AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// --------------------------���� 2---------------------------------
					else if (temp2.equals("���ı�") || temp2.equals("��õ��") || temp2.equals("��������") || temp2.equals("��걸")
							|| temp2.equals("����") || temp2.equals("���α�") || temp2.equals("�߱�")
							|| temp2.equals("�߶���")) {
						����2����.Seoul2City(e);
						// if (����2����.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// -----------------------------���1----------------------------
					else if (temp2.equals("����") || temp2.equals("���� ���籸") || temp2.equals("���� �ϻ굿��")
							|| temp2.equals("���� �ϻ꼭��") || temp2.equals("��õ��") || temp2.equals("�����")
							|| temp2.equals("���ֽ�") || temp2.equals("������") || temp2.equals("������") || temp2.equals("������")
							|| temp2.equals("������") || temp2.equals("�����ֽ�") || temp2.equals("����õ��")
							|| temp2.equals("��õ��") || temp2.equals("������ �д籸") || temp2.equals("������ ������")
							|| temp2.equals("������ �߿���") || temp2.equals("������ �Ǽ���") || temp2.equals("������ ���뱸")
							|| temp2.equals("������ ��ȱ�") || temp2.equals("������ �ȴޱ�") || temp2.equals("�����")
							|| temp2.equals("�Ȼ�� �ܿ���") || temp2.equals("�Ȼ�� ��ϱ�")) {
						���1����.GyeonggiCity(e);
						// if (���1����.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ----------------------------���2-----------------------------
					else if (temp2.equals("�ȼ���") || temp2.equals("�Ⱦ�� ���ȱ�") || temp2.equals("�Ⱦ�� ���ȱ�")
							|| temp2.equals("���ֽ�") || temp2.equals("����") || temp2.equals("���ֽ�") || temp2.equals("��õ��")
							|| temp2.equals("�����") || temp2.equals("���ν� ���ﱸ") || temp2.equals("���ν� ������")
							|| temp2.equals("���ν� ó�α�") || temp2.equals("�ǿս�") || temp2.equals("�����ν�")
							|| temp2.equals("��õ��") || temp2.equals("���ֽ�") || temp2.equals("���ý�") || temp2.equals("��õ��")
							|| temp2.equals("�ϳ���") || temp2.equals("ȭ����")) {
						���2����.Gyeonggi2City(e);
						// if (���2����.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------��õ----------------------------------
					else if (temp.equals("��õ")) {
						��õ����.IncheonCity(e);
						// if (��õ����.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------����----------------------------------
					else if (temp.equals("����")) {
						��������.GangwonCity(e);
						// if (��������.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------���� �Ǵ� ����----------------------------------
					else if (temp.equals("����") || temp.equals("����")) {
						����_��������.Daejeon_AND_SejongCity(e);
						// if (��õ����.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------���----------------------------------
					else if (temp.equals("���")) {
						��ϵ���.ChungbukCity(e);
						// if (��ϵ���.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------�泲----------------------------------
					else if (temp.equals("�泲")) {
						�泲����.ChungnamCity(e);
						// if (�泲����.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------�λ�----------------------------------
					else if (temp.equals("�λ�")) {
						�λ굵��.BusanCity(e);
						// if (�λ굵��.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------���----------------------------------
					else if (temp.equals("���")) {
						��굵��.UlsanCity(e);
						// if (��굵��.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------�泲1----------------------------------
					else if (temp2.equals("������") || temp2.equals("��â��") || temp2.equals("����") || temp2.equals("���ؽ�")
							|| temp2.equals("���ر�") || temp2.equals("�о��") || temp2.equals("��õ��") || temp2.equals("��û��")
							|| temp2.equals("����") || temp2.equals("�Ƿɱ�") || temp2.equals("���ֽ�")
							|| temp2.equals("â�籺")) {
						�泲����.GyeongnamCity(e);
						// if (�泲����.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------�泲2----------------------------------
					else if (temp2.equals("â���� ����������") || temp2.equals("â���� ����ȸ����") || temp2.equals("â���� ���걸")
							|| temp2.equals("â���� ��â��") || temp2.equals("â���� ���ر�") || temp2.equals("�뿵��")
							|| temp2.equals("�ϵ���") || temp2.equals("�Ծȱ�") || temp2.equals("�Ծ籺")
							|| temp2.equals("��õ��")) {
						�泲2����.Gyeongnam2City(e);
						// if (�泲2����.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------���1----------------------------------
					else if (temp2.equals("����") || temp2.equals("���ֽ�") || temp2.equals("��ɱ�") || temp2.equals("���̽�")
							|| temp2.equals("������") || temp2.equals("��õ��")) {
						��ϵ���.GyeongbukCity(e);
						// if (��ϵ���.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------���2----------------------------------
					else if (temp2.equals("�����") || temp2.equals("��ȭ��") || temp2.equals("���ֽ�") || temp2.equals("���ֱ�")
							|| temp2.equals("�ȵ���") || temp2.equals("������") || temp2.equals("���籺") || temp2.equals("���ֽ�")
							|| temp2.equals("��õ��") || temp2.equals("��õ��") || temp2.equals("�︪��") || temp2.equals("������")
							|| temp2.equals("�Ǽ���") || temp2.equals("û����") || temp2.equals("û�۱�") || temp2.equals("ĥ�")
							|| temp2.equals("���׽� ����") || temp2.equals("���׽� �ϱ�")) {
						���2����.Gyeongbuk2City(e);
						// if (���2����.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------�뱸----------------------------------
					else if (temp.equals("�뱸")) {
						�뱸����.DeaguCity(e);
						// if (�뱸����.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------����----------------------------------
					else if (temp.equals("����")) {
						���ֵ���.GwangjuCity(e);
						// if (���ֵ���.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------����----------------------------------
					else if (temp.equals("����")) {
						���ϵ���.JeonbukCity(e);
						// if (���ϵ���.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------����----------------------------------
					else if (temp.equals("����")) {
						��������.JeonnamCity(e);
						// if (��������.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------����----------------------------------
					else if (temp.equals("����")) {
						���ֵ���.JejuCity(e);
						// if (���ֵ���.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
						
					} else if (temp2.equals("��ü")) {
						if (index != 0) {
							crolling.area = crolling.area.substring(0, 5);
							Search_Albamon();
						}
					}

				}
				System.out.println(index);
				System.out.println(crolling.area);
			}
		}
	}

	public class MouseListener extends MouseAdapter {

		public void mouseClicked(MouseEvent e) {

			if (e.getClickCount() == 2) {
				try {
					Function.crolling.explore(Alba.get(table.getSelectedRow()).getURL());
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			} // ����Ŭ��

		}
	}

	public void Search_Albamon() { // ���� �˻�
		Alba = crolling.crolling();
		arr = new Object[Alba.size()][5];

		for (int i = 0; i < Alba.size(); i++) {
			int j = 0;
			arr[i][j++] = Alba.get(i).getArea();
			arr[i][j++] = Alba.get(i).getPay();
			arr[i][j++] = Alba.get(i).getOffice();
			arr[i][j++] = Alba.get(i).getText();
			arr[i][j++] = Alba.get(i).getTime();

		}
		TableModel.setDataVector(arr, head);
		table.getColumnModel().getColumn(0).setPreferredWidth(170);
		table.getColumnModel().getColumn(1).setPreferredWidth(170);
		table.getColumnModel().getColumn(2).setPreferredWidth(360);
		table.getColumnModel().getColumn(3).setPreferredWidth(525);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		table.getTableHeader().setReorderingAllowed(false);

		table.setRowHeight(35);
		table.setFont(new Font("���� ���", Font.BOLD, 25)); // ���� ũ�� ����
	}
}
