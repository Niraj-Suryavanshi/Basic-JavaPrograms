package talentBattleBasicsProgram;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a No.");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		if(no%2==0)
		{
			System.out.println("No. is Even");
		}
		else
		{
			System.out.println("No. is Odd");
		}
		

	}

}
