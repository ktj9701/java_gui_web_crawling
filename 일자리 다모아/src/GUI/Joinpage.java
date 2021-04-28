package GUI;

import java.awt.Button;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

import Function.DB_Method;
import Function.dirver;

public class Joinpage extends JFrame {
	 DB_Method db_method = new DB_Method();
	// -----------------------------------------------------------����
	Font Title_Font = new Font("���� ���", Font.BOLD, 30);
	Font Point15_Font = new Font("���� ���", Font.BOLD, 15);
	// -----------------------------------------------------------���̺� �� �ؽ�Ʈ �ʵ�
	static JLabel Title = new JLabel("ȸ������");
	static JLabel ID = new JLabel("���̵�");
	static JLabel PW = new JLabel("�н�����");
	static JLabel fail = new JLabel("");
	static JLabel PW_Check = new JLabel("�н����� Ȯ��");
	static TextField ID_ = new TextField(10);
	static TextField PW_ = new TextField(10);
	static TextField PW_Check_ = new TextField(10);

	// -----------------------------------------------------------��ư
	static Button Join = new Button("ȸ������");
	static Button Back = new Button("���ư���");

	Buttonlistener listner = new Buttonlistener();

	public Joinpage() {
		setTitle("ȸ������");
		setSize(dirver.SCREEN_WIDTH, dirver.SCREEN_HEIGHT);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // ���α׷� ũ�� ���� �Ұ� ����
		setLocationRelativeTo(null); // ȭ�� �߾ӿ� ������ �ϴ� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Title.setBounds(418, 122, 300, 30); // ----------------------���� ���̺�
		Title.setFont(Title_Font);
		Title.setVisible(true);
		add(Title);

		ID.setBounds(350, 200, 50, 30); // --------------------------ID ���̺�
		ID.setFont(Point15_Font);
		ID.setVisible(true);
		add(ID);

		PW.setBounds(350, 240, 100, 30); // ------------------------�н����� ���̺�
		PW.setFont(Point15_Font);
		PW.setVisible(true);
		add(PW);

		PW_Check.setBounds(350, 280, 100, 30); // ----------------�н����� Ȯ�� ���̺�
		PW_Check.setFont(Point15_Font);
		PW_Check.setVisible(true);
		add(PW_Check);

		fail.setBounds(350, 320, 200, 30);
		fail.setFont(Point15_Font);
		fail.setVisible(true);
		add(fail);

		ID_.setBounds(450, 200, 200, 30); // ---------------------���̵� �ؽ�Ʈ�ʵ�
		ID_.setVisible(true);
		add(ID_);

		PW_.setBounds(450, 240, 200, 30); // ----------------------��й�ȣ �ؽ�Ʈ�ʵ�
		PW_.setVisible(true);
		add(PW_);

		PW_Check_.setBounds(450, 280, 200, 30); // ----------------��й�ȣ Ȯ�� �ؽ�Ʈ�ʵ�
		PW_Check_.setVisible(true);
		add(PW_Check_);

		Join.setBounds(400, 370, 100, 30); // -----------------------ȸ�� ���� ��ư
		Join.setVisible(true);
		add(Join);

		Back.setBounds(550, 370, 100, 30); // -----------------------���� ���� ��ư
		Back.setVisible(true);
		add(Back);

		Join.addActionListener(listner);
		Back.addActionListener(listner);

	}

	class Buttonlistener implements ActionListener { // ��ư �̺�Ʈ
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == Join) { // ȸ�� ���� ��ư Ŭ��
				if (PW_.getText().equals(PW_Check_.getText())) {
					if (JoinAction(e)) {
						ID_.setText("");
						PW_.setText("");
						PW_Check_.setText("");
						//Loginpage Loginpage = new Loginpage();
						//dispose(); // �����ӻ���

					} else {
						ID_.setText("");
						PW_.setText("");
						PW_Check_.setText("");
						fail.setText("�ߺ��� ���̵� �Դϴ�.");
					}
				} else
					fail.setText("��й�ȣ�� �ٸ��ϴ�.");
			}

			else if (e.getSource() == Back) { // ���� ���� ��ư Ŭ��
				ID_.setText("");
				PW_.setText("");
				PW_Check_.setText("");
				Loginpage Loginpage = new Loginpage();
				dispose(); // �����ӻ���

			}

		}

	}

	public boolean JoinAction(ActionEvent e) {
		try {
			if (Loginpage.db_method.Join(ID_.getText(), PW_.getText())) {
				return true;
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}
}
