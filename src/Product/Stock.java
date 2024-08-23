package Product;

import java.util.ArrayList;


public class Stock {
    private ArrayList<StockProduct> stockProducts;

    public Stock() {
        this.stockProducts = new ArrayList<>();
    }

    public void registerProduct(StockProduct product) {
        stockProducts.add(product);
    }

    public void showDetails() {
        for (int index = 0; index < stockProducts.size(); index++) {
            System.out.println("Temos o produto " + this.getStockProducts().get(index).getProduct().getName() + " cujo ID é " + this.getStockProducts().get(index).getProduct().getId() + " com o preço de " + this.getStockProducts().get(index).getProduct().getFormatPrice() + ".\n" +
                    this.getStockProducts().get(index).getQtdInStock() + " em estoque, vendemos " + this.getStockProducts().get(index).getQtdSold() + " e compramos mais " + this.getStockProducts().get(index).getQtdAddStock() + " para adicionar ao estoque."
            );

            System.out.println("---------------");
        }
    }

    public ArrayList<StockProduct> getStockProducts() {
        return stockProducts;
    }

    public void setStockProducts(ArrayList<StockProduct> stockProducts) {
        this.stockProducts = stockProducts;
    }

}

