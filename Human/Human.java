package Human;

/**
 * Created by Игорь и Людмила on 20.03.2016.
 */
public class Human {
    String name;
    int age;
    int  height;
    String gender;
    String nationality;

    void adult(){
        if (age<18){
            System.out.println(name+" Hе совершеннолетний");
        }
        else if (age>=18){
            System.out.println(name+" Cовершеннолетний");
        }
    }
}
