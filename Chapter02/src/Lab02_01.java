import java.util.Scanner;
public class Lab02_01  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int gram, result;
		String Person, address;
		
		System.out.println("## 택배 보내기입니다. 다음을 각각 입력하세요 ##");
		System.out.print("받는 사람 : ");
		Person = s.nextLine();
		
		System.out.print("주소 : ");
		address = s.nextLine();

		System.out.print("무게(g) : ");
		gram = s.nextInt();

		result = gram * 5;

		System.out.println("** 받는 사람 ==> " + Person);
		System.out.println("** 주소 ==> " + address);
		System.out.println("** 배송비 ==> " + result + "점");
		s.close();
		
	}

}
