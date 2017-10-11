
public class PersonMain3 {
public static void main(String[] args) {
		
		Person3 p1 = new Person3("Jagadeesh", "S", Gender.Male, 8500016780);
		
		printDetails(p1);
	}

	public static void printDetails(Person3 p1){
		System.out.println("Person Details");
		System.out.println("-------------- \n");
		System.out.println("FirstName : " + p1.getFirstName());
		System.out.println("LastName : " + p1.getLastName());
		System.out.println("Gender : " + p1.getGender());
		System.out.println("Phone Number : " + p1.getPhoneNumber());
		
	}
}
