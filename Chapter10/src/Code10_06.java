public class Code10_06 {
	static int hap_para2(int v1, int v2) {
		int result;
		result = v1 + v2;
		return result;
	}
	static int hap_para3(int v1, int v2, int v3) {
		int result;
		result = v1 + v2 + v3;
		return result;
	}
	
	public static void main(String[] args) {
		int hap;
		hap = hap_para2(10, 20);
		System.out.println("매개변수 2개 메서드 호출 결과 ==> " + hap);
		
		hap = hap_para3(10, 20, 30);
		System.out.println("매개변수 3개 메서드 호출 결과 ==> " + hap);
	}

}
