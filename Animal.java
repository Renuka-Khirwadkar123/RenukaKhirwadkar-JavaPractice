public class Animal {

    String color;
    int age;

    void setData(String c,int a){

        color=c;
        age=a;

    }

    void displayData(){


        System.out.println(color +" " + age);
    }

public static void main(String[] args) {

    Animal aa=new Animal();

    
    aa.setData("red",22);
    aa.displayData();
    
}

    
}
