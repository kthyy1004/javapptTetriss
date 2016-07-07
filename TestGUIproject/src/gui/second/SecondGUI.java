package gui.second;

import java.awt.FlowLayout;

import javax.swing.*;

public class SecondGUI { // 상속받지않고 사용할떄
	private JFrame mainFrame; // 필드 선언하고
	private JButton okBtn, cancleBtn;
	private JTextField name;
	private JTextArea content;
	private JComboBox item;
	private JList color;
	private JCheckBox usd, ksw;
	private JSpinner amount;
	private JSlider grade;
	
	public SecondGUI(){}
	
	public void makeFrame(){ // 화면에 보여지는 메소드 작성
		mainFrame = new JFrame("second gui"); // 타이들바
		mainFrame.setBounds(100, 100, 1000, 500); // 좌표와 크기를 한번에 설정함.
		mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mainFrame.setLayout(new FlowLayout()); // 꽉차면 자동으로 밑줄로 내려간다 (배치방식 정한다.)
		
		// 컴포넌트를 만든다
		okBtn = new JButton("확인");
		cancleBtn = new JButton("취소");
		name = new JTextField(20);
		content = new JTextArea(5, 50); // (몇줄에,몇칸)
		usd = new JCheckBox("USD");
		ksw = new JCheckBox("KSW", true);
		
		String[] itemList = new String[]{"아이폰", "갤럭시폰", "아이패드", "갤럭시패드"}; // 배열을 만듬
		item = new JComboBox(itemList);
		
		String[] colorList = new String[]{"red", "yellow", "green", "blue", "black"};
		color = new JList(colorList);
		
		amount = new JSpinner(new SpinnerNumberModel(50, 1, 100, 1)); // Spinner 사용법 (자동 auto boxing 됨)
		
		grade = new JSlider(0, 10, 5);
		// 컴포넌트 끝
		
		// 여기서부터 배치한다.
		mainFrame.add(new JLabel("제품모델명 : "));
		mainFrame.add(name);
		mainFrame.add(new JLabel("제품선택 : "));
		mainFrame.add(item);
		mainFrame.add(new JLabel("색상선택 : "));
		mainFrame.add(color);
		mainFrame.add(new JLabel("수량 : "));
		mainFrame.add(amount);
		mainFrame.add(new JLabel("동급 : "));
		mainFrame.add(grade);
		mainFrame.add(new JLabel("통화단위 : "));
		mainFrame.add(usd);
		mainFrame.add(ksw);
		mainFrame.add(new JLabel("제품설명 : "));
		mainFrame.add(content);
		
		mainFrame.setVisible(true);
	}

	public static void main(String[] args) {
		new SecondGUI().makeFrame();
		

	}

}
