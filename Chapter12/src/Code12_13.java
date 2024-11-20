import javax.swing.JButton;
import javax.swing.JFrame;

public class Code12_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("null 레이아웃");
		
		frame.setLayout(null);
		
		JButton btn1 = new JButton("버튼1");
		btn1.setBounds(50, 50, 70, 60);
		frame.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.setBounds(80, 80, 70, 60);
		frame.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.setBounds(110, 110, 70, 60);
		frame.add(btn3);
		
		frame.setSize(250, 250);
		frame.setVisible(true);
	}

}
