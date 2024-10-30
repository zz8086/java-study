import java.util.Scanner;
public class Code09_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int numAry[] = new int[4];
		int hap = 0;
		
		for (int i = 0; i <= 3; i++)
		{
			System.out.print("numAry[" + i + "]의 넣을 숫자 : ");
			numAry[i] = s.nextInt();
		}
		
		
		for (int i = 0; i <= 3; i++)
		{
			hap += numAry[i];
		}
		
		System.out.println("합계 ==> " + hap);
		
		s.close();
	}

}
