import java.awt.Button;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Mainpage extends JFrame {
	static Button Serch = new Button("검색");
	static Button Calculator = new Button("월급 계산기");
	static TextField SerchField = new TextField();
	public static JScrollPane scroll;

	crolling crolling = new crolling();
	static Vector<Albatext> Alba;
	static Object arr[][];
	Buttonlistener listener = new Buttonlistener();

	public Mainpage() {
		setTitle("일자리 다모아");
		setSize(1500, 800);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // 프로그램 크기 조절 불가 설정
		setLocationRelativeTo(null); // 화면 중앙에 오도록 하는 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//----------------------------------------------------------광고 테이블 ------------------------------------------------------
		String head[] = { "지역", "급여", "회사명", "내용", "등록 시간" };
		Alba = crolling.crolling();
		arr = new Object[Alba.size()][5];
		System.out.println(Alba.size());
	
		for (int i = 0; i < Alba.size(); i++) {
			int j = 0;
			arr[i][j++] = Alba.get(i).getArea();
			arr[i][j++] = Alba.get(i).getPay();
			arr[i][j++] = Alba.get(i).getOffice();
			arr[i][j++] = Alba.get(i).getText();
			arr[i][j++] = Alba.get(i).getTime();
		
		}

		JTable table = new JTable(arr, head);
		scroll = new JScrollPane(table);
		table.setFont(new Font("맑은 고딕", Font.BOLD, 25)); // 글자 크기 설정
		table.setRowHeight(25);
		scroll.setBounds(160, 130, 1325, 633);
		scroll.setVisible(true);
		add(scroll);

		// ----------------------------------------------------------검색 버튼과 검색 텍스트 필드
		// ------------------------------------------------------
		Serch.setBounds(900, 30, 60, 60);
		Serch.setVisible(true);
		add(Serch);

		SerchField.setBounds(30, 40, 850, 40);
		SerchField.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		SerchField.setVisible(true);
		add(SerchField);

		Calculator.setBounds(1000, 30, 60, 60);
		Calculator.setVisible(true);
		add(Calculator);
		Calculator.addActionListener(listener);

	}

	class Buttonlistener implements ActionListener { // 버튼 이벤트
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == Calculator) {
				Calculatorpage calculator = new Calculatorpage();
				calculator.setVisible(true);
			}
		}
	}
}
