package HW1_3;

import java.util.Scanner;

public class Randomizer
{
    public static void main(String[] args)
    {

        int x = (int)(Math.random() * 100);
        int counter = 6;
        Scanner s = new Scanner(System.in);
        System.out.println("Загадано число от 0 до 100. У Вас семь попыток на угадывание.");
        System.out.print("Введите число: ");
        int a =s.nextInt();
        for (int i=1; i<=6; i++)
        {

            if (a < x)
            {
                System.out.print("Мало!");
                do {
                    System.out.println(" Осталось "  + counter + " попыток(ка).");
                    System.out.println("");
                    counter--;
                    break;
                } while (counter > 1);
                System.out.print("Введите число: ");
                a =s.nextInt();
            }
            else if (a > x)
            {
                System.out.print("Много!");
                do {
                    System.out.println(" Осталось "  + counter + " попыток(ка).");
                    System.out.println("");
                    counter--;
                    break;
                } while (counter > 1);
                System.out.print("Введите число: ");
                a =s.nextInt();
            }
            if (a == x)
            {
                System.out.println("Поздравляем! Вы выиграли!");
                break;
            }
            else if (i==6)
            {
                System.out.println("У вас закончились попытки!");
                System.out.println("Загаданное число: "+x);
            }
        }
    }
}
