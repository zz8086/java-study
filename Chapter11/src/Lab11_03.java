import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Lab11_03 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("모드를 선택하세요 (0: 암호화, 1: 복호화): ");
        int number = s.nextInt();
        s.nextLine();  // Enter key 입력 소비

        if (number == 0) {
            // 암호화 모드
            try (FileWriter fw = new FileWriter("C:/FirstJava/Chapter11/secure.txt")) {
                while (true) {
                    System.out.print("스파이에게 전달할 메시지 ==> ");
                    String inStr = s.nextLine();
                    if (inStr.equals("")) break;

                    StringBuilder encryption = new StringBuilder();
                    for (int i = 0; i < inStr.length(); i++) {
                        int num = (int) inStr.charAt(i);
                        num += 100;
                        encryption.append((char) num);
                    }
                    fw.write(encryption.toString() + "\n");
                }
                System.out.println("--- 메시지가 암호화되어 저장되었습니다 ---");
            }
        } else if (number == 1) {
            // 복호화 모드
            try (BufferedReader br = new BufferedReader(new FileReader("C:/FirstJava/Chapter11/secure.txt"))) {
                String encryptedLine;
                while ((encryptedLine = br.readLine()) != null) {
                    StringBuilder decryption = new StringBuilder();
                    for (int i = 0; i < encryptedLine.length(); i++) {
                        int num = (int) encryptedLine.charAt(i);
                        num -= 100;
                        decryption.append((char) num);
                    }
                    System.out.println("복호화된 메시지: " + decryption.toString());
                }
            }
        } else {
            System.out.println("잘못된 입력입니다. 0 또는 1을 입력해주세요.");
        }
        s.close();
    }
}
