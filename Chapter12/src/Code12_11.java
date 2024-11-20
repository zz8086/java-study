import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Code12_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GridLayout 연습");
		
		frame.setLayout(new GridLayout(3, 3, 5, 5));
		
		JButton[] btn = new JButton[9];
		for (int i = 0; i < 9; i++) {
			btn[i] = new JButton("버튼" + (i + 1));
			frame.add(btn[i]);
			
		}
		
		frame.setSize(250, 250);
		frame.setVisible(true);
	}

}
