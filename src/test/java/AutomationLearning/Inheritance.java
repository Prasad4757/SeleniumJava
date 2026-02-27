package AutomationLearning;

public class Inheritance {
    public static void main(String []args){
        Child c=new Child();
        c.Bike();
        c.Car();
        c.House();


    }
}

class parent{
     void House (){
         System.out.println("i have a house");
     }
     void Car(){
         System.out.println("I have a car");
     }

}
      class Child extends parent{
      void Bike(){
    System.out.println("i have a bike");
}

        }
