package AutomationLearning;

public class primeNum {
    public static void main(String []args){
        int temp=0;
        int n=6;

        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("n is prime number");
        }
        else{
            System.out.println("n is not prime number");
        }
    }
}
