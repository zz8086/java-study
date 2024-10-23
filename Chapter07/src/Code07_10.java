class Rabbit {
	String shape;
	int xPos;
	int yPos;
	
	Rabbit() {
		shape = "토끼";
	}
	
	void setPosition(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
}

public class Code07_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rabbit rabbit = new Rabbit();
		
		System.out.printf("토끼 객체의 기본 모양은 [%s]입니다.", rabbit.shape);
	}

}
