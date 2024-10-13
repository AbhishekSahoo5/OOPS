
public class Car extends Vehicle{

    // Method Overriding
    void start(){
        System.out.println("Car is Starting");
    }

    public static void main(String[] args) {
        Car obj=new Car();
        obj.wheelCount=4;
        obj.model="Range Rover";
        obj.start();
        obj.features();

    }
}
