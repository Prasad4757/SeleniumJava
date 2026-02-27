package AutomationLearning;

public class SortArrayWithoutSortmethod {
    public static void main(String []args){
        int [] a={4,5,6,7,1,9,3};

        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        for(int c:a){
            System.out.print(c+" ");

        }

    }
}
