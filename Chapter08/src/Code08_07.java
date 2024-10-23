abstract class Rabbit {
	String shape;
	int xPos;
	int yPos;
	
	void move(int x, int y) {
		this.xPos = x;
		this.yPos = y;
	}
}

class HouseRabbit extends Rabbit {
}

class MountainRabbit extends Rabbit {
}

public class Code08_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Rabbit rabbit = new Rabbit(); 추상 클래스는 객체로 만들 수 없음
		HouseRabbit hRabbit = new HouseRabbit();
		System.out.println("집토끼 객체 생성~~~");
		MountainRabbit mRabbit = new MountainRabbit();
		System.out.println("산토끼 객체 생성~~~");
	}

}
