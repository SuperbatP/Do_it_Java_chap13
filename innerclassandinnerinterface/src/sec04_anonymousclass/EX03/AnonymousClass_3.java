package sec04_anonymousclass.EX03;

interface A {public abstract void abc();}// A end
class B implements A{
	public void abc() {System.out.println("매개변수 전달");}
}//B end

class C{ void cde(A a) {a.abc();}
}//C end


public class AnonymousClass_3 {
public static void main(String[] args) {
	C c = new C();
	//클래스명+참조변수명
	A a = new B();
	c.cde(a);
	
	//클래스명
	c.cde(new B());
}
}
