package hw2;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Planets earth = new Planets("Земля", 3, 1);
        Planets mars = new Planets("Марс", 3, 1);
        Planets upiter = new Planets("Юпитер", 5, 14);
        Planets neptun = new Planets("Нептун", 8, 5);
        Planets venera = new Planets("Венера", 7, 11);

        Planets mar = new Planets("Марс", 2, 4);
        Planets upite = new Planets("Юпитер", 5, 14);
        Planets neptu = new Planets("Нептун", 8, 5);
        Planets vener = new Planets("Венера", 7, 11);

        ArrayList<Planets> planetsArrayList = new ArrayList<>();
        planetsArrayList.add(earth);
        planetsArrayList.add(mars);
        planetsArrayList.add(upiter);
        planetsArrayList.add(neptun);
        planetsArrayList.add(venera);
        planetsArrayList.add(mar);
        planetsArrayList.add(upite);
        planetsArrayList.add(neptu);
        planetsArrayList.add(vener);
        System.out.println(planetsArrayList.toString());
        for (Planets planets : planetsArrayList) {
            System.out.println(planets.hashCode());
        }

  for (int i=0; i<planetsArrayList.size(); i++){
      for (int j=0; j<planetsArrayList.size(); j++){
          if (planetsArrayList.get(i).equals(planetsArrayList.get(j))==false) planetsArrayList.remove(i);

          else if (planetsArrayList.get(i).equals(planetsArrayList.get(j))==true) System.out.println("sss");

      }
  }
        /*for (int i=0; i<planetsArrayList.size(); i++){
            for (int j=0; i<planetsArrayList.size(); i++){
                if (planetsArrayList.get(i).equals(planetsArrayList.get(j))==false){
                    planetsArrayList.remove(i);
                }
            }
        }
        for (int i=0; i<planetsArrayList.size(); i++){
            for (int j=0; i<planetsArrayList.size(); i++){
                if (planetsArrayList.get(i).equals(planetsArrayList.get(j))==false){
                    planetsArrayList.remove(i);
                }
            }
        }
        for (int i=0; i<planetsArrayList.size(); i++){
            for (int j=0; <planetsArrayList.size(); i++){
                if (planetsArrayList.get(i).equals(planetsArrayList.get(j))==false){
                    planetsArrayList.remove(i);
                }
            }
        }
        */
        System.out.println("fffff");
        for (Planets planets : planetsArrayList) {
            System.out.println(planets.hashCode());
        }
        for (int i=0; i<planetsArrayList.size(); i++){
            System.out.println(planetsArrayList.get(i));
            }
        for (Planets planets : planetsArrayList) {
            for (Planets planets1 : planetsArrayList) {
                if (planets.equals(planets1)==true){
                    System.out.println("verno");
                }
            }
        }

    }
}
