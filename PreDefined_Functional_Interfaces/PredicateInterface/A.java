package Java_8_Feature.PreDefined_Functional_Interfaces.PredicateInterface;
import java.util.function.Predicate;

interface I1{
    boolean test(int no);
}
class Main{
    public static void main(String[] args) {
        Predicate<Integer> obj = no -> no%2==0;
        System.out.println(obj.test(20));

        Predicate<String> obj2 = str -> str.length()>6;
        System.out.println(obj2.test("Amit Singh"));
        System.out.println(obj2.test("Abc"));
    }
}