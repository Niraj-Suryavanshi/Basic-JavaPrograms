package talentBattleBasicsProgram;
import java.util.Scanner;
public class FrequencyOfChar
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		 String str =sc.next();
	        char ch =sc.next().charAt(0);
	        int frequency = 0;

	        for(int i = 0; i < str.length(); i++) {
	            if(ch == str.charAt(i)) {
	                ++frequency;
	            }
	        }

	        System.out.println("Frequency of " + ch + " = " + frequency);

	}

}
