package AutomationLearning;

public class removeWhiteSpaces {
    public static void main(String []args){
        String string="hello world  Java";
        String newString=string.replace(" ","");
        System.out.println(newString);
    }
}
