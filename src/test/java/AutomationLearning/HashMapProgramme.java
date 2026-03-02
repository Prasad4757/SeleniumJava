package AutomationLearning;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgramme {
    public static void main(String[] args) {


        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put('a',1);
        hm.put('c',2);
        hm.put('e',3);
        hm.put('f',4);
        System.out.println(hm.get('c'));
        System.out.println(hm.containsKey('f'));
        System.out.println(hm.containsValue(2));
        hm.remove('c');
        System.out.println(hm.size());
        //hm.clear--> remoove all entries

        for(Character keys:hm.keySet()){
            System.out.print(keys+" ");

        }
        System.out.println(" ");

        for(int value: hm.values()){
            System.out.print(value+" ");
        }



    }
}