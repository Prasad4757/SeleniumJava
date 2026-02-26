package AutomationLearning;

import java.util.Arrays;

public class secondLargestArray {
    public static void main(String []args){
        int [] a={12,4,5,6,7,20,9,2,1};
        Arrays.sort(a);

        int n=a.length;
        int highest=a[n-1];
        int secondhighest=-1;

        for(int i=n-2;i>=0;i--){
            if(a[i]<highest){
                secondhighest=a[i];
                break;
            }
        }
        System.out.println("second highest array is  "+secondhighest);



    }
}
