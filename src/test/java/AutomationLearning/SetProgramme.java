package AutomationLearning;

import java.util.HashSet;
import java.util.Set;

public class SetProgramme {
    public static void main(String []args){
        Set<Integer> s=new HashSet<Integer>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(40);
        System.out.println(s.contains(40));
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.remove(40);
        System.out.print(s.size());


    }

}
