package HW5;


import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        String t;
        char temp1;
        System.out.println("Задайте кол-во строк:");
        n = scan.nextInt();
        String str [] = new String [n];
        System.out.println("Введите строки");
        for (int i=0;i<n;i++) {
            System.out.println("1");
            str[i]=scan.nextLine();
        }
        str[0]=scan.nextLine();
        str[1]=scan.nextLine();
        System.out.println(str[2]);
        System.out.println(str[0]);
        System.out.println(str[1]);



    }


}



