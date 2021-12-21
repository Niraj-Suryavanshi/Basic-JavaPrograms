package talentBattleBasicsProgram;

public class VowelsConsonants {

	public static void main(String[] args) {
		String str="mynameislakhan";
		char []ch=str.toCharArray();
		int length=ch.length;
		int vowel=0,consonants=0;
		for(int i=0;i<length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				vowel++;
			}
			else
			{
				consonants++;
			}
		}
		System.out.println("Vowels are:"+vowel);
		System.out.println("Consonants are"+consonants);
	}

}
