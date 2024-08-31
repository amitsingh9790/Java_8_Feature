package Java_8_Feature.Default_Method;

public interface I1 {
    void m1();
    default void m2(){
        System.out.println("hi from m2");
    }
}

class A implements I1 {
    @Override
    public void m1() {
        System.out.println("I am m1 from class A");
    }
    @Override
    public void m2(){ // overriding m2() is optional
        System.out.println("I am m2 from class B");
    }
}

class Main{
    public static void main(String[] args) {

    }
}