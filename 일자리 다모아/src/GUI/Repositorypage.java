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
	static JTable table; // 테이블
	static DefaultTableModel TableModel = new DefaultTableModel() {// 테이블 내용 수정 불가
		public boolean isCellEditable(int rowIndex,int mCollndex){return false;}};

	static JTableHeader header;
	public static DefaultComboBoxModel ComboModel = new DefaultComboBoxModel();
	static String Albahead[] = { "지역", "급여", "회사명", "내용" };
	static String Internhead[] = { "회사명", "내용", "지역", "모집 인원", "진행 상태" };

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
	JButton delete = new JButton("삭제");
	JButton back = new JButton("나가기");
	JPanel background = new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(images.ground4.getImage(), 0, 0,null); // 사진은 나중에 찾기
	setOpaque(false);super.paintComponent(g);}};

	public static int index = 0;

	public Repositorypage() {
		setTitle("일자리 다모아 - 즐겨찾기");
		setSize(1215, 565);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // 프로그램 크기 조절 불가 설정
		setLocationRelativeTo(null); // 화면 중앙에 오도록 하는 설정

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

		JLabel label = new JLabel("종류");
		label.setBounds(40, 90, 50, 30);
		label.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		add(label);

		String[] kind = { "알바", "인턴" };
		select = new JComboBox(kind);
		select.setSelectedIndex(0);
		select.setBounds(100, 90, 250, 30);
		select.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		add(select);
		select.addActionListener(Combolistener);

		for (int i = 0; i < 2; i++) {
			sort[i] = new JButton();
			add(sort[i]);
			sort[i].addActionListener(ButtonListener);
			sort[i].setFont(new Font("맑은 고딕", Font.BOLD, 10));
			sort[i].setBounds(380, 90, 110, 30);
		}
		sort[0].setText("과거 저장순▼");
		sort[1].setText("최신 저장순▲");
		sort[1].setVisible(false);

		stack.setBounds(520, 90, 400, 30);
		stack.setFont(new Font("맑은 고딕", Font.BOLD, 15));
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

	public class ButtonListener implements ActionListener { // 마우스 클릭 이벤트
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == delete) {
				if (table.getSelectedRow() != -1) {
					int connect = JOptionPane.showConfirmDialog(null, "영구 삭제하시겠습니까?", "Notice",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, images.Dialog_save);
					if (connect == JOptionPane.CLOSED_OPTION)
						;
					else if (connect == JOptionPane.YES_OPTION) {
						if (((String) select.getSelectedItem()).equals("알바")) {
							String temp = Alba.get(table.getSelectedRow()).getURL();
							try {
								SaveFunction.deletealba(temp);
							} catch (SQLException e1) {
							} catch (NullPointerException e2) {
							}
							JOptionPane.showMessageDialog(null, "삭제되었습니다.");
							Search_Alba();
						} else {
							String temp = intern.get(table.getSelectedRow()).getProject();
							try {
								SaveFunction.deleteintern(temp);
							} catch (SQLException e1) {
							} catch (NullPointerException e2) {
							}
							JOptionPane.showMessageDialog(null, "삭제되었습니다.");
							Search_Intern();
						}
					}
				} else
					JOptionPane.showMessageDialog(null, "내용을 선택해주세요.");
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

	public class MouseListener extends MouseAdapter { // 마우스 클릭 이벤트
		public void mouseClicked(MouseEvent e) {

			if (e.getClickCount() == 2) {
				if (((String) select.getSelectedItem()).equals("알바")) {
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

	public class combolistener implements ActionListener { // 콤보박스 선택시 이벤트 발생 클래스
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

	public static void Search_Alba() { // 광고 검색
		header = table.getTableHeader();
		header.setBackground(new Color(210, 222, 239));
		header.setFont(new Font("맑은 고딕", Font.BOLD, 25));
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
		table.setFont(new Font("맑은 고딕", Font.BOLD, 25)); // 글자 크기 설정
		stack.setText("현재 총 "+Alba.size()+"개의 광고가 저장되었습니다.");
	}

	public static void Search_Intern() { // 광고 검색
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
		table.setFont(new Font("맑은 고딕", Font.BOLD, 25)); // 글자 크기 설정
		stack.setText("현재 총 "+intern.size()+"개의 공고가 저장되었습니다.");
	}
}
