class Rabbit {
	Rabbit () {
		System.out.println("1. 슈퍼 클래스(토끼)의 생성자가 호출됩니다.");
	}
}

class HouseRabbit extends Rabbit {
	HouseRabbit () {
		System.out.println("2. 서브 클래스(집토끼)의 생성자가 호출됩니다.");
	}
	
}
public class Code08_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseRabbit hRabbit = new HouseRabbit();
	}
}
