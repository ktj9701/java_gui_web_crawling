package Function;

public class LoadInterntext {
	private String name;
	private String project;
	private String area;
	private String state;
	private String num;
	private String url;

	public LoadInterntext(String name, String project, String area, String num,String state,String URL) {
		this.name = name;
		this.project = project;
		this.area = area;
		this.num = num;
		this.state = state;
		this.url = URL;
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

	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getURL() {
		return url;
	}

	public void setURL(String url) {
		this.url = url;
	}
	
}
