import java.util.Scanner;

public class Code10_03 {
	static int plus(int v1, int v2) {
		int result;
		result = v1 + v2;
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in)
				;
		int hap;
		int number1, number2;
		number1 = 0;
		number2 = 0;
		
		hap = plus(100, 200);
		System.out.println("100과 200의 plus() 메서드 결과 : " + hap);
		
		System.out.println("더 할 두 수를 입력");
		number1 = s.nextInt();
		number2 = s.nextInt();
		
		hap = plus(number1, number2);
		
		System.out.println("합계 ==> " + hap);
		s.close();
	}
}
