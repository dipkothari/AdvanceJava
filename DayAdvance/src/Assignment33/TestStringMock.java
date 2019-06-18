package Assignment33;

class StringMock{
	String capcity;
	public StringMock() {
		
	}
	public StringMock(String Capacity) {
		this.capcity=capcity;
	}
	@Deprecated
	public static int search(String string, char searchItem) {
		int index;
		char[] charArray=string.toCharArray();
		for(index=0;index<charArray.length;index++) {
			if(charArray[index]==searchItem)
			{
				return index;
			}
			
		}
		return 0;
		
	}
}

public class TestStringMock {
	public static void main(String args[]) {
		String message = "What's in the naem";
		StringMock sm = new StringMock(message);
		System.out.println(sm.search(message,'n'));
		System.out.println(sm.search(message, 'y'));
	}
}