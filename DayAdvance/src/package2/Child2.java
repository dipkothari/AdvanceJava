package package2;
import package1.*;
public class Child2{
	public static void main(String args[]) {
	//public void getValues() {
		Base base=new Base();

		Child1 child1 = new Child1();
		System.out.println(base.getVariable());//default
	//	System.out.println(base.getvariable2());//private
	//	System.out.println(base.getvariable3());//protected
			System.out.println(base.variable4);
			System.out.println(base.getClass());
			System.out.println(child1.getVariable());//default
		//		System.out.println(child1.getvariable2());//private
		//		System.out.println(child1.getvariable3());//protected
				System.out.println(child1.variable4);//public
		//		System.out.println(child1.getValues());
		//System.out.println(base.variable1);//default
	//	System.out.println(base.variable2);//private
	//	System.out.println(base.variable3);//protected
		System.out.println(base.variable4);//public
	//	System.out.println(child1.variable1);//default
	//		System.out.println(child1.variable2);//private
	//		System.out.println(child1.variable3);//protected
			System.out.println(child1.variable4);
			
		Child2 child2 = new Child2();
	//	System.out.println(child2.variable1);//default
	//		System.out.println(child2.variable2);//private
	//		System.out.println(child2.variable3);//protected
	//		System.out.println(child2.variable4);
}
}