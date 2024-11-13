import java.io.FileWriter;
import java.util.Scanner;

public class Code11_05 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		FileWriter fw = new FileWriter("C:/FirstJava/Chapter11/myData3.txt");
		String inStr;
		
		while(true) {
			System.out.print("좋아하는 가수는 ? ");
			inStr = s.nextLine();
			if (inStr.equals(""))
				break;
			fw.write(inStr + "\n");
		}
		
		fw.close();
		System.out.println("--- myData3.txt 파일이 저장됨 ---");
	}

}
