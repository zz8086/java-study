class Rabbit {
	private Turtle myTurtle = new Turtle();
	
	Rabbit(Turtle turtle) {
		this.myTurtle = turtle;
		System.out.println("** 토끼가 거북이 등에 올라탔습니다. **");
	}
	
	public void whereIsRabbit() {
		System.out.printf("거북이 등 위의 토끼 위치는 현재 (%d,%d)입니다.\n",
		(int)this.myTurtle.getX(), (int)this.myTurtle.getY());
	}
}

public class Ex07_01 {
	public static void main(String[] args) {
		int xPos, yPos;
		String[] colorStr = {"red", "green", "blue", "black", "magenta", "orange", "gray"};
		
		Turtle turtle = new Turtle();
		Rabbit rabbit = new Rabbit(turtle);
		
		turtle.speed(500);
		turtle.setCanvasSize(500, 500);
		turtle.width(5);
		
		for (int i = 0; i < 20; i++)
		{
			xPos = (int)(Math.random()*500 - 250);
			yPos = (int)(Math.random()*500 - 250);
			
			int colorNum = (int) (Math.random()*colorStr.length);
			turtle.penColor(colorStr[colorNum]);
			turtle.setPosition(xPos,yPos);
			rabbit.whereIsRabbit();
		}
	}
}