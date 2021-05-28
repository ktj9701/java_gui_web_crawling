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

import Function.Albatext;
import Function.Interncrolling;
import Function.LoadInterntext;
import Function.SaveFunction;
import image.images;
public class Repositorypage extends JFrame {
	static JTable table; // ���̺�
	static DefaultTableModel TableModel = new DefaultTableModel() {// ���̺� ���� ���� �Ұ�
		public boolean isCellEditable(int rowIndex, int mCollndex) {
			return false;
		}
	};
	public static DefaultComboBoxModel ComboModel = new DefaultComboBoxModel();
	static String Albahead[] = { "����", "�޿�", "ȸ���", "����" };
	static String Internhead[] = { "ȸ���", "����", "����", "���� �ο�", "���� ����" };

	public static JScrollPane scroll;
	static Vector<Albatext> Alba;
	static Vector<LoadInterntext> intern;
	static Object arr[][];
	MouseListener MouseListener = new MouseListener();
	ButtonListener ButtonListener = new ButtonListener();
	public static JComboBox select;
	static SaveFunction crolling = new SaveFunction();
	JButton delete = new JButton("����");
	JButton back = new JButton("������");

	public Repositorypage() {
		setTitle("���ڸ� �ٸ�� - ���ã��");
		setSize(1500, 800);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // ���α׷� ũ�� ���� �Ұ� ����
		setLocationRelativeTo(null); // ȭ�� �߾ӿ� ������ �ϴ� ����
		table = new JTable(TableModel);
		table.addMouseListener(MouseListener);
		Search_Alba();
		scroll = new JScrollPane(table);
		scroll.setBounds(0, 130, 1484, 633);
		scroll.setVisible(true);
		add(scroll);

		JLabel label = new JLabel("����");
		label.setBounds(40, 90, 50, 30);
		label.setFont(new Font("���� ���", Font.BOLD, 15));
		add(label);

		String[] kind = { "�˹�", "����" };
		select = new JComboBox(kind);
		select.setSelectedIndex(0);
		select.setBounds(100, 90, 250, 30);
		select.setFont(new Font("���� ���", Font.BOLD, 15));
		add(select);
		combolistener Combolistener = new combolistener();
		select.addActionListener(Combolistener);

		delete.setBounds(1200, 20, 100, 100);
		add(delete);
		delete.addActionListener(ButtonListener);
		//delete.setIcon(images.test);
		back.setBounds(1350, 20, 100, 100);
		add(back);
		back.addActionListener(ButtonListener);
	}

	public class ButtonListener implements ActionListener { // ���콺 Ŭ�� �̺�Ʈ
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == delete) {
				if (((String) select.getSelectedItem()).equals("�˹�")) {
					String temp = Alba.get(table.getSelectedRow()).getURL();
					try {
						SaveFunction.deletealba(temp);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Search_Alba();
				} else {
					String temp = intern.get(table.getSelectedRow()).getProject();
					try {
						SaveFunction.deleteintern(temp);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Search_Intern();
				}
			}
			if(e.getSource()==back)
				dispose();
		}
	}

	public class MouseListener extends MouseAdapter { // ���콺 Ŭ�� �̺�Ʈ
		public void mouseClicked(MouseEvent e) {

			if (e.getClickCount() == 2) {
				if (((String) select.getSelectedItem()).equals("�˹�")) {
					try {
						Function.Albamoncrolling.explore(Alba.get(table.getSelectedRow()).getURL());
					} catch (URISyntaxException e1) {
						e1.printStackTrace();
					}
				} 
				else {
					try {
						System.out.println(intern.get(table.getSelectedRow()).getURL());
						Interncrolling.explore(intern.get(table.getSelectedRow()).getURL());
					} catch (URISyntaxException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
	}

	public class combolistener implements ActionListener { // �޺��ڽ� ���ý� �̺�Ʈ �߻� Ŭ����
		public void actionPerformed(ActionEvent e) {
			if (0 == select.getSelectedIndex()) {
				Search_Alba();
			} else
				Search_Intern();
		}

	}

	public static void Search_Alba() { // ���� �˻�
		Alba = crolling.loadalba();
		arr = new Object[Alba.size()][4];

		for (int i = 0; i < Alba.size(); i++) {
			int j = 0;
			arr[i][j++] = Alba.get(i).getArea();
			arr[i][j++] = Alba.get(i).getPay();
			arr[i][j++] = Alba.get(i).getOffice();
			arr[i][j++] = Alba.get(i).getText();

		}
		TableModel.setDataVector(arr, Albahead);
		table.getColumnModel().getColumn(0).setPreferredWidth(170);
		table.getColumnModel().getColumn(1).setPreferredWidth(170);
		table.getColumnModel().getColumn(2).setPreferredWidth(360);
		table.getColumnModel().getColumn(3).setPreferredWidth(525);
		table.getTableHeader().setReorderingAllowed(false);

		table.setRowHeight(35);
		table.setFont(new Font("���� ���", Font.BOLD, 25)); // ���� ũ�� ����
	}

	public static void Search_Intern() { // ���� �˻�
		intern = crolling.loadintern();
		arr = new Object[intern.size()][5];

		for (int i = 0; i < intern.size(); i++) {
			int j = 0;
			arr[i][j++] = intern.get(i).getName();
			arr[i][j++] = intern.get(i).getProject();
			arr[i][j++] = intern.get(i).getArea();
			arr[i][j++] = intern.get(i).getNum();
			arr[i][j++] = intern.get(i).getState();
		}
		TableModel.setDataVector(arr, Internhead);
		table.getColumnModel().getColumn(0).setPreferredWidth(170);
		table.getColumnModel().getColumn(1).setPreferredWidth(170);
		table.getColumnModel().getColumn(2).setPreferredWidth(360);
		table.getColumnModel().getColumn(3).setPreferredWidth(525);
		table.getColumnModel().getColumn(4).setPreferredWidth(525);
		table.getTableHeader().setReorderingAllowed(false);

		table.setRowHeight(35);
		table.setFont(new Font("���� ���", Font.BOLD, 25)); // ���� ũ�� ����
	}
}
