package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Function.Calculation_function;

public class Calculatorpage extends JFrame {
	public static JComboBox Before;
	public static JComboBox After;
	public static JComboBox week_num;
	public static JComboBox Worktime;
	static JRadioButton Tex[] = new JRadioButton[2];
	ButtonGroup group = new ButtonGroup();
	public static JTextField Pay = new JTextField(10);
	JLabel errorlabel = new JLabel("�Է��� ���� �ʾҽ��ϴ�.");

	static JButton Reset = new JButton("�ʱ�ȭ");
	static JButton Calculation = new JButton("���");

	static JLabel Result_pay__Integer_label = new JLabel("0��");
	static JLabel Extra_pay_Integer_label = new JLabel("0��");
	static JLabel Total_pay_Integer_label = new JLabel("0��");
	static JLabel Tex_pay__Integer_label = new JLabel("0��");

	Buttonlistener listener = new Buttonlistener();
	Radiolistener radiolistener = new Radiolistener();

	public static boolean Tex_flag = false; // ���� ���� ����

	DecimalFormat formatter = new DecimalFormat("###,###");

	public Calculatorpage() {
		setTitle("���� ����");
		setSize(400, 600);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // ���α׷� ũ�� ���� �Ұ� ����
		setLocationRelativeTo(null); // ȭ�� �߾ӿ� ������ �ϴ� ����
		dispose();

		// ----------------------- �޺� �ڽ� ----------------------------------
		String[] kinds = { "�ñ�", "�ϱ�", "����", "����" };
		Before = new JComboBox(kinds);
		Before.setSelectedIndex(0);
		Before.setBounds(60, 30, 70, 30);
		Before.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Before);

		After = new JComboBox(kinds);
		After.setSelectedIndex(1);
		After.setBounds(260, 30, 70, 30);
		After.setFont(new Font("���� ���", Font.BOLD, 15));
		add(After);

