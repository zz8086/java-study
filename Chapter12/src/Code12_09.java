import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Code12_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("FlowLayout 연습");
		
		frame.setLayout(new FlowLayout(FlowLayout.RIGHT,15,15));
		
		JButton btn1 = new JButton("버튼1");
		frame.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		frame.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		frame.add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		frame.add(btn4);
		
		JButton btn5 = new JButton("버튼5");
		frame.add(btn5);
		
		frame.setSize(250, 250);
		frame.setVisible(true);
	}

}
