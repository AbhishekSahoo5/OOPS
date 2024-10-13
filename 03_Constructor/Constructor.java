
public class Constructor {
    public static void main(String[] args) {
        // Complex num1=new Complex();      
        // num1.print();

        Complex num2=new Complex(4,5);
        num2.print();
        Complex num3=new Complex(6,7);
        num3.print();

        Complex num4=new Complex(10);
        num4.print();
    
        Complex result=num2.add(num3);
        result.print();

        
        
    }
    
}

class Complex{
    int a,b;
    String name;

    // default constructor ---> having no parameters
    // public Complex(){
    //     a=5;
    //     b=9;
    // }

    public Complex(int real, int img)
    {
        a=real;
        b=img;
    }

    // Constructor overloading
    public Complex(int real)
    {
        a=real;
        b=1;
    }


    void print(){
        System.out.println(a+" + "+b+"i");
    }

    Complex add(Complex num2){
        return new Complex(a+num2.a,b+num2.b);
    }

    // use of this keyword
    Complex(int a,int b){
        this.a=a;
        this.b=b;
        print();
    }

}