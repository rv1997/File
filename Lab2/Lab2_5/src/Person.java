public class Person {
	private String firstName;
	private String lastName;
	private String gender;
	private String phone;
	Person(String firstName,String lastName,String gender,String phone)
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
	
	public String getGender() {
		return gender;
	}
	public String getPhone()
	{
		return phone;
	}
	
	

}
