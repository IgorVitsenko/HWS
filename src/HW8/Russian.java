package HW8;
public class Russian extends Human {
    Russian (String name){
        this.name=name;
    }
    void sayHello() {
        System.out.println("Привeт!");
    }
    public void boorishness() {
        System.out.println("Сиш, сюда иди!");  //:D
    }
    public void sayGoodbye() {
        System.out.println("До свидания!");
    }
    void speak(){
        sayHello();
        boorishness();
        sayGoodbye();
    }
}
