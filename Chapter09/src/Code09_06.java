import java.util.Arrays;
public class Code09_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ary[] = {10, 20, 30};
		
		System.out.println("현재 배열 길이 : " + ary.length);
		System.out.print("현재 배열의 내용 : ");
		for (int i = 0; i < ary.length; i++)
		{
			System.out.print(ary[i] + " ");
		}
		System.out.println();
		
		ary = Arrays.copyOf(ary,  ary.length + 2);
		
		System.out.println("새 배열 길이 : " + ary.length);
		System.out.print("새 배열의 내용 : ");
		for (int i = 0; i < ary.length; i++)
		{
			System.out.print(ary[i] + " ");
		}
		System.out.println();

	}

}
