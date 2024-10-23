
public class Code04_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "    한글    ABCD efgh  ";
		String cutStr = "";
		
		cutStr = str.trim();
		
		System.out.println("기존 문자열 ==> [" + str +"]");
		System.out.println("공백 제거 ==> ["+ cutStr +"]");
	}

}
