
public class Code07_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Turtle turtle = new Turtle();
		int curX, curY;
		
		turtle.shape("arrow");
		turtle.shapeSize(50, 50);
		turtle.down();
		turtle.left(45);
		turtle.forward(200);
		
		curX = (int) turtle.getX();
		curY = (int) turtle.getY();
		System.out.println("거북이 위치 ==>" + curX + "," + curY);
	}

}