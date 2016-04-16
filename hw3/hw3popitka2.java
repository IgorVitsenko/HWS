package hw3;

/**
 * Created by Игорь и Людмила on 17.03.2016.
 */
public class hw3popitka2 {
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
            //
            System.out.println(mass.length);
            //
            int result = -1;
            for (int i=0;i< mass.length; i++)
            {
                for (int j=0;j<mass[0].length; j++)
                    if (result<mass[0][j]) {
                        result = mass[0][j];
                    }
            }
            for (int a=0; a<mass.length; a++) {
                if (mass[0][0] < result) {
                    for (int i = 0; i < mass.length; i++) {
                        for (int j = 0; j < i; j++) {
                            int tmp = mass[0][j];
                            mass[0][j] = mass[0][j + 1];
                            mass[0][j + 1] = tmp;
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
