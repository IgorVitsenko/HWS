package hw2;

/**
 * Created by Игорь и Людмила on 15.03.2016.
 */
public class hw2 {
    public static void main(String[] args) {
        int mass [][] = new int [4] [4];
        int result = 0;
        for (int i=0;i< mass.length; i++)
        {
            for (int j=0;j<mass[i].length; j++) {
                int a = (int)(Math.random()*100);
                mass[i][j] = a;
            }
        }
        for (int i=0;i< mass.length; i++)
        {
            for (int j=0;j<mass[i].length; j++) {
                if (result < mass[i][j]) {
                    result = mass[i][j];
                }
            }
            }
        System.out.println("Самое большое число массива: " + result);
        }
    }

