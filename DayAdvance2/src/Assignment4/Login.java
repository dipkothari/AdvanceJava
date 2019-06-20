package Assignment4;
import java.util.*;
public class Login {
	private Map<Integer, String> loginMap = new LinkedHashMap<Integer, String>();
	public void addLogin(int customerId,String password) {
		loginMap.put(customerId,password);
	}
}
