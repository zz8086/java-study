public class Lab04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var1 = "Java";
		String var2;
		
		System.out.println("원본 문자열 ==>" + var1);
		
		var2 = var1.substring(0,1).toLowerCase();
		var2 += var1.substring(1,4).toUpperCase();
		System.out.print("변환 문자열 ==>" + var2);
		
		
	}

}
