import java.io.FileWriter;

public class Code11_04 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:/FirstJava/Chapter11/myData2.txt");
		String outStr;
		
		outStr = "르세라핌";
		fw.write(outStr + "\n");
		
		outStr = "아이브";
		fw.write(outStr + "\n");
		
		outStr = "뉴진스";
		fw.write(outStr + "\n");
		
		fw.close();
		System.out.println("--- myData2.txt 파일이 저장됨 ---");
	}

}
