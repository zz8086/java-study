import java.util.Scanner;
public class a {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score;
		
		System.out.print("점수 입력 ==> ");
		score = s.nextInt();
		
		if (score <= 59)
			System.out.print("F");
		else
			if (score <= 69)
				System.out.print("D");
			else
				if (score <= 79)
					System.out.print("C");
				else
					if (score <= 89)
						System.out.print("B");
					else
						System.out.print("A");
		
		System.out.println(" 학점입니다.");
		s.close();
	}
}