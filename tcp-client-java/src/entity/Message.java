package entity;

public class Message {
	private String classe;
	private String method;
	private String content;
	

	public Message(String classe, String method, String content) {
		super();
		this.classe = classe;
		this.method = method;
		this.content = content;
	}
	
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
