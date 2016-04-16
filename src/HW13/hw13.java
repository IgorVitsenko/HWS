package HW13;

public class hw13 {
    public static void main(String[] args) {
        int a =777;
        int z=3;
        try{
           int res = a/z;
            System.out.println("Вот твой результат!\n"+res);
        }catch (ArithmeticException e){
            System.out.println("Видимо ты делишь на ноль. Нельзя так.");
        }finally {
            throw new ArithmeticException("ERROR 404");
        }
    }
}
