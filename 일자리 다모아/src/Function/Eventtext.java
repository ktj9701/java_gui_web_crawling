package Function;

import javax.swing.JButton;

public class Eventtext {
	private String title;
	private String text;
	private String period;
	private String announce;
	private String url;
	
	public Eventtext(String _title, String _text, String _period, String _announce,String _url) {
			this.title = _title;
			this.text = _text;
			this.period = _period;
			this.announce = _announce;
			this.url = _url;
		}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getAnnounce() {
		return announce;
	}

	public void setAnnounce(String announce) {
		this.announce = announce;
	}

	public String getURL() {
		return url;
	}

	public void setURL(String url) {
		this.url = url;
	}
}