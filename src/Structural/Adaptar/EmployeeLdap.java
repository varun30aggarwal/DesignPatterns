package Structural.Adaptar;

public class EmployeeLdap {

	private String cn;
	private String surname;
	private String givename;
	private String mail;
	
	public EmployeeLdap(String cn, String surname, String givenname, String mail)
	{
		this.cn=cn;
		this.givename=givenname;
		this.surname=surname;
		this.mail=mail;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setGivename(String givename) {
		this.givename = givename;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCn() {
		return cn;
	}

	public String getSurname() {
		return surname;
	}

	public String getGivename() {
		return givename;
	}

	public String getMail() {
		return mail;
	}
	
	
}
