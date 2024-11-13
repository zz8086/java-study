import java.io.BufferedReader;
import java.io.FileReader;

public class Lab11_01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("C:/FirstJava/Chapter11/myData1.txt"));
		String inStr;
		int number = 0;
	
		while(true) {
		number++;			
		inStr = br.readLine();
			if (inStr == null)
				break;
			System.out.println(number + " : " + inStr);
		}
		br.close();
	}
}