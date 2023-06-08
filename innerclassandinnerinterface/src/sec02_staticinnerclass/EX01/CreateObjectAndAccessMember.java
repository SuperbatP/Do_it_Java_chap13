package sec02_staticinnerclass.EX01;

class A{
	int a=3;
	static int b=4;
	void method1() {System.out.println("instance method");}
	static void method2() {System.out.println("static method");}
	
	static class B{
		void bcd() {
		//System.out.println(a); static가 없어서 오류 /객체가 없어서 오류
		System.out.println(b);
		//method1();static가 없어서 오류 /객체가 없어서 오류
		method2();}
	}
}


public class CreateObjectAndAccessMember {
public static void main(String[] args) {
	A.B b=new A.B();
	b.bcd();
}
}
