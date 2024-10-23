import java.util.Scanner;
public class Lab06_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int select, computerselect, i;
		i = 0;
		select = 0;
		computerselect = 0;
		
		while(true)
		{
			i++;
			System.out.print("게임 " + i + "회 : 컴퓨터가 생각한 숫자는? ");
			select = s.nextInt();
			
			computerselect = (int)(Math.random() * 5) + 1;
			
			if(select == computerselect)
			{
				System.out.println(" 맞혔네요. 축하합니다!!");
				System.out.println("게임을 마칩니다.");
				break;
			}
			
			System.out.println("아까워요." + computerselect + "였는데요." + "다시 해보세요. ㅠ");
			
		}
	}

}
