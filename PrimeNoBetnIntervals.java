package talentBattleBasicsProgram;

public class PrimeNoBetnIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=10;
		int end=20;
		while(start<end)
		{
			boolean flag=false;
			for(int i=2;i<=start/2;i++)
			{
				if(start%i==0)
				{
					flag=true;
					break;
				}
			}
			
			if(!flag&&start!=0&&start!=1)
			{
				System.out.printf(start+" ");
			}
			
			start++;
		}

	}

}
