package Java_8_Feature.Static_Method;

public interface I1 {
    void m1();
    static void m2(){
        System.out.println("hi from m2");
    }
}

class A implements I1 {
    @Override
    public void m1() {
        System.out.println("I am m1 from class A");
    }
}

class Main{
    public static void main(String[] args) {

    }
}