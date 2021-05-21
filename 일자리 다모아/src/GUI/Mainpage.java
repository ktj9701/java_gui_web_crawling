package GUI;
// 메인 화면

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import Function.AlbaHeavencrolling;
import Function.Albamoncrolling;
import Function.Albatext;
import Function.Interncrolling;
import Function.SaveFunction;
import region.Busan;
import region.Chungbuk;
import region.Chungnam;
import region.City;
import region.Daejeon_AND_Sejong;
import region.Deagu;
import region.Detail_Area;
import region.Gangwon;
import region.Gwangju;
import region.Gyeongbuk;
import region.Gyeongbuk2;
import region.Gyeonggi;
import region.Gyeonggi2;
import region.Gyeongnam;
import region.Gyeongnam2;
import region.Incheon;
import region.Jeju;
import region.Jeonbuk;
import region.Jeonnam;
import region.Seoul;
import region.Seoul2;
import region.Ulsan;

public class Mainpage extends JFrame {
	JTableHeader header;

	Interncrolling ict = new Interncrolling();
	public static Object temp;
	static Object temp2;

	Detail_Area Detail = new Detail_Area(); // 세부적인 지역 모음 클래스
	City city = new City();
	Seoul 서울1도시 = new Seoul();
	Seoul2 서울2도시 = new Seoul2();
	Gyeonggi 경기1도시 = new Gyeonggi();
	Gyeonggi2 경기2도시 = new Gyeonggi2();
	Incheon 인천도시 = new Incheon();
	Gangwon 강원도시 = new Gangwon();
	Daejeon_AND_Sejong 대전_세종도시 = new Daejeon_AND_Sejong();
	Chungbuk 충북도시 = new Chungbuk();
	Chungnam 충남도시 = new Chungnam();
	Busan 부산도시 = new Busan();
	Ulsan 울산도시 = new Ulsan();
	Gyeongnam 경남도시 = new Gyeongnam();
	Gyeongnam2 경남2도시 = new Gyeongnam2();
	Gyeongbuk 경북도시 = new Gyeongbuk();
	Gyeongbuk2 경북2도시 = new Gyeongbuk2();
	Deagu 대구도시 = new Deagu();
	Gwangju 광주도시 = new Gwangju();
	Jeonbuk 전북도시 = new Jeonbuk();
	Jeonnam 전남도시 = new Jeonnam();
	Jeju 제주도시 = new Jeju();

	public static int index = 0; // 적용된 지역 갯수
	JTable table; // 테이블
	static JButton Search = new JButton("검색");
	static JButton Reset = new JButton("리셋");
	static JButton Calculator = new JButton("급여 계산기");
	static JButton AlbaHeaven = new JButton("알바천국");
	static JButton Intern = new JButton("인턴");
	static JButton SAVE = new JButton("즐겨찾기");
	static JButton SAVE2 = new JButton("저장");
	static JButton EVENT = new JButton("이벤트");
	static JButton INFO = new JButton("팁");
	static JTextField AGE;
	static String example = "60세 이하 입력";
	static DefaultTableModel TableModel = new DefaultTableModel() {// 테이블 내용 수정 불가
		public boolean isCellEditable(int rowIndex, int mCollndex) {
			return false;
		}
	}; // 내용 수정 불가
	public static DefaultComboBoxModel ComboModel = new DefaultComboBoxModel();

	static String head[] = { "지역", "급여", "회사명", "내용", "등록 시간" };
	public static JScrollPane scroll;

	static Vector<Albatext> Alba;
	static Object arr[][];

	static JComboBox Area; // 시, 도 콤보박스

	public static JComboBox Detail_Area;

	public static JComboBox City;

	public static JComboBox Gender;

	public static JComboBox Period;

