package Student;

/**
 * Created by Игорь и Людмила on 20.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Student vasya= new Student("Вася", 17, 233);
        Student pasha= new Student("Паша", 17, 233);
        Student anton= new Student("Антон", 17, 233);
        Student masha= new Student("Маша", 17, 233);
        vasya.proverka(51);
        pasha.proverka(39);
        anton.proverka(100);
        masha.proverka(77);
    }
}
