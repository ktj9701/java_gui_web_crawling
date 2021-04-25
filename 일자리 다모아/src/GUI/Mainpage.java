package GUI;
// 메인 화면

import java.awt.Button;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URISyntaxException;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Function.crolling;
import Function.wewe;
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
import region.Seoul;
import region.Seoul2;
import region.Ulsan;
import region.Jeonnam;

public class Mainpage extends JFrame {
	Object temp, temp2;

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
	static Button Search = new Button("검색");
	static Button Reset = new Button("리셋");
	static Button Calculator = new Button("월급 계산기");
	static Button AlbaHeaven = new Button("알바천국");
	static Button JobKorea = new Button("잡코리아");
	static DefaultTableModel TableModel = new DefaultTableModel() {// 테이블 내용 수정 불가
		public boolean isCellEditable(int rowIndex, int mCollndex) {
			return false;
		}
	}; // 내용 수정 불가
	public static DefaultComboBoxModel ComboModel = new DefaultComboBoxModel();

	static String head[] = { "지역", "급여", "회사명", "내용", "등록 시간" };
	static TextField SerchField = new TextField();
	public static JScrollPane scroll;

	crolling crolling = new crolling();
	static Vector<Albatext> Alba;
	static Object arr[][];

	static JComboBox Area; // 시, 도 콤보박스

	public static JComboBox Detail_Area;

	public static JComboBox City;

	// 적용된 필터링 확인 및 필터리 삭제 버튼-----------------------------------------------
	public static JLabel[] Filtering = new JLabel[5];
	public static JButton[] delete = new JButton[5];

//-------------------------------------이벤트 ---------------------------
	Buttonlistener listener = new Buttonlistener();
	MouseListener MouseListener = new MouseListener();

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
		table.addMouseListener(MouseListener);
		Search_Albamon();
		scroll = new JScrollPane(table);
		scroll.setBounds(160, 130, 1325, 633);
		scroll.setVisible(true);
		add(scroll);

// ----------------------------------------------------------검색 버튼과 검색 텍스트 필드
		Search.setBounds(900, 30, 60, 60);
		Search.setVisible(true);
		add(Search);
		Search.addActionListener(listener);

		SerchField.setBounds(30, 40, 850, 40);
		SerchField.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		SerchField.setVisible(true);
		add(SerchField);

		Calculator.setBounds(1000, 30, 60, 60);
		Calculator.setVisible(true);
		add(Calculator);
		Calculator.addActionListener(listener);

		Reset.setBounds(1100, 30, 60, 60);
		Reset.setVisible(true);
		add(Reset);
		Reset.addActionListener(listener);
// ------------------------------------지역 콤보박스-------------------

		JLabel Province = new JLabel("지역");
		Province.setBounds(40, 90, 50, 30);
		Province.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		add(Province);
		String[] Korea_Province = { "선택", "서울", "경기", "인천", "강원", "대전", "세종", "충남", "충북", "부산", "울산", "경남", "경북", "대구",
				"광주", "전남", "전북", "제주" };
		Area = new JComboBox(Korea_Province);
		Area.setSelectedIndex(0);
		Area.setBounds(100, 90, 70, 30);
		Area.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		add(Area);
		combolistener Combolistener = new combolistener();
		Area.addActionListener(Combolistener);
		// ------------------------------------세부적인 지역 콤보박스-------------------

		Detail_Area = new JComboBox();

		Detail_Area.setBounds(200, 90, 150, 30);
		Detail_Area.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		Detail_Area.setVisible(false);
		add(Detail_Area);

		Detail_Area.addActionListener(Combolistener);

		City = new JComboBox();
		City.setBounds(400, 90, 150, 30);
		City.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		City.setVisible(false);
		add(City);
		City.addActionListener(Combolistener);

		// 알바천국과 잡코리아 팝업창

		AlbaHeaven.setBounds(1300, 30, 60, 60);
		AlbaHeaven.setVisible(true);
		add(AlbaHeaven);
		AlbaHeaven.addActionListener(listener);

		JobKorea.setBounds(1400, 30, 60, 60);
		JobKorea.setVisible(true);
		add(JobKorea);
		JobKorea.addActionListener(listener);

