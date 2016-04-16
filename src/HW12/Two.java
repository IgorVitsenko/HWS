package HW12;

import java.util.*;

public class Two {
    public static void main(String[] args) {
        HashSet one = new HashSet<>();
        LinkedHashSet two = new LinkedHashSet<>();
        TreeSet three = new TreeSet<>();
        Iterator<Integer> itrone = one.iterator();
        Iterator<Integer> itrtwo = two.iterator();
        Iterator<Integer> itrthree = three.iterator();

        long start = System.nanoTime();
        for (int i = 0; i<10; i++){
            int x = (int)(Math.random() * 100);
            one.add(x);
        }
        long end = System.nanoTime();
        System.out.println("Время записи в HashSet: "+(end-start));

        start = System.nanoTime();
        for (int i = 0; i<10; i++) {
            int x = (int)(Math.random() * 100);
            two.add(x);;
        }
        end = System.nanoTime();
        System.out.println("Время записи в LinkedHashSet: "+(end-start));

        start = System.nanoTime();
        for (int i = 0; i<10; i++) {
            int x = (int)(Math.random() * 100);
            three.add(x);
        }
        end = System.nanoTime();
        System.out.println("Время записи в TreeSet: "+(end-start));
        System.out.println();

        start = System.nanoTime();
        while (itrone.hasNext()){
        }
        end = System.nanoTime();
        System.out.println("Время поиска по HashSet: "+(end-start));

        start = System.nanoTime();
        while (itrtwo.hasNext()){
        }
        end = System.nanoTime();
        System.out.println("Время поиска по LinkedHashSet: "+(end-start));

        start = System.nanoTime();
        while (itrthree.hasNext()){
        }
        end = System.nanoTime();
        System.out.println("Время поиска по TreeSet: "+(end-start));
        System.out.println();

        start = System.nanoTime();
        one.removeAll(one);
        end = System.nanoTime();
        System.out.println("Время удаления в HashSet: "+(end-start));

        start = System.nanoTime();
        two.removeAll(two);
        end = System.nanoTime();
        System.out.println("Время удаления в LinkedHashSet: "+(end-start));

        start = System.nanoTime();
        three.removeAll(three);
        end = System.nanoTime();
        System.out.println("Время удаления в TreeSet: "+(end-start));
    }
}
