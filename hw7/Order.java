package hw7;
import java.util.Date;
public class Order extends Datex{
    private static int lastID;
    int ID=0;
    int CustomerID;
    int ProductID;
    Date time;
    private static Order[] array;


   Order(){
       double x=Math.random()*30;
       time=getDate((int)x);
       ProductID=(int)Math.random()*Product.lastID;
       CustomerID=(int)Math.random()*Customer.lastID;
       ID=lastID;
       lastID++;
   }
      void info (){
        Customer.scustomers[ProductID].cinfo();
        Product.sproducts[CustomerID].pinfo();
        System.out.println(time);
    }

}