	public static JComboBox Dutyweek;
	// 적용된 필터링 확인 및 필터리 삭제 버튼-----------------------------------------------
	public static JLabel Filterlabel = new JLabel("-------필터링-------");
	public static JLabel Filterlabel1 = new JLabel("근무 기간-------");
	public static JLabel Filterlabel2 = new JLabel("근무 요일-------");
	public static JLabel Filterlabel3 = new JLabel("성별-------------");
	public static JLabel Filterlabel4 = new JLabel("지역-------");
	public static JLabel[] Filtering = new JLabel[5]; // 적용된 지역 레이블
	public static JButton[] delete = new JButton[5]; // 적용된 지역 삭제 버튼
	public static JLabel genderlabel = new JLabel(); // 적용된 성별 레이블
	public static JButton genderbutton = new JButton(); // 적용된 성별 삭제 버튼
	public static JLabel periodlabel = new JLabel(); // 적용된 근무 기간 레이블
	public static JButton periodbutton = new JButton(); // 적용된 근무 기간 삭제 레이블
	public static JLabel dutyweeklabel = new JLabel(); // 적용된 근무 요일 레이블
	public static JButton dutyweekbutton = new JButton(); // 적용된 근무 요일 삭제 레이블
//-------------------------------------이벤트 ---------------------------
	Buttonlistener listener = new Buttonlistener();
	FilterButtonlistener FilterButtonlistener = new FilterButtonlistener();
	MouseListener1 MouseListener1 = new MouseListener1();
	MouseListener2 MouseListener2 = new MouseListener2();
	Areacombolistener AreaCombolistener = new Areacombolistener();
	Filtercombolistener FilterCombolistener = new Filtercombolistener();

