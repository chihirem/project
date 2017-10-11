

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee emp = acceptDetails();
		
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		service.addEmployee(emp);
		service.findInsuranceScheme(emp);
		
		printDetails(emp);
		
	}
	
	public static Employee acceptDetails(){
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee id : ");
		emp.setEmployeeid(sc.nextInt());
		
		System.out.println("Enter Name : ");
		emp.setName(sc.next());
		
		System.out.println("Enter Salary : ");
		emp.setSalary(sc.nextDouble());
		
		System.out.println("Enter Designation :");
		emp.setDesignation(sc.next());
		
		sc.close();
		
		return emp;
		
		
	}
	
	public static void printDetails(Employee emp){
		
		System.out.println("Employee ID : " + emp.getEmployeeid());
		System.out.println("Employee Name : " + emp.getName());
		System.out.println("Employee Salary : " + emp.getSalary());
		System.out.println("Employee Designation : " + emp.getDesignation());
		System.out.println("Employee Insurance Scheme : " + emp.getInsuranceScheme());
	}
}
