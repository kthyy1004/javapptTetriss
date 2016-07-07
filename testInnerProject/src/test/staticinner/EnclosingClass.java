package test.staticinner;

public class EnclosingClass {
	private StaticInner obj;
	
	//내부클래스는 바깥 클래스의 멤버라고생각
	static class StaticInner{}
}
