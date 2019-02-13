import java.util.Scanner;


public class Lab2_3 {
	public static void main(String[] args) {
		String first;
		String last;
		char gender;
		Scanner s=new Scanner(System.in);
		first=s.nextLine();
		last=s.nextLine();
		gender=s.next().charAt(0);
		Person p=new Person(first,last,gender);
		System.out.println("Person Details:");
		System.out.println("_______________");
		System.out.println();
		System.out.println("First Name:"+p.getFirstName());
		System.out.println("Last Name :"+p.getLastName());
		System.out.println("Gender :"+p.getGender());
		
		
		
		
	}

}
