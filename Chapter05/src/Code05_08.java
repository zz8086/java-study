import java.util.Scanner;
public class Code05_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int score;
		
		System.out.print("점수 입력 ==> ");
		score = s.nextInt();
		
		if (score >= 90)
			System.out.print("A");
		else if (score >= 80)
			System.out.print("B");
		else if (score >= 70)
			System.out.print("C");
		else if (score >= 60)
			System.out.print("D");
		else
			System.out.print("F");
		
		System.out.println(" 학점입니다.");
		s.close();
	}

}
