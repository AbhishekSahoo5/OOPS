
public class Constructor {
    public static void main(String[] args) {
        Complex num1=new Complex(2,4);
        Complex num2=new Complex(4,1);
        Complex num3=new Complex(21);
        num1.print();
        num2.print();
        num3.print();

        System.out.println("Adding two Complex Num");
        Complex result=num1.add(num2);
        result.print();

        
    }
    
}

class Complex{
    int a,b;
    String name;

    // default constructor
    // public Complex(){
    //     a=0;
    //     b=0;
    // }

    // same value will assigned to all the objects
    // public Complex(){
    //     a=5;
    //     b=9;
    // }

    // parametrized constructor
    // Complex(int real,int imag){
    //     a=real;
    //     b=imag;
    // }
    Complex(int a,int b){
        this.a=a;
        this.b=b;
    }
    
    // Constructor overloading
    Complex(int real){
        a=real;
        b=100;
    }



    void print(){
        System.out.println(a+" + "+b+"i");
    }

    Complex add(Complex num2){
        // this.print();      //--> print the current object i.e. num2
        System.out.println(this);
        Complex newNum=new Complex(a+num2.a,b+num2.b);
        return newNum;
    }


}