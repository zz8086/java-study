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

public class Code07_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rabbit rabbit1 = new Rabbit();
		Rabbit rabbit2 = new Rabbit();
		Rabbit rabbit3 = new Rabbit();
		
		rabbit1.shape = "원";
		rabbit2.shape = "삼각형";
		rabbit3.shape = "토끼";
		
		rabbit1.setposition(100, 100);
		rabbit2.setposition(-100, 100);
		rabbit3.setposition(0, -100);;
	}

}
