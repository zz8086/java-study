class Rabbit {
	private String shape;
	int xPos;
	int yPos;
	
	private void move(int x, int y) {
		this.xPos = x;
		this.yPos = y;
	}
}

class HouseRabbit extends Rabbit {
	String owner;
	void eatFeed() {
		System.out.println("집토기가 사료를 먹습니다.");
	}
}

public class Code08_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseRabbit hRabbit = new HouseRabbit();
		
		hRabbit.owner = "난생이";
		hRabbit.eatFeed();
		// hRabbit.shape = "삼각형"; Error
		// hRabbit.move(100, 100); Error
		hRabbit.xPos = 100;
		hRabbit.yPos = 100;
	}

}
