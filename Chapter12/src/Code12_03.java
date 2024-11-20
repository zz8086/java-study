import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Code12_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("버튼");
		frame.setLayout(new FlowLayout());
		
		JButton button1 = new JButton("Click");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼을 눌렀군요 ^^");;
			}
		});
		frame.add(button1);
		
		frame.setSize(250, 250);
		frame.setVisible(true);
	}

}
