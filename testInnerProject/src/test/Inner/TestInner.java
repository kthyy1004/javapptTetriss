package test.Inner;

public class TestInner {

	public static void main(String[] args) {
		// public 내부클래스 사용시
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		
		outer.innerPrint();
		inner.print();

		OuterClass.InnerClass inner2 = new OuterClass().new InnerClass();
		inner2.print();
		//inner 꺼로 직접접근해서 inner 것만 사용가능함
		//outer 사용못함
		
	}

}
