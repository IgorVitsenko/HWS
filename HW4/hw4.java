package HW4;

import java.util.Scanner;

/**
 * Created by Игорь и Людмила on 17.03.2016.
 */
public class hw4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a,b,c,d;
        int max =0;
        System.out.println("Введите 4 строки:");
        a = s.nextLine();
        b = s.nextLine();
        c = s.nextLine();
        d = s.nextLine();
        if (max<a.length()){
            max=a.length();
        }
        if (max<b.length()){
            max=b.length();
        }
        if (max<c.length()){
            max=c.length();
        }
        if (max<d.length()){
            max=d.length();
        }




        if (max<a.length()){
            max=a.length();
        }
        if (max<b.length()){
            max=b.length();
        }
        if (max<c.length()){
            max=c.length();
        }
        if (max<d.length()){
            max=d.length();
        }
        System.out.println(max);
    }
}
