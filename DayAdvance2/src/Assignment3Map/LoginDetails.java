package Assignment3Map;
import java.util.*;
public class LoginDetails {
	
	public void addSameKey(Map<Integer, String> map) {
		if(map.containsKey(4)) {
			System.out.println("Key is already present in map");
		}
		map.put(4, "Deepu");
	}
	
	public void printLoginDetails(Map<Integer, String> map) {
		Set<Integer> set = map.keySet();
	//	Set<Map.entry(Integer, String)) values=map.entrySet();

		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	public static void main(String args[]) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1,"Sam");
		map.put(2, "Tom");
		map.put(3, "Sam");
		map.put(4, "Deep");
		
		System.out.println("Map before adding the same key "+map);
		
		//Set(Map.entry(Integer, String)) values=map.entrySet();
		
		LoginDetails loginDetails = new LoginDetails();
		loginDetails.addSameKey(map);
		System.out.println("value for 4, after addSamekey :"+map.get(4));
		System.out.println("Map after adding the same key 4 :"+map);
		loginDetails.printLoginDetails(map);
	}
}
