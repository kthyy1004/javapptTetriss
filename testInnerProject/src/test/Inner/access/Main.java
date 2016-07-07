package test.Inner.access;

public class Main {

	public static void main(String[] args) {
		new OuterClass().methodOuter();
		
		//내부클래스가 public 이면 클래스 밖에서도 사용가능
		//인스턴스(non-static) 클래스의 경우
		OuterClass.InnerClass inRef = new OuterClass().new InnerClass();
		inRef.inPrint();	//내부클래스가 가진 public 메소드 실행
		
		//스태틱 이너클래스의 경우
		OuterClass.StaticInnerClass sinRef = new OuterClass.StaticInnerClass();
		
		//스태틱 이너클래스가 가진 public 필드의 사용
		System.out.println("sinNum : " + OuterClass.StaticInnerClass.sinNum);
	}

}
