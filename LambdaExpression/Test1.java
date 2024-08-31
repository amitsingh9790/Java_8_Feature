package Java_8_Feature.LambdaExpression;

//LambdaExpression only apply on Functional Interface
@FunctionalInterface
interface test1 {
    void m1(int a);
}

public class Test1{
    public static void main(String[] args) {
        test1 obj = (int a) ->{                  //LambdaExpression
            System.out.println("a: "+a);
        };
//      I1 obj = a -> System.out.println("a: "+a); // we can also do like this when there is only one statement

        obj.m1(6);
    }
}
