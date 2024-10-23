import java.util.Scanner;
public class Code04_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String var1, var2;
		int diff;
		
		System.out.print("첫 번째 문자열 ==> ");
		var1 = s.nextLine();
		System.out.print("두 번째 문자열 ==> ");
		var2 = s.nextLine();
		
		diff = var1.length() - var2.length();
		System.out.println("두 문자열 길이의 차이는 " + diff + "입니다.");
		s.close();
	}

}
