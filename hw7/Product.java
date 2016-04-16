package hw7;

public class Product {
        static int lastID=0;
        int ID=0;
        int lID=0;
        int price;
        String name;
        static Product[] sproducts;

    Product(int count){
        sproducts = new Product[count];
    }
    Product(String name, int price){
        this.name=name;
        this.price=price;
        ID=lastID;
        lastID++;
    }
    void add(Product product){
        sproducts[lID]=product;
        lID++;
    }

    void pinfo(){
        System.out.println(name+" "+price+"$");
    }
}
