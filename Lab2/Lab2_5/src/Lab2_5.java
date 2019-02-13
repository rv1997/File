import java.util.Scanner;
import  java.util.Scanner.*;

import static java.lang.Math.*;
enum gen
{
	M,F
}

public class Lab2_5 {
	
	public static void main(String[] args) {
		
		String first;
		String last;
		String phone;
		String gender;
		Scanner s=new Scanner(System.in);
		first=s.nextLine();
		last=s.nextLine();
		gender=s.nextLine();
		phone=s.nextLine();
		if(gender.equals(gen.M.toString()) || gender.equals(gen.F.toString()))
		{
		Person p=new Person(first,last,gender,phone);
		System.out.println("Person Details:");
		System.out.println("_______________");
		System.out.println();
		System.out.println("First Name:"+p.getFirstName());
		System.out.println("Last Name :"+p.getLastName());
		System.out.println("Gender :"+p.getGender());
		System.out.println("Phone no. :"+p.getPhone());
		}
		else
			System.out.println("Wrong Entry");
		
}
}
