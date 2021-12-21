package talentBattleBasicsProgram;

public class PalindromeNo {

	public static void main(String[] args) {

		int num=131211;
		int original=num;
		int reversedNo=0;
		int remainder;
		while(num!=0)
		{
			remainder=num%10;
			reversedNo=reversedNo*10+remainder;
			num/=10;
		}
		
		if(reversedNo==original)
		{
			System.out.println("No is palindrome no");
		}
		else
		{
			System.out.println("No is not a palindrome no");
		}
	}

}
