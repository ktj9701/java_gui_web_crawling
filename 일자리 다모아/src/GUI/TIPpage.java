package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import image.images;

public class TIPpage extends JFrame {
	String list[] = { "1. �����ӱ�", "2. �����ӱ�-������", "3. �����ӱ� ��ȿ��", "4. ���޼����̶�?", "5. �߰� - �߰�����", "6. �ٷΰ�༭", "7. 4�뺸��",
			"8. 4�뺸���������1", "9. 4�뺸���������2" };
	JComboBox QnA = new JComboBox(list);
	JButton BACK = new JButton("����");
	static JLabel label[] = new JLabel[9];
	static JButton left = new JButton();
	static JButton right = new JButton();
	combolistener combolistener = new combolistener();
	Buttonlistener Buttonlistener = new Buttonlistener();

	public TIPpage() {
		setTitle("���ڸ� �ٸ�� - ��, �˹ٻ��");
		setSize(450, 650);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
		this.setLayout(null);
		setResizable(false); // ���α׷� ũ�� ���� �Ұ� ����
		setLocationRelativeTo(null); // ȭ�� �߾ӿ� ������ �ϴ� ����
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		QnA.setBounds(20, 10, 300, 30);
		QnA.setFont(new Font("���� ���", Font.BOLD, 13));
		add(QnA);
		QnA.addActionListener(combolistener);

		BACK.setBounds(330, 10, 100, 30);
		add(BACK);
		BACK.setBackground(new Color(213, 227, 157));
		BACK.addActionListener(Buttonlistener);
		
		for (int i = 0; i < label.length; i++) {
			label[i] = new JLabel();
			label[i].setBounds(30, 50, 460, 510);
			add(label[i]);
		}
		label[0].setIcon(images.TIP1);
		label[1].setIcon(images.TIP2);
		label[2].setIcon(images.TIP3);
		label[3].setIcon(images.TIP4);
		label[4].setIcon(images.TIP5);
		label[5].setIcon(images.TIP6);
		label[6].setIcon(images.TIP7);
		label[7].setIcon(images.TIP8);
		label[8].setIcon(images.TIP9);
		vision(0);

		left.setBounds(0, 550, 50, 50);
		left.setIcon(images.left);
		left.setContentAreaFilled(false);
		left.setBorderPainted(false);
		right.setBounds(380, 550, 50, 50);
		right.setIcon(images.right);
		right.setContentAreaFilled(false);
		right.setBorderPainted(false);
		add(left);
		left.addActionListener(Buttonlistener);
		add(right);
		right.addActionListener(Buttonlistener);
	}

	class Buttonlistener implements ActionListener { // ��ư �̺�Ʈ
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == left) {
				if (QnA.getSelectedIndex() != 0) {
					vision(QnA.getSelectedIndex() - 1);
					QnA.setSelectedIndex(QnA.getSelectedIndex() - 1);
				} else {
					vision(8);
					QnA.setSelectedIndex(8);
				}
			}

			if (e.getSource() == right) {
				if (QnA.getSelectedIndex() != 8) {
					vision(QnA.getSelectedIndex() + 1);
					QnA.setSelectedIndex(QnA.getSelectedIndex() + 1);
				} else {
					vision(0);
					QnA.setSelectedIndex(0);
				}
			}
			if (e.getSource() == BACK) {
				dispose();
			}
		}
	}

	class combolistener implements ActionListener { // �����޺��ڽ� ���ý� �̺�Ʈ �߻� Ŭ����
		public void actionPerformed(ActionEvent e) {
			switch (QnA.getSelectedIndex()) {
			case 0:
				vision(0);
				break;
			case 1:
				vision(1);
				break;
			case 2:
				vision(2);
				break;
			case 3:
				vision(3);
				break;
			case 4:
				vision(4);
				break;
			case 5:
				vision(5);
				break;
			case 6:
				vision(6);
				break;
			case 7:
				vision(7);
				break;
			case 8:
				vision(8);
				break;
			}
		}
	}

	public void vision(int exception) {
		for (int i = 0; i < label.length; i++) {
			if (i == exception) {
				label[i].setVisible(true);
				continue;
			}
			label[i].setVisible(false);
		}
	}
}
