package container.user;

public class User {
	private int no = 0;
	private String name = "안대혁";
	
	public User() {
	}
	
	public User(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + "]";
	}
}
