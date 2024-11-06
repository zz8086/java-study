public class Code10_11 {
	static int a = 100;
	
	static void method1() {
		int a = 200;
		System.out.println("method1()에서 a의 값 ==> " + a);
	}
	
	static void method2() {
		a = a + 1;
		System.out.println("method2()에서 a의 값 ==> " + a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		method2();
	}

}