	public Mainpage() {
		setTitle("일자리 다모아 - 메인");
		setSize(1500, 800);
		this.setLayout(null);
		setVisible(true);
		setResizable(false); // 프로그램 크기 조절 불가 설정
		setLocationRelativeTo(null); // 화면 중앙에 오도록 하는 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//----------------------------------------------------------광고 테이블 ------------------------------------------------------
		table = new JTable(TableModel);
		table.addMouseListener(MouseListener1);

		Search_Albamon();
		scroll = new JScrollPane(table);
		scroll.setBounds(160, 130, 1325, 633);
		scroll.setVisible(true);
		add(scroll);

// ----------------------------------------------------------검색 버튼과 검색 텍스트 필드
		Search.setBounds(900, 20, 60, 60);
		Search.setVisible(true);
		add(Search);
		Search.addActionListener(listener);

		Calculator.setBounds(1000, 20, 60, 60);
		Calculator.setVisible(true);
		add(Calculator);
		Calculator.addActionListener(listener);

		Reset.setBounds(1100, 20, 60, 60);
		Reset.setVisible(true);
		add(Reset);
		Reset.addActionListener(listener);
// ------------------------------------지역 콤보박스-------------------

		JLabel Province = new JLabel("지역");
		Province.setBounds(860, 90, 50, 30);
		Province.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		add(Province);
		String[] Korea_Province = { "선택", "서울", "경기", "인천", "강원", "대전", "세종", "충남", "충북", "부산", "울산", "경남", "경북", "대구",
				"광주", "전남", "전북", "제주" };
		Area = new JComboBox(Korea_Province);
		Area.setSelectedIndex(0);
		Area.setBounds(900, 90, 70, 30);
		Area.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		add(Area);

		Area.addActionListener(AreaCombolistener);
		// ------------------------------------세부적인 지역 콤보박스-------------------

		Detail_Area = new JComboBox();

		Detail_Area.setBounds(1000, 90, 150, 30);
		Detail_Area.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		Detail_Area.setVisible(false);
		add(Detail_Area);

		Detail_Area.addActionListener(AreaCombolistener);

		City = new JComboBox();
		City.setBounds(1180, 90, 150, 30);
		City.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		City.setVisible(false);
		add(City);
		City.addActionListener(AreaCombolistener);

		// -----------------------------------성별 필터링
		JLabel gender_label = new JLabel("성별");
		gender_label.setBounds(520, 90, 50, 30);
		gender_label.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		add(gender_label);

		String[] gender = { "전체", "남자", "여자" };
		Gender = new JComboBox(gender);
		Gender.setBounds(570, 90, 70, 30);
		Gender.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		Gender.setVisible(true);
		add(Gender);

		Gender.addActionListener(FilterCombolistener);

		// -----------------------------------근무기간 필터링
		JLabel period_label = new JLabel("근무 기간");
		period_label.setBounds(40, 90, 70, 30);
		period_label.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		add(period_label);

		String[] periodhead = { "전체", "하루", "1주일이하", "1주일~1개월", "1개월~3개월", "3개월~6개월", "6개월~1년", "1년이상" };
		Period = new JComboBox(periodhead);
		Period.setBounds(120, 90, 130, 30);
		Period.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		Period.setVisible(true);
		add(Period);
		Period.addActionListener(FilterCombolistener);

		// -----------------------------------근무요일 필터링
		JLabel dutyweek_label = new JLabel("근무 요일");
		dutyweek_label.setBounds(280, 90, 70, 30);
		dutyweek_label.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		add(dutyweek_label);

		String[] dutyweekhead = { "전체", "월 ~ 일", "월 ~ 토", "월 ~ 금", "주   말" };
		Dutyweek = new JComboBox(dutyweekhead);
		Dutyweek.setBounds(360, 90, 130, 30);
		Dutyweek.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		Dutyweek.setVisible(true);
		add(Dutyweek);
		Dutyweek.addActionListener(FilterCombolistener);

		// -----------------------------------나이 필터링

		JLabel agelabel = new JLabel("나이");
		agelabel.setBounds(660, 90, 50, 30);
		agelabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		add(agelabel);

		AGE = new JTextField(example);
		AGE.setBounds(700, 90, 130, 30);
		AGE.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		add(AGE);
		AGE.addMouseListener(MouseListener2);
		// ----------------------------------------------- 알바천국과 잡코리아 팝업창

		AlbaHeaven.setBounds(1300, 20, 60, 60);
		AlbaHeaven.setVisible(true);
		add(AlbaHeaven);
		AlbaHeaven.addActionListener(listener);

		Intern.setBounds(1400, 20, 60, 60);
		Intern.setVisible(true);
		add(Intern);
		Intern.addActionListener(listener);
		// -------------------------------------------------즐겨찾기 버튼
		SAVE.setBounds(1200, 20, 60, 60);
		SAVE.setVisible(true);
		add(SAVE);
		SAVE.addActionListener(listener);

		SAVE2.setBounds(600, 20, 60, 60);
		SAVE2.setVisible(true);
		add(SAVE2);
		SAVE2.addActionListener(listener);
		// -------------------------------------------------이벤트 버튼
		EVENT.setBounds(800, 20, 60, 60);
		EVENT.setVisible(true);
		add(EVENT);
		EVENT.addActionListener(listener);
		// -------------------------------------------------팁 버튼
		INFO.setBounds(700, 20, 60, 60);
		INFO.setVisible(true);
		add(INFO);
		INFO.addActionListener(listener);

		// --------------------------------------------------------------------필터링 레이블과
		// 필터링 삭제
		Filterlabel.setBounds(10, 130, 150, 20);
		Filterlabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		add(Filterlabel);

		Filterlabel1.setBounds(10, 160, 150, 20);
		Filterlabel1.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		add(Filterlabel1);

		periodlabel.setBounds(20, 190, 150, 20);
		periodlabel.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		periodlabel.setText("");
		add(periodlabel);

		periodbutton.setBounds(130, 190, 20, 20);
		periodbutton.setText("");
		periodbutton.setVisible(false);
		periodbutton.addActionListener(FilterButtonlistener);
		add(periodbutton);

		Filterlabel2.setBounds(10, 230, 150, 20); // -----------------근무 요일 레이블
		Filterlabel2.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		add(Filterlabel2);

		dutyweeklabel.setBounds(20, 260, 150, 20);
		dutyweeklabel.setText("");
		dutyweeklabel.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		add(dutyweeklabel); // -----------------------------------------근무 요일 레이블

		dutyweekbutton.setBounds(130, 260, 20, 20);// ------------------근무 요일 버튼
		dutyweekbutton.setText("");
		dutyweekbutton.setVisible(false);
		dutyweekbutton.addActionListener(FilterButtonlistener);
		add(dutyweekbutton);

		Filterlabel3.setBounds(10, 300, 150, 20);
		Filterlabel3.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		add(Filterlabel3);

		genderlabel.setBounds(20, 330, 150, 20);
		genderlabel.setText("");
		genderlabel.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		add(genderlabel); // -----------------------------------------성별 레이블

		genderbutton.setBounds(130, 330, 20, 20);// ------------------성별 버튼
		genderbutton.setText("");
		genderbutton.setVisible(false);
		genderbutton.addActionListener(FilterButtonlistener);
		add(genderbutton);

		Filterlabel4.setBounds(10, 360, 150, 20);
		Filterlabel4.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		add(Filterlabel4);

		for (int i = 0; i < 5; i++) {
			Filtering[i] = new JLabel();
			Filtering[i].setFont(new Font("맑은 고딕", Font.BOLD, 12));
			delete[i] = new JButton();
		}
		Filtering[0].setBounds(20, 390, 100, 20);
		Filtering[0].setVisible(false);
		add(Filtering[0]);
		Filtering[1].setBounds(20, 420, 100, 20);
		Filtering[1].setVisible(false);
		add(Filtering[1]);
		Filtering[2].setBounds(20, 450, 100, 20);
		Filtering[2].setVisible(false);
		add(Filtering[2]);
		Filtering[3].setBounds(20, 480, 100, 20);
		Filtering[3].setVisible(false);
		add(Filtering[3]);
		Filtering[4].setBounds(20, 510, 100, 20);
		Filtering[4].setVisible(false);
		add(Filtering[4]);

		delete[0].setBounds(130, 390, 20, 20);
		delete[0].setVisible(false);
		add(delete[0]);
		delete[0].addActionListener(FilterButtonlistener);
		delete[1].setBounds(130, 420, 20, 20);
		delete[1].setVisible(false);
		add(delete[1]);
		delete[1].addActionListener(FilterButtonlistener);
		delete[2].setBounds(130, 450, 20, 20);
		delete[2].setVisible(false);
		add(delete[2]);
		delete[2].addActionListener(FilterButtonlistener);
		delete[3].setBounds(130, 480, 20, 20);
		delete[3].setVisible(false);
		add(delete[3]);
		delete[3].addActionListener(FilterButtonlistener);
		delete[4].setBounds(130, 510, 20, 20);
		delete[4].setVisible(false);
		add(delete[4]);
		delete[4].addActionListener(FilterButtonlistener);

	}

