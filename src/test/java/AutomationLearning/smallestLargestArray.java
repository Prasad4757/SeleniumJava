package AutomationLearning;

import java.util.Arrays;

public class smallestLargestArray {
    public static void main(String []args){
        int [] a={12,4,5,6,7,20,9,2,1,3};
        Arrays.sort(a);

        int min=a[0];
        int max=a[0];

        for(int i=0;i<a.length;i++) {
            if (a[i] > max){
                max=a[i];
            }
        }
        System.out.println(max);

        for(int i=a.length-1;i>=0;i--){
            if(a[i]<min){
                min=a[i];
            }
        }

        System.out.println(min);

    }
}
