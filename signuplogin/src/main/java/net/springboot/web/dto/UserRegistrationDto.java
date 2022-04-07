package net.springboot.web.dto;

public class UserRegistrationDto {
	private String firstName;
	private String mobileNumber;
	private String email;
	private String password;
	
	public UserRegistrationDto(){
		
	}
	
	public UserRegistrationDto(String firstName, String mobileNumber, String email, String password) {
		super();
		this.firstName = firstName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.password = password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	
}