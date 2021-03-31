import java.awt.Button;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Mainpage extends JFrame {
	static Button Serch = new Button("검색");
	static Button Calculator = new Button("월급 계산기");
	static TextField SerchField = new TextField();
	
	public static JList List;
	public static JScrollPane scroll;
	static DefaultListModel array = new DefaultListModel();

	crolling crolling = new crolling();

	Buttonlistener listener = new Buttonlistener();
	public Mainpage() {
		setTitle("일자리 다모아");
		setSize(1500, 800);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // 프로그램 크기 조절 불가 설정
		setLocationRelativeTo(null); // 화면 중앙에 오도록 하는 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//----------------------------------------------------------광고 스크롤 ------------------------------------------------------
		scroll = new JScrollPane(List, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);  //가로 줄 생성
		List = new JList(array);
		scroll = new JScrollPane(List);
		List.setFont(new Font("맑은 고딕", Font.BOLD, 25)); // 글자 크기 설정
		scroll.setBounds(160, 130, 1325, 633);
		scroll.setVisible(true);
		add(scroll);
		
		//----------------------------------------------------------검색 버튼과 검색 텍스트 필드 ------------------------------------------------------
		Serch.setBounds(900, 30, 60, 60);
		Serch.setVisible(true);
		add(Serch);

		SerchField.setBounds(30,40,850,40);
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
			if(e.getSource()==Calculator) {
				Calculatorpage calculator= new Calculatorpage();
				calculator.setVisible(true);
			}
		}
	}
}
