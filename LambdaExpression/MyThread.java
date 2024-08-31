package Java_8_Feature.LambdaExpression;

class Main{
    public static void main(String[] args) {
        Runnable r = ()->{  //LambdaExpression
            for (int i = 1; i < 6; ++i) {
                System.out.println("Hi from child thread");
            }
        };
        Thread t = new Thread(r);
        t.start();

        for (int i = 1; i < 6; ++i) {
            System.out.println("hello form main Thread");
        }
    }
}