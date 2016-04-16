package hw7;


public class Customer {
    static int lastID=0;
    int ID=0;
    String name;
    int age;
    int lID=0;
    static Customer[] scustomers;

    Customer(int count){
        scustomers = new Customer[count];
    }
    Customer(String name, int age){
        this.name=name;
        this.age=age;
        ID=lastID;
        lastID++;
    }
    void add(Customer customer){
        scustomers[lID]=customer;
        lID++;
    }

    void cinfo(){
        System.out.println(name+" ("+age+"лет) :");
    }

}
