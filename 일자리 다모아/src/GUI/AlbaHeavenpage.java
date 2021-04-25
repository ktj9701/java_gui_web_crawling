package GUI;

import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Function.wewe;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URISyntaxException;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlbaHeavenpage extends JFrame {
	static wewe Albaheaven_crolling = new wewe();
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

	Buttonlistener listener = new Buttonlistener();
	MouseListener MouseListener = new MouseListener();

	public AlbaHeavenpage() {
		setTitle("���ڸ� �ٸ�� - �˾�");
		setSize(1500, 800);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // ���α׷� ũ�� ���� �Ұ� ����
		setLocationRelativeTo(null); // ȭ�� �߾ӿ� ������ �ϴ� ����

		table = new JTable(TableModel);
		table.addMouseListener(MouseListener);
		Search_AlbaHeaven();
		scroll = new JScrollPane(table);
		scroll.setBounds(160, 130, 1325, 633);
		scroll.setVisible(true);
		add(scroll);
	}

	class Buttonlistener implements ActionListener { // ��ư �̺�Ʈ
		public void actionPerformed(ActionEvent e) {
		}
	}

	public class MouseListener extends MouseAdapter {

		public void mouseClicked(MouseEvent e) {

			if (e.getClickCount() == 2) {
				try {
					Function.crolling.explore(AlbaHeaven.get(table.getSelectedRow()).getURL());
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
