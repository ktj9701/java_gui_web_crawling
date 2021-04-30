package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Function.Interncrolling;
import Function.IPP;
import Function.ICT;
import Function.wewe;
import GUI.AlbaHeavenpage.MouseListener;
import GUI.Mainpage.combolistener;

public class ICTpage extends JFrame {
	static Interncrolling Intern_crolling = new Interncrolling();
	static JTable table; // ���̺�
	static DefaultTableModel TableModel = new DefaultTableModel() {// ���̺� ���� ���� �Ұ�
		public boolean isCellEditable(int rowIndex, int mCollndex) {
			return false;
		}
	}; // ���� ���� �Ұ�
	public static DefaultComboBoxModel ComboModel = new DefaultComboBoxModel();
	static String ICThead[] = { "ȸ���", "����", "���ñ��", "����", "���� �ο�", "ä�� ��Ȳ" };
	static String IPPhead[] = { "ȸ���", "����", "����", "���� �ο�", "���� ����" };
	public static JScrollPane scroll;
	static Vector<ICT> ICT;
	static Vector<IPP> IPP;
	static Object arr[][];

	MouseListener MouseListener = new MouseListener();
	public static JComboBox select;

	public ICTpage() {
		setTitle("���ڸ� �ٸ�� - �˾�");
		setSize(1500, 800);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // ���α׷� ũ�� ���� �Ұ� ����
		setLocationRelativeTo(null); // ȭ�� �߾ӿ� ������ �ϴ� ����
		table = new JTable(TableModel);
		table.addMouseListener(MouseListener);
		ICT_Search(0);
		scroll = new JScrollPane(table);
		scroll.setBounds(0, 130, 1484, 633);
		scroll.setVisible(true);
		add(scroll);

		JLabel label = new JLabel("����");
		label.setBounds(40, 90, 50, 30);
		label.setFont(new Font("���� ���", Font.BOLD, 15));
		add(label);

		String[] kind = { "2021�� ��ݱ�(��������)", "2020�� �Ϲݱ�(��������)" };
		select = new JComboBox(kind);
		select.setSelectedIndex(0);
		select.setBounds(100, 90, 200, 30);
		select.setFont(new Font("���� ���", Font.BOLD, 15));
		add(select);
		combolistener Combolistener = new combolistener();
		select.addActionListener(Combolistener);
	}

	public class MouseListener extends MouseAdapter {

		public void mouseClicked(MouseEvent e) {

			if (e.getClickCount() == 2) {
				try {
					Function.crolling.explore(ICT.get(table.getSelectedRow()).getURL());
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			} // ����Ŭ��

		}
	}

	public static void ICT_Search(int index) {
		if (index == 0) {
			try {
				ICT = Intern_crolling.ICT2021��ݱ�();
				arr = new Object[ICT.size()][6];
				for (int i = 0; i < ICT.size(); i++) {
					int j = 0;
					arr[i][j++] = ICT.get(i).getName();
					arr[i][j++] = ICT.get(i).getProject();
					arr[i][j++] = ICT.get(i).getSubject();
					arr[i][j++] = ICT.get(i).getArea();
					arr[i][j++] = ICT.get(i).getMax();
					arr[i][j++] = ICT.get(i).getNum();
				}
				TableModel.setDataVector(arr, ICThead);
				table.getColumnModel().getColumn(0).setPreferredWidth(250);
				table.getColumnModel().getColumn(1).setPreferredWidth(525);
				table.getColumnModel().getColumn(2).setPreferredWidth(250);
				table.getColumnModel().getColumn(3).setPreferredWidth(170);
				table.getColumnModel().getColumn(4).setPreferredWidth(120);
				table.getColumnModel().getColumn(5).setPreferredWidth(80);
				table.getTableHeader().setReorderingAllowed(false);
				table.setRowHeight(35);
				table.setFont(new Font("���� ���", Font.BOLD, 25)); // ���� ũ�� ����
				return;
			} catch (SQLException e) {
			}
		}
		if (index == 1) {
			try {
				IPP = Intern_crolling.IPP2020�Ϲݱ�();
				arr = new Object[IPP.size()][5];
				for (int i = 0; i < IPP.size(); i++) {
					int j = 0;
					arr[i][j++] = IPP.get(i).getName();
					arr[i][j++] = IPP.get(i).getProject();
					arr[i][j++] = IPP.get(i).getArea();
					arr[i][j++] = IPP.get(i).getNum();
					arr[i][j++] = IPP.get(i).getState();
				}
				TableModel.setDataVector(arr, IPPhead);
				table.getColumnModel().getColumn(0).setPreferredWidth(250);
				table.getColumnModel().getColumn(1).setPreferredWidth(525);
				table.getColumnModel().getColumn(2).setPreferredWidth(250);
				table.getColumnModel().getColumn(3).setPreferredWidth(170);
				table.getColumnModel().getColumn(4).setPreferredWidth(120);
				table.getTableHeader().setReorderingAllowed(false);
				table.setRowHeight(35);
				table.setFont(new Font("���� ���", Font.BOLD, 25)); // ���� ũ�� ����
				return;
			} catch (SQLException e) {
			}
		}
	}

	public class combolistener implements ActionListener { // �޺��ڽ� ���ý� �̺�Ʈ �߻� Ŭ����
		public void actionPerformed(ActionEvent e) {
			if (select.getSelectedIndex() == 0)
				ICT_Search(0);
			if (select.getSelectedIndex() == 1)
				ICT_Search(1);
		}
	}
}
