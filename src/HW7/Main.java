package HW7;
public class Main {
    public static void main(String[] args) {
        Customer scustomer = new Customer(5);
        Product iphonese = new Product("iPhone SE", 200);
        Product samsungs4 = new Product("Samsung Galaxy S4", 100);
        Product lgg4 = new Product("LG G4", 95);
        Product nexus6 = new Product("Google Nexus 6", 110);
        Customer ivan = new Customer("Иван", 21);
        Customer misha = new Customer("Михаил", 19);
        Customer dasha = new Customer("Дарья", 22);
        Customer masha = new Customer("Мария", 20);
        Customer roma = new Customer("Роман", 23);

        Product sprodukt = new Product(4);
        sprodukt.add(iphonese);sprodukt.add(samsungs4);sprodukt.add(lgg4);sprodukt.add(nexus6);
        scustomer.add(ivan);scustomer.add(misha);scustomer.add(dasha);scustomer.add(masha);scustomer.add(roma);
        Order o0 = new Order();Order o1 = new Order();Order o2 = new Order();Order o3 = new Order();
        Order o4 = new Order();Order o5 = new Order();Order o6 = new Order();Order o7 = new Order();
        Order o8 = new Order();Order o9 = new Order();Order o10 = new Order();Order o11 = new Order();
        Order o12 = new Order();Order o13 = new Order();Order o14 = new Order();Order o15 = new Order();
        Order o16 = new Order();Order o17 = new Order();Order o18 = new Order();Order o19 = new Order();
        o0.info();o1.info();o2.info();o3.info();o4.info();o5.info();o6.info();o7.info();o8.info();o9.info();o10.info();
        o11.info();o12.info();o13.info();o14.info();o15.info();o16.info();o17.info();o18.info();o19.info();
    }
}
