// ���� ȭ��

import java.awt.Button;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Mainpage extends JFrame {
	Detail_Area Detail= new Detail_Area(); // �������� ���� ���� Ŭ����
	
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

	static JComboBox Area, Detail_Area;  //��, �� �޺��ڽ�
	

//-------------------------------------�̺�Ʈ 
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
		String[] Korea_Province = { "����","����", "���", "��õ", "����", "����", "����", "�泲", "�溹", "�λ�", "���", "�泲", "���", "�뱸", "����",
				"����", "����", "����" };
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
			
	}	
	
	//------------------ ���� Ŭ���� �� �޼ҵ� ����
	
	class Buttonlistener implements ActionListener { // ��ư �̺�Ʈ
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == Calculator) {
				Calculatorpage calculator = new Calculatorpage();
				calculator.setVisible(true);
			}
		}
	}
	public class combolistener implements ActionListener { // �޺��ڽ� ���ý� �̺�Ʈ �߻� Ŭ����
		public void actionPerformed(ActionEvent e) {
			JComboBox cb = (JComboBox) e.getSource();
			Detail_Area.setVisible(true);
			Detail.changeComboBox(e); // �޺��ڽ��� �´� ����Ʈ ���
			Detail_Area.setSelectedIndex(0);
			Search_Alba();
			
		}
	}
	

	
	public void Search_Alba() {  //���� �˻�
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
