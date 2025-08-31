package Day48_SpringbootRestAPI.model;

public class Student {
	
	private Long id;
	private String name;
	
	public Student(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Long getID() { return id; }
	public String getName() { return name; }
	
	public void setID(Long id) { this.id = id; }
	public void setName(String name) { this.name = name;}
}
