import java.util.Scanner;
public class Lab03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double lbnum, kgnum;
		double kgres, lbres;
		
		System.out.print("파운드(lb)를 입력하세요: ");
		lbnum = s.nextDouble();
		kgres = lbnum * 0.453592;
		System.out.println(lbnum + "파운드(lb)는 " + kgres + "킬로그램(kg)입니다.");
		System.out.print("킬로그램(kg)을 입력하세요: ");
		kgnum = s.nextDouble();
		lbres = kgnum * 2.204623;
		System.out.println(kgnum + "킬로그램(kg)은 " + lbres + "파운드(lb)입니다.");
		s.close();
		
	}

}
