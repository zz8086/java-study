abstract class Rabbit {
	String shape;
	int xPos;
	int yPos;
	
	void move(int x, int y) {
		this.xPos = x;
		this.yPos = y;
	}
	
	abstract void sleep();
}

class HouseRabbit extends Rabbit {
	void sleep() {
		System.out.println("집토기가 우리에서 잠자고 있습니다.");
	}
}

class MountainRabbit extends Rabbit {
	void sleep() {
		System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
	}
}
public class Code08_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseRabbit hRabbit = new HouseRabbit();
		MountainRabbit mRabbit = new MountainRabbit();
		
		hRabbit.sleep();
		mRabbit.sleep();
	}

}
