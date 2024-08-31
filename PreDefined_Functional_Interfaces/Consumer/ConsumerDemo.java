package Java_8_Feature.PreDefined_Functional_Interfaces.Consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> c = str-> System.out.println("Hi "+str.concat("@gmail.com"));
        c.accept("Amit");
        c.accept("Rahul");
    }
}
