package AutomationLearning;

public class Methodoverloading {
    public static void main(String []args){
        A a= new A();
        a.add(30,20);
        a.add(30,20,10);

    }
}

class A{
    void add(int a, int b){
        int sum=a+b;
        System.out.println(sum);

    }

    void add(int a, int b, int c){
        int sub=a-b-c;
        System.out.println(sub);
    }
}
