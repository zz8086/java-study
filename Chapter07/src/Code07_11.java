class Rabbit {
	String shape;
	int xPos;
	int yPos;
	
	Rabbit(String value)
	{
		shape = value;
		
	}
	
	void setPosition(int x, int y)
	{
			xPos = x;
			yPos = y;
	}
}


public class Code07_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rabbit rabbit1 = new Rabbit("원");
		Rabbit rabbit2 = new Rabbit("삼각형");
		Rabbit rabbit3 = new Rabbit("토기");
		
		System.out.printf("토기1 객체의 모양은 [%s]입니다.\n", rabbit1.shape);
		System.out.printf("토기1 객체의 모양은 [%s]입니다.\n", rabbit2.shape);
		System.out.printf("토기1 객체의 모양은 [%s]입니다.\n", rabbit3.shape);
	}

}
