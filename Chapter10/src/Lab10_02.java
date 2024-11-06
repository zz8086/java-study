import java.util.Arrays;
public class Lab10_02 {
	static int[] lotto() {

	int[] num = {0, 0, 0, 0, 0, 0};

	for(int i = 0; i < num.length; i++) {
		num[i] = (int) ((Math.random() * 45) + 1);

		for (int j = 0; j < i; j++) {
			if (num[i] == num[j]) {
			i--;
			break;
			}
		}
	}
	
	return num;

	}
	
	public static void main(String[] args) {
	
		int[] lottonumber;

		System.out.println("** 로또 추첨을 시작합니다. **");
		lottonumber = lotto();
		
		Arrays.sort(lottonumber);
		
		System.out.println("오늘의 로또 번호 ==> " + Arrays.toString(lottonumber)); 

	}
}