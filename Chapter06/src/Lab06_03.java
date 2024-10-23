
public class Lab06_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice1, dice2, dice3, i;
		dice1 = 0;
		dice2 = 0;
		dice3 = 0;
		i = 0;
		
		while(true) 
		{
		dice1 = (int)(Math.random() * 6) + 1;
		dice2 = (int)(Math.random() * 6) + 1;
		dice3 = (int)(Math.random() * 6) + 1;
		
		i++;
		
		if((dice1 == dice2) && (dice1 == dice3))
			{
				System.out.println("3개 주사위는 모두 " + dice1 + "입니다.");
				System.out.println("같은 숫자가 나올 때까지 " + i + "번 던졌습니다.");
				break;
			}		
		
		}
	}

}
