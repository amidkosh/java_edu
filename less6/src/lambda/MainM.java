package lambda;


public class MainM {
    public static void main(String[] args) {
        SomeClass c = new SomeClass();
//        MyInterface my = new MyInterface() {
//            @Override
//            public String doSomething() {
//                return "Hello";
//            }
//        };
//        c.someMethod(my);
        c.someMethod(()->"Hello");
    }
}
