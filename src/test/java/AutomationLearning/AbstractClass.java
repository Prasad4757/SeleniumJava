package AutomationLearning;

public class AbstractClass {
    public static void main(String[] args) {
        P p=new P();
        p.x();
        p.y();
        p.z();


    }
}

abstract class XYZ{
    abstract void x();

     void y() {
        System.out.print("y");
    }
        abstract void z();
    }


    class P extends XYZ{
        void x() {
            System.out.print("x-implementation ");
        }
        void y() {
            System.out.print("y in P class");
        }
        void z() {
            System.out.print("z-implematation");
        }

    }