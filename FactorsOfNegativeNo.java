package talentBattleBasicsProgram;

public class FactorsOfNegativeNo {

	public static void main(String[] args) {
		int number=-60;
		for(int i=number;i<=Math.abs(number);i++)
		{
			if(i==0)//used to skip exception divided by zero
			{
				continue;
			}
			else {
				if(number%i==0)
				{
					System.out.print(i+" ");
				}
			}
			
		}

	}

}
