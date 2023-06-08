package sec01_instanceinnerclass.EX02;

class A{
	int a=3;
	int b=4;
	void abc() {System.out.println("A 클래스 메서드");}

//인스턴스 이너클래스 정의
class B{
	int a=5;
	int b=6;
	void abc() {System.out.println("B 클래스 메서드");}//상속이 오버라이딩 개념 절대 아님
	
	void bcd() {
	System.out.println(a);//this. 자동추가=자기 자신 것 호출
	System.out.println(b);//this. 자동추가=자기 자신 것 호출
	abc();//this. 자동추가=자기 자신 것 호출
	
	//아우터 클래스의 멤버 호출
	System.out.println(A.this.a);
	System.out.println(A.this.b);
	A.this.abc();
	}
}//B class end
}//A class end 
public class UseMembersOfOuterClass {
public static void main(String[] args) {
	A a=new A();
	A.B b= a.new B();
	b.bcd();
}
}
