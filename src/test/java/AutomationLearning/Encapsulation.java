package AutomationLearning;

public class Encapsulation {
    public static void main(String []args){
        enap e=new enap("","");
        e.setUsername("prasad");
        e.setPassword("prasad123");
        System.out.println("username is  "+e.getUsername()+" password is "+e.getPassword());

    }


}

class enap{
    private String username="omkar";
    private String password="omkar123";

    public enap(String username,String password ){
        this.username=username;
        this.password=password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
}
