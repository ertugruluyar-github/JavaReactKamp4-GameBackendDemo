package Abstract;

import java.time.LocalDate;

public abstract class User {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String password;
	private String nationalityId;
	private LocalDate dateOfBirth;
	
	public User() {}
	
	public User(int id, String firstName, String lastName, String email, String userName, String password,
			String nationalityId, LocalDate dateOfBirth) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}

	public User(String firstName, String lastName, String email, String userName, String password,
			String nationalityId, LocalDate dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}

	// Getter - Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
