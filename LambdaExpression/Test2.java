package Java_8_Feature.LambdaExpression;

interface I2{
    int getLength(String name);
}

public class Test2 {
    public static void main(String[] args) {
        I2 obj = (String name)->{
            return name.length();
        };
//        I2 obj = name-> name.length(); is tarah bhi lik sakte hai
        System.out.println(obj.getLength("Amit Singh"));

    }
}
