package gui.first;

import java.awt.FlowLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class FirstGUI extends JFrame implements ActionListener{
	private JButton button;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	
	public FirstGUI(){
		//super("first gui"); // 타이틀 바에 보여질 문구. 
		// 생성자에 String title 이 문구다
		super();
		this.setTitle("first gui");
		// frame 클래스의 setTitle 메소드를 이용해서도 가능
		this.setSize(600, 400); // 사이즈를 정한다 (가로,세로)
		this.setLocation(200,200); // 윈도우창의 위치를 정한다 (x좌표,y좌표)
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // 닫으면서 프로그램도 종료시키는것
		this.setLayout(new FlowLayout());
		
		// 컴포넌트 생성
		button = new JButton("클릭");
		button.addActionListener(this); // 버튼에 액션이 발생하면()안이 작동한다. 상속받은 후손클래스를 사용한다.
		// 이벤트 핸들러의 레퍼런스를 쓴다.(자신이 받았기때문에 this씀)
		// 버튼 작동 클래스랑 연결할때 addActionListener 사용함.
		
		button2 = new JButton("클릭2"); // 이벤트 감지센서
		// 다른 클래스에서 받아올떄 (button2)
		button2.addActionListener(new Button2Click(this)); // 실행 메소드를 만든 클래스객체를 ()안에넣는다. 생성자를 이용해서 전달함.
		
		button3 = new JButton("클릭3");
		button3.addActionListener(new Button3Click(this));
		
		button4 = new JButton("클릭4"); // 이름없는 클래스 1회용 익명(anonymus) 클래스로 작성함
		button4.addActionListener(new ActionListener(){// 생성자를 만든다.
			// 이 안에다 오버라이딩 함
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(((JButton)(e.getSource())), e.getActionCommand() + "버튼 누름");
				
			}
			
			
		});
		
		
		
		
		
		this.add(button); // 프레임에 추가
		this.add(button2);
		this.add(button3);
		this.add(button4);
		
		
		
		
		
		
		this.setVisible(true); // setVisible을 써야 보여진다.(괄호안에는 참 거짓값) 항상 마지막에 써야함
		}

	public static void main(String[] args) {
		new FirstGUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) { // 버튼클릭하면 작동되는 메소드
		JOptionPane.showMessageDialog(this, e.getActionCommand() + "버튼 누름");
		
	}
	// 내부 클래스로 작성하는 경우 (button3)
	private class Button3Click implements ActionListener{// 이 클래스 안에만 사용할수 있는 내부 클래스
		private JFrame mainFrame;
		public Button3Click(JFrame mainFrame){ // 생성자 초기값 만들어서 자신이 받아야함
			this.mainFrame = mainFrame;
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(mainFrame, e.getActionCommand() + "버튼 누름");
		
	}
	}
	
	
}
