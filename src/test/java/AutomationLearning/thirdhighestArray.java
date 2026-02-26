package AutomationLearning;

import java.util.Arrays;

public class thirdhighestArray {
    public static void main(String []args){
        int [] a={12,4,5,6,7,20,9,2,1};    //output-> 9
        Arrays.sort(a);

        int n=a.length;
        int highest=a[n-1];
        int thirdhighest=-1;

        for(int i=n-3;i>=0;i--){
            if(a[i]<highest){
                thirdhighest=a[i];
                break;
            }
        }
        System.out.println(thirdhighest);


    }
}