		JLabel Changelabel = new JLabel("��(��)     ����");
		Changelabel.setBounds(150, 30, 100, 30);
		Changelabel.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Changelabel);

		// ---------------------- ���� �Է� ---------------------------
		Pay.setBounds(230, 100, 100, 30);
		Pay.setText("");
		Pay.setHorizontalAlignment(JTextField.RIGHT);

		Pay.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Pay);

		JLabel Kindpaylabel;
		Kindpaylabel = new JLabel((String) Before.getSelectedItem());
		Kindpaylabel.setBounds(110, 100, 30, 30);
		Kindpaylabel.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Kindpaylabel);

		JLabel Paylabel = new JLabel("��");
		Paylabel.setBounds(335, 100, 30, 30);
		Paylabel.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Paylabel);

		errorlabel.setBounds(230, 130, 150, 30);
		errorlabel.setFont(new Font("���� ���", Font.BOLD, 10));
		errorlabel.setForeground(Color.RED);
		errorlabel.setVisible(false);
		add(errorlabel);

		// ---------------------- �ְ� �ٹ� Ƚ�� �Է� ---------------------------
		String[] num = { "0��", "1��", "1��", "2��", "3��", "4��", "5��", "6��", "7��" };
		week_num = new JComboBox(num);
		week_num.setSelectedIndex(6);
		week_num.setBounds(230, 170, 100, 30);
		week_num.setFont(new Font("���� ���", Font.BOLD, 15));
		add(week_num);

		JLabel weeklabel = new JLabel("�ְ� �ٹ� �ϼ�");
		weeklabel.setBounds(110, 170, 150, 30);
		weeklabel.setFont(new Font("���� ���", Font.BOLD, 15));
		add(weeklabel);

		// ---------------------- �ð� ���� ---------------------------
		String[] time = { "1�ð�", "2�ð�", "3�ð�", "4�ð�", "5�ð�", "6�ð�", "7�ð�", "8�ð�", "9�ð�", "10�ð�", "11�ð�", "12�ð�" };
		Worktime = new JComboBox(time);
		Worktime.setSelectedIndex(7);
		Worktime.setBounds(230, 230, 100, 30);
		Worktime.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Worktime);

		JLabel timelabel = new JLabel("�ٹ� �ð�");
		timelabel.setBounds(110, 230, 100, 30);
		timelabel.setFont(new Font("���� ���", Font.BOLD, 15));
		add(timelabel);

		// --------------------- ���� ���� ���� --------------------------

		Tex[0] = new JRadioButton();
		Tex[1] = new JRadioButton();
		Tex[0].setText("�ҵ漼 ����(3.3%)");
		Tex[1].setText("���� ����");
		Tex[0].setBounds(50, 290, 150, 30);
		Tex[1].setBounds(220, 290, 100, 30);
		Tex[0].setFont(new Font("���� ���", Font.BOLD, 15));
		Tex[1].setFont(new Font("���� ���", Font.BOLD, 15));
		Tex[1].setSelected(true);
		group.add(Tex[0]);
		group.add(Tex[1]);
		add(Tex[0]);
		add(Tex[1]);

		Reset.setBounds(80, 340, 100, 30); // -----------------------�ʱ�ȭ ��ư
		Reset.setVisible(true);
		add(Reset);

		Calculation.setBounds(230, 340, 100, 30); // -----------------------�ʱ�ȭ ��ư
		Calculation.setVisible(true);
		add(Calculation);
		// ----------------------------------------��� ���̺�-----------------------------
		JLabel Result_pay_label = new JLabel("���� �޿�(+)");
		Result_pay_label.setBounds(30, 400, 100, 30);
		Result_pay_label.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Result_pay_label);

		Result_pay__Integer_label.setHorizontalAlignment(JLabel.RIGHT);
		Result_pay__Integer_label.setBounds(250, 400, 100, 30);
		Result_pay__Integer_label.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Result_pay__Integer_label);

		JLabel Extra_pay_label = new JLabel("���� ���� ����(+)");
		Extra_pay_label.setBounds(30, 430, 150, 30);
		Extra_pay_label.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Extra_pay_label);

		Extra_pay_Integer_label.setHorizontalAlignment(JLabel.RIGHT);
		Extra_pay_Integer_label.setBounds(250, 430, 100, 30);
		Extra_pay_Integer_label.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Extra_pay_Integer_label);

		JLabel Tex_pay_label = new JLabel("�ҵ漼(-)");
		Tex_pay_label.setBounds(30, 460, 100, 30);
		Tex_pay_label.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Tex_pay_label);

		Tex_pay__Integer_label.setHorizontalAlignment(JLabel.RIGHT);
		Tex_pay__Integer_label.setBounds(250, 460, 100, 30);
		Tex_pay__Integer_label.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Tex_pay__Integer_label);

		JLabel device_label = new JLabel("-------------------------------------------------------");
		device_label.setBounds(30, 490, 350, 30);
		device_label.setFont(new Font("���� ���", Font.BOLD, 15));
		add(device_label);

		JLabel Total_pay_label = new JLabel("���� �޿�");
		Total_pay_label.setBounds(30, 510, 100, 30);
		Total_pay_label.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Total_pay_label);

		Total_pay_Integer_label.setHorizontalAlignment(JLabel.RIGHT);
		Total_pay_Integer_label.setBounds(250, 510, 100, 30);
		Total_pay_Integer_label.setFont(new Font("���� ���", Font.BOLD, 15));
		add(Total_pay_Integer_label);

		Reset.addActionListener(listener);
		Calculation.addActionListener(listener);
		Tex[0].addItemListener(radiolistener);
		Tex[1].addItemListener(radiolistener);
	}

	class Buttonlistener implements ActionListener { // ��� �� ���� ��ư �̺�Ʈ
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == Reset) { // ���� ��ư
				Before.setSelectedIndex(0);
				After.setSelectedIndex(1);
				Worktime.setSelectedIndex(7);
				Pay.setText("");
				Result_pay__Integer_label.setText("0��");
				Extra_pay_Integer_label.setText("0��");
				Tex_pay__Integer_label.setText("0��");
				Total_pay_Integer_label.setText("0��");
				Tex[1].setSelected(true);
				Tex_flag = false;
				errorlabel.setVisible(false);

			} else if (e.getSource() == Calculation) { // ��� ��ư
				if (Pay.getText().equals("")) // �ӱ��� �Է����� �ʾ�����
					errorlabel.setVisible(true);
				else {
					Calculation_function process = new Calculation_function();
					Result_pay__Integer_label.setText(formatter.format(process.Result_pay_function()) + "��");
					Extra_pay_Integer_label.setText(formatter.format(process.extra_pay_function()) + "��");
					Tex_pay__Integer_label.setText(process.Tex_function() + "��");
					Total_pay_Integer_label.setText(formatter.format(process.total_function()) + "��");
				}
			}
		}
	}

	class Radiolistener implements ItemListener { // �ҵ漼 ���� ��ư �̺�Ʈ
		public void itemStateChanged(ItemEvent e) {
			if (Tex[0].isSelected()) {
				Tex_flag = true;
			}
		}
	}
}