package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Function.Albatext;
import Function.LoadInterntext;
import Function.SaveFunction;

public class Repositorypage extends JFrame {
	static JTable table; // 테이블
	static DefaultTableModel TableModel = new DefaultTableModel() {// 테이블 내용 수정 불가
		public boolean isCellEditable(int rowIndex, int mCollndex) {
			return false;
		}
	};
	public static DefaultComboBoxModel ComboModel = new DefaultComboBoxModel();
	static String Albahead[] = { "지역", "급여", "회사명", "내용" };
	static String Internhead[] = { "회사명", "내용", "지역", "모집 인원", "진행 상태" };

	public static JScrollPane scroll;
	static Vector<Albatext> Alba;
	static Vector<LoadInterntext> intern;
	static Object arr[][];
	MouseListener MouseListener = new MouseListener();
	public static JComboBox select;
	SaveFunction crolling = new SaveFunction();

	public Repositorypage() {
		setTitle("일자리 다모아 - 즐겨찾기");
		setSize(1500, 800);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // 프로그램 크기 조절 불가 설정
		setLocationRelativeTo(null); // 화면 중앙에 오도록 하는 설정
		table = new JTable(TableModel);
		table.addMouseListener(MouseListener);
		Search_Alba();
		scroll = new JScrollPane(table);
		scroll.setBounds(0, 130, 1484, 633);
		scroll.setVisible(true);
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
		combolistener Combolistener = new combolistener();
		select.addActionListener(Combolistener);
	}

	public class MouseListener extends MouseAdapter { // 마우스 클릭 이벤트
		public void mouseClicked(MouseEvent e) {

			if (e.getClickCount() == 2) {

			}
		}
	}

	public class combolistener implements ActionListener { // 콤보박스 선택시 이벤트 발생 클래스
		public void actionPerformed(ActionEvent e) {
			if (0 == select.getSelectedIndex()) {
				Search_Alba();
			}
			else
				Search_Intern();
			}
		}
	

	public void Search_Alba() { // 광고 검색
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
		table.setFont(new Font("맑은 고딕", Font.BOLD, 25)); // 글자 크기 설정
	}
	public void Search_Intern() { // 광고 검색
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
		table.setFont(new Font("맑은 고딕", Font.BOLD, 25)); // 글자 크기 설정
	}
}
