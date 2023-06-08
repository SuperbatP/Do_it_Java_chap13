package sec05_innerinterface.EX02;

class Button{
	OnClickListener oc1;//필드선언
	void setOnClickListener (OnClickListener oc1) {
		this.oc1=oc1;}
	
interface OnClickListener{
	public abstract void onClick();}
	void onClick() {oc1.onClick();}
}

public class ButtonAPIExample {
public static void main(String[] args) {
	//개발자1. 클릭했을 때 음악재생
	Button btn1=new Button();
	btn1.setOnClickListener(new Button.OnClickListener() {
		@Override
		public void onClick() {System.out.println("개발자1 : 음악재생");}
	});
	btn1.onClick();
	
	//개발자1. 클릭했을 때 네이버
		Button btn2=new Button();
		btn2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {System.out.println("개발자2 : 네이버접속");}
		});
		btn2.onClick();
}
}
