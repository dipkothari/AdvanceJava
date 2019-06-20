package Assignment5;

import java.util.*;

public class Debug {
	public void showRecords(Set<String> set) {
		if(!set.isEmpty()) {
			Iterator<String> itr = set.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		}else {
			System.out.println("Set is an empty set");
		}
	}
	
	public static void main(String args[]) {
		Set<String> set = new HashSet<String>();
		set.add("Lourie");
		set.add("Lrie");
		set.add("Louie");
		set.add("Lorie");
		Debug debug = new Debug();
		System.out.println("Printing the records...");
		debug.showRecords(set);
	}
}
