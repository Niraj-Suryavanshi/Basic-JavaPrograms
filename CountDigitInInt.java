package talentBattleBasicsProgram;

public class CountDigitInInt {

	public static void main(String a[])
	{
	 int count = 0, num = 000344452;

	    while (num != 0) {
	      // num = num/10
	      num /= 10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);
	  }
	}