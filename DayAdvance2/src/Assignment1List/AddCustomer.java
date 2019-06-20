package Assignment1List;
import java.util.*;
public class AddCustomer {
	public void printCustomer(List<String> arrayList) {
		Iterator<String> itr = arrayList.iterator(); 
		System.out.println("Customers are:");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	
}
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("Deep");
		list.add("Deep");
		list.add("Rakeshbhai");
		list.add("Kothari");
	//	list
		AddCustomer customer = new AddCustomer();
		customer.printCustomer(list);
		System.out.println(list);
	}
}
