package HW8;

public class Ukrainian extends Human implements Football{

    Ukrainian (String name){
        this.name=name;
    }
    void sayHello() {
        System.out.println("Привiт!");
    }
    public void boorishness() {
        System.out.println("Москалiв на ножi!");   //:D:D:D
    }
    public void sayGoodbye() {
        System.out.println("До побачення!");
    }

    public void playFootball() {
        System.out.println("Вже краще! Знаэмо як вдарити м'яча!");
    }
    void speak(){
        sayHello();
        boorishness();
        sayGoodbye();
    }
}
