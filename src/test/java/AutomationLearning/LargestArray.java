package AutomationLearning;

public class LargestArray {
    public static void main(String []args){
        int [] a={4,5,6,7,1,9,3};
        int max=a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);


    }
}
