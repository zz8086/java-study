
public class Code11_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = {10, 20, 30};
		
		try {
			ary[3] = 1234;
		} catch (Exception e) {
			System.out.println("오류 발생! 확인해 보세요~");
		}
	}

}
