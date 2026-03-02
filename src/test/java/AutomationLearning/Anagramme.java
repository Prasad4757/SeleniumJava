package AutomationLearning;

import java.util.Arrays;

public class Anagramme {

    public static void main(String []args){
        String s1="listen";
        String s2="silent";

        char [] s11=s1.toCharArray();
        char [] s22=s2.toCharArray();

        Arrays.sort(s11);
        Arrays.sort(s22);
        if(Arrays.equals(s11,s22)){
            System.out.println("String is anagramme");
        }
        else{
            System.out.println("String is not anagramme");
        }

    }
}
