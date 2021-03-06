package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URISyntaxException;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

import Function.Eventcrolling;
import Function.Eventtext;
import image.images;

public class Eventpage extends JFrame {
	JTableHeader header;
	static Eventcrolling Event_crolling = new Eventcrolling();
	static JTable table; // 테이블
	static DefaultTableModel TableModel = new DefaultTableModel() {// 테이블 내용 수정 불가
		public boolean isCellEditable(int rowIndex, int mCollndex) {
			return false;
		}
	}; // 내용 수정 불가
	public static DefaultComboBoxModel ComboModel = new DefaultComboBoxModel();
	static String head[] = { "제목", "내용", "기간", "분류" };
	public static JScrollPane scroll;
	static Vector<Eventtext> Event;
	static Object arr[][];
	MouseListener MouseListener = new MouseListener();
	JPanel background = new JPanel();
	JButton back = new JButton();
	Buttonlistener Buttonlistener =new Buttonlistener();
	public Eventpage() {
		setTitle("일자리 다모아 - 이벤트");
		setSize(797, 346);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // 프로그램 크기 조절 불가 설정
		setLocationRelativeTo(null); // 화면 중앙에 오도록 하는 설정
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		background.setLayout(null);
		setContentPane(background);
		background.setBackground(Color.WHITE);

		table = new JTable(TableModel) {
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
				JComponent component = (JComponent) super.prepareRenderer(renderer, row, column);
				if (!isRowSelected(row)) {
					if (row % 2 == 0)
						component.setBackground(Color.WHITE);
						
					else
						component.setBackground(new Color(213, 227, 157));
				}
				return component;

			}
		};
		table.addMouseListener(MouseListener);
		Search_Event();
		scroll = new JScrollPane(table);
		scroll.setBounds(0, 130, 785, 335);
		//scroll.setVisible(true);
		background.add(scroll);

		JLabel title = new JLabel();
		title.setIcon(images.title_event);
		title.setBounds(0, 0, 500, 130);
		background.add(title);

		back.setBounds(680, 20, 100, 100);
		back.setIcon(images.back);
		add(back);
		back.setContentAreaFilled(false);
		back.setBorderPainted(false);
		back.addActionListener(Buttonlistener);
	}

	class Buttonlistener implements ActionListener { // 버튼 이벤트
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==back)
				dispose();
		}
	}

	public class MouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {

			if (e.getClickCount() == 2) {
				try {
					Function.Eventcrolling.explore(Event.get(table.getSelectedRow()).getURL());
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			} // 더블클릭

		}
	}

	public void Search_Event() { // 광고 검색
		header = table.getTableHeader();
		header.setBackground(new Color(112,200,71));
		header.setFont(new Font("맑은 고딕", Font.BOLD, 25));
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
			table.setFont(new Font("맑은 고딕", Font.BOLD, 12)); // 글자 크기 설정
		} catch (NullPointerException e) {
		}
	}

}
