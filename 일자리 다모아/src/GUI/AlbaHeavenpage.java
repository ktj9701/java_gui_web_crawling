package GUI;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Function.AlbaHeavencrolling;
import Function.Albatext;
import Function.SaveFunction;

public class AlbaHeavenpage extends JFrame {
	static AlbaHeavencrolling Albaheaven_crolling = new AlbaHeavencrolling();
	static JTable table; // ���̺�
	static DefaultTableModel TableModel = new DefaultTableModel() {// ���̺� ���� ���� �Ұ�
		public boolean isCellEditable(int rowIndex, int mCollndex) {
			return false;
		}
	}; // ���� ���� �Ұ�
	public static DefaultComboBoxModel ComboModel = new DefaultComboBoxModel();
	static String head[] = { "����", "�޿�", "ȸ���", "����", "��� �ð�" };
	public static JScrollPane scroll;
	static Vector<Albatext> AlbaHeaven;
	static Object arr[][];
	MouseListener MouseListener = new MouseListener();
	JButton SAVE = new JButton("����");
	ButtonListener ButtonListener = new ButtonListener();

	public AlbaHeavenpage() {
		setTitle("���ڸ� �ٸ�� - �˾�");
		setSize(1315, 800);
		this.setLayout(null);
		setVisible(true);
		// setResizable(false); // ���α׷� ũ�� ���� �Ұ� ����
		setLocationRelativeTo(null); // ȭ�� �߾ӿ� ������ �ϴ� ����
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		table = new JTable(TableModel);
		table.addMouseListener(MouseListener);
		Search_AlbaHeaven();
		scroll = new JScrollPane(table);
		scroll.setBounds(0, 130, 1300, 633);
		scroll.setVisible(true);
		add(scroll);
		table.getTableHeader().setResizingAllowed(false); // ũ�� ���� �Ұ�

		SAVE.setBounds(1200, 20, 100, 100);
		add(SAVE);
		SAVE.addActionListener(ButtonListener);
	}

	public class ButtonListener implements ActionListener { // ���콺 Ŭ�� �̺�Ʈ
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == SAVE) {
				try {
					SaveFunction.savealba(Loginpage.ID_.getText()," "+AlbaHeaven.get(table.getSelectedRow()).getArea(),AlbaHeaven.get(table.getSelectedRow()).getPay()
							,AlbaHeaven.get(table.getSelectedRow()).getOffice(),AlbaHeaven.get(table.getSelectedRow()).getText(),AlbaHeaven.get(table.getSelectedRow()).getURL());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Repositorypage.Search_Alba();
			}
		}
	}

	public class MouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 2) {
				try {
					Function.AlbaHeavencrolling.explore(AlbaHeaven.get(table.getSelectedRow()).getURL());
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			} // ����Ŭ��

		}
	}

	public static void Search_AlbaHeaven() { // ���� �˻�
		try {
			AlbaHeaven = Albaheaven_crolling.crolling();
			arr = new Object[AlbaHeaven.size()][5];
			for (int i = 0; i < AlbaHeaven.size(); i++) {
				int j = 0;
				arr[i][j++] = AlbaHeaven.get(i).getArea();
				arr[i][j++] = AlbaHeaven.get(i).getPay();
				arr[i][j++] = AlbaHeaven.get(i).getOffice();
				arr[i][j++] = AlbaHeaven.get(i).getText();
				arr[i][j++] = AlbaHeaven.get(i).getTime();
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
		} catch (NullPointerException e) {
		}
	}

}
