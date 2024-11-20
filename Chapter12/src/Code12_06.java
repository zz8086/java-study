import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Code12_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("이미지 넣기");
		frame.setLayout(new FlowLayout());
		
		ImageIcon img1 = new ImageIcon("C:/FirstJava/Chapter12/a.png");
		ImageIcon img2 = new ImageIcon("C:/FirstJava/Chapter12/b.png");
		
		JLabel label1 = new JLabel(img1);
		frame.add(label1);
		
		JButton button1 = new JButton("클릭", img2);
		frame.add(button1);
		
		frame.setSize(250, 250);
		frame.setVisible(true);
	}

}
