package GUI;
// ���� ȭ��

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

import Function.AlbaHeavencrolling;
import Function.Albamoncrolling;
import Function.Albatext;
import Function.Interncrolling;
import Function.SaveFunction;
import image.images;
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

public class Mainpage extends JFrame implements Runnable {

	static JPanel background = new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(images.ground.getImage(), 0, 0, null); // ������ ���߿� ã��
			setOpaque(false);
			super.paintComponent(g);
		}
	};

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
	static JButton AlbaMon = new JButton();
	static JButton Search = new JButton("�˻�");
	static JButton Reset = new JButton("���� ����");
	static JButton Calculator = new JButton("�޿� ����");
	static JButton AlbaHeaven = new JButton();
	static JButton Intern = new JButton();
	static JButton REPOSITORY = new JButton();
	static JButton SAVE = new JButton();
	static JButton INFO = new JButton();
	static JButton EVENT = new JButton();
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
	public static JLabel Filterlabel = new JLabel("--------���͸�--------");
	public static JLabel Filterlabel1 = new JLabel("�ٹ� �Ⱓ-------");
	public static JLabel Filterlabel2 = new JLabel("�ٹ� ����-------");
	public static JLabel Filterlabel3 = new JLabel("����-------------");
	public static JLabel Filterlabel4 = new JLabel("����-------------");
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
	int timer = 0;
	Thread t;

	public Mainpage() {
		t = new Thread(this);
		t.start();
		setTitle("���ڸ� �ٸ�� - ����");
		setSize(1500, 800);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // ���α׷� ũ�� ���� �Ұ� ����
		setLocationRelativeTo(null); // ȭ�� �߾ӿ� ������ �ϴ� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		background.setLayout(null);
		setContentPane(background);
		setBackground(Color.WHITE);
//----------------------------------------------------------���� ���̺� ------------------------------------------------------
		table = new JTable(TableModel) {
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
				JComponent component = (JComponent) super.prepareRenderer(renderer, row, column);
				if (!isRowSelected(row)) {
					if (row % 2 == 0)
						component.setBackground(new Color(255, 191, 147));
					else
						component.setBackground(Color.WHITE);
				}
				return component;

			}
		};
		table.addMouseListener(MouseListener1);

		Search_Albamon();
		scroll = new JScrollPane(table);
		scroll.setBounds(160, 200, 1325, 563);
		scroll.setVisible(true);
		add(scroll);

		AlbaMon.setBounds(0, 0, 400, 136);
		AlbaMon.setIcon(images.Albamon);
		add(AlbaMon);
		AlbaMon.addActionListener(listener);
// ----------------------------------------------------------�˻� ��ư�� �˻� �ؽ�Ʈ �ʵ�
		Search.setBounds(1350, 155, 110, 30);
		Search.setBackground(new Color(255, 221, 221));
		Search.setVisible(true);
		add(Search);
		Search.addActionListener(listener);

		Calculator.setBounds(1350, 75, 110, 30);
		Calculator.setBackground(new Color(255, 221, 221));
		Calculator.setVisible(true);
		add(Calculator);
		Calculator.addActionListener(listener);

		Reset.setBounds(1350, 115, 110, 30);
		Reset.setBackground(new Color(255, 221, 221));
		Reset.setVisible(true);
		add(Reset);
		Reset.addActionListener(listener);
