import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Code12_02 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("레이블");
		frame.setLayout(new FlowLayout());
		
		JLabel label1 = new JLabel("난생처음~~ 자바를");
		frame.add(label1);
		
		JLabel label2 = new JLabel("열심히");
		label2.setForeground(Color.RED);
		Font font = new Font("궁서 보통", Font.BOLD, 30);
		label2.setFont(font);
		frame.add(label2);
		
		JLabel label3 = new JLabel("코딩 중 입니다.");
		label3.setOpaque(true);
		label3.setBackground(Color.YELLOW);
		frame.add(label3);
		
		frame.setSize(250, 250);
		frame.setVisible(true);;
		
	}

}
