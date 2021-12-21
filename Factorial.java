package talentBattleBasicsProgram;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=6;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is:"+fact);
		int no1=0;
		int no2=1;
		System.out.println("Fibonacci series is:");
		System.out.print(no1+" "+no2+" ");
		for(int i=2;i<num;i++)
		{
			
			int sum=no1+no2;
			System.out.print(" "+sum+" ");
			no1=no2;
			no2=sum;
			
		}
	
		

	}

}
