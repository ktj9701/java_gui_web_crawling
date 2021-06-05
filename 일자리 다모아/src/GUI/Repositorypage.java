package GUI;

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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

import Function.Albatext;
import Function.Interncrolling;
import Function.LoadInterntext;
import Function.SaveFunction;
import image.images;

public class Repositorypage extends JFrame {
	static JTable table; // ���̺�
	static DefaultTableModel TableModel = new DefaultTableModel() {// ���̺� ���� ���� �Ұ�
		public boolean isCellEditable(int rowIndex,int mCollndex){return false;}};

	static JTableHeader header;
	public static DefaultComboBoxModel ComboModel = new DefaultComboBoxModel();
	static String Albahead[] = { "����", "�޿�", "ȸ���", "����" };
	static String Internhead[] = { "ȸ���", "����", "����", "���� �ο�", "���� ����" };

	public static JScrollPane scroll;
	static Vector<Albatext> Alba;
	static Vector<LoadInterntext> intern;
	static Object arr[][];
	MouseListener MouseListener = new MouseListener();
	ButtonListener ButtonListener = new ButtonListener();
	combolistener Combolistener = new combolistener();
	public static JComboBox select;
	static SaveFunction crolling = new SaveFunction();

	static JLabel stack=new JLabel();
	JButton sort[] = new JButton[2];
	JButton delete = new JButton("����");
	JButton back = new JButton("������");
	JPanel background = new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(images.ground4.getImage(), 0, 0,null); // ������ ���߿� ã��
	setOpaque(false);super.paintComponent(g);}};

	public static int index = 0;

	public Repositorypage() {
		setTitle("���ڸ� �ٸ�� - ���ã��");
		setSize(1215, 565);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // ���α׷� ũ�� ���� �Ұ� ����
		setLocationRelativeTo(null); // ȭ�� �߾ӿ� ������ �ϴ� ����

		background.setLayout(null);
		setContentPane(background);
		setBackground(Color.WHITE);

		table = new JTable(TableModel) {
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
				JComponent component = (JComponent) super.prepareRenderer(renderer, row, column);
				if (!isRowSelected(row)) {
					if (row % 2 == 0)
						component.setBackground(Color.WHITE);
					else
						component.setBackground(new Color(234, 239, 247));
				}
				return component;

			}
		};
		table.addMouseListener(MouseListener);
		Search_Alba();
		scroll = new JScrollPane(table);
		scroll.setBounds(0, 130, 1200, 400);
		//scroll.setVisible(true);
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
		select.addActionListener(Combolistener);

		for (int i = 0; i < 2; i++) {
			sort[i] = new JButton();
			add(sort[i]);
			sort[i].addActionListener(ButtonListener);
			sort[i].setFont(new Font("���� ���", Font.BOLD, 10));
			sort[i].setBounds(380, 90, 110, 30);
		}
		sort[0].setText("���� �������");
		sort[1].setText("�ֽ� �������");
		sort[1].setVisible(false);

		stack.setBounds(520, 90, 400, 30);
		stack.setFont(new Font("���� ���", Font.BOLD, 15));
		add(stack);

		delete.setBounds(975, 20, 100, 100);
		delete.setIcon(images.delete);
		add(delete);
		delete.setContentAreaFilled(false);
		delete.setBorderPainted(false);
		delete.addActionListener(ButtonListener);

		back.setBounds(1100, 20, 100, 100);
		back.setIcon(images.back);
		add(back);
		back.setContentAreaFilled(false);
		back.setBorderPainted(false);
		back.addActionListener(ButtonListener);
	}

	public class ButtonListener implements ActionListener { // ���콺 Ŭ�� �̺�Ʈ
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == delete) {
				if (table.getSelectedRow() != -1) {
					int connect = JOptionPane.showConfirmDialog(null, "���� �����Ͻðڽ��ϱ�?", "Notice",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, images.Dialog_save);
					if (connect == JOptionPane.CLOSED_OPTION)
						;
					else if (connect == JOptionPane.YES_OPTION) {
						if (((String) select.getSelectedItem()).equals("�˹�")) {
							String temp = Alba.get(table.getSelectedRow()).getURL();
							try {
								SaveFunction.deletealba(temp);
							} catch (SQLException e1) {
							} catch (NullPointerException e2) {
							}
							JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�.");
							Search_Alba();
						} else {
							String temp = intern.get(table.getSelectedRow()).getProject();
							try {
								SaveFunction.deleteintern(temp);
							} catch (SQLException e1) {
							} catch (NullPointerException e2) {
							}
							JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�.");
							Search_Intern();
						}
					}
				} else
					JOptionPane.showMessageDialog(null, "������ �������ּ���.");
			}
			if (e.getSource() == back)
				dispose();
			if (e.getSource() == sort[0]) {
				index = 1;
				sort[0].setVisible(false);
				sort[1].setVisible(true);
				if (0 == select.getSelectedIndex())
					Search_Alba();
				else
					Search_Intern();
			}
			if (e.getSource() == sort[1]) {
				index = 0;
				sort[0].setVisible(true);
				sort[1].setVisible(false);
				if (0 == select.getSelectedIndex())
					Search_Alba();
				else
					Search_Intern();
			}
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
				} else {
					try {
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
				index = 0;
				sort[0].setVisible(true);
				sort[1].setVisible(false);
				Search_Alba();
			} else {
				index = 0;
				sort[0].setVisible(true);
				sort[1].setVisible(false);
				Search_Intern();
			}
		}

	}

	public static void Search_Alba() { // ���� �˻�
		header = table.getTableHeader();
		header.setBackground(new Color(210, 222, 239));
		header.setFont(new Font("���� ���", Font.BOLD, 25));
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
		table.getColumnModel().getColumn(0).setPreferredWidth(130);
		table.getColumnModel().getColumn(1).setPreferredWidth(140);
		table.getColumnModel().getColumn(2).setPreferredWidth(360);
		table.getColumnModel().getColumn(3).setPreferredWidth(450);
		table.getTableHeader().setReorderingAllowed(false);
		table.setRowHeight(35);
		table.setFont(new Font("���� ���", Font.BOLD, 25)); // ���� ũ�� ����
		stack.setText("���� �� "+Alba.size()+"���� ���� ����Ǿ����ϴ�.");
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
		table.getColumnModel().getColumn(0).setPreferredWidth(200);
		table.getColumnModel().getColumn(1).setPreferredWidth(400);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setPreferredWidth(80);
		table.getTableHeader().setReorderingAllowed(false);

		table.setRowHeight(35);
		table.setFont(new Font("���� ���", Font.BOLD, 25)); // ���� ũ�� ����
		stack.setText("���� �� "+intern.size()+"���� ���� ����Ǿ����ϴ�.");
	}
}
