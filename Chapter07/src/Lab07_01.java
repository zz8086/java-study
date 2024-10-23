import java.util.Scanner;
class Rabbit {
	String shape;
	int xPos;
	int yPos;
	
	void setposition(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
}

public class Lab07_01 {
	public static void main(String[] args) {
		Rabbit rabbit;
		
		rabbit = new Rabbit();
		rabbit.shape = "토끼";
		
		Scanner s = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		while(true)
		{
		System.out.print("토끼가 이동할 x좌표 ==> ");
		x = s.nextInt();
		System.out.print("토끼가 이동할 y좌표 ==> ");
		y = s.nextInt();
		rabbit.setposition(x, y);
		System.out.println("** 토끼의 현재 위치는 (" + x + "," + y + ")입니다.");
		}
	}
}
