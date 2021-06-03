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

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

import Function.AlbaHeavencrolling;
import Function.Albatext;
import Function.SaveFunction;
import image.images;

public class AlbaHeavenpage extends JFrame {
	static AlbaHeavencrolling Albaheaven_crolling = new AlbaHeavencrolling();
	private static JTableHeader header;
	static JTable table; // 테이블
	JPanel background = new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(images.ground2.getImage(), 0, 0, null); // 사진은 나중에 찾기
			setOpaque(false);
			super.paintComponent(g);
		}
	};

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

	JButton SAVE;
	JButton BACK;
	JButton title;

	public AlbaHeavenpage() {
		setTitle("일자리 다모아 - 팝업");
		setSize(1315, 800);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // 프로그램 크기 조절 불가 설정
		setLocationRelativeTo(null); // 화면 중앙에 오도록 하는 설정
		background.setLayout(null);
		setContentPane(background);

		table = new JTable(TableModel) {
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
				JComponent component = (JComponent) super.prepareRenderer(renderer, row, column);
				if (!isRowSelected(row)) {
					if (row % 2 == 0)
						component.setBackground(new Color(255, 255, 179));
					else
						component.setBackground(Color.WHITE);
				}
				return component;

			}
		};
		MouseListener MouseListener = new MouseListener();
		table.addMouseListener(MouseListener);
		Search_AlbaHeaven();
		scroll = new JScrollPane(table);
		scroll.setBounds(0, 130, 1300, 633);
		scroll.setVisible(true);
		add(scroll);
		
		ButtonListener ButtonListener = new ButtonListener();
		title = new JButton();
		title.setIcon(images.title_Albaheaven);
		title.setBounds(0, 0, 450, 130);
		add(title);
		title.addActionListener(ButtonListener);
		title.setContentAreaFilled(false);
		title.setBorderPainted(false);
		title.setFocusPainted(false);

		SAVE = new JButton();
		SAVE.setBounds(1030, 20, 110, 110);
		SAVE.setIcon(images.save);
		add(SAVE);
		SAVE.addActionListener(ButtonListener);
		SAVE.setContentAreaFilled(false);
		SAVE.setBorderPainted(false);

		BACK = new JButton();
		BACK.setBounds(1200, 20, 110, 110);
		BACK.setIcon(images.back);
		add(BACK);
		BACK.addActionListener(ButtonListener);
		BACK.setContentAreaFilled(false);
		BACK.setBorderPainted(false);

	}

	public class ButtonListener implements ActionListener { // 마우스 클릭 이벤트
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == SAVE) {
				if (table.getSelectedRow() != -1) {
					int connect = JOptionPane.showConfirmDialog(null, "저장 하시겠습니까?", "Notice", JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE, images.Dialog_save);
					if (connect == JOptionPane.CLOSED_OPTION)
						;
					else if (connect == JOptionPane.YES_OPTION) {
						try {
							if (-1 != SaveFunction.savealba(Loginpage.ID_.getText(),
									" " + AlbaHeaven.get(table.getSelectedRow()).getArea(),
									AlbaHeaven.get(table.getSelectedRow()).getPay(),
									AlbaHeaven.get(table.getSelectedRow()).getOffice(),
									AlbaHeaven.get(table.getSelectedRow()).getText(),
									AlbaHeaven.get(table.getSelectedRow()).getURL())) {
								JOptionPane.showMessageDialog(null, "저장되었습니다.");
								Repositorypage.Search_Alba();
							} else
								JOptionPane.showMessageDialog(null, "이미 저장된 내용입니다.");
						} catch (SQLException e1) {
						} catch (NullPointerException e2) {
						}
					}
				} else
					JOptionPane.showMessageDialog(null, "광고를 선택하지 않으셨습니다.");
			}
			if (e.getSource() == BACK)
				dispose();
			if (e.getSource() == title)
				try {
					Function.AlbaHeavencrolling.explore("http://www.alba.co.kr/");
				} catch (URISyntaxException e1) {
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
			header = table.getTableHeader();
			header.setBackground(new Color(255, 192, 0));
			header.setFont(new Font("맑은 고딕", Font.BOLD, 25));
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
			table.getColumnModel().getColumn(2).setPreferredWidth(340);
			table.getColumnModel().getColumn(3).setPreferredWidth(525);
			table.getColumnModel().getColumn(4).setPreferredWidth(120);
			table.getTableHeader().setReorderingAllowed(false);
			table.setRowHeight(35);
			table.setFont(new Font("맑은 고딕", Font.BOLD, 25)); // 글자 크기 설정
		} catch (NullPointerException e) {
		}
	}

}
