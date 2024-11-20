import javax.swing.JFrame;
public class Code12_01 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JFrame frame1 = new JFrame();
		JFrame frame2 = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("기본 윈도우 창");
		
		frame.setSize(500, 500);
		frame.setVisible(true);;
		
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setTitle("기본 윈도우 창1");
		
		frame1.setSize(1920, 1200);
		frame1.setVisible(true);;
		
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setTitle("기본 윈도우 창2");
		
		frame2.setSize(250, 250);
		frame2.setVisible(true);;
		
	}

}
