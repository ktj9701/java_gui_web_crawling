package Function;

import javax.swing.JButton;

public class Albatext {
	private String area;
	private String pay;
	private String office;
	private String text;
	private String time;
	private String url;
	public Albatext(String _area, String _pay, String _office, String _text, String _time,String _url) {
			this.area = _area;
			this.pay = _pay;
			this.office = _office;
			this.text = _text;
			this.time = _time;	
			this.url = _url;
		}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	public String getURL() {
		return url;
	}

	public void setURL(String url) {
		this.url = url;
	}
}