		// -------------------------------필터링 레이블과 필터링 삭제
		// 버튼----------------------------------------
		for (int i = 0; i < 5; i++) {
			Filtering[i] = new JLabel();
			delete[i] = new JButton();
		}
		Filtering[0].setBounds(20, 150, 100, 20);
		Filtering[0].setVisible(false);
		add(Filtering[0]);
		Filtering[1].setBounds(20, 180, 100, 20);
		Filtering[1].setVisible(false);
		add(Filtering[1]);
		Filtering[2].setBounds(20, 210, 100, 20);
		Filtering[2].setVisible(false);
		add(Filtering[2]);
		Filtering[3].setBounds(20, 240, 100, 20);
		Filtering[3].setVisible(false);
		add(Filtering[3]);
		Filtering[4].setBounds(20, 270, 100, 20);
		Filtering[4].setVisible(false);
		add(Filtering[4]);

		delete[0].setBounds(130, 150, 20, 20);
		delete[0].setVisible(false);
		add(delete[0]);
		delete[0].addActionListener(listener);
		delete[1].setBounds(130, 180, 20, 20);
		delete[1].setVisible(false);
		add(delete[1]);
		delete[1].addActionListener(listener);
		delete[2].setBounds(130, 210, 20, 20);
		delete[2].setVisible(false);
		add(delete[2]);
		delete[2].addActionListener(listener);
		delete[3].setBounds(130, 240, 20, 20);
		delete[3].setVisible(false);
		add(delete[3]);
		delete[3].addActionListener(listener);
		delete[4].setBounds(130, 270, 20, 20);
		delete[4].setVisible(false);
		add(delete[4]);
		delete[4].addActionListener(listener);

	}

	// ------------------ 내부 클래스 및 메소드 구현

	class Buttonlistener implements ActionListener { // 버튼 이벤트
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == Calculator) {
				Calculatorpage calculator = new Calculatorpage();
				calculator.setVisible(true);
			}
			if (e.getSource() == Search) {
				Search_Albamon();
				AlbaHeavenpage.Search_AlbaHeaven();
			}
			if (e.getSource() == Reset) {                //리셋 버튼 이벤트---------------------------------
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
					crolling.area = "";
					wewe.area="";
					Search_Albamon();
					AlbaHeavenpage.Search_AlbaHeaven();
				} catch (IllegalArgumentException e1) {

				}
			}
			if (e.getSource() == delete[0]) {
				for (int i = 0; i < index; i++) {
					if ((index == 5) || i == 4)
						break;

					else
						Filtering[i].setText(Filtering[i + 1].getText());
				}
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				crolling.area = crolling.area.substring(9);
				Search_Albamon();
			}
			if (e.getSource() == delete[1]) {
				for (int i = 1; i < index; i++) {
					if ((index == 5) || i == 4)
						break;

					else
						Filtering[i].setText(Filtering[i + 1].getText());
				}
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				crolling.area = crolling.area.substring(0, 9) + crolling.area.substring(18);
				Search_Albamon();
			}
			if (e.getSource() == delete[2]) {
				for (int i = 2; i < index; i++) {
					if ((index == 5) || i == 4)
						break;
					else
						Filtering[i].setText(Filtering[i + 1].getText());
				}
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				crolling.area = crolling.area.substring(0, 18) + crolling.area.substring(27);
				Search_Albamon();
			}
			if (e.getSource() == delete[3]) {
				for (int i = 3; i < index; i++) {
					if ((index == 5) || i == 4)
						break;

					else
						Filtering[i].setText(Filtering[i + 1].getText());
				}
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				crolling.area = crolling.area.substring(0, 27) + crolling.area.substring(36);
				Search_Albamon();
			}
			if (e.getSource() == delete[4]) {
				Filtering[index - 1].setText("");
				Filtering[index - 1].setVisible(false);
				delete[index - 1].setText("");
				delete[index - 1].setVisible(false);
				index--;
				crolling.area = crolling.area.substring(0, 36);
				Search_Albamon();
			}
			if (e.getSource() == AlbaHeaven) {
				AlbaHeavenpage popup = new AlbaHeavenpage();
			}
			if (e.getSource() == JobKorea) {

			}
		}
	}

	public class combolistener implements ActionListener { // 콤보박스 선택시 이벤트 발생 클래스
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
						if(index!= 5)
						AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// --------------------------서울 2---------------------------------
					else if (temp2.equals("송파구") || temp2.equals("양천구") || temp2.equals("영등포구") || temp2.equals("용산구")
							|| temp2.equals("은평구") || temp2.equals("종로구") || temp2.equals("중구")
							|| temp2.equals("중랑구")) {
						서울2도시.Seoul2City(e);
						// if (서울2도시.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
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
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
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
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------인천----------------------------------
					else if (temp.equals("인천")) {
						인천도시.IncheonCity(e);
						// if (인천도시.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------강원----------------------------------
					else if (temp.equals("강원")) {
						강원도시.GangwonCity(e);
						// if (강원도시.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------새전 또는 세종----------------------------------
					else if (temp.equals("대전") || temp.equals("세종")) {
						대전_세종도시.Daejeon_AND_SejongCity(e);
						// if (인천도시.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------충북----------------------------------
					else if (temp.equals("충북")) {
						충북도시.ChungbukCity(e);
						// if (충북도시.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------충남----------------------------------
					else if (temp.equals("충남")) {
						충남도시.ChungnamCity(e);
						// if (충남도시.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------부산----------------------------------
					else if (temp.equals("부산")) {
						부산도시.BusanCity(e);
						// if (부산도시.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------울산----------------------------------
					else if (temp.equals("울산")) {
						울산도시.UlsanCity(e);
						// if (울산도시.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------경남1----------------------------------
					else if (temp2.equals("거제시") || temp2.equals("거창군") || temp2.equals("고성군") || temp2.equals("김해시")
							|| temp2.equals("남해군") || temp2.equals("밀양시") || temp2.equals("사천시") || temp2.equals("산청군")
							|| temp2.equals("양산시") || temp2.equals("의령군") || temp2.equals("진주시")
							|| temp2.equals("창녕군")) {
						경남도시.GyeongnamCity(e);
						// if (충남도시.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------경남2----------------------------------
					else if (temp2.equals("창원시 마산합포구") || temp2.equals("창원시 마산회원구") || temp2.equals("창원시 성산구")
							|| temp2.equals("창원시 의창구") || temp2.equals("창원시 진해구") || temp2.equals("통영시")
							|| temp2.equals("하동군") || temp2.equals("함안군") || temp2.equals("함양군")
							|| temp2.equals("합천군")) {
						경남2도시.Gyeongnam2City(e);
						// if (경남2도시.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------경북1----------------------------------
					else if (temp2.equals("경산시") || temp2.equals("경주시") || temp2.equals("고령군") || temp2.equals("구미시")
							|| temp2.equals("군위군") || temp2.equals("김천시")) {
						경북도시.GyeongbukCity(e);
						// if (경북도시.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
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
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------대구----------------------------------
					else if (temp.equals("대구")) {
						대구도시.DeaguCity(e);
						// if (대구도시.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------광주----------------------------------
					else if (temp.equals("광주")) {
						광주도시.GwangjuCity(e);
						// if (광주도시.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------전북----------------------------------
					else if (temp.equals("전북")) {
						전북도시.JeonbukCity(e);
						// if (전북도시.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------전남----------------------------------
					else if (temp.equals("전남")) {
						전남도시.JeonnamCity(e);
						// if (전남도시.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
					}
					// ---------------------------제주----------------------------------
					else if (temp.equals("제주")) {
						제주도시.JejuCity(e);
						// if (제주도시.flag != true)
						// Search_Albamon();
						if(index!= 5)
							AlbaHeavenpage.Albaheaven_crolling.area+="%2C";
						
					} else if (temp2.equals("전체")) {
						if (index != 0) {
							crolling.area = crolling.area.substring(0, 5);
							Search_Albamon();
						}
					}

				}
				System.out.println(index);
				System.out.println(crolling.area);
			}
		}
	}

	public class MouseListener extends MouseAdapter {

		public void mouseClicked(MouseEvent e) {

			if (e.getClickCount() == 2) {
				try {
					Function.crolling.explore(Alba.get(table.getSelectedRow()).getURL());
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			} // 더블클릭

		}
	}

	public void Search_Albamon() { // 광고 검색
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
