package test.main.frame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

import test.event.handler.ActionEventHandler;

public class MainFrame extends JFrame{
	private JMenuBar menubar; //JMenuBar 는분량이많아서 별도의 클래스를 만들어서 관리하면 좋음
	private JButton loginBtn, cancleBtn;
	private JPanel southPane, centerPane, centerTopPane, centerBottomPane;
	private JTextField userid;
	private JPasswordField userpwd;
	
	
	public MainFrame(){
		super("My Application");
		this.setBounds(new Rectangle(100, 100, 800, 600));
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//프레임을 지정할때는 배치방식을 지정해야함
		this.setLayout(new BorderLayout()); //null처리하면 내맘대로 크기지정할수있음
		
		//south 구역에 배치할 panel 구성	---------------------------------------------------
		southPane = new JPanel();
		loginBtn = new JButton("로그인");
		cancleBtn = new JButton("취소");
		
		loginBtn.addActionListener(new ActionEventHandler(this));
		cancleBtn.addActionListener(new ActionEventHandler(this));
		
		southPane.add(loginBtn);
		southPane.add(cancleBtn);
		
		//center 구역에 배치할 panel 구성---------------------------------------------------
		centerPane = new JPanel();
		centerPane.setLayout(new GridLayout(2, 1));
		//center 위쪽 Panel 구성 *********************************************************
		centerTopPane = new JPanel();
		centerTopPane.add(new JLabel("아 이 디 : "));
		userid = new JTextField(25);
		centerTopPane.add(userid);
		
		//center 아래쪽 panel 구성 ********************************************************
		centerBottomPane = new JPanel();
		centerBottomPane.add(new JLabel("암       호 : "));
		userpwd = new JPasswordField(25);
		centerBottomPane.add(userpwd);
		
		centerPane.add(centerTopPane);
		centerPane.add(centerBottomPane);
		
		//프레임에 panel 배치 -------------------------------------------------------------
		this.add(southPane, BorderLayout.SOUTH);
		this.add(centerPane, BorderLayout.CENTER);
		
		this.setVisible(true);
	}


	public JTextField getUserid() {
		return userid;
	}


	public JPasswordField getUserpwd() {
		return userpwd;
	}
	
	

}
