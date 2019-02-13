import java.util.Scanner;


public class Lab2_1 {
	public static void main(String[] args) {
		int age;
		float weight;
		Scanner s=new Scanner(System.in);
		String first = s.nextLine();
		String last = s.nextLine();
		char gender = s.next().charAt(0);
		age=s.nextInt();
		weight=s.nextFloat();
		System.out.println("Person Details:");
		System.out.println("_______________");
		System.out.println();
		System.out.println("First Name:"+first);
		System.out.println("Last Name :"+last);
		System.out.println("Gender :"+gender);
		System.out.println("Age:"+age);
		System.out.println("Weight:"+weight);
		
		
		
	}

}
