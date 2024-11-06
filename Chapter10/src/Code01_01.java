
public class Code01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int diceNum;
		
		System.out.println("A님, 주사위를 던집니다~");
		diceNum = (int) ((Math.random() * 6) + 1);
		System.out.println("결과 : " + diceNum);
		
		System.out.println("B님, 주사위를 던집니다~");
		diceNum = (int) ((Math.random() * 6) + 1);
		System.out.println("결과 : " + diceNum);
		
		System.out.println("C님, 주사위를 던집니다~");
		diceNum = (int) ((Math.random() * 6) + 1);
		System.out.println("결과 : " + diceNum);
	}

}
