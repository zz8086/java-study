import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


public class Lab11_02 {
	public static void main(String[] args) throws Exception {
	//StringBuilder sb = new StringBuilder();
	BufferedReader br = new BufferedReader(new FileReader("C:/FirstJava/Chapter11/myData1.txt"));
	FileWriter fw = new FileWriter("C:/FirstJava/Chapter11/newFile.txt");
	String copy;

	while(true) {
	copy = br.readLine();
	if (copy == null)
		break;
	fw.write(copy + "\n");
	}

	br.close();
	fw.close();
	System.out.println("--- myData1.txt가 newFile.txt로 복사되었음 ---");
	}
}