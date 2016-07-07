package test.Inner;

public class OuterClass {
	//Field
	//Constructor
	//Method
	public void innerPrint(){
		System.out.println("num : " + new InnerClass().num);
	}
	
	
	public class InnerClass{
		//Field
		private int num = 123;
		
		//Constructor
		public  InnerClass(){}
		//Method
		public void print(){
			System.out.println("내부클래스가 가진 public 메소드입니다.");
		}
	}
	
	/*public static void main(String[] args){
		new OuterClass().innerPrint();
	}*/
	
}
