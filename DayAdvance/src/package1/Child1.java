package package1;

public class Child1 extends Base {
	public void getValues() {
		System.out.println(getVariable());//default
		System.out.println(getVariable2());//private
		System.out.println(variable3);//protected
		System.out.println(variable4);//public
	}
}
