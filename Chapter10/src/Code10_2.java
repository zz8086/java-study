
public class Code10_2 {
	static void drawDice() {
		int diceNum;
		diceNum = (int) ((Math.random() * 6) + 1);
		// Math.random() * 6으로 하면 0 ~ 6 범위
		// 5번째줄에 소스 코드가 있으면 1 ~ 6 범위
		System.out.println("결과 : " + diceNum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A님, 주사위를 던집니다~");
		drawDice();
		
		System.out.println("B님, 주사위를 던집니다~");
		drawDice();
		
		System.out.println("C님, 주사위를 던집니다~");
		drawDice();
	}

}
