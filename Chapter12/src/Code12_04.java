import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Code12_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("체크박스");
		frame.setLayout(new FlowLayout());
		
		JCheckBox check1 = new JCheckBox("클릭하세요");
		check1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check1.isSelected())
					JOptionPane.showMessageDialog(null, "체크박스 ON");
				else
					JOptionPane.showMessageDialog(null, "체크박스 OFF");
			}
		});
		frame.add(check1);
		
		frame.setSize(250, 250);
		frame.setVisible(true);
	}

}
