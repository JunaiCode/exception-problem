package model;
public class Person {
	
	private String document;
	private String type;
	
	public Person(String document,String type) {
		
		this.document = document;
		this.type = type;
	}
	
	public void setDocument(String document) {
		
		this.document = document;
	}
	
	public String getDocument() {
		return document;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

}
