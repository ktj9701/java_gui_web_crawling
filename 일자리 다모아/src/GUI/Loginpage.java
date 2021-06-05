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

	Font Title_Font = new Font("���� ���", Font.BOLD, 50);
	Font label_Font = new Font("���� ���", Font.BOLD, 15);
	static JLabel Title = new JLabel("���ڸ�"); // ���α׷� ���� �ʳ� �������� ��ü�� ��
	static JLabel Title2 = new JLabel("�ٸ��"); 
	static JLabel ID = new JLabel("���̵�");
	static JLabel PW = new JLabel("��й�ȣ");
	static JLabel fail = new JLabel("ȸ���� �ƴϰų� ���̵�� ��й�ȣ�� ��ġ �����ʽ��ϴ�.");
	public static JTextField ID_ = new JTextField(10);
	static JTextField PW_ = new JTextField(10);
	static JButton Login = new JButton("�α���");
	static JButton Join = new JButton("ȸ������");
	static JButton TEST = new JButton("�׽�Ʈ");
	static boolean TEST_flag= false;
	
	static JPanel background = new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(images.start.getImage(), 0, 0, null); // ������ ���߿� ã��
			setOpaque(false);
			super.paintComponent(g);
		}
	};

	public Loginpage() {
		setTitle("�α���");
		setSize(dirver.SCREEN_WIDTH, dirver.SCREEN_HEIGHT);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // ���α׷� ũ�� ���� �Ұ� ����
		setLocationRelativeTo(null); // ȭ�� �߾ӿ� ������ �ϴ� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		background.setLayout(null);
		setContentPane(background);
		setBackground(Color.WHITE);
		
		Title.setBounds(200, 300, 200, 50); // ------------------------------����
		Title.setFont(Title_Font);
		//Title.setVisible(true);

		Title2.setBounds(700, 300, 200, 50); // ------------------------------����
		Title2.setFont(Title_Font);
		//Title2.setVisible(true);
		
		ID.setBounds(398, 550, 100, 30); // --------------------------------ID ���̺�
		ID.setFont(label_Font);
		//ID.setVisible(true);

		PW.setBounds(398, 580, 100, 30); // ----------------------------PW ���̺�
		PW.setFont(label_Font);
		//PW.setVisible(true);

		ID_.setBounds(463, 553, 200, 20); // --------------------------ID & PW �ؽ�Ʈ�ʵ�
		PW_.setBounds(463, 583, 200, 20);  
		
		//ID_.setVisible(true);
		//PW_.setVisible(true);

		Login.setBounds(420, 625, 100, 30); // ---------------------�α��� ��ư
		Login.setBackground(new Color(196,80,74));
		//Login.setVisible(true);

		Join.setBounds(560, 625, 100, 30); // -----------------------ȸ�� ���� ��ư
		Join.setBackground(new Color(196,80,74));
		//Join.setVisible(true);

		TEST.setBounds(700, 625, 100, 30); // ---------------------�α��� ��ư
		TEST.setBackground(new Color(196,80,74));
		//TEST.setVisible(true);
		
		fail.setBounds(400, 598, 400, 30); // ----------------�α��� ���� ���̺�
		fail.setForeground(Color.red);
		fail.setFont(new Font("���� ���", Font.BOLD, 11));
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

		Login.addActionListener(Loginlistener); // -------------------------�̺�Ʈó��
		Join.addActionListener(Loginlistener);
		TEST.addActionListener(Loginlistener);
	}
	class Buttonlistener implements ActionListener { // ��ư �̺�Ʈ
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == Login) { // �α��� ��ư Ŭ��
				try {					
					DB_Method db_method=new DB_Method();
					int result =db_method.Login(ID_.getText(),PW_.getText());
					if(result==1) {
						Mainpage mainPage = new Mainpage();	
						dispose(); // �����ӻ���	
					}
					else { // ---------------------------------�α��� ����
						ID_.setText("");
						PW_.setText("");
						fail.setVisible(true);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else if (event.getSource() == Join) { // ȸ�� ���� ��ư Ŭ��
				ID_.setText("");
				PW_.setText("");
				Joinpage JoinPage = new Joinpage();
			}
			else if(event.getSource()==TEST) {
				JOptionPane.showMessageDialog(null, "�׽�Ʈ ���� ����Դϴ�. �����ͺ��̽��� ����ϴ� ����, ������, ���� ����� ����� �� �����ϴ�.");
				TEST_flag=true;
				Mainpage mainPage = new Mainpage();	
				dispose(); // �����ӻ���	
			}
		}
	}

}

