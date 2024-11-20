import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;

public class Code12_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("목록 선택");
		frame.setLayout(new FlowLayout());
		
		String[] petAry = {"고양이", "강아지", "토끼", "코알라", "미어캣"};
		
		JList list = new JList(petAry);
		frame.add(list);
		
		JComboBox combo = new JComboBox(petAry);
		frame.add(combo);
		
		frame.setSize(250, 250);
		frame.setVisible(true);
	}

}
