package test.Inner.access;

public class OuterClass {
	private int outNum = 12;	//인스턴스변수라고 함
	private static int outStaticNum = 21;	//**static 정적변수
	
	public class InnerClass{	//인스턴스 클래스라고도 함 (non-static)
		private int inNum = outNum;	//외부클래스의 private 멤버 접근가능
		private int inNum2 = outStaticNum; //외부클래스의 static 멤버도 사용 가능
		
		public void inPrint(){
			System.out.println("inNum : " + inNum +", inNum2 : " + inNum2);
		}
	}
	
	public static class StaticInnerClass{ 		//**정적클래스
		static int sinNum = outStaticNum; //외부클래스의 private 멤버 접근가능
		private static int sinNum2 = new OuterClass().outNum; //외부클래스의 인스턴스 멤버 사용못함
		//this 레퍼런스가 존재하지 않기 때문임
		
		public void staticInPrint(){
			System.out.println("sinNum : " + sinNum);
//			sinRef.staticInprint();
		}
	}
	
	//method
	public void methodOuter(){
		//지역변수
		int localValue = 3;
		final int finalValue = 5;
		
		//Local Inner Class
		class LocalInner{
			private int value = localValue;
			private int value2 = finalValue;
			private int oValue = outNum;
			private int sValue = outStaticNum;
			
			public void printValue(){
				System.out.println("value : " + value);
				System.out.println("value2 : " + value2);
				System.out.println("oValue : " + outNum);
				System.out.println("sValue : " + sValue);
			}
		}
		
		//사용
		new LocalInner().printValue();
	}
	
}















