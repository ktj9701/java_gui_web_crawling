package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

import Function.DB_Method;
import Function.dirver;
import image.images;

public class Joinpage extends JFrame {
	// -----------------------------------------------------------��Ʈ
	Font Title_Font = new Font("���� ���", Font.BOLD, 30);
	Font Point15_Font = new Font("���� ���", Font.BOLD, 15);
	// -----------------------------------------------------------���̺� �� �ؽ�Ʈ �ʵ�
	static JLabel Title = new JLabel("ȸ������");
	static JLabel ID = new JLabel("���̵�");
	static JLabel PW = new JLabel("�н�����");
	static JLabel fail = new JLabel("");
	static JLabel PW_Check = new JLabel("�н����� Ȯ��");
	static JTextField ID_ = new JTextField(10);
	static JTextField PW_ = new JTextField(10);
	static JTextField PW_Check_ = new JTextField(10);

	// -----------------------------------------------------------��ư
	static JButton Join = new JButton("ȸ������");
	static JButton Back = new JButton("���ư���");

	Buttonlistener listner = new Buttonlistener();
	static JPanel background = new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(images.join.getImage(), 0, 0, null); // ������ ���߿� ã��
			setOpaque(false);
			super.paintComponent(g);
		}
	};

	public Joinpage() {
		setTitle("ȸ������");
		setSize(600, 400);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // ���α׷� ũ�� ���� �Ұ� ����
		setLocationRelativeTo(null); // ȭ�� �߾ӿ� ������ �ϴ� ����
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		background.setLayout(null);
		setContentPane(background);
		setBackground(Color.WHITE);

		Title.setBounds(240, 100, 300, 30); // ----------------------���� ���̺�
		Title.setFont(Title_Font);
		// Title.setVisible(true);
		add(Title);

		ID.setBounds(80, 150, 50, 30); // --------------------------ID ���̺�
		ID.setFont(Point15_Font);
		// ID.setVisible(true);
		add(ID);

		PW.setBounds(80, 190, 100, 30); // ------------------------�н����� ���̺�
		PW.setFont(Point15_Font);
		// PW.setVisible(true);
		add(PW);

		PW_Check.setBounds(80, 230, 100, 30); // ----------------�н����� Ȯ�� ���̺�
		PW_Check.setFont(Point15_Font);
		// PW_Check.setVisible(true);
		add(PW_Check);

		fail.setBounds(80, 270, 200, 30);
		fail.setFont(Point15_Font);
		// fail.setVisible(true);
		add(fail);

		ID_.setBounds(200, 150, 200, 30); // ---------------------���̵� �ؽ�Ʈ�ʵ�
		// ID_.setVisible(true);
		add(ID_);

		PW_.setBounds(200, 190, 200, 30); // ----------------------��й�ȣ �ؽ�Ʈ�ʵ�
		// PW_.setVisible(true);
		add(PW_);

		PW_Check_.setBounds(200, 230, 200, 30); // ----------------��й�ȣ Ȯ�� �ؽ�Ʈ�ʵ�
		// PW_Check_.setVisible(true);
		add(PW_Check_);

		Join.setBounds(170, 310, 100, 30); // -----------------------ȸ�� ���� ��ư
		// Join.setVisible(true);
		Join.setBackground(new Color(196, 80, 74));
		add(Join);

		Back.setBounds(300, 310, 100, 30); // -----------------------���� ���� ��ư
		// Back.setVisible(true);
		Back.setBackground(new Color(196, 80, 74));
		add(Back);

		Join.addActionListener(listner);
		Back.addActionListener(listner);

	}

	class Buttonlistener implements ActionListener { // ��ư �̺�Ʈ
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == Join) { // ȸ�� ���� ��ư Ŭ��
				if (PW_.getText().equals(PW_Check_.getText())) {

					DB_Method db_method2 = new DB_Method();
					int result = 0;
					try {
						result = db_method2.Join(ID_.getText(), PW_.getText());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					if (result == 1) {
						JOptionPane.showMessageDialog(null, "ȸ����� �Ϸ�");
						dispose();

					} else {
						JOptionPane.showMessageDialog(null, "�ߺ����̵� / ȸ������ ����");
						ID_.setText("");
						PW_.setText("");
						PW_Check_.setText("");
					}

				} else
					fail.setText("��й�ȣ�� �ٸ��ϴ�.");
			}

			else if (e.getSource() == Back) { // ���� ���� ��ư Ŭ��
				ID_.setText("");
				PW_.setText("");
				PW_Check_.setText("");
				dispose(); // �����ӻ���

			}

		}

	}
}