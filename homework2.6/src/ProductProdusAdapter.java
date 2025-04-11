public class ProductProdusAdapter {
    private static final double USD_TO_LEI = 4.5; // Curs de schimb fix

    // Convertește un obiect Product într-un obiect Produs
    public static Produs ProductToProdus(Product product) {
        int id = product.getId();
        String nume = product.getName();
        double pretLei = product.getPriceUSD() * USD_TO_LEI; // Conversia prețului din USD în Lei
        return new Produs(id, nume, pretLei);
    }

    // Convertește un obiect Produs într-un obiect Product
    public static Product ProdusToProduct(Produs produs) {
        int id = produs.getId();
        String name = produs.getNume();
        double priceUSD = produs.getPretLei() / USD_TO_LEI; // Conversia prețului din Lei în USD
        return new Product(id, name, priceUSD);
    }
}
