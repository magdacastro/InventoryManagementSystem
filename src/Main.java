import Product.Product;
import Product.StockProduct;
import Product.Stock;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StockProduct p1 = new StockProduct(new Product(1, "Camiseta", 35.90), 25, 56, 10);
        StockProduct p2 = new StockProduct(new Product(2, "Bermuda", 69.90), 60, 200, 8);
        Stock stock = new Stock();
        stock.registerProduct(p1);
        stock.registerProduct(p2);
        stock.showDetails();
    }
}