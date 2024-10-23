import java.util.Scanner;

public class Lab02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int number1, number2, result;
		double result1;
		
		System.out.print("함수1 ==>" );
		number1 = s.nextInt();
		
		System.out.print("함수2 ==>" );
		number2 = s.nextInt();
		
		result = number1 + number2;
		System.out.println(number1 + "+" + number2 + "=" + result);
		
		result = number1 - number2;
		System.out.println(number1 + "-" + number2 + "=" + result);
		
		result = number1 * number2;
		System.out.println(number1 + "x" + number2 + "=" + result);
		
		result1 = (double) number1 / number2;
		System.out.println(number1 + "/" + number2 + "=" + result1);
		
		result = number1 % number2;
		System.out.println(number1 + "%" + number2 + "=" + result);
	}

}
