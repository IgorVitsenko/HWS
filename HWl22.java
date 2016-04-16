/**
 * Created by Игорь on 04.03.2016.
 */
import java.util.Scanner;
public class HWl22 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a;
        double b;
        System.out.println("Введите число 1:");
        a=s.nextInt();
        System.out.println("Введите число 2:");
        b=s.nextDouble();
        double c;
        double d;
        double e;
        double z;
        System.out.println(c=a*b);
        System.out.println(d=c*a);
        System.out.println(e=c*b);
        System.out.println(z=c+d+e);
    }
}
