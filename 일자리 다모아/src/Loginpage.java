import javax.swing.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Loginpage extends JFrame {
	Buttonlistener Loginlistener = new Buttonlistener();

	Font Title_Font = new Font("���� ���", Font.BOLD, 30);
	static JLabel Title = new JLabel("���ڸ� �ٸ��"); // ���α׷� ���� �ʳ� �������� ��ü�� ��
	static JLabel ID = new JLabel("���̵�");
	static JLabel PW = new JLabel("��й�ȣ");
	static JLabel fail = new JLabel("ȸ���� �ƴϰų� ���̵�� ��й�ȣ�� ��ġ �����ʽ��ϴ�.");
	static TextField ID_ = new TextField(10);
	static TextField PW_ = new TextField(10);
	static Button Login = new Button("�α���");
	static Button Join = new Button("ȸ������");

	static String name = "������"; // -----------ȸ������ ������ ���� �׽�Ʈ ���߿� �����ؾ���

	public Loginpage() {
		setTitle("�α���");
		setSize(dirver.SCREEN_WIDTH, dirver.SCREEN_HEIGHT);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // ���α׷� ũ�� ���� �Ұ� ����
		setLocationRelativeTo(null); // ȭ�� �߾ӿ� ������ �ϴ� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Title.setBounds(418, 122, 300, 30); // ------------------------------����
		Title.setFont(Title_Font);
		Title.setVisible(true);

		ID.setBounds(398, 353, 50, 30); // --------------------------------ID ���̺�
		ID.setVisible(true);

		PW.setBounds(398, 396, 50, 30); // ----------------------------PW ���̺�
		PW.setVisible(true);

		ID_.setBounds(463, 355, 200, 20); // --------------------------ID & PW �ؽ�Ʈ�ʵ�
		PW_.setBounds(463, 398, 200, 20);  
		
		ID_.setVisible(true);
		PW_.setVisible(true);

		Login.setBounds(420, 460, 50, 30); // ---------------------�α��� ��ư
		Login.setVisible(true);

		Join.setBounds(560, 460, 50, 30); // -----------------------ȸ�� ���� ��ư
		Join.setVisible(true);

		fail.setBounds(420, 420, 400, 30); // ----------------�α��� ���� ���̺�
		fail.setForeground(Color.red);
		fail.setFont(new Font("���� ���", Font.BOLD, 11));
		fail.setVisible(false);
		add(fail);
		this.add(Title);
		this.add(ID);
		this.add(PW);
		this.add(ID_);
		this.add(PW_);
		this.add(Login);
		this.add(Join);

		Login.addActionListener(Loginlistener); // -------------------------�̺�Ʈó��
		Join.addActionListener(Loginlistener);
	}

	class Buttonlistener implements ActionListener { // ��ư �̺�Ʈ
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == Login) { // �α��� ��ư Ŭ��
				
				if (ID_.getText().equals("admin") && (PW_.getText().equals("1234"))) {
					System.out.println("�α��� ��");
					Mainpage mainPage = new Mainpage();
					dispose(); // �����ӻ���
					mainPage.setVisible(true); // ���ο� ������
				}
				if (ID_.getText().equals(name) && (PW_.getText().equals("1234"))) { // -----------ȸ������ ������ ���� �׽�Ʈ ���߿�
																					// �����ؾ���
					Mainpage mainPage = new Mainpage();
					dispose(); // �����ӻ���
					mainPage.setVisible(true); // ���ο� ������
				} else { // ---------------------------------�α��� ����
					ID_.setText("");
					PW_.setText("");
					fail.setVisible(true);
				}
			} else if (event.getSource() == Join) { // ȸ�� ���� ��ư Ŭ��
				ID_.setText("");
				PW_.setText("");
				Joinpage JoinPage = new Joinpage();
				dispose(); // �����ӻ���
				JoinPage.setVisible(true); // ���ο� ������
			}

		}
	}
}
