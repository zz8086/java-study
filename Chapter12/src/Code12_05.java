import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Code12_05 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("라디오버튼");
		frame.setLayout(new FlowLayout());
		
		JRadioButton radio1 = new JRadioButton("뉴진스");
		JRadioButton radio2 = new JRadioButton("블랙핑크");
		JRadioButton radio3 = new JRadioButton("트와이스");
		frame.add(radio1);
		frame.add(radio2);
		frame.add(radio3);
		
		ButtonGroup grp = new ButtonGroup();
		grp.add(radio1);
		grp.add(radio1);
		grp.add(radio1);
		
		frame.setSize(250, 250);
		frame.setVisible(true);
	}
}
