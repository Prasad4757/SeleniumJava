package AutomationLearning;

import java.util.HashMap;
import java.util.Map;

public class printDuplicateCharatcer {

    public static void main(String []args){
        String s="automationtesting";
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1);

            }
            else{
                int count=hm.get(s.charAt(i));
                hm.put(s.charAt(i),count+1);
            }
        }

        for(Map.Entry<Character,Integer>z:hm.entrySet()){
            if(z.getValue()>1){
                System.out.print(z.getKey()+" ");
            }
        }
    }
}
