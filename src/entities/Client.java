package entities;
import java.util.Date;

public class Client {
	//1. declara��o de vari�veis
	private String name;
	private String email;
	private Date birthDate;
	//2. construtor padr�o
	public Client() {	
	}
	//3. construtor com argumentos
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	//4. Getters e Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
}
