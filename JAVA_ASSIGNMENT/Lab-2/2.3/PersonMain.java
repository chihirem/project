
public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person("Jagadeesh", "S", 'M');
		
		System.out.println("Person Details");
		System.out.println("-------------- ");
		System.out.println("FirstName : " + p1.getFirstName());
		System.out.println("LastName : " + p1.getLastName());
		System.out.println("Gender : " + p1.getGender());
	}

}
