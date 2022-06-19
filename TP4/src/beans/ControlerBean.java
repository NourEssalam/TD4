package beans;

public class ControlerBean {
	private String lastName;
	private String firstName;
	private String adresse;
	private String phone;
	private String email;
	
	
	public ControlerBean() {
		
		setLastName("");
		setFirstName(""); 
		setAdresse(""); 
		setPhone(""); 
		setEmail(""); 

	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	
}
