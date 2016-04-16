package HW4.HW43;

import java.util.Scanner;

public class proba {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] x = new int[4];
        String[] z = new String[4];
        String a,b,c,d;
        int max=0;
        int min = 100000000;
        System.out.println("Введите 4 строки:");
        a = s.nextLine();
        b = s.nextLine();
        c = s.nextLine();
        d = s.nextLine();

        x[0]=a.length();
        x[1]=b.length();
        x[2]=c.length();
        x[3]=d.length();
        z[0]=a;
        z[1]=b;
        z[2]=c;
        z[3]=d;

        for (int i=0;i<4; i++) {
            if (max<x[i]){
                max=x[i];
            }
        }
        for (int i=0;i<4; i++) {
            if (min>x[i]){
                min=x[i];
            }
        }
        for (int i=0;i<4; i++) {
            if (max==x[i]){
                System.out.println("Самая длинная строка: "+z[i]);
                System.out.println("Её длинна: " + max);
            }
        }
        for (int i=0;i<4; i++) {
            if (min==x[i]){
                System.out.println("Самая короткая строка: "+z[i]);
                System.out.println("Её длинна: " + min);
            }
        }
    }
}
