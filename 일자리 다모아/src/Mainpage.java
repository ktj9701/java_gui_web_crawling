import java.awt.Button;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Mainpage extends JFrame {
	static Button Serch = new Button("�˻�");
	static Button Calculator = new Button("���� ����");
	static TextField SerchField = new TextField();
	
	public static JList List;
	public static JScrollPane scroll;
	static DefaultListModel array = new DefaultListModel();

	crolling crolling = new crolling();

	Buttonlistener listener = new Buttonlistener();
	public Mainpage() {
		setTitle("���ڸ� �ٸ��");
		setSize(1500, 800);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // ���α׷� ũ�� ���� �Ұ� ����
		setLocationRelativeTo(null); // ȭ�� �߾ӿ� ������ �ϴ� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//----------------------------------------------------------���� ��ũ�� ------------------------------------------------------
		scroll = new JScrollPane(List, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);  //���� �� ����
		List = new JList(array);
		scroll = new JScrollPane(List);
		List.setFont(new Font("���� ���", Font.BOLD, 25)); // ���� ũ�� ����
		scroll.setBounds(160, 130, 1325, 633);
		scroll.setVisible(true);
		add(scroll);
		
		//----------------------------------------------------------�˻� ��ư�� �˻� �ؽ�Ʈ �ʵ� ------------------------------------------------------
		Serch.setBounds(900, 30, 60, 60);
		Serch.setVisible(true);
		add(Serch);

		SerchField.setBounds(30,40,850,40);
		SerchField.setFont(new Font("���� ���", Font.BOLD, 30));
		SerchField.setVisible(true);
		add(SerchField);
		
		Calculator.setBounds(1000, 30, 60, 60);
		Calculator.setVisible(true);
		add(Calculator);
		Calculator.addActionListener(listener);
		
	}
	class Buttonlistener implements ActionListener { // ��ư �̺�Ʈ
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==Calculator) {
				Calculatorpage calculator= new Calculatorpage();
				calculator.setVisible(true);
			}
		}
	}
}
