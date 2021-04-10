package Function;

import GUI.Calculatorpage;

public class Calculation_function {
	String time_temp = (String) Calculatorpage.Worktime.getSelectedItem(); // ������ �ٹ� �ð��� String ������ ����
	int time = Integer.parseInt(time_temp.substring(0, 1)); // String ������ ������ �ٹ� �ð��� int ������ ����

	String week_temp = (String) Calculatorpage.week_num.getSelectedItem(); // ������ �ְ� �ٹ� Ƚ���� String ������ ����
	int week = Integer.parseInt(week_temp.substring(0, 1)); // String ������ ������ �ְ� �ٹ� Ƚ���� int ������ ����

	double avg_num = 4.345238; // �� �� ��� �� ( 365/ 12 / 7)

	public int Result_pay_function() { // ���� �޿� �޼ҵ�
		int pay = Integer.parseInt((String) Calculatorpage.Pay.getText()); // �Է��� �޿� -> ���� �޿�
		if (Calculatorpage.Before.getSelectedItem().equals("�ñ�")) { // �ñ����� ��� ��
			pay = pay * time; // �ϱ�
			switch ((String) Calculatorpage.After.getSelectedItem()) { // ��ȯ ���
			case "�ñ�": // �ñ� -> �ñ�
				pay = pay / time;
				break;
			case "�ϱ�": // �ñ� -> �ϱ�
				break;
			case "����": // �ñ� -> ����
				pay = (int) (pay * week * avg_num);
				break;
			case "����": // �ñ�-> ����;
				pay = (int) (pay * week * avg_num * 12);
				break;
			}
		} else if (Calculatorpage.Before.getSelectedItem().equals("�ϱ�")) { // �ϱ����� ��� ��
			switch ((String) Calculatorpage.After.getSelectedItem()) { // ��ȯ ���
			case "�ñ�": // �ñ� -> �ñ�
				pay = pay / time;
				break;
			case "�ϱ�": // �ñ� -> �ϱ�
				break;
			case "����": // �ñ� -> ����
				pay = (int) (pay * week * avg_num);
				break;
			case "����": // �ñ�-> ����;
				pay = (int) (pay * week * avg_num * 12);
				break;
			}
		} else if (Calculatorpage.Before.getSelectedItem().equals("����")) { // �������� ��� ��
			switch ((String) Calculatorpage.After.getSelectedItem()) { // ��ȯ ���
			case "�ñ�": // �ñ� -> �ñ�
				pay =  (int)(pay/avg_num/week/time);
				break;
			case "�ϱ�": // �ñ� -> �ϱ�
				pay = (int)(pay/avg_num/week);
				break;
			case "����": // �ñ� -> ����
				break;
			case "����": // �ñ�-> ����;
				pay = pay*12;
				break;
			}
		} else if (Calculatorpage.Before.getSelectedItem().equals("����")) { // �������� ��� ��
			switch ((String) Calculatorpage.After.getSelectedItem()) { // ��ȯ ���
			case "�ñ�": // �ñ� -> �ñ�
				pay = (int)(pay/12/avg_num/week/time);
				break;
			case "�ϱ�": // �ñ� -> �ϱ�
				pay=(int)(pay/12/avg_num/week);
				break;
			case "����": // �ñ� -> ����
				pay = pay/12;
				break;
			case "����": // �ñ�-> ����;
				break;
			}
		}
		return pay;
	}

	public int extra_pay_function() { // ���޼��� �޼ҵ�
		int extra_pay = 0; // ���޼���
		if (time * week >= 15 && Calculatorpage.Before.getSelectedItem().equals("�ñ�")) {
			// ���޼��� ���ϱ� -> �ְ� 15�ð� �̻� ���ؾ� ���޼��� ���� ���� ����, �ñ����� �����̳� ��������� ���� ���� ��, �Ϻ����� �����̻���
			// ���� �� ����x
			if (Calculatorpage.After.getSelectedItem().equals("����"))
				extra_pay = (int) (avg_num
						* ((time * week) / 40 * 8 * Integer.parseInt((String) Calculatorpage.Pay.getText()))); // �Ѵ��� ��
																												// 4.34
																												// ��

			else if (Calculatorpage.After.getSelectedItem().equals("����"))
				extra_pay = (int) ((365.0 / 7.0)
						* ((time * week) / 40 * 8 * Integer.parseInt((String) Calculatorpage.Pay.getText()))); // 1���� ��
																												// 52��
		}
		return extra_pay;
	}
	public int Tex_function() { // ���� �޿� �޼ҵ�
		if(Calculatorpage.Tex_flag==true)
			return (int)((Result_pay_function() + extra_pay_function())*0.033);
		else
			return 0;
	}

	public int total_function() { // ���� �޿� �޼ҵ�
		return Result_pay_function() + extra_pay_function()-Tex_function();
	}

}
