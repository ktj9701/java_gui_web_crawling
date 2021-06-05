package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;
import Function.DB_Method;
import Function.dirver;
import image.images;

public class Loginpage extends JFrame {
	
	Buttonlistener Loginlistener = new Buttonlistener();

	Font Title_Font = new Font("맑은 고딕", Font.BOLD, 50);
	Font label_Font = new Font("맑은 고딕", Font.BOLD, 15);
	static JLabel Title = new JLabel("일자리"); // 프로그램 제목 훗날 사진으로 대체할 예
	static JLabel Title2 = new JLabel("다모아"); 
	static JLabel ID = new JLabel("아이디");
	static JLabel PW = new JLabel("비밀번호");
	static JLabel fail = new JLabel("회원이 아니거나 아이디와 비밀번호가 일치 하지않습니다.");
	public static JTextField ID_ = new JTextField(10);
	static JTextField PW_ = new JTextField(10);
	static JButton Login = new JButton("로그인");
	static JButton Join = new JButton("회원가입");
	static JButton TEST = new JButton("테스트");
	static boolean TEST_flag= false;
	
	static JPanel background = new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(images.start.getImage(), 0, 0, null); // 사진은 나중에 찾기
			setOpaque(false);
			super.paintComponent(g);
		}
	};

	public Loginpage() {
		setTitle("로그인");
		setSize(dirver.SCREEN_WIDTH, dirver.SCREEN_HEIGHT);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // 프로그램 크기 조절 불가 설정
		setLocationRelativeTo(null); // 화면 중앙에 오도록 하는 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		background.setLayout(null);
		setContentPane(background);
		setBackground(Color.WHITE);
		
		Title.setBounds(200, 300, 200, 50); // ------------------------------제목
		Title.setFont(Title_Font);
		//Title.setVisible(true);

		Title2.setBounds(700, 300, 200, 50); // ------------------------------제목
		Title2.setFont(Title_Font);
		//Title2.setVisible(true);
		
		ID.setBounds(398, 550, 100, 30); // --------------------------------ID 레이블
		ID.setFont(label_Font);
		//ID.setVisible(true);

		PW.setBounds(398, 580, 100, 30); // ----------------------------PW 레이블
		PW.setFont(label_Font);
		//PW.setVisible(true);

		ID_.setBounds(463, 553, 200, 20); // --------------------------ID & PW 텍스트필드
		PW_.setBounds(463, 583, 200, 20);  
		
		//ID_.setVisible(true);
		//PW_.setVisible(true);

		Login.setBounds(420, 625, 100, 30); // ---------------------로그인 버튼
		Login.setBackground(new Color(196,80,74));
		//Login.setVisible(true);

		Join.setBounds(560, 625, 100, 30); // -----------------------회원 가입 버튼
		Join.setBackground(new Color(196,80,74));
		//Join.setVisible(true);

		TEST.setBounds(700, 625, 100, 30); // ---------------------로그인 버튼
		TEST.setBackground(new Color(196,80,74));
		//TEST.setVisible(true);
		
		fail.setBounds(400, 598, 400, 30); // ----------------로그인 실패 레이블
		fail.setForeground(Color.red);
		fail.setFont(new Font("맑은 고딕", Font.BOLD, 11));
		fail.setVisible(false);
		add(fail);
		add(Title);
		add(Title2);
		add(ID);
		add(PW);
		add(ID_);
		add(PW_);
		add(Login);
		add(Join);
		add(TEST);

		Login.addActionListener(Loginlistener); // -------------------------이벤트처리
		Join.addActionListener(Loginlistener);
		TEST.addActionListener(Loginlistener);
	}
	class Buttonlistener implements ActionListener { // 버튼 이벤트
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == Login) { // 로그인 버튼 클릭
				try {					
					DB_Method db_method=new DB_Method();
					int result =db_method.Login(ID_.getText(),PW_.getText());
					if(result==1) {
						Mainpage mainPage = new Mainpage();	
						dispose(); // 프레임삭제	
					}
					else { // ---------------------------------로그인 실패
						ID_.setText("");
						PW_.setText("");
						fail.setVisible(true);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else if (event.getSource() == Join) { // 회원 가입 버튼 클릭
				ID_.setText("");
				PW_.setText("");
				Joinpage JoinPage = new Joinpage();
			}
			else if(event.getSource()==TEST) {
				JOptionPane.showMessageDialog(null, "테스트 전용 모드입니다. 데이터베이스를 사용하는 인턴, 저장목록, 저장 기능은 사용할 수 없습니다.");
				TEST_flag=true;
				Mainpage mainPage = new Mainpage();	
				dispose(); // 프레임삭제	
			}
		}
	}

}

