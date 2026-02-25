package AutomationLearning;

public class reverseWord {
    public static void main(String [] args){
        String s="John Cena";  //output-> nhoJ aneC

        String y="";

        String [] z=s.split(" ");
        for(int i=0;i<z.length;i++){
            String P=z[i];
            String rev="";

            for(int j=P.length()-1;j>=0;j--){
                rev=rev+P.charAt(j);
            }
            y=y+rev;


            if(i<z.length-1){
                y=y+" ";
            }

        }
        System.out.println(y);

    }
}
