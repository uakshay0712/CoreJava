package CompetitiveCoding;

public class CamelCase {
    public static int camelcase(String s) {

        int count=1;
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)){
                count ++;
            }
        }
        return count;
    }
}

