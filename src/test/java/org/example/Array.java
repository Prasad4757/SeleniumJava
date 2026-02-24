package org.example;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        enap e=new enap("","");
        e.setUsername("magix");
        e.setpassword("magix123");

         System.out.println("username"+ e.getUsername());
        System.out.println("password"+ e.getpassword());



    }
}


class enap {

    public String username = "ashok";
    public String password = "ashok@133";


    public enap(String username, String password) {
        this.username = username;
        this.password = password;

    }

    void setUsername(String username){
        this.username=username;
    }

    void  setpassword(String password){
        this.password=password;
    }
    String getUsername(){
        return this.username;

    }
     String getpassword(){
       return this.password;
    }




}



