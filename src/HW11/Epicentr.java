package HW11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Epicentr {
    public static void main(String[] args) {
        HashMap gvozdi = new HashMap();
        LinkedHashMap bolti = new LinkedHashMap();
        TreeMap shyrypi = new TreeMap();
        long start = System.nanoTime();
        gvozdi.put(1, "10mm");
        gvozdi.put(2, "15mm");
        gvozdi.put(3, "20mm");
        gvozdi.put(4, "25mm");
        gvozdi.put(5, "30mm");
        gvozdi.put(6, "35mm");
        gvozdi.put(7, "50mm");
        gvozdi.put(8, "75mm");
        gvozdi.put(9, "100mm");
        gvozdi.put(10, "150mm");
        long end = System.nanoTime();
        System.out.println("Время записи в HashMap: "+(end-start));
        start = System.nanoTime();
        bolti.put(1, "10mm");
        bolti.put(2, "15mm");
        bolti.put(3, "20mm");
        bolti.put(4, "25mm");
        bolti.put(5, "30mm");
        bolti.put(6, "35mm");
        bolti.put(7, "50mm");
        bolti.put(8, "75mm");
        bolti.put(9, "100mm");
        bolti.put(10, "150mm");
        end = System.nanoTime();
        System.out.println("Время записи в LinkedHashMap: "+(end-start));
        start = System.nanoTime();
        shyrypi.put(1, "10mm");
        shyrypi.put(2, "15mm");
        shyrypi.put(3, "20mm");
        shyrypi.put(4, "25mm");
        shyrypi.put(5, "30mm");
        shyrypi.put(6, "35mm");
        shyrypi.put(7, "50mm");
        shyrypi.put(8, "75mm");
        shyrypi.put(9, "100mm");
        shyrypi.put(10, "150mm");
        end = System.nanoTime();
        System.out.println("Время записи в TreeMap: "+(end-start));
        System.out.println("\nГвозди\n"+gvozdi.toString());
        System.out.println("Болты\n"+bolti.toString());
        System.out.println("Шурупы\n"+shyrypi.toString());
    }
}
