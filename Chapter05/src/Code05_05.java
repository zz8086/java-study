import java.util.Scanner;
public class Code05_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.print("숫자 입력 ==> ");
		num = s.nextInt();
		
		if (num % 2 == 0)
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");
		
		s.close();
	}

}
