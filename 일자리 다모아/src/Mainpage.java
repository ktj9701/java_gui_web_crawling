// ���� ȭ��

import java.awt.Button;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Mainpage extends JFrame {
	Object temp, temp2;

	Detail_Area Detail = new Detail_Area(); // �������� ���� ���� Ŭ����
	City city = new City();
	Seoul ����1���� = new Seoul();
	Seoul2 ����2���� = new Seoul2();
	static int index = 0;

	static Button Serch = new Button("�˻�");
	static Button Calculator = new Button("���� ����");

	static DefaultTableModel TableModel = new DefaultTableModel();
	static DefaultComboBoxModel ComboModel = new DefaultComboBoxModel();

	static String head[] = { "����", "�޿�", "ȸ���", "����", "��� �ð�" };
	static TextField SerchField = new TextField();
	public static JScrollPane scroll;

	crolling crolling = new crolling();
	static Vector<Albatext> Alba;
	static Object arr[][];

	static JComboBox Area, Detail_Area, City; // ��, �� �޺��ڽ�

	// ����� ���͸� Ȯ�� �� ���͸� ���� ��ư-----------------------------------------------
	static JLabel[] Filtering = new JLabel[5];
	static JButton[] delete = new JButton[5];

//-------------------------------------�̺�Ʈ ---------------------------
	Buttonlistener listener = new Buttonlistener();

	public Mainpage() {
		setTitle("���ڸ� �ٸ��");
		setSize(1500, 800);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // ���α׷� ũ�� ���� �Ұ� ����
		setLocationRelativeTo(null); // ȭ�� �߾ӿ� ������ �ϴ� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//----------------------------------------------------------���� ���̺� ------------------------------------------------------

		Search_Alba();
		JTable table = new JTable(TableModel);
		scroll = new JScrollPane(table);
		table.setFont(new Font("���� ���", Font.BOLD, 25)); // ���� ũ�� ����
		table.setRowHeight(25);
		scroll.setBounds(160, 130, 1325, 633);
		scroll.setVisible(true);
		add(scroll);

// ----------------------------------------------------------�˻� ��ư�� �˻� �ؽ�Ʈ �ʵ�
		Serch.setBounds(900, 30, 60, 60);
		Serch.setVisible(true);
		add(Serch);
		Serch.addActionListener(listener);

		SerchField.setBounds(30, 40, 850, 40);
		SerchField.setFont(new Font("���� ���", Font.BOLD, 30));
		SerchField.setVisible(true);
		add(SerchField);

		Calculator.setBounds(1000, 30, 60, 60);
		Calculator.setVisible(true);
		add(Calculator);
		Calculator.addActionListener(listener);

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
		delete[1].setBounds(130, 180, 20, 20);
		delete[1].setVisible(false);
		add(delete[1]);
		delete[2].setBounds(130, 210, 20, 20);
		delete[2].setVisible(false);
		add(delete[2]);
		delete[3].setBounds(130, 240, 20, 20);
		delete[3].setVisible(false);
		add(delete[3]);
		delete[4].setBounds(130, 270, 20, 20);
		delete[4].setVisible(false);
		add(delete[4]);
	}

	// ------------------ ���� Ŭ���� �� �޼ҵ� ����

	class Buttonlistener implements ActionListener { // ��ư �̺�Ʈ
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == Calculator) {
				Calculatorpage calculator = new Calculatorpage();
				calculator.setVisible(true);
			}
			if (e.getSource() == Serch) {
				index = 0;
				for (int i = 0; i < 5; i++) {
					Filtering[i].setText("");
					Filtering[i].setVisible(false);
					delete[i].setText("");
					delete[i].setVisible(false);
				}
				crolling.area = "";
				Search_Alba();
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
					Search_Alba();
					temp = Area.getSelectedItem();
				} 
				else if (e.getSource() == Detail_Area) {
					index=0;
					for (int i = 0; i < 5; i++) {
						Filtering[i].setText("");
						Filtering[i].setVisible(false);
						delete[i].setText("");
						delete[i].setVisible(false);
					}
					City.setVisible(true);
					city.changeComboBox(e);
					Search_Alba();
					temp2 = Detail_Area.getSelectedItem();
				} 
				else if (e.getSource() == City) {
					if (temp2.equals("������") || temp2.equals("������") || temp2.equals("���ϱ�") || temp2.equals("������")
							|| temp2.equals("���Ǳ�") || temp2.equals("������") || temp2.equals("���α�") || temp2.equals("��õ��")
							|| temp2.equals("�����") || temp2.equals("������") || temp2.equals("���빮��") || temp2.equals("���۱�")
							|| temp2.equals("������") || temp2.equals("���빮��") || temp2.equals("���ʱ�") || temp2.equals("������")
							|| temp2.equals("���ϱ�")) {
						����1����.SeoulCity(e);
						if (����1����.flag != true)
							Search_Alba();
					} else if (temp2.equals("���ı�") || temp2.equals("��õ��") || temp2.equals("��������") || temp2.equals("��걸")
							|| temp2.equals("����") || temp2.equals("���α�") || temp2.equals("�߱�")
							|| temp2.equals("�߶���")) {
						����2����.Seoul2City(e);
						if (����2����.flag != true)
							Search_Alba();
					}
				}
				System.out.println(crolling.area);
			}
		}
	}

	public void Search_Alba() { // ���� �˻�
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
	}
}
