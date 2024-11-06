
public class Code10_10 {
	static int[] method3(int v1, int v2) {
		int res1, res2;
		res1 = v1 + v2;
		res2 = v1 - v2;
		return new int[] {res1, res2};
	}
	
	public static void main(String[] args) {
		int num1 = 100, num2 = 200;
		int[] resAry;
		
		resAry = method3(num1, num2);
		
		System.out.println("100+200 결과 : " + resAry[0]);
		System.out.println("100-200 결과 : " + resAry[1]);

	}

}
