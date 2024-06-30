public class MainClass{
    public static void main(String[] args) {
        // object
        Dog d1=new Dog();
        d1.name="Tommy";
        d1.bark();
        d1.walk();

        Dog d2=new Dog();
        d2.name="shampoo";
        d2.bark();
        d1.walk();

        Complex num1=new Complex();
        num1.a=3;
        num1.b=5;
        num1.print();

    }
}

// Class for a Complex Number
class Complex{
    int a,b;

    void print(){
        System.out.println(a+" + "+b+"i");
    }
}

class Dog{           //factory

    // properties
    String name; 
    int age;
    String color;

    // behaviour
    void walk(){
        System.out.println(name+" is walking");
    }

    void bark(){
        System.out.println(name+" is barking");
    }
}

class Cat{

}