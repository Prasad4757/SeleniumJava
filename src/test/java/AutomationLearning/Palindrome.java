package AutomationLearning;

public class Palindrome {
    public static void main(String [] args) {
        String s = "sms";
        String y = "";

        for(int i=s.length()-1;i>=0;i--){
            y=y+s.charAt(i);
        }
        System.out.println(y);

        if(y.equals(s)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }

}
