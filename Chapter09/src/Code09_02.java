import java.util.Scanner;
public class Code09_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int numAry[] = new int[4];
		int hap = 0;
		
		System.out.print("숫자 : ");
		numAry[0] = s.nextInt();
		System.out.print("숫자 : ");
		numAry[1] = s.nextInt();
		System.out.print("숫자 : ");
		numAry[2] = s.nextInt();
		System.out.print("숫자 : ");
		numAry[3] = s.nextInt();
		
		hap = numAry[0] + numAry[1] + numAry[2] + numAry[3];
		System.out.println("합계 ==> " + hap);
		
		s.close();
		
	}

}
