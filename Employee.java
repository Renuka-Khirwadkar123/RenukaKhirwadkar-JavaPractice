public class Employee {
    

    public void eat(){

        System.out.println("I am eating");
    }

    public void run(){

        System.out.println("I am running");
    }

    public static void main(String[] args){

        System.out.println("I am running");

        Employee e=new Employee();

        e.eat();
        e.run();
       // Birds b=new Birds();
        e.fly();

    }

}

class Birds extends Employee{


    public void fly(){


        System.out.println("I am flying");
    }
}