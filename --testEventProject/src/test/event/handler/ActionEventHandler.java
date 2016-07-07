package test.event.handler;

import java.awt.event.*;
import javax.swing.*;

import test.main.frame.MainFrame;

public class ActionEventHandler implements ActionListener{
	private JFrame parent;
	
	public ActionEventHandler(JFrame parent){
		this.parent = parent;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// 
		switch(e.getActionCommand()){
		case "로그인": 
					String userid = ((MainFrame)parent).getUserid().getText();//메인프레임은 k프레임의 후손이라서 다운캐스팅하고
					//getUserid 의값을 getText() 로 추출
					String userpwd = new String(((MainFrame)parent).getUserpwd().getPassword());
					
					System.out.println(userid + ", " + userpwd);
					break;
		case "취소":	int result = JOptionPane.showConfirmDialog(parent, "프로그램을 종료하시겠습니까?");
//					System.out.println("result : " + result);
					if(result == 0)
						System.exit(0);
		}
		//elf 문으로 aqual처리해도됨
		
	}

}
