package sec05_innerinterface.EX01;

class A{
	static interface B{//static 없어도 자동으로 컴파일
		public abstract void bcd();
	}
}

class C implements A.B{//이너인터페이스니까 바깥 클래스 써줘야 함
	public void bcd() {System.out.println("이너 인터페이스 구현 클래스 생성");}
}

public class CreatObjectOfInnerInterface {
public static void main(String[] args) {
	//자식클래스 직접 생성
	A.B ab = new C();
	C c= new C();
	c.bcd();
	//익명이너클래스 생성
	A.B b= new A.B() {public void bcd() {System.out.println("익명 이너 클래스로 객체 생성");}};
	b.bcd();
}//main end
}


