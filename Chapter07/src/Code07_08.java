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

public class Code07_08 {
	public static void main(String[] args) 
	{
		Rabbit rabbit1 = new Rabbit();
		Rabbit rabbit2 = new Rabbit();
		Rabbit rabbit3 = new Rabbit();
		
		rabbit1.shape = "원";
		rabbit2.shape = "삼각형";
		rabbit3.shape = "토끼";
		
	}
}
