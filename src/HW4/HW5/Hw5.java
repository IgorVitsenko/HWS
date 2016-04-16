package HW4.HW5;


import java.util.ArrayList;
import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        String t;
        char temp1;
        System.out.println("Задайте кол-во строк:");
        n = scan.nextInt();
        n++;
        ArrayList str = new ArrayList();
        System.out.println("Введите строки");
        while (n>0){
            str.add(scan.nextLine());
            n--;
        }
        System.out.println(str.toString());

    }
}