// ------------------------------------���� �޺��ڽ�-------------------

		JLabel Province = new JLabel("����");
		Province.setBounds(860, 155, 50, 30);
		Province.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Province);
		String[] Korea_Province = { "����", "����", "���", "��õ", "����", "����", "����", "�泲", "���", "�λ�", "���", "�泲", "���", "�뱸",
				"����", "����", "����", "����" };
		Area = new JComboBox(Korea_Province);
		Area.setSelectedIndex(0);
		Area.setBounds(900, 155, 70, 30);
		Area.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Area);

		Area.addActionListener(AreaCombolistener);
		// ------------------------------------�������� ���� �޺��ڽ�-------------------

		Detail_Area = new JComboBox();

		Detail_Area.setBounds(1000, 155, 150, 30);
		Detail_Area.setFont(new Font("���� ���", Font.BOLD, 15));
		Detail_Area.setVisible(false);
		add(Detail_Area);

		Detail_Area.addActionListener(AreaCombolistener);

		City = new JComboBox();
		City.setBounds(1180, 155, 150, 30);
		City.setFont(new Font("���� ���", Font.BOLD, 15));
		City.setVisible(false);
		add(City);
		City.addActionListener(AreaCombolistener);

		// -----------------------------------���� ���͸�
		JLabel gender_label = new JLabel("����");
		gender_label.setBounds(520, 155, 50, 30);
		gender_label.setFont(new Font("���� ���", Font.BOLD, 15));
		add(gender_label);

		String[] gender = { "��ü", "����", "����" };
		Gender = new JComboBox(gender);
		Gender.setBounds(570, 155, 70, 30);
		Gender.setFont(new Font("���� ���", Font.BOLD, 15));
		Gender.setVisible(true);
		add(Gender);

		Gender.addActionListener(FilterCombolistener);

		// -----------------------------------�ٹ��Ⱓ ���͸�
		JLabel period_label = new JLabel("�ٹ� �Ⱓ");
		period_label.setBounds(40, 155, 70, 30);
		period_label.setFont(new Font("���� ���", Font.BOLD, 15));
		add(period_label);

		String[] periodhead = { "��ü", "�Ϸ�", "1��������", "1����~1����", "1����~3����", "3����~6����", "6����~1��", "1���̻�" };
		Period = new JComboBox(periodhead);
		Period.setBounds(120, 155, 130, 30);
		Period.setFont(new Font("���� ���", Font.BOLD, 15));
		Period.setVisible(true);
		add(Period);
		Period.addActionListener(FilterCombolistener);

		// -----------------------------------�ٹ����� ���͸�
		JLabel dutyweek_label = new JLabel("�ٹ� ����");
		dutyweek_label.setBounds(280, 155, 70, 30);
		dutyweek_label.setFont(new Font("���� ���", Font.BOLD, 15));
		add(dutyweek_label);

		String[] dutyweekhead = { "��ü", "�� ~ ��", "�� ~ ��", "�� ~ ��", "��   ��" };
		Dutyweek = new JComboBox(dutyweekhead);
		Dutyweek.setBounds(360, 155, 130, 30);
		Dutyweek.setFont(new Font("���� ���", Font.BOLD, 15));
		Dutyweek.setVisible(true);
		add(Dutyweek);
		Dutyweek.addActionListener(FilterCombolistener);

		// -----------------------------------���� ���͸�

		JLabel agelabel = new JLabel("����");
		agelabel.setBounds(660, 155, 50, 30);
		agelabel.setFont(new Font("���� ���", Font.BOLD, 15));
		add(agelabel);

		AGE = new JTextField(example);
		AGE.setBounds(700, 155, 130, 30);
		AGE.setFont(new Font("���� ���", Font.BOLD, 15));
		add(AGE);
		AGE.addMouseListener(MouseListener2);
		// ----------------------------------------------- �˹�õ���� ���ڸ��� �˾�â

		AlbaHeaven.setBounds(1060, 10, 110, 110);
		AlbaHeaven.setIcon(images.Albaheaven);
		add(AlbaHeaven);
		AlbaHeaven.addActionListener(listener);
		AlbaHeaven.setContentAreaFilled(false);
		AlbaHeaven.setBorderPainted(false);
		
		JLabel albaheavenlabel= new JLabel("�˹�õ��");
		albaheavenlabel.setFont(new Font("���� ���",Font.BOLD,15));
		albaheavenlabel.setBounds(1090,130,70,15);
		add(albaheavenlabel);
		
		Intern.setBounds(900, 10, 110, 110);
		Intern.setIcon(images.IPP);
		add(Intern);
		Intern.addActionListener(listener);
		Intern.setContentAreaFilled(false);
		Intern.setBorderPainted(false);
		
		JLabel Internlabel= new JLabel("���� ����");
		Internlabel.setFont(new Font("���� ���",Font.BOLD,15));
		Internlabel.setBounds(925,130,70,15);
		add(Internlabel);
		
		EVENT.setBounds(1210, 10, 110, 110);
		EVENT.setIcon(images.event1);
		add(EVENT);
		EVENT.addActionListener(listener);
		EVENT.setContentAreaFilled(false);
		EVENT.setBorderPainted(false);
		
		JLabel Eventlabel= new JLabel("�̺�Ʈ");
		Eventlabel.setFont(new Font("���� ���",Font.BOLD,15));
		Eventlabel.setBounds(1240,130,70,15);
		add(Eventlabel);
		// -------------------------------------------------���ã�� ��ư
		REPOSITORY.setBounds(590, 10, 110, 110);
		REPOSITORY.setVisible(true);
		REPOSITORY.setIcon(images.Repasitory);
		add(REPOSITORY);
		REPOSITORY.addActionListener(listener);
		REPOSITORY.setContentAreaFilled(false);
		REPOSITORY.setBorderPainted(false);

		JLabel Repositorylabel= new JLabel("������");
		Repositorylabel.setFont(new Font("���� ���",Font.BOLD,15));
		Repositorylabel.setBounds(610,130,70,15);
		add(Repositorylabel);
		
		SAVE.setBounds(450, 10, 110, 110);
		SAVE.setIcon(images.save);
		SAVE.setVisible(true);
		add(SAVE);
		SAVE.addActionListener(listener);
		SAVE.setContentAreaFilled(false);
		SAVE.setBorderPainted(false);
		
		JLabel Savelabel= new JLabel("��  ��");
		Savelabel.setFont(new Font("���� ���",Font.BOLD,15));
		Savelabel.setBounds(480,130,70,15);
		add(Savelabel);
		// -------------------------------------------------�� ��ư
		INFO.setBounds(750, 10, 110, 110);
		INFO.setIcon(images.tip);
		add(INFO);
		INFO.addActionListener(listener);
		INFO.setContentAreaFilled(false);
		INFO.setBorderPainted(false);
		
		JLabel Infolabel= new JLabel("��");
		Infolabel.setFont(new Font("���� ���",Font.BOLD,15));
		Infolabel.setBounds(800,130,70,15);
		add(Infolabel);
		// --------------------------------------------------------------------���͸�
		// ���̺�����͸� ����
		Filterlabel.setBounds(10, 200, 150, 20);
		Filterlabel.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Filterlabel);

		Filterlabel1.setBounds(10, 230, 150, 20);
		Filterlabel1.setFont(new Font("���� ���", Font.BOLD, 13));
		add(Filterlabel1);

		periodlabel.setBounds(20, 260, 150, 20);
		periodlabel.setFont(new Font("���� ���", Font.BOLD, 12));
		periodlabel.setText("");
		add(periodlabel);

		periodbutton.setBounds(130, 260, 20, 20);
		periodbutton.setText("");
		periodbutton.setVisible(false);
		periodbutton.addActionListener(FilterButtonlistener);
		add(periodbutton);

		Filterlabel2.setBounds(10, 300, 150, 20); // -----------------�ٹ� ���� ���̺�
		Filterlabel2.setFont(new Font("���� ���", Font.BOLD, 13));
		add(Filterlabel2);

		dutyweeklabel.setBounds(20, 330, 150, 20);
		dutyweeklabel.setText("");
		dutyweeklabel.setFont(new Font("���� ���", Font.BOLD, 12));
		add(dutyweeklabel); // -----------------------------------------�ٹ� ���� ���̺�

		dutyweekbutton.setBounds(130, 330, 20, 20);// ------------------�ٹ� ���� ��ư
		dutyweekbutton.setText("");
		dutyweekbutton.setVisible(false);
		dutyweekbutton.addActionListener(FilterButtonlistener);
		add(dutyweekbutton);

		Filterlabel3.setBounds(10, 370, 150, 20);
		Filterlabel3.setFont(new Font("���� ���", Font.BOLD, 13));
		add(Filterlabel3);

		genderlabel.setBounds(20, 400, 150, 20);
		genderlabel.setText("");
		genderlabel.setFont(new Font("���� ���", Font.BOLD, 12));
		add(genderlabel); // -----------------------------------------���� ���̺�

		genderbutton.setBounds(130, 400, 20, 20);// ------------------���� ��ư
		genderbutton.setText("");
		genderbutton.setVisible(false);
		genderbutton.addActionListener(FilterButtonlistener);
		add(genderbutton);

		Filterlabel4.setBounds(10, 430, 150, 20);
		Filterlabel4.setFont(new Font("���� ���", Font.BOLD, 13));
		add(Filterlabel4);

		for (int i = 0; i < 5; i++) {
			Filtering[i] = new JLabel();
			Filtering[i].setFont(new Font("���� ���", Font.BOLD, 12));
			delete[i] = new JButton();
		}
		Filtering[0].setBounds(20, 460, 100, 20);
		Filtering[0].setVisible(false);
		add(Filtering[0]);
		Filtering[1].setBounds(20, 490, 100, 20);
		Filtering[1].setVisible(false);
		add(Filtering[1]);
		Filtering[2].setBounds(20, 520, 100, 20);
		Filtering[2].setVisible(false);
		add(Filtering[2]);
		Filtering[3].setBounds(20, 550, 100, 20);
		Filtering[3].setVisible(false);
		add(Filtering[3]);
		Filtering[4].setBounds(20, 580, 100, 20);
		Filtering[4].setVisible(false);
		add(Filtering[4]);

		delete[0].setBounds(130, 460, 20, 20);
		delete[0].setVisible(false);
		add(delete[0]);
		delete[0].addActionListener(FilterButtonlistener);
		delete[1].setBounds(130, 490, 20, 20);
		delete[1].setVisible(false);
		add(delete[1]);
		delete[1].addActionListener(FilterButtonlistener);
		delete[2].setBounds(130, 520, 20, 20);
		delete[2].setVisible(false);
		add(delete[2]);
		delete[2].addActionListener(FilterButtonlistener);
		delete[3].setBounds(130, 550, 20, 20);
		delete[3].setVisible(false);
		add(delete[3]);
		delete[3].addActionListener(FilterButtonlistener);
		delete[4].setBounds(130, 580, 20, 20);
		delete[4].setVisible(false);
		add(delete[4]);
		delete[4].addActionListener(FilterButtonlistener);

	}

	// ------------------ ���� Ŭ���� �� �޼ҵ� ����
	class Buttonlistener implements ActionListener { // ��ư �̺�Ʈ
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == AlbaMon) {
				try {
					Function.Albamoncrolling.explore("https://www.albamon.com");
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			}
			if (e.getSource() == Calculator) { // ���� ��ư------------------
				Calculatorpage calculator = new Calculatorpage();
			}
			if (e.getSource() == Search) {// �˻� ��ư----------------------

				if (AGE.getText().equals(example) || AGE.getText().equals("")) {
					Search_Albamon();
					AlbaHeavenpage.Search_AlbaHeaven();
				} else {
					try {
						Integer.parseInt(AGE.getText());
						Albamoncrolling.age = AGE.getText();
						AlbaHeavencrolling.age = AGE.getText();
						Search_Albamon();
						AlbaHeavenpage.Search_AlbaHeaven();
					} catch (NumberFormatException e1) {
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
			if (e.getSource() == REPOSITORY) { // ------------------���ã�� ��ư �̺�Ʈ
				Repositorypage repository = new Repositorypage();
			}
			if (e.getSource() == INFO) { // ------------------�� ��ư �̺�Ʈ
				TIPpage tip = new TIPpage();
			}
			if (e.getSource() == EVENT) {
				Eventpage event = new Eventpage();
			}
			if (e.getSource() == SAVE) { // -----------------���� ��ư �̺�Ʈ
				if (table.getSelectedRow() != -1) {
					int connect = JOptionPane.showConfirmDialog(null, "���� �Ͻðڽ��ϱ�?", "Notice", JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE, images.Dialog_save);
					if (connect == JOptionPane.CLOSED_OPTION)
						;
					else if (connect == JOptionPane.YES_OPTION) {
						try {
							if (-1 != SaveFunction.savealba(Loginpage.ID_.getText(),
									Alba.get(table.getSelectedRow()).getArea(),
									Alba.get(table.getSelectedRow()).getPay(),
									Alba.get(table.getSelectedRow()).getOffice(),
									Alba.get(table.getSelectedRow()).getText(),
									Alba.get(table.getSelectedRow()).getURL())) {
								JOptionPane.showMessageDialog(null, "����Ǿ����ϴ�.");
								Repositorypage.Search_Alba();
							}
							else
								JOptionPane.showMessageDialog(null, "�̹� ����� �����Դϴ�.");
						} catch (SQLException e1) {
						} catch (NullPointerException e2) {
						}
					}
				} else
					JOptionPane.showMessageDialog(null, "���� �������� �����̽��ϴ�.");

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
				int connect = JOptionPane.showConfirmDialog(null, "�ش� ���������� �̵��Ͻðڽ��ϱ�?", "Notice",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, images.Dialog_Albamon);
				if (connect == JOptionPane.CLOSED_OPTION)
					;
				else if (connect == JOptionPane.YES_OPTION) {
					try {
						System.out.println(Alba.get(table.getSelectedRow()).getURL());
						Function.Albamoncrolling.explore(Alba.get(table.getSelectedRow()).getURL());
					} catch (URISyntaxException e1) {
						e1.printStackTrace();
					}
				} else
					;
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
		header.setBackground(new Color(255, 102, 0));
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
		table.getColumnModel().getColumn(2).setPreferredWidth(340);
		table.getColumnModel().getColumn(3).setPreferredWidth(525);
		table.getColumnModel().getColumn(4).setPreferredWidth(120);
		table.getTableHeader().setReorderingAllowed(false);

		table.setRowHeight(35);
		table.setFont(new Font("���� ���", Font.BOLD, 25)); // ���� ũ�� ����

	}

	public void run() { // �ð� �޼ҵ�
		while (true) {
			if (timer % 2 == 0) {
				Intern.setIcon(images.ICT);
				EVENT.setIcon(images.event2);
				INFO.setIcon(images.tip2);
				AlbaHeaven.setIcon(images.Albaheaven2);
			} else {
				Intern.setIcon(images.IPP);
				EVENT.setIcon(images.event1);
				INFO.setIcon(images.tip);
				AlbaHeaven.setIcon(images.Albaheaven);
			}
			timer++;
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {

			}
		}
	}

}
