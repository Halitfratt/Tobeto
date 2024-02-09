package homeworks.hw2.youtube.cleancode;

public class Main {
    public static void main(String[] args) {
        //ürünler
        Product product1 = new Product(1,"Kitap",120.0);
        Product product2 = new Product(2,"Defter",75.0);
        //bir normal müşteri, bir öğrenci, bir askeri
        Customer customer1 = new Customer(1,"Akin Aksoy");
        Student customer2 = new Student(2,"Engin Demiroğ");
        Military militaryCustomer = new Military(3,"İsmail Bayraktar");

        IBankService iBankService = new CentralBankService();
        ProductManager productManager = new ProductManager(iBankService);
        System.out.println("************");


        productManager.sell(product1,customer1);
        productManager.sell(product1,customer2);
        productManager.sell(product1,militaryCustomer);




    }

}
