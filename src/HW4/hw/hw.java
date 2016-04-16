package HW4.hw;

class hw {
    public static void main(String[] args) {
        int mass [][] = new int [5] [8];
        for (int i=0;i< mass.length; i++)
        {
            for (int j=0;j<mass[i].length; j++) {
                int a = (int)(Math.random()*99);
                mass[i][j] = a;
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
