package HW12;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числa");
        Set ints = new HashSet<>();
        for (int i = 0; i<21; i++){
            i=sc.nextInt();
            ints.add(i);
        }
        System.out.println(ints.toString());
    }
}
