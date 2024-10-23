import java.util.Scanner;
public class Lab05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int age;
		
		System.out.print("나이 입력 ==> ");
		age = s.nextInt();
		
		if (age >= 18)
		{
			System.out.println("즐거운 시간 보내세요.^^");
		}
		else
		{
			System.out.println("나갈 시간입니다.");
		}
		System.out.print("협조 감사합니다.");
		
		s.close();
	}

}
