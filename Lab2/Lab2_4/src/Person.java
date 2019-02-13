
public class Person {
	private String firstName;
	private String lastName;
	private char gender;
	private String phone;
	Person(String firstName,String lastName,char gender,String phone)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
		this.phone=phone;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public char getGender() {
		return gender;
	}
	public String getPhone()
	{
		return phone;
	}
	
	

}
