

import java.util.HashMap;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl {
	HashMap<String, Employee> list = new HashMap<String, Employee>();
	
	public void addEmployee(Employee emp){
		String empID = "" + emp.getEmployeeid();
		list.put(empID, emp);
	}
	
	public void findInsuranceScheme(Employee emp){
		double sal = emp.getSalary();
		String design = emp.getDesignation();
		
		if (sal > 5000 && sal < 20000 && design.equals("System Associate"))
			emp.setInsuranceScheme("Scheme C");
		else if (sal >= 20000 && design.equals("Programmer"))
			emp.setInsuranceScheme("Scheme B");
		else if (sal >=40000 && design.equals("Manager"))
			emp.setInsuranceScheme("Scheme A");
		else if (sal < 5000)
			emp.setInsuranceScheme("No Scheme");
	
	}
	
}
