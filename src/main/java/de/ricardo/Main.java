package de.ricardo;

public class Main {
    public static void main(String[] args) {

        ProductRepo repo = new ProductRepo();


        Product macbook = new Product("Macbook", "Apple", "Pro",  2499, 123456);
        Product gamingLaptop = new Product("Gaming Laptop", "Razor", "Blade",  2399, 123457);
        Product gamingPC = new Product("Gaming PC", "Asus", "Game on", 1499, 123458 );

        repo.addProduct(macbook);
        repo.addProduct(gamingLaptop);
        repo.addProduct(gamingPC);


        repo.getProducts();


        System.out.println("Product by Id: " + repo.getProductById(123456));


        System.out.println("\nRemoving Product by Id");
        repo.removeProduct(repo.getProductById(123456));


        repo.getProducts();
    }
}