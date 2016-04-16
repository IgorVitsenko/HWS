package hw;
public class Main {
    public static void main(String[] args) {
        class LocalClass implements TestInterface{
            public void method1() {System.out.println("LocalClass. method1");}
            public void method2() {System.out.println("LocalClass. method2");}
            void localClassMethod1(){System.out.println("localClassMethod1");}
        }
        TestInterface testInterface = new TestInterface() {
            public void method1() {System.out.println("testInterface. method1");}
            public void method2() {System.out.println("testInterface. method1");}
        };
        LocalClass lc = new LocalClass();
        lc.method1();
        lc.method2();
        lc.localClassMethod1();
        testInterface.method1();
        testInterface.method2();
        General gen = new General();
        General.SecondClass gsc = gen.new SecondClass();
        gen.method();
        gsc.method();
        testInterface.method1();
        testInterface.method2();
        P1 p1 = new P1();
        P1.StaticInnerClass psic = new P1.StaticInnerClass();
        P1.InnerClass pic = p1.new InnerClass();
        psic.method1();
        psic.method2();
        psic.sayStaticInnerClass();
        pic.method1();
        pic.method2();
        pic.sayInnerClass();
    }
}
