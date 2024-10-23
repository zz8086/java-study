
public class Lab03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res;
		
		res = 0;
		res -= 900 * 10; // 삼각김밥 10개 구입
		res -= 3500 * 5; // 도시락 5개 구입
		res += 1800 * 2; // 바나나맛 우유 2개 판매
		res += 4000 * 4; // 도시락 4개 판매
		res += 1500 * 1; // 콜라 1개 판매
		res += 2000 * 4; // 새우깡 4개 판매
		res += 1800 * 5; // 캔커피 5개 판매
		
		System.out.println("오늘 총매출액은 " + res + "원입니다.");
	}

}
