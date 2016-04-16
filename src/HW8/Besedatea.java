package HW8;
public class Besedatea {
    public static void main(String[] args) {
        Englishman noel = new Englishman("Noel");
        Russian vasya = new Russian("Вася");
        Ukrainian burko = new Ukrainian("Бурко");
        noel.speak();
        vasya.speak();
        burko.speak();
        burko.playFootball();
    }
}
