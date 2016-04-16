package HW5.Student;
public class Student {
    String name;
    int age;
    int  mark;
    int  gr;

    public Student(String name,int age,int gr){
        this.name=name;
        this.age=age;
        this.gr=gr;
    }

    void proverka(int mark){
        this.mark=mark;
        if (mark<50){
            System.out.println(name+", оценка: "+mark+". Не прошёл!");
        }
        else if (mark>50){
            System.out.println(name+", оценка: "+mark+". Прошёл!");
        }
    }

}
