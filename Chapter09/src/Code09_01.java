import java.util.Scanner;
public class Code09_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num1, num2, num3, num4;
		int hap = 0;
		
		System.out.print("숫자 : ");
		num1 = s.nextInt();
		System.out.print("숫자 : ");
		num2 = s.nextInt();
		System.out.print("숫자 : ");
		num3 = s.nextInt();
		System.out.print("숫자 : ");
		num4 = s.nextInt();
		
		hap = num1 + num2 + num3 + num4;
		System.out.println("합계 ==> " + hap);
		
		s.close();
				
	}

}
