import java.io.FileInputStream;
import java.io.FileOutputStream;

public class image_io {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:/FirstJava/Chapter11/sun.png");
		FileOutputStream fos = new FileOutputStream("C:/FirstJava/Chapter11/Sun_out.jpg");
		int ch;
		
		while ((ch = fis.read()) != -1) fos.write((byte) ch);
		
		fis.close();
		fos.close();
	}

}
