//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creăm un obiect Product
        Product product = new Product(1, "Laptop", 1000.0); // Prețul în USD
        System.out.println("Product: " + product);

        // Convertim Product în Produs
        Produs produs = ProductProdusAdapter.ProductToProdus(product);
        System.out.println("Produs (după conversie în Lei): " + produs);

        // Convertim Produs înapoi în Product
        Product productBack = ProductProdusAdapter.ProdusToProduct(produs);
        System.out.println("Product (după conversia înapoi în USD): " + productBack);
    }
}