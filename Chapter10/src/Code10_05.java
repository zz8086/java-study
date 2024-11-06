public class Code10_05 {
	static int para3_method(int v1, int v2, int v3) {
		int result;
		result = v1 + v2 + v3;
		return result;
	}
	
	public static void main(String[] args) {
		int hap;
		hap = para3_method(10, 20, 30);
		System.out.println("매개변수 3개 메서드 호출 결과 ==> " + hap);
	}

}
