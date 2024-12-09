public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product("Product1", 20.0);
        Product product2 = new Product("Product2", 30.0);

        System.out.println("Before price reduction:");
        product1.printProduct();
        product2.printProduct();

        product1.setPrice(product1.getPrice() - 5);
        product2.setPrice(product2.getPrice() - 5);

        System.out.println("After price reduction:");
        product1.printProduct();
        product2.printProduct();
    }
}
