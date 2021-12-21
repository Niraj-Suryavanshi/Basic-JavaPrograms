package talentBattleBasicsProgram;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="at",reverseStr="";
		int strLength=str.length();
		for(int i=(strLength-1);i>=0;i--)
		{
			reverseStr=reverseStr+str.charAt(i);
		}
		if(str.toLowerCase().equals(reverseStr.toLowerCase()))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}

	}

}
