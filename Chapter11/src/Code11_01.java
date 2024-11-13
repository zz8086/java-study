import java.io.BufferedReader;
import java.io.FileReader;

public class Code11_01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("C:/FirstJava/Chapter11/myData1.txt"));
		String inStr;
		
		inStr = br.readLine();
		System.out.println(inStr);
		
		inStr = br.readLine();
		System.out.println(inStr);
		
		inStr = br.readLine();
		System.out.println(inStr);
		
		br.close();
	}

}
