package GUI;
// ���� ȭ��

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import Function.AlbaHeavencrolling;
import Function.Albamoncrolling;
import Function.Albatext;
import Function.Interncrolling;
import Function.SaveFunction;
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
import region.Jeonnam;
import region.Seoul;
import region.Seoul2;
import region.Ulsan;

public class Mainpage extends JFrame {
	JTableHeader header;

	Interncrolling ict = new Interncrolling();
	public static Object temp;
	static Object temp2;

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
	static JButton Search = new JButton("�˻�");
	static JButton Reset = new JButton("����");
	static JButton Calculator = new JButton("�޿� ����");
	static JButton AlbaHeaven = new JButton("�˹�õ��");
	static JButton Intern = new JButton("����");
	static JButton SAVE = new JButton("���ã��");
	static JButton SAVE2 = new JButton("����");
	static JButton EVENT = new JButton("�̺�Ʈ");
	static JButton INFO = new JButton("��");
	static JTextField AGE;
	static String example = "60�� ���� �Է�";
	static DefaultTableModel TableModel = new DefaultTableModel() {// ���̺� ���� ���� �Ұ�
		public boolean isCellEditable(int rowIndex, int mCollndex) {
			return false;
		}
	}; // ���� ���� �Ұ�
	public static DefaultComboBoxModel ComboModel = new DefaultComboBoxModel();

	static String head[] = { "����", "�޿�", "ȸ���", "����", "��� �ð�" };
	public static JScrollPane scroll;

	static Vector<Albatext> Alba;
	static Object arr[][];

	static JComboBox Area; // ��, �� �޺��ڽ�

	public static JComboBox Detail_Area;

	public static JComboBox City;

	public static JComboBox Gender;

	public static JComboBox Period;

	public static JComboBox Dutyweek;
	// ����� ���͸� Ȯ�� �� ���͸� ���� ��ư-----------------------------------------------
	public static JLabel Filterlabel = new JLabel("-------���͸�-------");
	public static JLabel Filterlabel1 = new JLabel("�ٹ� �Ⱓ-------");
	public static JLabel Filterlabel2 = new JLabel("�ٹ� ����-------");
	public static JLabel Filterlabel3 = new JLabel("����-------------");
	public static JLabel Filterlabel4 = new JLabel("����-------");
	public static JLabel[] Filtering = new JLabel[5]; // ����� ���� ���̺�
	public static JButton[] delete = new JButton[5]; // ����� ���� ���� ��ư
	public static JLabel genderlabel = new JLabel(); // ����� ���� ���̺�
	public static JButton genderbutton = new JButton(); // ����� ���� ���� ��ư
	public static JLabel periodlabel = new JLabel(); // ����� �ٹ� �Ⱓ ���̺�
	public static JButton periodbutton = new JButton(); // ����� �ٹ� �Ⱓ ���� ���̺�
	public static JLabel dutyweeklabel = new JLabel(); // ����� �ٹ� ���� ���̺�
	public static JButton dutyweekbutton = new JButton(); // ����� �ٹ� ���� ���� ���̺�
//-------------------------------------�̺�Ʈ ---------------------------
	Buttonlistener listener = new Buttonlistener();
	FilterButtonlistener FilterButtonlistener = new FilterButtonlistener();
	MouseListener1 MouseListener1 = new MouseListener1();
	MouseListener2 MouseListener2 = new MouseListener2();
	Areacombolistener AreaCombolistener = new Areacombolistener();
	Filtercombolistener FilterCombolistener = new Filtercombolistener();

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
		table.addMouseListener(MouseListener1);

		Search_Albamon();
		scroll = new JScrollPane(table);
		scroll.setBounds(160, 130, 1325, 633);
		scroll.setVisible(true);
		add(scroll);

// ----------------------------------------------------------�˻� ��ư�� �˻� �ؽ�Ʈ �ʵ�
		Search.setBounds(900, 20, 60, 60);
		Search.setVisible(true);
		add(Search);
		Search.addActionListener(listener);

		Calculator.setBounds(1000, 20, 60, 60);
		Calculator.setVisible(true);
		add(Calculator);
		Calculator.addActionListener(listener);

