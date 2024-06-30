
public class methodOverloading {
    public static void main(String[] args) {
        Greet obj=new Greet();
        obj.greetings();
        obj.greetings("Abhishek");
        obj.greetings(20);
        obj.greetings(20,"Abhishek");
    }
    
}


class Greet{
    void greetings(){
        System.out.println("Hello, Good Morning");
    }

    void greetings(String name){
        System.out.println("Hello "+name+" Good Morning");
    }

    void greetings(int age){
        System.out.println("My age is "+age);
    }   
    void greetings(int age, String name){
        System.out.println("Hey My name is "+name+" and my age is "+age);
    }
}