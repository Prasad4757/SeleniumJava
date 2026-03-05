package AutomationLearning;

import java.util.ArrayList;

public class List<W> {
    public static void main(String []args){
        ArrayList<Integer> ls=new ArrayList<Integer>();
        ls.add(10);
        ls.add(20);
        ls.add(40);
        ls.add(50);
        ls.add(25);
        ls.set(1,200);
        System.out.println(ls.isEmpty());
        System.out.println(ls.get(2));//40
        ls.remove(0);//10
        System.out.println(ls.get(0));






    }
}
