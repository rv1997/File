import java.util.Scanner;


public class Lab2_4 {
	public static void main(String[] args) {
		String first;
		String last;
		String phone;
		char gender;
		Scanner s=new Scanner(System.in);
		first=s.nextLine();
		last=s.nextLine();
		gender=s.next().charAt(0);
		s.nextLine();
		phone=s.nextLine();
		Person p=new Person(first,last,gender,phone);
		System.out.println("Person Details:");
		System.out.println("_______________");
		System.out.println();
		System.out.println("First Name:"+p.getFirstName());
		System.out.println("Last Name :"+p.getLastName());
		System.out.println("Gender :"+p.getGender());
		System.out.println("Phone no. :"+p.getPhone());
}
}
