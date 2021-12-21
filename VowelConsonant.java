package talentBattleBasicsProgram;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Character");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("Character is Vowel");
		}
		else
		{
			System.out.println("Character is Consonant");
		}
	}

}
