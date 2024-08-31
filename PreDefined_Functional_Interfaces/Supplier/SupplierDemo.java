package Java_8_Feature.PreDefined_Functional_Interfaces.Supplier;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> s = ()-> (int)(Math.random()*100);
        System.out.println(s.get());

        Supplier<String > s2 = () -> {
            String[] names = {"Arun", "Amit", "Raj", "Anikesh"};
            int i = (int)(Math.random()*4);
            return names[i];
        };
        System.out.println(s2.get());
    }
}
