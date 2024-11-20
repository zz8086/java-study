import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Code12_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("CardLayout 연습");
		
		frame.setLayout(new CardLayout(20, 20));
		
		JButton btn1 = new JButton("버튼 1");
		frame.add(btn1);
		JButton btn2 = new JButton("버튼 2");
		frame.add(btn2);
		JButton btn3 = new JButton("버튼 3");
		frame.add(btn3);
		
		frame.setSize(250, 250);
		frame.setVisible(true);
		
	}

}
