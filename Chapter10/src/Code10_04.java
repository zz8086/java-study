
public class Code10_04 {
	static int para2_method(int v1, int v2) {
		int result;
		result = v1 + v2;
		return result;
	}
	
	public static void main(String[] args) {
		int hap;
		hap = para2_method(10, 20);
		System.out.println("매개변수 2개 메서드 호출 결과 ==> " + hap);
	}
}