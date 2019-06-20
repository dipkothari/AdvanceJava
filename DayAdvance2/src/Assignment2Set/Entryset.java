package Assignment2Set;
import java.util.*;
public class Entryset {
	public void printSetRecords(Set<String> set) {
		if(set.isEmpty()) {
			System.out.println("set is an empty");
		}
		else {
			System.out.println("Set elemets are :" + set);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("First entry");
		set.add("Firstentryy");
		set.add("First entry");
		set.add("Second entry");
		set.add("Firstentry");
		//set.clear();
		
		Entryset demo = new Entryset();
		demo.printSetRecords(set);
		System.out.println(set);
		
		Set<String> newset = new HashSet<String>();
		demo.printSetRecords(newset);
		System.out.println(newset);
	}

}