		Reset.setBounds(1100, 20, 60, 60);
		Reset.setVisible(true);
		add(Reset);
		Reset.addActionListener(listener);
// ------------------------------------���� �޺��ڽ�-------------------

		JLabel Province = new JLabel("����");
		Province.setBounds(860, 90, 50, 30);
		Province.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Province);
		String[] Korea_Province = { "����", "����", "���", "��õ", "����", "����", "����", "�泲", "���", "�λ�", "���", "�泲", "���", "�뱸",
				"����", "����", "����", "����" };
		Area = new JComboBox(Korea_Province);
		Area.setSelectedIndex(0);
		Area.setBounds(900, 90, 70, 30);
		Area.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Area);

		Area.addActionListener(AreaCombolistener);
		// ------------------------------------�������� ���� �޺��ڽ�-------------------

		Detail_Area = new JComboBox();

		Detail_Area.setBounds(1000, 90, 150, 30);
		Detail_Area.setFont(new Font("���� ���", Font.BOLD, 15));
		Detail_Area.setVisible(false);
		add(Detail_Area);

		Detail_Area.addActionListener(AreaCombolistener);

		City = new JComboBox();
		City.setBounds(1180, 90, 150, 30);
		City.setFont(new Font("���� ���", Font.BOLD, 15));
		City.setVisible(false);
		add(City);
		City.addActionListener(AreaCombolistener);

		// -----------------------------------���� ���͸�
		JLabel gender_label = new JLabel("����");
		gender_label.setBounds(520, 90, 50, 30);
		gender_label.setFont(new Font("���� ���", Font.BOLD, 15));
		add(gender_label);

		String[] gender = { "��ü", "����", "����" };
		Gender = new JComboBox(gender);
		Gender.setBounds(570, 90, 70, 30);
		Gender.setFont(new Font("���� ���", Font.BOLD, 15));
		Gender.setVisible(true);
		add(Gender);

		Gender.addActionListener(FilterCombolistener);

		// -----------------------------------�ٹ��Ⱓ ���͸�
		JLabel period_label = new JLabel("�ٹ� �Ⱓ");
		period_label.setBounds(40, 90, 70, 30);
		period_label.setFont(new Font("���� ���", Font.BOLD, 15));
		add(period_label);

		String[] periodhead = { "��ü", "�Ϸ�", "1��������", "1����~1����", "1����~3����", "3����~6����", "6����~1��", "1���̻�" };
		Period = new JComboBox(periodhead);
		Period.setBounds(120, 90, 130, 30);
		Period.setFont(new Font("���� ���", Font.BOLD, 15));
		Period.setVisible(true);
		add(Period);
		Period.addActionListener(FilterCombolistener);

		// -----------------------------------�ٹ����� ���͸�
		JLabel dutyweek_label = new JLabel("�ٹ� ����");
		dutyweek_label.setBounds(280, 90, 70, 30);
		dutyweek_label.setFont(new Font("���� ���", Font.BOLD, 15));
		add(dutyweek_label);

		String[] dutyweekhead = { "��ü", "�� ~ ��", "�� ~ ��", "�� ~ ��", "��   ��" };
		Dutyweek = new JComboBox(dutyweekhead);
		Dutyweek.setBounds(360, 90, 130, 30);
		Dutyweek.setFont(new Font("���� ���", Font.BOLD, 15));
		Dutyweek.setVisible(true);
		add(Dutyweek);
		Dutyweek.addActionListener(FilterCombolistener);

		// -----------------------------------���� ���͸�

		JLabel agelabel = new JLabel("����");
		agelabel.setBounds(660, 90, 50, 30);
		agelabel.setFont(new Font("���� ���", Font.BOLD, 15));
		add(agelabel);

		AGE = new JTextField(example);
		AGE.setBounds(700, 90, 130, 30);
		AGE.setFont(new Font("���� ���", Font.BOLD, 15));
		add(AGE);
		AGE.addMouseListener(MouseListener2);
		// ----------------------------------------------- �˹�õ���� ���ڸ��� �˾�â

		AlbaHeaven.setBounds(1300, 20, 60, 60);
		AlbaHeaven.setVisible(true);
		add(AlbaHeaven);
		AlbaHeaven.addActionListener(listener);

		Intern.setBounds(1400, 20, 60, 60);
		Intern.setVisible(true);
		add(Intern);
		Intern.addActionListener(listener);
		// -------------------------------------------------���ã�� ��ư
		SAVE.setBounds(1200, 20, 60, 60);
		SAVE.setVisible(true);
		add(SAVE);
		SAVE.addActionListener(listener);

		SAVE2.setBounds(600, 20, 60, 60);
		SAVE2.setVisible(true);
		add(SAVE2);
		SAVE2.addActionListener(listener);
		// -------------------------------------------------�̺�Ʈ ��ư
		EVENT.setBounds(800, 20, 60, 60);
		EVENT.setVisible(true);
		add(EVENT);
		EVENT.addActionListener(listener);
		// -------------------------------------------------�� ��ư
		INFO.setBounds(700, 20, 60, 60);
		INFO.setVisible(true);
		add(INFO);
		INFO.addActionListener(listener);

		// --------------------------------------------------------------------���͸� ���̺��
		// ���͸� ����
		Filterlabel.setBounds(10, 130, 150, 20);
		Filterlabel.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Filterlabel);

		Filterlabel1.setBounds(10, 160, 150, 20);
		Filterlabel1.setFont(new Font("���� ���", Font.BOLD, 13));
		add(Filterlabel1);

		periodlabel.setBounds(20, 190, 150, 20);
		periodlabel.setFont(new Font("���� ���", Font.BOLD, 12));
		periodlabel.setText("");
		add(periodlabel);

		periodbutton.setBounds(130, 190, 20, 20);
		periodbutton.setText("");
		periodbutton.setVisible(false);
		periodbutton.addActionListener(FilterButtonlistener);
		add(periodbutton);

		Filterlabel2.setBounds(10, 230, 150, 20); // -----------------�ٹ� ���� ���̺�
		Filterlabel2.setFont(new Font("���� ���", Font.BOLD, 13));
		add(Filterlabel2);

		dutyweeklabel.setBounds(20, 260, 150, 20);
		dutyweeklabel.setText("");
		dutyweeklabel.setFont(new Font("���� ���", Font.BOLD, 12));
		add(dutyweeklabel); // -----------------------------------------�ٹ� ���� ���̺�

		dutyweekbutton.setBounds(130, 260, 20, 20);// ------------------�ٹ� ���� ��ư
		dutyweekbutton.setText("");
		dutyweekbutton.setVisible(false);
		dutyweekbutton.addActionListener(FilterButtonlistener);
		add(dutyweekbutton);

		Filterlabel3.setBounds(10, 300, 150, 20);
		Filterlabel3.setFont(new Font("���� ���", Font.BOLD, 13));
		add(Filterlabel3);

		genderlabel.setBounds(20, 330, 150, 20);
		genderlabel.setText("");
		genderlabel.setFont(new Font("���� ���", Font.BOLD, 12));
		add(genderlabel); // -----------------------------------------���� ���̺�

		genderbutton.setBounds(130, 330, 20, 20);// ------------------���� ��ư
		genderbutton.setText("");
		genderbutton.setVisible(false);
		genderbutton.addActionListener(FilterButtonlistener);
		add(genderbutton);

		Filterlabel4.setBounds(10, 360, 150, 20);
		Filterlabel4.setFont(new Font("���� ���", Font.BOLD, 13));
		add(Filterlabel4);

		for (int i = 0; i < 5; i++) {
			Filtering[i] = new JLabel();
			Filtering[i].setFont(new Font("���� ���", Font.BOLD, 12));
			delete[i] = new JButton();
		}
		Filtering[0].setBounds(20, 390, 100, 20);
		Filtering[0].setVisible(false);
		add(Filtering[0]);
		Filtering[1].setBounds(20, 420, 100, 20);
		Filtering[1].setVisible(false);
		add(Filtering[1]);
		Filtering[2].setBounds(20, 450, 100, 20);
		Filtering[2].setVisible(false);
		add(Filtering[2]);
		Filtering[3].setBounds(20, 480, 100, 20);
		Filtering[3].setVisible(false);
		add(Filtering[3]);
		Filtering[4].setBounds(20, 510, 100, 20);
		Filtering[4].setVisible(false);
		add(Filtering[4]);

		delete[0].setBounds(130, 390, 20, 20);
		delete[0].setVisible(false);
		add(delete[0]);
		delete[0].addActionListener(FilterButtonlistener);
		delete[1].setBounds(130, 420, 20, 20);
		delete[1].setVisible(false);
		add(delete[1]);
		delete[1].addActionListener(FilterButtonlistener);
		delete[2].setBounds(130, 450, 20, 20);
		delete[2].setVisible(false);
		add(delete[2]);
		delete[2].addActionListener(FilterButtonlistener);
		delete[3].setBounds(130, 480, 20, 20);
		delete[3].setVisible(false);
		add(delete[3]);
		delete[3].addActionListener(FilterButtonlistener);
		delete[4].setBounds(130, 510, 20, 20);
		delete[4].setVisible(false);
		add(delete[4]);
		delete[4].addActionListener(FilterButtonlistener);

	}

	// ------------------ ���� Ŭ���� �� �޼ҵ� ����
	class Buttonlistener implements ActionListener { // ��ư �̺�Ʈ
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == Calculator) { // ���� ��ư------------------
				Calculatorpage calculator = new Calculatorpage();
				calculator.setVisible(true);
			}
			if (e.getSource() == Search) {// �˻� ��ư----------------------

				if (AGE.getText().equals(example) || AGE.getText().equals("")) {
					Search_Albamon();
					AlbaHeavenpage.Search_AlbaHeaven();
				} 
				else {
					try {
						Integer.parseInt(AGE.getText());
						Albamoncrolling.age = AGE.getText();
						AlbaHeavencrolling.age = AGE.getText();
						Search_Albamon();
						AlbaHeavenpage.Search_AlbaHeaven();
					} 
					catch (NumberFormatException e1) {
						System.out.println("��! �װ� ���ڰ� �ƴ϶���!!");
					}
				}
			}
			if (e.getSource() == Reset) { // ���� ��ư �̺�Ʈ---------------------------------
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
					genderlabel.setText("");
					periodlabel.setText("");
					genderbutton.setVisible(false);
					periodbutton.setVisible(false);
					Gender.setSelectedIndex(0);
					Period.setSelectedIndex(0);
				} catch (IllegalArgumentException e1) {
				}
					Albamoncrolling.area = "";
					Albamoncrolling.gender = "";
					Albamoncrolling.period = "";
					Albamoncrolling.dutyweek = "";
					Albamoncrolling.age = "";
					AlbaHeavencrolling.area = "";
					AlbaHeavencrolling.gender = "";
					AlbaHeavencrolling.period = "";
					AlbaHeavencrolling.dutyweek = "";
					AlbaHeavencrolling.age = "";
					AGE.setText(example);
					Search_Albamon();
					AlbaHeavenpage.Search_AlbaHeaven();
				
			}
			if (e.getSource() == AlbaHeaven) { // ------------�˹�õ�� ��ư �̺�Ʈ
				AlbaHeavenpage popup = new AlbaHeavenpage();
			}
			if (e.getSource() == Intern) { // ------------------���� ��ư �̺�Ʈ
				Internpage ict = new Internpage();
			}
			if (e.getSource() == SAVE) { // ------------------���ã�� ��ư �̺�Ʈ
				Repositorypage save = new Repositorypage();
			}
			if (e.getSource() == EVENT) { // ------------------�̺�Ʈ ��ư �̺�Ʈ
				Eventpage event = new Eventpage();
			}
			if (e.getSource() == INFO) { // ------------------�� ��ư �̺�Ʈ

			}
			if (e.getSource() == SAVE2) { // -----------------���� ��ư �̺�Ʈ
				try {
					SaveFunction.savealba(Loginpage.ID_.getText(), Alba.get(table.getSelectedRow()).getArea(),
							Alba.get(table.getSelectedRow()).getPay(), Alba.get(table.getSelectedRow()).getOffice(),
							Alba.get(table.getSelectedRow()).getText(), Alba.get(table.getSelectedRow()).getURL());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Repositorypage.Search_Alba();
			}
		}
	}

	class FilterButtonlistener implements ActionListener { // ���͸���ư �̺�Ʈ
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == delete[0]) {
				String[] temp6 = AlbaHeavencrolling.area.split("%2C");
				AlbaHeavencrolling.area = "";
				for (int i = 0; i < index; i++) {
					if (i == (index - 1))
						break;
					else {
						Filtering[i].setText(Filtering[i + 1].getText());
						AlbaHeavencrolling.area += temp6[i + 1] + "%2C";
					}
				}
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				Albamoncrolling.area = Albamoncrolling.area.substring(9);
				Search_Albamon();
				AlbaHeavenpage.Search_AlbaHeaven();

				if (Albamoncrolling.area.equals("")) { // ��� ������ ������� �ʱ�ȭ������ ����
					Area.setSelectedIndex(0);
					Detail_Area.setSelectedIndex(0);
					City.setSelectedIndex(0);
					Detail_Area.setVisible(false);
					City.setVisible(false);
				}

			}
			if (e.getSource() == delete[1]) {
				String[] temp6 = AlbaHeavencrolling.area.split("%2C");
				AlbaHeavencrolling.area = temp6[0] + "%2C";
				for (int i = 1; i < index; i++) {
					if (i == (index - 1))
						break;
					else {
						Filtering[i].setText(Filtering[i + 1].getText());
						AlbaHeavencrolling.area += temp6[i + 1] + "%2C";
					}
				}
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				Albamoncrolling.area = Albamoncrolling.area.substring(0, 9) + Albamoncrolling.area.substring(18);
				Search_Albamon();
				AlbaHeavenpage.Search_AlbaHeaven();
			}
			if (e.getSource() == delete[2]) {
				String[] temp6 = AlbaHeavencrolling.area.split("%2C");
				AlbaHeavencrolling.area = temp6[0] + "%2C" + temp6[1] + "%2C";
				for (int i = 2; i < index; i++) {
					if (i == (index - 1))
						break;
					else {
						Filtering[i].setText(Filtering[i + 1].getText());
						AlbaHeavencrolling.area += temp6[i + 1] + "%2C";
					}
				}
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				Albamoncrolling.area = Albamoncrolling.area.substring(0, 18) + Albamoncrolling.area.substring(27);
				Search_Albamon();
				AlbaHeavenpage.Search_AlbaHeaven();
			}
			if (e.getSource() == delete[3]) {
				String[] temp6 = AlbaHeavencrolling.area.split("%2C");
				AlbaHeavencrolling.area = temp6[0] + "%2C" + temp6[1] + "%2C" + temp6[2] + "%2C";
				for (int i = 3; i < index; i++) {
					if (i == (index - 1))
						break;
					else {
						Filtering[i].setText(Filtering[i + 1].getText());
						AlbaHeavencrolling.area += temp6[i + 1] + "%2C";
					}
				}
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				Albamoncrolling.area = Albamoncrolling.area.substring(0, 27) + Albamoncrolling.area.substring(36);
				Search_Albamon();
				AlbaHeavenpage.Search_AlbaHeaven();
			}
			if (e.getSource() == delete[4]) {
				String[] temp6 = AlbaHeavencrolling.area.split("%2C");
				AlbaHeavencrolling.area = temp6[0] + "%2C" + temp6[1] + "%2C" + temp6[2] + "%2C" + temp6[3] + "%2C";
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				Albamoncrolling.area = Albamoncrolling.area.substring(0, 36);
				Search_Albamon();
				AlbaHeavenpage.Search_AlbaHeaven();
			}

			if (e.getSource() == genderbutton) {
				Albamoncrolling.gender = "";
				AlbaHeavencrolling.gender = "";
				genderlabel.setText("");
				genderbutton.setVisible(false);
				Search_Albamon();
				AlbaHeavenpage.Search_AlbaHeaven();
			}
			if (e.getSource() == periodbutton) {
				Albamoncrolling.period = "";
				AlbaHeavencrolling.period = "";
				periodlabel.setText("");
				periodbutton.setVisible(false);
				Search_Albamon();
				AlbaHeavenpage.Search_AlbaHeaven();
			}
		}
	}

	class Areacombolistener implements ActionListener { // �����޺��ڽ� ���ý� �̺�Ʈ �߻� Ŭ����
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
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// --------------------------���� 2---------------------------------
					else if (temp2.equals("���ı�") || temp2.equals("��õ��") || temp2.equals("��������") || temp2.equals("��걸")
							|| temp2.equals("����") || temp2.equals("���α�") || temp2.equals("�߱�")
							|| temp2.equals("�߶���")) {
						����2����.Seoul2City(e);
						// if (����2����.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
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
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
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
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------��õ----------------------------------
					else if (temp.equals("��õ")) {
						��õ����.IncheonCity(e);
						// if (��õ����.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------����----------------------------------
					else if (temp.equals("����")) {
						��������.GangwonCity(e);
						// if (��������.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------���� �Ǵ� ����----------------------------------
					else if (temp.equals("����") || temp.equals("����")) {
						����_��������.Daejeon_AND_SejongCity(e);
						// if (��õ����.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------���----------------------------------
					else if (temp.equals("���")) {
						��ϵ���.ChungbukCity(e);
						// if (��ϵ���.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------�泲----------------------------------
					else if (temp.equals("�泲")) {
						�泲����.ChungnamCity(e);
						// if (�泲����.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------�λ�----------------------------------
					else if (temp.equals("�λ�")) {
						�λ굵��.BusanCity(e);
						// if (�λ굵��.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------���----------------------------------
					else if (temp.equals("���")) {
						��굵��.UlsanCity(e);
						// if (��굵��.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------�泲1----------------------------------
					else if (temp2.equals("������") || temp2.equals("��â��") || temp2.equals("����") || temp2.equals("���ؽ�")
							|| temp2.equals("���ر�") || temp2.equals("�о��") || temp2.equals("��õ��") || temp2.equals("��û��")
							|| temp2.equals("����") || temp2.equals("�Ƿɱ�") || temp2.equals("���ֽ�")
							|| temp2.equals("â�籺")) {
						�泲����.GyeongnamCity(e);
						// if (�泲����.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------�泲2----------------------------------
					else if (temp2.equals("â���� ����������") || temp2.equals("â���� ����ȸ����") || temp2.equals("â���� ���걸")
							|| temp2.equals("â���� ��â��") || temp2.equals("â���� ���ر�") || temp2.equals("�뿵��")
							|| temp2.equals("�ϵ���") || temp2.equals("�Ծȱ�") || temp2.equals("�Ծ籺")
							|| temp2.equals("��õ��")) {
						�泲2����.Gyeongnam2City(e);
						// if (�泲2����.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------���1----------------------------------
					else if (temp2.equals("����") || temp2.equals("���ֽ�") || temp2.equals("��ɱ�") || temp2.equals("���̽�")
							|| temp2.equals("������") || temp2.equals("��õ��")) {
						��ϵ���.GyeongbukCity(e);
						// if (��ϵ���.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
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
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------�뱸----------------------------------
					else if (temp.equals("�뱸")) {
						�뱸����.DeaguCity(e);
						// if (�뱸����.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------����----------------------------------
					else if (temp.equals("����")) {
						���ֵ���.GwangjuCity(e);
						// if (���ֵ���.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------����----------------------------------
					else if (temp.equals("����")) {
						���ϵ���.JeonbukCity(e);
						// if (���ϵ���.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------����----------------------------------
					else if (temp.equals("����")) {
						��������.JeonnamCity(e);
						// if (��������.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------����----------------------------------
					else if (temp.equals("����")) {
						���ֵ���.JejuCity(e);
						// if (���ֵ���.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
				}
			}
		}
	}

	class Filtercombolistener implements ActionListener { // �� �� ���͸� �޺��ڽ� ���ý� �̺�Ʈ �߻� Ŭ����
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == Gender) {
				if (Gender.getSelectedItem().equals("��ü")) {
					genderlabel.setText("");
					genderbutton.setVisible(false);
					Albamoncrolling.gender = "";
					AlbaHeavencrolling.gender = "";
				}
				if (Gender.getSelectedItem().equals("����")) {
					genderlabel.setText("����");
					genderbutton.setVisible(true);
					Albamoncrolling.gender = "M";
					AlbaHeavencrolling.gender = "C01";
				}
				if (Gender.getSelectedItem().equals("����")) {
					genderlabel.setText("����");
					genderbutton.setVisible(true);
					Albamoncrolling.gender = "W";
					AlbaHeavencrolling.gender = "C02";
				}
			}
			if (e.getSource() == Period) {
				if (Period.getSelectedItem().equals("��ü")) {
					Albamoncrolling.period = "";
					AlbaHeavencrolling.period = "";
				}
				if (Period.getSelectedItem().equals("�Ϸ�")) {
					periodlabel.setText("�Ϸ�");
					periodbutton.setVisible(true);
					Albamoncrolling.period = "5";
					AlbaHeavencrolling.period = "H01";
				}
				if (Period.getSelectedItem().equals("1��������")) {
					periodlabel.setText("1��������");
					periodbutton.setVisible(true);
					Albamoncrolling.period = "10";
					AlbaHeavencrolling.period = "H02";
				}
				if (Period.getSelectedItem().equals("1����~1����")) {
					periodlabel.setText("1����~1����");
					periodbutton.setVisible(true);
					Albamoncrolling.period = "20";
					AlbaHeavencrolling.period = "H03";
				}
				if (Period.getSelectedItem().equals("1����~3����")) {
					periodlabel.setText("1����~3����");
					periodbutton.setVisible(true);
					Albamoncrolling.period = "30";
					AlbaHeavencrolling.period = "H04";
				}
				if (Period.getSelectedItem().equals("3����~6����")) {
					periodlabel.setText("3����~6����");
					periodbutton.setVisible(true);
					Albamoncrolling.period = "40";
					AlbaHeavencrolling.period = "H05";
				}
				if (Period.getSelectedItem().equals("6����~1��")) {
					periodlabel.setText("6����~1��");
					periodbutton.setVisible(true);
					Albamoncrolling.period = "45";
					AlbaHeavencrolling.period = "H06";
				}
				if (Period.getSelectedItem().equals("1���̻�")) {
					periodlabel.setText("1���̻�");
					periodbutton.setVisible(true);
					Albamoncrolling.period = "48";
					AlbaHeavencrolling.period = "H09";
				}
			}
			if (e.getSource() == Dutyweek) {
				if (Dutyweek.getSelectedItem().equals("��ü")) {
					Albamoncrolling.dutyweek = "";
					AlbaHeavencrolling.dutyweek = "";
				}
				if (Dutyweek.getSelectedItem().equals("�� ~ ��")) {
					dutyweeklabel.setText("�� ~ ��");
					dutyweekbutton.setVisible(true);
					Albamoncrolling.dutyweek = "10";
					AlbaHeavencrolling.dutyweek = "D03";
				}
				if (Dutyweek.getSelectedItem().equals("�� ~ ��")) {
					dutyweeklabel.setText("�� ~ ��");
					dutyweekbutton.setVisible(true);
					Albamoncrolling.dutyweek = "20";
					AlbaHeavencrolling.dutyweek = "D02";
				}
				if (Dutyweek.getSelectedItem().equals("�� ~ ��")) {
					dutyweeklabel.setText("�� ~ ��");
					dutyweekbutton.setVisible(true);
					Albamoncrolling.dutyweek = "30";
					AlbaHeavencrolling.dutyweek = "D01";
				}
				if (Dutyweek.getSelectedItem().equals("��   ��")) {
					dutyweeklabel.setText("��   ��");
					dutyweekbutton.setVisible(true);
					Albamoncrolling.dutyweek = "40";
					AlbaHeavencrolling.dutyweek = "D04";
				}
			}
		}
	}

	class MouseListener1 extends MouseAdapter {

		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 2) {
				try {
					System.out.println(Alba.get(table.getSelectedRow()).getURL());
					Function.Albamoncrolling.explore(Alba.get(table.getSelectedRow()).getURL());
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			} // ����Ŭ��

		}
	}

	class MouseListener2 extends MouseAdapter {

		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 1) {
				AGE.setText("");
			}
		}
	}

	public void Search_Albamon() { // ���� �˻�
		header = table.getTableHeader();
		header.setBackground(Color.red);
		header.setFont(new Font("���� ���", Font.BOLD, 25));

		Albamoncrolling crolling = new Albamoncrolling();
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
