package Java_8_Feature.Functional_Interface;

//1. marker interface - 0 abstract method
//2. functional interface - only 1 abstract method
//3. normal interface - more than 1 abstract methods
@FunctionalInterface
public interface I1 { //functional interface
    void m1();
}

@FunctionalInterface
interface I2 extends I1{

}

class Main{
    public static void main(String[] args) {

    }
}