	// ------------------ 내부 클래스 및 메소드 구현
	class Buttonlistener implements ActionListener { // 버튼 이벤트
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == Calculator) { // 계산기 버튼------------------
				Calculatorpage calculator = new Calculatorpage();
				calculator.setVisible(true);
			}
			if (e.getSource() == Search) {// 검색 버튼----------------------

				if (AGE.getText().equals(example) || AGE.getText().equals("")) {
					Search_Albamon();
					AlbaHeavenpage.Search_AlbaHeaven();
				} 
				else {
					try {
						Integer.parseInt(AGE.getText());
						Albamoncrolling.age = AGE.getText();
						AlbaHeavencrolling.age = AGE.getText();
						Search_Albamon();
						AlbaHeavenpage.Search_AlbaHeaven();
					} 
					catch (NumberFormatException e1) {
						System.out.println("얘! 그건 숫자가 아니란다!!");
					}
				}
			}
			if (e.getSource() == Reset) { // 리셋 버튼 이벤트---------------------------------
				index = 0;
				for (int i = 0; i < 5; i++) {
					Filtering[i].setText("");
					Filtering[i].setVisible(false);
					delete[i].setText("");
					delete[i].setVisible(false);
				}
				try {
					Area.setSelectedIndex(0);
					Detail_Area.setSelectedIndex(0);
					City.setSelectedIndex(0);
					Detail_Area.setVisible(false);
					City.setVisible(false);
					genderlabel.setText("");
					periodlabel.setText("");
					genderbutton.setVisible(false);
					periodbutton.setVisible(false);
					Gender.setSelectedIndex(0);
					Period.setSelectedIndex(0);
				} catch (IllegalArgumentException e1) {
				}
					Albamoncrolling.area = "";
					Albamoncrolling.gender = "";
					Albamoncrolling.period = "";
					Albamoncrolling.dutyweek = "";
					Albamoncrolling.age = "";
					AlbaHeavencrolling.area = "";
					AlbaHeavencrolling.gender = "";
					AlbaHeavencrolling.period = "";
					AlbaHeavencrolling.dutyweek = "";
					AlbaHeavencrolling.age = "";
					AGE.setText(example);
					Search_Albamon();
					AlbaHeavenpage.Search_AlbaHeaven();
				
			}
			if (e.getSource() == AlbaHeaven) { // ------------알바천국 버튼 이벤트
				AlbaHeavenpage popup = new AlbaHeavenpage();
			}
			if (e.getSource() == Intern) { // ------------------인턴 버튼 이벤트
				Internpage ict = new Internpage();
			}
			if (e.getSource() == SAVE) { // ------------------즐겨찾기 버튼 이벤트
				Repositorypage save = new Repositorypage();
			}
			if (e.getSource() == EVENT) { // ------------------이벤트 버튼 이벤트
				Eventpage event = new Eventpage();
			}
			if (e.getSource() == INFO) { // ------------------팁 버튼 이벤트

			}
			if (e.getSource() == SAVE2) { // -----------------저장 버튼 이벤트
				try {
					SaveFunction.savealba(Loginpage.ID_.getText(), Alba.get(table.getSelectedRow()).getArea(),
							Alba.get(table.getSelectedRow()).getPay(), Alba.get(table.getSelectedRow()).getOffice(),
							Alba.get(table.getSelectedRow()).getText(), Alba.get(table.getSelectedRow()).getURL());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Repositorypage.Search_Alba();
			}
		}
	}

	class FilterButtonlistener implements ActionListener { // 필터링버튼 이벤트
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == delete[0]) {
				String[] temp6 = AlbaHeavencrolling.area.split("%2C");
				AlbaHeavencrolling.area = "";
				for (int i = 0; i < index; i++) {
					if (i == (index - 1))
						break;
					else {
						Filtering[i].setText(Filtering[i + 1].getText());
						AlbaHeavencrolling.area += temp6[i + 1] + "%2C";
					}
				}
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				Albamoncrolling.area = Albamoncrolling.area.substring(9);
				Search_Albamon();
				AlbaHeavenpage.Search_AlbaHeaven();

				if (Albamoncrolling.area.equals("")) { // 모든 조건이 사라지면 초기화면으로 변경
					Area.setSelectedIndex(0);
					Detail_Area.setSelectedIndex(0);
					City.setSelectedIndex(0);
					Detail_Area.setVisible(false);
					City.setVisible(false);
				}

			}
			if (e.getSource() == delete[1]) {
				String[] temp6 = AlbaHeavencrolling.area.split("%2C");
				AlbaHeavencrolling.area = temp6[0] + "%2C";
				for (int i = 1; i < index; i++) {
					if (i == (index - 1))
						break;
					else {
						Filtering[i].setText(Filtering[i + 1].getText());
						AlbaHeavencrolling.area += temp6[i + 1] + "%2C";
					}
				}
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				Albamoncrolling.area = Albamoncrolling.area.substring(0, 9) + Albamoncrolling.area.substring(18);
				Search_Albamon();
				AlbaHeavenpage.Search_AlbaHeaven();
			}
			if (e.getSource() == delete[2]) {
				String[] temp6 = AlbaHeavencrolling.area.split("%2C");
				AlbaHeavencrolling.area = temp6[0] + "%2C" + temp6[1] + "%2C";
				for (int i = 2; i < index; i++) {
					if (i == (index - 1))
						break;
					else {
						Filtering[i].setText(Filtering[i + 1].getText());
						AlbaHeavencrolling.area += temp6[i + 1] + "%2C";
					}
				}
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				Albamoncrolling.area = Albamoncrolling.area.substring(0, 18) + Albamoncrolling.area.substring(27);
				Search_Albamon();
				AlbaHeavenpage.Search_AlbaHeaven();
			}
			if (e.getSource() == delete[3]) {
				String[] temp6 = AlbaHeavencrolling.area.split("%2C");
				AlbaHeavencrolling.area = temp6[0] + "%2C" + temp6[1] + "%2C" + temp6[2] + "%2C";
				for (int i = 3; i < index; i++) {
					if (i == (index - 1))
						break;
					else {
						Filtering[i].setText(Filtering[i + 1].getText());
						AlbaHeavencrolling.area += temp6[i + 1] + "%2C";
					}
				}
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				Albamoncrolling.area = Albamoncrolling.area.substring(0, 27) + Albamoncrolling.area.substring(36);
				Search_Albamon();
				AlbaHeavenpage.Search_AlbaHeaven();
			}
			if (e.getSource() == delete[4]) {
				String[] temp6 = AlbaHeavencrolling.area.split("%2C");
				AlbaHeavencrolling.area = temp6[0] + "%2C" + temp6[1] + "%2C" + temp6[2] + "%2C" + temp6[3] + "%2C";
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				Albamoncrolling.area = Albamoncrolling.area.substring(0, 36);
				Search_Albamon();
				AlbaHeavenpage.Search_AlbaHeaven();
			}

			if (e.getSource() == genderbutton) {
				Albamoncrolling.gender = "";
				AlbaHeavencrolling.gender = "";
				genderlabel.setText("");
				genderbutton.setVisible(false);
				Search_Albamon();
				AlbaHeavenpage.Search_AlbaHeaven();
			}
			if (e.getSource() == periodbutton) {
				Albamoncrolling.period = "";
				AlbaHeavencrolling.period = "";
				periodlabel.setText("");
				periodbutton.setVisible(false);
				Search_Albamon();
				AlbaHeavenpage.Search_AlbaHeaven();
			}
		}
	}

	class Areacombolistener implements ActionListener { // 지역콤보박스 선택시 이벤트 발생 클래스
		public void actionPerformed(ActionEvent e) {
			if (index != 5) {
				if (e.getSource() == Area) {
					for (int i = 0; i < 5; i++) {
						Filtering[i].setText("");
						Filtering[i].setVisible(false);
						delete[i].setText("");
						delete[i].setVisible(false);
					}
					Detail_Area.setVisible(true);
					Detail.changeComboBox(e); // 콤보박스에 맞는 리스트 출력
					// Search_Albamon();
					temp = Area.getSelectedItem();
				} else if (e.getSource() == Detail_Area) {
					index = 0;
					for (int i = 0; i < 5; i++) {
						Filtering[i].setText("");
						Filtering[i].setVisible(false);
						delete[i].setText("");
						delete[i].setVisible(false);
					}
					City.setVisible(true);
					city.changeComboBox(e);
					// Search_Albamon();
					temp2 = Detail_Area.getSelectedItem();
				}
				// ------------------------------서울 1--------------------------------
				else if (e.getSource() == City) {
					if (temp2.equals("강남구") || temp2.equals("강동구") || temp2.equals("강북구") || temp2.equals("강서구")
							|| temp2.equals("관악구") || temp2.equals("광진구") || temp2.equals("구로구") || temp2.equals("금천구")
							|| temp2.equals("노원구") || temp2.equals("도봉구") || temp2.equals("동대문구") || temp2.equals("동작구")
							|| temp2.equals("마포구") || temp2.equals("서대문구") || temp2.equals("서초구") || temp2.equals("성동구")
							|| temp2.equals("성북구")) {
						서울1도시.SeoulCity(e);
						// f (서울1도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// --------------------------서울 2---------------------------------
					else if (temp2.equals("송파구") || temp2.equals("양천구") || temp2.equals("영등포구") || temp2.equals("용산구")
							|| temp2.equals("은평구") || temp2.equals("종로구") || temp2.equals("중구")
							|| temp2.equals("중랑구")) {
						서울2도시.Seoul2City(e);
						// if (서울2도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// -----------------------------경기1----------------------------
					else if (temp2.equals("가평군") || temp2.equals("고양시 덕양구") || temp2.equals("고양시 일산동구")
							|| temp2.equals("고양시 일산서구") || temp2.equals("과천시") || temp2.equals("광명시")
							|| temp2.equals("광주시") || temp2.equals("구리시") || temp2.equals("구리시") || temp2.equals("군포시")
							|| temp2.equals("김포시") || temp2.equals("남양주시") || temp2.equals("동두천시")
							|| temp2.equals("부천시") || temp2.equals("성남시 분당구") || temp2.equals("성남시 수정구")
							|| temp2.equals("수정시 중원구") || temp2.equals("수원시 권선구") || temp2.equals("수원시 영통구")
							|| temp2.equals("수원시 장안구") || temp2.equals("수원시 팔달구") || temp2.equals("시흥시")
							|| temp2.equals("안산시 단원구") || temp2.equals("안산시 상록구")) {
						경기1도시.GyeonggiCity(e);
						// if (경기1도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ----------------------------경기2-----------------------------
					else if (temp2.equals("안성시") || temp2.equals("안양시 동안구") || temp2.equals("안양시 만안구")
							|| temp2.equals("양주시") || temp2.equals("양평군") || temp2.equals("여주시") || temp2.equals("연천군")
							|| temp2.equals("오산시") || temp2.equals("용인시 기흥구") || temp2.equals("용인시 수지구")
							|| temp2.equals("용인시 처인구") || temp2.equals("의왕시") || temp2.equals("의정부시")
							|| temp2.equals("이천시") || temp2.equals("파주시") || temp2.equals("평택시") || temp2.equals("포천시")
							|| temp2.equals("하남시") || temp2.equals("화성시")) {
						경기2도시.Gyeonggi2City(e);
						// if (경기2도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------인천----------------------------------
					else if (temp.equals("인천")) {
						인천도시.IncheonCity(e);
						// if (인천도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------강원----------------------------------
					else if (temp.equals("강원")) {
						강원도시.GangwonCity(e);
						// if (강원도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------새전 또는 세종----------------------------------
					else if (temp.equals("대전") || temp.equals("세종")) {
						대전_세종도시.Daejeon_AND_SejongCity(e);
						// if (인천도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------충북----------------------------------
					else if (temp.equals("충북")) {
						충북도시.ChungbukCity(e);
						// if (충북도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------충남----------------------------------
					else if (temp.equals("충남")) {
						충남도시.ChungnamCity(e);
						// if (충남도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------부산----------------------------------
					else if (temp.equals("부산")) {
						부산도시.BusanCity(e);
						// if (부산도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------울산----------------------------------
					else if (temp.equals("울산")) {
						울산도시.UlsanCity(e);
						// if (울산도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------경남1----------------------------------
					else if (temp2.equals("거제시") || temp2.equals("거창군") || temp2.equals("고성군") || temp2.equals("김해시")
							|| temp2.equals("남해군") || temp2.equals("밀양시") || temp2.equals("사천시") || temp2.equals("산청군")
							|| temp2.equals("양산시") || temp2.equals("의령군") || temp2.equals("진주시")
							|| temp2.equals("창녕군")) {
						경남도시.GyeongnamCity(e);
						// if (충남도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------경남2----------------------------------
					else if (temp2.equals("창원시 마산합포구") || temp2.equals("창원시 마산회원구") || temp2.equals("창원시 성산구")
							|| temp2.equals("창원시 의창구") || temp2.equals("창원시 진해구") || temp2.equals("통영시")
							|| temp2.equals("하동군") || temp2.equals("함안군") || temp2.equals("함양군")
							|| temp2.equals("합천군")) {
						경남2도시.Gyeongnam2City(e);
						// if (경남2도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------경북1----------------------------------
					else if (temp2.equals("경산시") || temp2.equals("경주시") || temp2.equals("고령군") || temp2.equals("구미시")
							|| temp2.equals("군위군") || temp2.equals("김천시")) {
						경북도시.GyeongbukCity(e);
						// if (경북도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------경북2----------------------------------
					else if (temp2.equals("문경시") || temp2.equals("봉화군") || temp2.equals("상주시") || temp2.equals("성주군")
							|| temp2.equals("안동시") || temp2.equals("영덕군") || temp2.equals("영양군") || temp2.equals("영주시")
							|| temp2.equals("영천시") || temp2.equals("예천군") || temp2.equals("울릉군") || temp2.equals("울진군")
							|| temp2.equals("의성군") || temp2.equals("청도군") || temp2.equals("청송군") || temp2.equals("칠곡군")
							|| temp2.equals("포항시 남구") || temp2.equals("포항시 북구")) {
						경북2도시.Gyeongbuk2City(e);
						// if (경북2도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------대구----------------------------------
					else if (temp.equals("대구")) {
						대구도시.DeaguCity(e);
						// if (대구도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------광주----------------------------------
					else if (temp.equals("광주")) {
						광주도시.GwangjuCity(e);
						// if (광주도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------전북----------------------------------
					else if (temp.equals("전북")) {
						전북도시.JeonbukCity(e);
						// if (전북도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------전남----------------------------------
					else if (temp.equals("전남")) {
						전남도시.JeonnamCity(e);
						// if (전남도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
					// ---------------------------제주----------------------------------
					else if (temp.equals("제주")) {
						제주도시.JejuCity(e);
						// if (제주도시.flag != true)
						// Search_Albamon();
						if (index != 5)
							AlbaHeavenpage.Albaheaven_crolling.area += "%2C";
					}
				}
			}
		}
	}

	class Filtercombolistener implements ActionListener { // 그 외 필터링 콤보박스 선택시 이벤트 발생 클래스
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == Gender) {
				if (Gender.getSelectedItem().equals("전체")) {
					genderlabel.setText("");
					genderbutton.setVisible(false);
					Albamoncrolling.gender = "";
					AlbaHeavencrolling.gender = "";
				}
				if (Gender.getSelectedItem().equals("남자")) {
					genderlabel.setText("남자");
					genderbutton.setVisible(true);
					Albamoncrolling.gender = "M";
					AlbaHeavencrolling.gender = "C01";
				}
				if (Gender.getSelectedItem().equals("여자")) {
					genderlabel.setText("여자");
					genderbutton.setVisible(true);
					Albamoncrolling.gender = "W";
					AlbaHeavencrolling.gender = "C02";
				}
			}
			if (e.getSource() == Period) {
				if (Period.getSelectedItem().equals("전체")) {
					Albamoncrolling.period = "";
					AlbaHeavencrolling.period = "";
				}
				if (Period.getSelectedItem().equals("하루")) {
					periodlabel.setText("하루");
					periodbutton.setVisible(true);
					Albamoncrolling.period = "5";
					AlbaHeavencrolling.period = "H01";
				}
				if (Period.getSelectedItem().equals("1주일이하")) {
					periodlabel.setText("1주일이하");
					periodbutton.setVisible(true);
					Albamoncrolling.period = "10";
					AlbaHeavencrolling.period = "H02";
				}
				if (Period.getSelectedItem().equals("1주일~1개월")) {
					periodlabel.setText("1주일~1개월");
					periodbutton.setVisible(true);
					Albamoncrolling.period = "20";
					AlbaHeavencrolling.period = "H03";
				}
				if (Period.getSelectedItem().equals("1개월~3개월")) {
					periodlabel.setText("1개월~3개월");
					periodbutton.setVisible(true);
					Albamoncrolling.period = "30";
					AlbaHeavencrolling.period = "H04";
				}
				if (Period.getSelectedItem().equals("3개월~6개월")) {
					periodlabel.setText("3개월~6개월");
					periodbutton.setVisible(true);
					Albamoncrolling.period = "40";
					AlbaHeavencrolling.period = "H05";
				}
				if (Period.getSelectedItem().equals("6개월~1년")) {
					periodlabel.setText("6개월~1년");
					periodbutton.setVisible(true);
					Albamoncrolling.period = "45";
					AlbaHeavencrolling.period = "H06";
				}
				if (Period.getSelectedItem().equals("1년이상")) {
					periodlabel.setText("1년이상");
					periodbutton.setVisible(true);
					Albamoncrolling.period = "48";
					AlbaHeavencrolling.period = "H09";
				}
			}
			if (e.getSource() == Dutyweek) {
				if (Dutyweek.getSelectedItem().equals("전체")) {
					Albamoncrolling.dutyweek = "";
					AlbaHeavencrolling.dutyweek = "";
				}
				if (Dutyweek.getSelectedItem().equals("월 ~ 일")) {
					dutyweeklabel.setText("월 ~ 일");
					dutyweekbutton.setVisible(true);
					Albamoncrolling.dutyweek = "10";
					AlbaHeavencrolling.dutyweek = "D03";
				}
				if (Dutyweek.getSelectedItem().equals("월 ~ 토")) {
					dutyweeklabel.setText("월 ~ 토");
					dutyweekbutton.setVisible(true);
					Albamoncrolling.dutyweek = "20";
					AlbaHeavencrolling.dutyweek = "D02";
				}
				if (Dutyweek.getSelectedItem().equals("월 ~ 금")) {
					dutyweeklabel.setText("월 ~ 금");
					dutyweekbutton.setVisible(true);
					Albamoncrolling.dutyweek = "30";
					AlbaHeavencrolling.dutyweek = "D01";
				}
				if (Dutyweek.getSelectedItem().equals("주   말")) {
					dutyweeklabel.setText("주   말");
					dutyweekbutton.setVisible(true);
					Albamoncrolling.dutyweek = "40";
					AlbaHeavencrolling.dutyweek = "D04";
				}
			}
		}
	}

	class MouseListener1 extends MouseAdapter {

		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 2) {
				try {
					System.out.println(Alba.get(table.getSelectedRow()).getURL());
					Function.Albamoncrolling.explore(Alba.get(table.getSelectedRow()).getURL());
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			} // 더블클릭

		}
	}

	class MouseListener2 extends MouseAdapter {

		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 1) {
				AGE.setText("");
			}
		}
	}

	public void Search_Albamon() { // 광고 검색
		header = table.getTableHeader();
		header.setBackground(Color.red);
		header.setFont(new Font("맑은 고딕", Font.BOLD, 25));

		Albamoncrolling crolling = new Albamoncrolling();
		Alba = crolling.crolling();
		arr = new Object[Alba.size()][5];

		for (int i = 0; i < Alba.size(); i++) {
			int j = 0;
			arr[i][j++] = Alba.get(i).getArea();
			arr[i][j++] = Alba.get(i).getPay();
			arr[i][j++] = Alba.get(i).getOffice();
			arr[i][j++] = Alba.get(i).getText();
			arr[i][j++] = Alba.get(i).getTime();

		}

		TableModel.setDataVector(arr, head);
		table.getColumnModel().getColumn(0).setPreferredWidth(170);
		table.getColumnModel().getColumn(1).setPreferredWidth(170);
		table.getColumnModel().getColumn(2).setPreferredWidth(360);
		table.getColumnModel().getColumn(3).setPreferredWidth(525);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		table.getTableHeader().setReorderingAllowed(false);

		table.setRowHeight(35);
		table.setFont(new Font("맑은 고딕", Font.BOLD, 25)); // 글자 크기 설정
	}
}
