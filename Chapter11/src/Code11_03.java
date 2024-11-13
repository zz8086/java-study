import java.io.BufferedReader;
import java.io.FileReader;

public class Code11_03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new FileReader("C:/FirstJava/Chapter11/myData1.txt"));
		String inStr;
		
		while(true) {
			inStr = br.readLine();
			if (inStr == null)
				break;
			sb.append(inStr).append("\n");
		}
		
		br.close();
		
		sb.reverse();
		System.out.println(sb);
		
	}

}
