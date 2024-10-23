class Rabbit {
	private String shape;
	private int xPos;
	private int yPos;
	
	
	void setPosition(int x, int y) {
		xPos = x;
		xPos = y;
	}
}

public class Code07_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Rabbit rabbit = new Rabbit();
		
		rabbit.setPosition(100, 200);
		rabbit.xPos = 100;
		rabbit.yPos = 200;
	} 

}
