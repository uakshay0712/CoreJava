package CompetitiveCoding;

public class AlternatingCharacter {

	public static int alternatingCharacter(String s) {
		int c=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }
        }
        return c++;

		

	}

}
