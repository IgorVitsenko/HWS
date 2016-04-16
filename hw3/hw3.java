package hw3;


/**
 * Created by Игорь и Людмила on 15.03.2016.
 */
public class hw3 {
    public static void main(String[] args) {
        int mass[][] = new int[6][7];
        for (int i=0;i< mass.length; i++)
        {
            for (int j=0;j<mass[i].length; j++) {
                int a = (int)(Math.random()*9);
                mass[i][j] = a;
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-");
             int tmp;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length - 1; j++) {
                for (int l = j; l < mass.length + 1; l++) {
                    if (mass[i][j] < mass[i][l]) {
                        tmp = mass[i][j];
                        mass[i][j] = mass[i][l];
                        mass[i][l] = tmp;
                    }
                }
            }
        }


        for (int i=0;i< mass.length; i++)
        {
            for (int j=0;j<mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }







    }
}
