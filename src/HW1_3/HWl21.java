package HW1_3;

import java.util.Scanner;
public class HWl21 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Введите число");
        int x=s.nextInt();
        int a=x+1;
        int b=a+1;
        int c=b+1;
        int d=c+1;
        int z=a+b+c+d;
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+z);
    }
}
