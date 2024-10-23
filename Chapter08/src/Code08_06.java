class Rabbit {
	int xPos;
	int yPos;
	
	void move(int x, int y) {
		this.xPos = x;
		this.yPos = y;
	}
}

class HouseRabbit extends Rabbit {
	void move(int x, int y) {
		this.xPos = x;
		this.yPos = y;
		
		if (this.xPos > 100)
			this.xPos = 100;
		if (this.yPos > 100)
			this.yPos = 100;
	}
}

class MountainRabbit extends Rabbit {
	
}

public class Code08_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseRabbit hRabbit = new HouseRabbit();
		MountainRabbit mRabbit = new MountainRabbit();
		
		hRabbit.move(500, 500);
		mRabbit.move(500, 500);
		
		System.out.printf("집토기 위치: (%d, %d) \n", hRabbit.xPos, hRabbit.yPos);
		System.out.printf("산토기 위치: (%d, %d) \n", mRabbit.xPos, mRabbit.yPos);
	}

}
