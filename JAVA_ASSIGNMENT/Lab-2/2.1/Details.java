import java.util.Scanner;


public class Details {

	public static void main(String[] args) {
		String first,last,gender;
		int age;
		double weight;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Name");
		first=sc.next();
		System.out.println("Enter the Last Name");
		last=sc.next();
		System.out.println("Enter the Gender");
		gender=sc.next();
		System.out.println("Enter the Age");
		age=sc.nextInt();
		System.out.println("Enter the Weight");
		weight=sc.nextDouble();
		System.out.println("First Name : "+first);
		System.out.println("last Name : "+last);
		System.out.println("Gender : "+gender);
		System.out.println("Age : "+age);
		System.out.println("Weight :"+weight);
		sc.close();
	}

}
