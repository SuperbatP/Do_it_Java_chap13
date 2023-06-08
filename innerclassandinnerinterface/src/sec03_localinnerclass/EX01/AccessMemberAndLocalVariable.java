package sec03_localinnerclass.EX01;

class A{
	int a=3;//필드
	void abc() {
		int b=5;//메서드 안에 있음->지역변수
		//지역이너클래스
		class B{
			void bcd() {
			System.out.println(a);//필드
			System.out.println(b);//지역변수	
			a=5;
		//	b=7; 오류. 지역 이너클래스에서 사용하는 지역변수는 자동 final 선언
			}
		}//B class end
		B bb=new B();
		bb.bcd();
		
	}
}// A class end

public class AccessMemberAndLocalVariable {
public static void main(String[] args) {
	A a=new A();
	a.abc();
}
}
