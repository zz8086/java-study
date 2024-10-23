import java.util.Scanner;
public class Ex03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int right, forward;
		
		Turtle turtle = new Turtle();
		
		turtle.width(5);
		turtle.penColor("blue");
		
		while(true) {
			System.out.print("거북이의 회전 각도: ");
			right = s.nextInt();
			turtle.right(right);
			
			System.out.print("거북이의 이동 거리: ");
			forward = s.nextInt();
			turtle.forward(forward);
		}
	}

}
