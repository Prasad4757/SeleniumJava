package AutomationLearning;

public class primenumbersRange {
    public static void main(String []args){
        int temp=0;
        for(int n=2;n<=20;n++){
            for(int i=2;i<=n-1;i++){
                if(n%i==0){
                    temp=temp+1;
                }
            }
            if(temp==0){
                System.out.print(n+" ");
            }
            else{
                temp=0;
            }
        }
    }
}
