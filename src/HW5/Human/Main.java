package HW5.Human;
public class Main {
    public static void main(String[] args) {
        Human vasya = new Human();
        vasya.name = "Вася";
        vasya.age= 19;
        vasya.height=130;
        vasya.gender="М";
        vasya.nationality="Украинец";

        Human masha = new Human();
        masha.name = "Маша";
        masha.age= 17;
        masha.height=160;
        masha.gender="Ж";
        masha.nationality="Украинка";

        Human dasha = new Human();
        dasha.name = "Даша";
        dasha.age= 23;
        dasha.height=172;
        dasha.gender="Ж";
        dasha.nationality="Украинка";

        Human kostya = new Human();
        kostya.name = "Костя";
        kostya.age= 25;
        kostya.height=197;
        kostya.gender="М";
        kostya.nationality="Украинец";

        Human dima = new Human();
        dima.name = "Дима";
        dima.age= 43;
        dima.height=201;
        dima.gender="М";
        dima.nationality="Украинец";

        vasya.adult();
        masha.adult();
        dasha.adult();
        kostya.adult();
        dima.adult();
        int allage = vasya.age+masha.age+dasha.age+kostya.age+dima.age;
        System.out.println("Общий возраст равен:"+allage);
        int adage[]=new int[5];
        adage[0]=vasya.age;
        adage[1]=masha.age;
        adage[2]=dasha.age;
        adage[3]=kostya.age;
        adage[4]=dima.age;
        int yage=0;
        int nage=0;

        for (int i=0; i<5; i++){
            if (adage[i]<18){
                nage+=adage[i];
            }
            else if (adage[i]>=18){
                yage+=adage[i];
            }

        }
        System.out.println(nage);
        System.out.println(yage);
    }
}
