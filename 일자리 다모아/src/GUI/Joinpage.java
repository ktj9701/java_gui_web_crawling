package GUI;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

import Function.DB_Method;
import Function.dirver;

public class Joinpage extends JFrame {
	// DB_Method db_method2 = new DB_Method();
	// -----------------------------------------------------------폰토
	Font Title_Font = new Font("맑은 고딕", Font.BOLD, 30);
	Font Point15_Font = new Font("맑은 고딕", Font.BOLD, 15);
	// -----------------------------------------------------------레이블 및 텍스트 필드
	static JLabel Title = new JLabel("회원가입");
	static JLabel ID = new JLabel("아이디");
	static JLabel PW = new JLabel("패스워드");
	static JLabel fail = new JLabel("");
	static JLabel PW_Check = new JLabel("패스워드 확인");
	static TextField ID_ = new TextField(10);
	static TextField PW_ = new TextField(10);
	static TextField PW_Check_ = new TextField(10);

	// -----------------------------------------------------------버튼
	static Button Join = new Button("회원가입");
	static Button Back = new Button("돌아가기");

	Buttonlistener listner = new Buttonlistener();

	public Joinpage() {
		setTitle("회원가입");
		setSize(600,400);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // 프로그램 크기 조절 불가 설정
		setLocationRelativeTo(null); // 화면 중앙에 오도록 하는 설정
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		Title.setBounds(220, 50, 300, 30); // ----------------------제목 레이블
		Title.setFont(Title_Font);
		Title.setVisible(true);
		add(Title);

		ID.setBounds(80, 150, 50, 30); // --------------------------ID 레이블
		ID.setFont(Point15_Font);
		ID.setVisible(true);
		add(ID);

		PW.setBounds(80, 190, 100, 30); // ------------------------패스워드 레이블
		PW.setFont(Point15_Font);
		PW.setVisible(true);
		add(PW);

		PW_Check.setBounds(80, 230, 100, 30); // ----------------패스워드 확인 레이블
		PW_Check.setFont(Point15_Font);
		PW_Check.setVisible(true);
		add(PW_Check);

		fail.setBounds(80, 270, 200, 30);
		fail.setFont(Point15_Font);
		fail.setVisible(true);
		add(fail);

		ID_.setBounds(200, 150, 200, 30); // ---------------------아이디 텍스트필드
		ID_.setVisible(true);
		add(ID_);

		PW_.setBounds(200, 190, 200, 30); // ----------------------비밀번호 텍스트필드
		PW_.setVisible(true);
		add(PW_);

		PW_Check_.setBounds(200, 230, 200, 30); // ----------------비밀번호 확인 텍스트필드
		PW_Check_.setVisible(true);
		add(PW_Check_);

		Join.setBounds(170, 310, 100, 30); // -----------------------회원 가입 버튼
		Join.setVisible(true);
		add(Join);

		Back.setBounds(300, 310, 100, 30); // -----------------------돌아 가기 버튼
		Back.setVisible(true);
		add(Back);

		Join.addActionListener(listner);
		Back.addActionListener(listner);

	}

	class Buttonlistener implements ActionListener { // 버튼 이벤트
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == Join) { // 회원 가입 버튼 클릭
				if (PW_.getText().equals(PW_Check_.getText())) {

					DB_Method db_method2 = new DB_Method();
					int result=0;
					try {
						result = db_method2.Join(ID_.getText(), PW_.getText());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if (result == 1) {
						JOptionPane.showMessageDialog(null, "회원등록 완료");
						//Loginpage login = new Loginpage();
						dispose();
						
					} else {
						JOptionPane.showMessageDialog(null, "중복아이디 / 회원동록 실패");
						ID_.setText("");
						PW_.setText("");
						PW_Check_.setText("");
					}

				} 
				else
					fail.setText("비밀번호가 다릅니다.");
			}

			else if (e.getSource() == Back) { // 돌아 가기 버튼 클릭
				ID_.setText("");
				PW_.setText("");
				PW_Check_.setText("");
				dispose(); // 프레임삭제

			}

		}

	}
}