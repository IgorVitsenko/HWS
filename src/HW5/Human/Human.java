package HW5.Human;
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
