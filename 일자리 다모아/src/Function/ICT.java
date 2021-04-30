package Function;

public class ICT {
	private String name;
	private String project;
	private String subject;
	private String area;
	private String max;
	private String num;
	private String url;

	public ICT(String name, String project, String subject, String area, String max, String num, String url) {
		this.name = name;
		this.project = project;
		this.subject = subject;
		this.area = area;
		this.max = max;
		this.num = num;
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	public String getURL() {
		return url;
	}

	public void setURL(String url) {
		this.url = url;
	}
}
