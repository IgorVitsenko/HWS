package HW1_3;

import java.util.Scanner;

public class HWl33
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3-х значное число:");
        int s;
        s = sc.nextInt();
        int a = s/100;
        int b = (s /10) % 10;
        int c =  s % 10;
        System.out.println(a+b+c);
    }
}
