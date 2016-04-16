package Humans;
public class Englishman extends Human {
    Englishman (String name){
        this.name=name;
    }
    void sayHello() {
        System.out.println("Hello!");
    }
    public void boorishness() {
        System.out.println("Avada-Kedavra!");
    }
    public void sayGoodbye() {
        System.out.println("Goodbye!");
    }

    void speak(){
        sayHello();
        boorishness();
        sayGoodbye();
    }
}
