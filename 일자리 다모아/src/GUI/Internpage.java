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
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Function.ICT;
import Function.IPP;
import Function.Interncrolling;
import Function.SaveFunction;

public class Internpage extends JFrame {
	static Interncrolling Intern_crolling = new Interncrolling();
	static JTable table; // 테이블
	static DefaultTableModel TableModel = new DefaultTableModel() {// 테이블 내용 수정 불가
		public boolean isCellEditable(int rowIndex, int mCollndex) {
			return false;
		}
	}; // 내용 수정 불가
	public static DefaultComboBoxModel ComboModel = new DefaultComboBoxModel();
	static String ICThead[] = { "회사명", "제목", "관련기술", "지역", "배정 인원", "채용 현황" };
	static String IPPhead[] = { "회사명", "제목", "지역", "모집 인원", "진행 상태" };
	public static JScrollPane scroll;
	static Vector<ICT> ICT;
	static Vector<IPP> IPP;
	static Object arr[][];
	JButton SAVE = new JButton("저장");
	MouseListener MouseListener = new MouseListener();
	public static JComboBox select;
	Buttonlistener listener = new Buttonlistener();

	public Internpage() {
		setTitle("일자리 다모아 - 인턴팝업");
		setSize(1500, 800);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // 프로그램 크기 조절 불가 설정
		setLocationRelativeTo(null); // 화면 중앙에 오도록 하는 설정
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		table = new JTable(TableModel);
		table.addMouseListener(MouseListener);
		INTERN_Search(0);
		scroll = new JScrollPane(table);
		scroll.setBounds(0, 130, 1484, 633);
		scroll.setVisible(true);
		add(scroll);

		JLabel label = new JLabel("종류");
		label.setBounds(40, 90, 50, 30);
		label.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		add(label);

		SAVE.setBounds(600, 20, 60, 60);
		SAVE.setVisible(true);
		add(SAVE);
		SAVE.addActionListener(listener);

		String[] kind = { "[ICT] 2021년 상반기(국내과정)", "[ICT] 2020년 하반기(국내과정)", "[ICT] 2020년 상반기(국내과정)",
				"=============================", "[IPP] 2021년 상반기(국내과정)", "[IPP] 2020년 하반기(국내과정)",
				"[IPP] 2020년 상반기(국내과정)", "[IPP] 2019년 하반기(국내과정)", "[IPP] 2019년 상반기(국내과정)" };
		select = new JComboBox(kind);
		select.setSelectedIndex(0);
		select.setBounds(100, 90, 250, 30);
		select.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		add(select);
		combolistener Combolistener = new combolistener();
		select.addActionListener(Combolistener);
	}

	class Buttonlistener implements ActionListener { // 버튼 이벤트
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == SAVE) {
				if (select.getSelectedIndex() >= 0 && select.getSelectedIndex() <= 2) {
					try {
						SaveFunction.saveintern(Loginpage.ID_.getText(), ICT.get(table.getSelectedRow()).getName(),
								ICT.get(table.getSelectedRow()).getProject(), ICT.get(table.getSelectedRow()).getArea(),
								ICT.get(table.getSelectedRow()).getNum(), "마감",
								ICT.get(table.getSelectedRow()).getURL());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Repositorypage.Search_Intern();
				}
				else {
					try {
						SaveFunction.saveintern(Loginpage.ID_.getText(), IPP.get(table.getSelectedRow()).getName(),
								IPP.get(table.getSelectedRow()).getProject(), IPP.get(table.getSelectedRow()).getArea(),
								IPP.get(table.getSelectedRow()).getNum(), IPP.get(table.getSelectedRow()).getState(),
								IPP.get(table.getSelectedRow()).getURL());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Repositorypage.Search_Intern();
				}
			}
		}
	}

	public class MouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {

			if (e.getClickCount() == 2) {
				if (((String) select.getSelectedItem()).substring(0, 5).equals("[ICT]")) { // ict 광고 클릭시
					try {
						Function.Interncrolling.explore(ICT.get(table.getSelectedRow()).getURL());
					} catch (URISyntaxException e1) {
						e1.printStackTrace();
					}
				} // 더블클릭
				else { // ipp광고 클릭시
					try {
						Function.Interncrolling.explore(IPP.get(table.getSelectedRow()).getURL());
					} catch (URISyntaxException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
	}

	public static void INTERN_Search(int index) {
		if (index == 0) {
			try {
				ICT = Intern_crolling.ICT2021상반기();
				arr = new Object[ICT.size()][6];
				Search_ict();
			} catch (SQLException e) {
			}
		}
		if (index == 1) {
			try {
				ICT = Intern_crolling.ICT2020하반기();
				arr = new Object[ICT.size()][6];
				Search_ict();
			} catch (SQLException e) {
			}
		}
		if (index == 2) {
			try {
				ICT = Intern_crolling.ICT2020상반기();
				arr = new Object[ICT.size()][6];
				Search_ict();
			} catch (SQLException e) {
			}
		}
		if (index == 4) {
			try {
				IPP = Intern_crolling.IPP2021상반기();
				arr = new Object[IPP.size()][5];
				Search_ipp();
			} catch (SQLException e) {
			}
		}
		if (index == 5) {
			try {
				IPP = Intern_crolling.IPP2020하반기();
				arr = new Object[IPP.size()][5];
				Search_ipp();
			} catch (SQLException e) {
			}
		}
		if (index == 6) {
			try {
				IPP = Intern_crolling.IPP2020상반기();
				arr = new Object[IPP.size()][5];
				Search_ipp();
			} catch (SQLException e) {
			}
		}
		if (index == 7) {
			try {
				IPP = Intern_crolling.IPP2019하반기();
				arr = new Object[IPP.size()][5];
				Search_ipp();
			} catch (SQLException e) {
			}
		}
		if (index == 8) {
			try {
				IPP = Intern_crolling.IPP2019상반기();
				arr = new Object[IPP.size()][5];
				Search_ipp();
			} catch (SQLException e) {
			}
		}
	}

	public class combolistener implements ActionListener { // 콤보박스 선택시 이벤트 발생 클래스
		public void actionPerformed(ActionEvent e) {
			INTERN_Search(select.getSelectedIndex());
		}

	}

	public static void Search_ict() {
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
		table.setFont(new Font("맑은 고딕", Font.BOLD, 25)); // 글자 크기 설정
	}

	public static void Search_ipp() {
		for (int i = 0; i < IPP.size(); i++) {
			int j = 0;
			arr[i][j++] = IPP.get(i).getName();
			arr[i][j++] = IPP.get(i).getProject();
			arr[i][j++] = IPP.get(i).getArea();
			arr[i][j++] = IPP.get(i).getNum();
			arr[i][j++] = IPP.get(i).getState();
		}
		TableModel.setDataVector(arr, IPPhead);
		table.getColumnModel().getColumn(0).setPreferredWidth(230);
		table.getColumnModel().getColumn(1).setPreferredWidth(600);
		table.getColumnModel().getColumn(2).setPreferredWidth(180);
		table.getColumnModel().getColumn(3).setPreferredWidth(50);
		table.getColumnModel().getColumn(4).setPreferredWidth(120);
		table.getTableHeader().setReorderingAllowed(false);
		table.setRowHeight(35);
		table.setFont(new Font("맑은 고딕", Font.BOLD, 25)); // 글자 크기 설정
	}
}
