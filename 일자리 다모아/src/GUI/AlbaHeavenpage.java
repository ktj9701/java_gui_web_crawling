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
	static JTable table; // 테이블
	static DefaultTableModel TableModel = new DefaultTableModel() {// 테이블 내용 수정 불가
		public boolean isCellEditable(int rowIndex, int mCollndex) {
			return false;
		}
	}; // 내용 수정 불가
	public static DefaultComboBoxModel ComboModel = new DefaultComboBoxModel();
	static String head[] = { "지역", "급여", "회사명", "내용", "등록 시간" };
	public static JScrollPane scroll;
	static Vector<Albatext> AlbaHeaven;
	static Object arr[][];
	MouseListener MouseListener = new MouseListener();
	JButton SAVE = new JButton("저장");
	ButtonListener ButtonListener = new ButtonListener();

	public AlbaHeavenpage() {
		setTitle("일자리 다모아 - 팝업");
		setSize(1315, 800);
		this.setLayout(null);
		setVisible(true);
		// setResizable(false); // 프로그램 크기 조절 불가 설정
		setLocationRelativeTo(null); // 화면 중앙에 오도록 하는 설정
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		table = new JTable(TableModel);
		table.addMouseListener(MouseListener);
		Search_AlbaHeaven();
		scroll = new JScrollPane(table);
		scroll.setBounds(0, 130, 1300, 633);
		scroll.setVisible(true);
		add(scroll);
		table.getTableHeader().setResizingAllowed(false); // 크기 조절 불가

		SAVE.setBounds(1200, 20, 100, 100);
		add(SAVE);
		SAVE.addActionListener(ButtonListener);
	}

	public class ButtonListener implements ActionListener { // 마우스 클릭 이벤트
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
			} // 더블클릭

		}
	}

	public static void Search_AlbaHeaven() { // 광고 검색
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
			table.setFont(new Font("맑은 고딕", Font.BOLD, 25)); // 글자 크기 설정
		} catch (NullPointerException e) {
		}
	}

}
