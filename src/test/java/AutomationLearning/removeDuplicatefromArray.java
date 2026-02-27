package AutomationLearning;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicatefromArray {
    public static void main(String [] args){

        int [] a={1,2,4,1,6,7,3,2,8,4,10};  //1, 2, 3, 4, 6, 7, 8, 10

        Set<Integer> s=new HashSet<Integer>();

        for(int n:a){
            s.add(n);
        }
        System.out.println(s);
    }
}
