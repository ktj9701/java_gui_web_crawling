package GUI;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URISyntaxException;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Function.Eventcrolling;
import Function.Eventtext;

public class Eventpage extends JFrame{
	static Eventcrolling Event_crolling = new Eventcrolling();
	static JTable table; // ���̺�
	static DefaultTableModel TableModel = new DefaultTableModel() {// ���̺� ���� ���� �Ұ�
		public boolean isCellEditable(int rowIndex, int mCollndex) {
			return false;
		}
	}; // ���� ���� �Ұ�
	public static DefaultComboBoxModel ComboModel = new DefaultComboBoxModel();
	static String head[] = { "����", "����", "�Ⱓ", "��÷�ڹ�ǥ"};
	public static JScrollPane scroll;
	static Vector<Eventtext> Event;
	static Object arr[][];
	MouseListener MouseListener = new MouseListener();

	public Eventpage() {
		setTitle("���ڸ� �ٸ�� - �̺�Ʈ");
		setSize(800, 500);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // ���α׷� ũ�� ���� �Ұ� ����
		setLocationRelativeTo(null); // ȭ�� �߾ӿ� ������ �ϴ� ����
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		table = new JTable(TableModel);
		table.addMouseListener(MouseListener);
		Search_Event();
		scroll = new JScrollPane(table);
		scroll.setBounds(0, 130, 785, 335);
		scroll.setVisible(true);
		add(scroll);
	}
	public class MouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {

			if (e.getClickCount() == 2) {
				try {
					Function.Eventcrolling.explore(Event.get(table.getSelectedRow()).getURL());
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			} // ����Ŭ��

		}
	}

	public static void Search_Event() { // ���� �˻�
		try {
			Event = Event_crolling.crolling();
			arr = new Object[Event.size()][4];

			for (int i = 0; i < Event.size(); i++) {
				int j = 0;
				arr[i][j++] = Event.get(i).getTitle();
				arr[i][j++] = Event.get(i).getText();
				arr[i][j++] = Event.get(i).getPeriod();
				arr[i][j++] = Event.get(i).getAnnounce();
			}
			TableModel.setDataVector(arr, head);
			table.getColumnModel().getColumn(0).setPreferredWidth(340);
			table.getColumnModel().getColumn(1).setPreferredWidth(340);
			table.getColumnModel().getColumn(2).setPreferredWidth(190);
			table.getColumnModel().getColumn(3).setPreferredWidth(100);
			table.getTableHeader().setReorderingAllowed(false);
			table.setRowHeight(35);
			table.setFont(new Font("���� ���", Font.BOLD, 12)); // ���� ũ�� ����
		} catch (NullPointerException e) {
		}
	}
	
}
