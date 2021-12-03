package blart;

import java.io.Serializable;

public class java_bean implements Serializable {
	private String name;
	private String password;
	public java_bean() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
