package Java_8_Feature.PreDefined_Functional_Interfaces.FunctionInterface;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> f = sal -> sal*12;
        System.out.println(f.apply(10_000));

        Function<String ,String> f2 = str -> str.concat(" Hello EveryOne");
        System.out.println(f2.apply("Amit"));

        Function<String ,Integer> f3 = str -> str.length();
        System.out.println(f3.apply("Amit Singh"));
    }
}
