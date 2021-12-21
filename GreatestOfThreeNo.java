package talentBattleBasicsProgram;
import java.util.Scanner;
public class GreatestOfThreeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number1:");
		int a1=sc.nextInt();
		System.out.println("Enter a Number2:");
		int a2=sc.nextInt();
		System.out.println("Enter a Number3:");
		int a3=sc.nextInt();
		
		if(a1>a2)
		{
			if(a1>a3)
			{
				System.out.println("No.1 is greater");
			}
			
		}else if(a2>a3)
		{
			if(a2>a1)
			{
				System.out.println("No.2 is greater");
			}
		}
		else
		{
			System.out.println("No.3 is greater");
		}
		
		

	}

}
