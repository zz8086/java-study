
public class Code09_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ary = new int[3][4];
		int value = 1;
		
		for (int i = 0; i < 3; i++)
		{
			for (int k = 0; k < 4; k++)
			{
				ary[i][k] = value;
				value++;
			}
		}
		
		System.out.printf("ary[0][0]부터 ary[2][3]까지 출력 \n");
		for (int k = 0; k < 4; k++)
		{
			for (int i = 0; i < 3; i++)
			{
				System.out.printf("%3d ", ary[i][k]);
			}
			System.out.printf("\n");
		}
	}

}
