package AutomationLearning;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class findDuplicateCharacter {
    public static void main(String []args){
        String s="automationtesting";
       Set<Character> hs=new HashSet<Character>();
       for(char ch: s.toCharArray()){
           if(hs.add(ch)==false){
               System.out.print(ch+" ");

           }
       }
    }
}
