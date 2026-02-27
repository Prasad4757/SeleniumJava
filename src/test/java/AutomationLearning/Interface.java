package AutomationLearning;

public class Interface {
    public static void main(String[] args) {
        PBF p=new PBF();
        p.x();

        p.z();


    }


    interface XYZ1{
        void x();


        void z();
    }

}

class PBF implements Interface.XYZ1 {
    public void x() {
        System.out.print("x-implementation interface");
    }



    public void z() {
        System.out.println("z-implematation interface");
    }


}
