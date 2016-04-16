package tr;

/**
 * Created by Игорь и Людмила on 15.03.2016.
 */
public class tr {
    public static void main(String[] args) {
        int [][] b=new int[8][];
        for(int i=0;i<b.length;i++) {
            b[i]=new int[i];
            for(int j=0;j<b[i].length;j++) {
                b[i][j]=i+j;
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }

}
