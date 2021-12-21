package talentBattleBasicsProgram;

public class ArmstrongNoNDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=1634,originalNumber,result=0,n=0,remainder;
		originalNumber=number;
		for( ; originalNumber!=0; originalNumber/=10,n++);
		originalNumber=number;
		for(;originalNumber!=0;originalNumber/=10)
		{
			remainder=originalNumber%10;
			result+=Math.pow(remainder, n);
		}
		if(result==number)
		{
			System.out.println(number+" is armstrog number");
		}
		else
		{
			System.out.println(number+" is not armstrong number");
		}

	}

}
