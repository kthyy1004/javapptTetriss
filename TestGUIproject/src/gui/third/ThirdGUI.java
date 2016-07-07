package gui.third;

import java.awt.*;

import javax.swing.*;

public class ThirdGUI extends JFrame{
	public ThirdGUI(){
		this.setTitle("third gui");
		this.setBounds(new Rectangle(100, 100, 600, 74)); // Rectangle 메소드 사용해서 작성방법
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		this.setLayout(new BorderLayout());
		
		this.add(new JButton("one"), BorderLayout.NORTH); // "one" 이라는 버튼은 북쪽에 배치한다.
		this.add(new JButton("two"), BorderLayout.WEST); // "two"는 서쪽에 배치한다.
		this.add(new JButton("third"), BorderLayout.CENTER); // "third"는 가운데 배치한다.
		this.add(new JButton("fourth"), BorderLayout.EAST); // 동쪽에 배치하라
		this.add(new JButton("fifth"), BorderLayout.SOUTH); // 남쪽에 배치하라
		
		
		
		this.setVisible(true);
	}

}
