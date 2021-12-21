package talentBattleBasicsProgram;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=331,remainder,originalNumber,result=0;
		
		originalNumber=number;
		while(originalNumber!=0)
		{
			remainder=originalNumber%10;
			result+=Math.pow(remainder, 3);
			originalNumber/=10;
			
		}
		if(result==number)
		{
			System.out.println(number+" is armstrong");
		}
		else
		{
			System.out.println(number+" is not a armstrong");
		}

	}

}
