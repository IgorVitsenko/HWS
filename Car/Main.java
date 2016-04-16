package Car;

/**
 * Created by Игорь и Людмила on 20.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.name = "BMW 320i";
        bmw.color = "Белый";
        bmw.weight = 1000;

        Car honda = new Car();
        honda.name = "Honda Civic";
        honda.color = "Чёрный";
        honda.weight = 800;

        Car vw = new Car();
        vw.name = "VW Golf I";
        vw.color = "Зелёный";
        vw.weight = 900;

        Car audi = new Car();
        audi.name = "Audi Q7";
        audi.color = "Красный";
        audi.weight = 1500;

        Car mercedes = new Car();
        mercedes.name = "Mercedes C280";
        mercedes.color = "Синий";
        mercedes.weight = 1200;

        Car ford = new Car();
        ford.name = "Ford Focus";
        ford.color = "Белый";
        ford.weight = 1000;

        Car chev = new Car();
        chev.name = "Chevrolet Camaro SS";
        chev.color = "Оранжевый";
        chev.weight = 1200;

        Car corv = new Car();
        corv.name = "Corvette ZR1";
        corv.color = "Персиковый";
        corv.weight = 700;

        Car mg = new Car();
        mg.name = "MG 350";
        mg.color = "Серебристый";
        mg.weight = 1200;

        Car nissan = new Car();
        nissan.name = "Nissan GT-R";
        nissan.color = "Розовый";
        nissan.weight = 1000;


        System.out.println(bmw.name+" Цвет: "+bmw.color+" Масса: "+bmw.weight);
        System.out.println(honda.name+" Цвет: "+honda.color+" Масса: "+honda.weight);
        System.out.println(vw.name+" Цвет: "+vw.color+" Масса: "+vw.weight);
        System.out.println(audi.name+" Цвет: "+audi.color+" Масса: "+audi.weight);
        System.out.println(mercedes.name+" Цвет: "+mercedes.color+" Масса: "+mercedes.weight);
        System.out.println(ford.name+" Цвет: "+ford.color+" Масса: "+ford.weight);
        System.out.println(chev.name+" Цвет: "+chev.color+" Масса: "+chev.weight);
        System.out.println(corv.name+" Цвет: "+corv.color+" Масса: "+corv.weight);
        System.out.println(mg.name+" Цвет: "+mg.color+" Масса: "+mg.weight);
        System.out.println(nissan.name+" Цвет: "+nissan.color+" Масса: "+nissan.weight);
    }
}
