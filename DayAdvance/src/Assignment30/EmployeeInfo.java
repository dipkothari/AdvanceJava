package Assignment30;

import java.util.ArrayList;
import java.util.*;

public class EmployeeInfo {
	public static void main(String args[]) {
		Calendar c = Calendar.getInstance();
		Employee employee1 = new Employee();
		employee1.setEmployeeID(1001);
		employee1.setEmployeeName("DEEP");
		// employee1.setDateOFBirth(c.set(1995,5,25));
		 
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		employee2.setEmployeeID(1002);
		employee3.setEmployeeID(1003);
		employee3.setEmployeeName("Yash");
		List l = new ArrayList();
		l.add(employee1);
		l.add(employee2);
		l.add(employee3);
		//l.add(employee1);
		
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		}
}
