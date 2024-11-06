import java.util.Scanner;

public class Lab10_01 {
	static int ca(int v1, int v2, char op) {
		int result;
		result = 0;
		
		if (op == '+') result = v1 + v2;
		if (op == '-') result = v1 - v2;
		if (op == '*') result = v1 * v2;
		if (op == '/') result = v1 / v2;
		
		return result;
		
	}
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			
			char a;
			int number1, number2;
			number1 = 0;
			number2 = 0;
			
			System.out.printf("계산 입력(+,-,*,/) :");
			a = s.next().charAt(0);
			
			System.out.printf("첫 번째 숫자 입력 : ");
			number1 = s.nextInt();
			
			System.out.printf("두 번째 숫자 입력 : ");
			number2 = s.nextInt();
			
			System.out.println("계산 결과 : " + ca(number1, number2, a));
			
	}
}