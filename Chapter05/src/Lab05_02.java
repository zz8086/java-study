import java.util.Scanner;
public class Lab05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String strArray[] = {"가위", "바위", "보"};
		String var1, comHand;
		
		int rnd = (int) (Math.random() * strArray.length);
		comHand = strArray[rnd];
		
		System.out.print("나의 가위/바위/보 ==> ");
		var1 = s.nextLine();
		
		System.out.println("컴퓨터의 가위/바위/보 ==> " + comHand);
		
		if(var1.equals("가위"))
		{
			if(comHand.equals("가위"))
			{
				System.out.println("비겼습니다. ㅡ.ㅡ");
			}
			else if(comHand.equals("보"))
			{
				System.out.println("이겼습니다. ^^");
			}
			else if(comHand.equals("바위"))
			{
				System.out.println("졌습니다. ㅠㅠ");
			}
			
		}
		else if(var1.equals("바위"))
		{
			if(comHand.equals("가위"))
			{
				System.out.println("이겼습니다. ^^");
			}
			else if(comHand.equals("보"))
			{
				System.out.println("졌습니다. ㅠㅠ");
			}
			else if(comHand.equals("바위"))
			{
				System.out.println("비겼습니다. ㅡ.ㅡ");
			}
			
		}
		else if(var1.equals("보"))
		{
			if(comHand.equals("가위"))
			{
				System.out.println("졌습니다. ㅠㅠ");
			}
			else if(comHand.equals("보"))
			{
				System.out.println("비겼습니다. ㅡ.ㅡ");
			}
			else if(comHand.equals("바위"))
			{
				System.out.println("이겼습니다. ^^");
			}
			
		}
	
		s.close();
	}

}
