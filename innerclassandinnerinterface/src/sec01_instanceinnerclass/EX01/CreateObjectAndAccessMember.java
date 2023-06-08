package sec01_instanceinnerclass.EX01;

class A {
	public int a=3;
	protected int b =4;
	int c=5;
	private int d =6;
	
	void abc() {System.out.println("A 클래스 메서드 abc()");}
	
	//인스턴스 이너클래스
class B{void bac(){
	//아우터 클래스의 필드 사용 
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	//아우터 클래스의 메서드 호출
	abc();}
}
}


public class CreateObjectAndAccessMember {
public static void main(String[] args) {
	//객체생성
	A a=new A();//1. 아우터 글래스의 객체 생성
	A.B b= a.new B();//a 객체 속 B
	b.bac();
	
}
}
