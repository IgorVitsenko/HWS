package hw;
public class P1 {
    static class StaticInnerClass implements TestInterface{
        public void method1() {
            System.out.println("StaticInnerClass. method1");
        }
        public void method2() {
            System.out.println("StaticInnerClass. method2");
        }
      void sayStaticInnerClass(){
          System.out.println("sayStaticInnerClass");
      }
    }
    class InnerClass implements TestInterface{
        public void method1() {
            System.out.println("InnerClass. method1");
        }
        public void method2() {
            System.out.println("InnerClass. method2");
        }
        void sayInnerClass(){
            System.out.println("sayInnerClass");
        }
    }
}
