package ma.youcode.request;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class SignupRequest {
	@NotBlank
//	@Size(min = 3, max = 20)
	private String username;

	@NotBlank
//	@Size(max = 50)
	@Email
	private String email;

	@NotBlank
//	@Size(min = 3, max = 20)
	private String firstName;
	
	
	@NotNull(message="Ce champ ne doit etre null !")
//	@Size(min=3, message="Ce champ doit avoir au moins 3 Caracteres !")
	private String lastName;



	@NotBlank
//	@Size(min = 10, max = 13)
	private int phone;

	

	@NotBlank
//	@Size(min = 6, max = 40)
	private String password;

	private String userId;

	private boolean isEnabled;
	
	private Set<String> role;

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public Set<String> getRole() {
		return this.role;
	}

	public void setRole(Set<String> role) {
		this.role = role;
	}

//	public Date getTime() {
//		return time;
//	}
//
//	public void setTime(Date time) {
//		this.time = time;
//	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
