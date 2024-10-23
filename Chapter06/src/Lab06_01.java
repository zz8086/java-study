
public class Lab06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, result;
		num = 5;
		result = 1;
		
		for(int i = 1; i <= num; i++)
		{
			result *= i;
		}
		System.out.println("A, B, C, D, E 학생들을 순서대로 세우는 경우의 수 : " + result);
	}

}