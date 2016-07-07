package gui.first;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Button2Click implements ActionListener{ // 별도로 작성할떄.
	private JFrame parent;
	
public Button2Click(JFrame parent){
	this.parent = parent;
}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(parent, e.getActionCommand() + "버튼 누름"); // (보여줄 애, 전달받는애)
		
	}

}
