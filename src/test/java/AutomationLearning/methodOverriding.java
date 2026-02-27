package AutomationLearning;

public class methodOverriding {
    public static void main(String []args){
         D d=new D();
        d.add(30,15);

        //run time decides to run child mehtod only



    }
}

class C {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);

    }
}

    class D extends C{
        void add(int a, int b){
            int sub=a-b;
            System.out.println(sub);

    }
}


