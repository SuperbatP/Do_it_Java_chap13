package sec04_anonymousclass.EX04;

interface A {public abstract void abc();}// A end

class C{ void cde(A a) {a.abc();}
}//C end


public class AnonymousClass_4 {
	public static void main(String[] args) {
		C c = new C();
		//참조변수명
		A a = new A() {public void abc() {System.out.println("매개변수 전달");}};
		c.cde(a);
		
		//클래스명, 참조변수명 둘 다 없음
		c.cde(new A(){public void abc() {System.out.println("매개변수 전달");}
		});
	}
}
