package AutomationLearning;

import java.util.HashSet;
import java.util.Set;

public class printDuplicatesfromArray {
    public static void main(String []args){
    int [] a={1,2,4,1,6,7,3,2,8,4,10};  //1,2,4

    Set<Integer> s=new HashSet<>();
    for(int n:a) {
        if(s.add(n)==false){
            System.out.print(n+" ");
        }
    }
    }

}
