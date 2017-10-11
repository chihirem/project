import java.util.Scanner;


public class PersonMain1 {
	
	public long phone;
	Scanner sc=new Scanner(System.in);
	public void phone()
	{
		System.out.println("Enter the Phone Number");
		phone=sc.nextLong();
	}
	public void display()
	{
		System.out.println("----Person Details-----");

		Person p1=new Person("Jagadeesh","S","Male",22,62);

		System.out.println("First Name  :"+p1.first);
		System.out.println("Last Name   :"+p1.last);
		System.out.println("Gender      :"+p1.gender);
		System.out.println("Age         :"+p1.age);
		System.out.println("Weight       :"+p1.weight);
		System.out.println("Phone Number :"+phone);
	}

	public static void main(String[] args) {
		
		PersonMain1 p2=new PersonMain1();
		p2.phone();
		p2.display();	
	}
}
