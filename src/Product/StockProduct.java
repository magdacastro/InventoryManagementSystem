package Product;

public class StockProduct {
    private int qtdSold;
    private int qtdAddStock;
    private int qtdInStock;
    private Product product;

    public StockProduct(Product product, int qtdSold, int qtdAddStock, int qtdInStock) {
        this.qtdSold = qtdSold;
        this.qtdAddStock = qtdAddStock;

        if (qtdSold > (qtdInStock + qtdAddStock)) {
            throw new RuntimeException("Quantidade vendida não pode ser maior que o estoque disponível.");
        }

        this.qtdInStock = qtdInStock;
        this.product = product;

        this.updateStock();
    }

    public void addQtdProducts(int qtd){
        this.setQtdAddStock(this.getQtdInStock() + qtd);
    }

    public void updateStock(){
        this.setQtdInStock(this.getQtdInStock() + this.getQtdAddStock() - this.getQtdSold());
    }

    public void removeQtdProducts(int qtd){
        this.setQtdSold(this.getQtdInStock() - qtd);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQtdSold() {
        return qtdSold;
    }

    public void setQtdSold(int qtdSold) {
        this.qtdSold = qtdSold;
    }

    public int getQtdAddStock() {
        return qtdAddStock;
    }

    public void setQtdAddStock(int qtdAddStock) {
        this.qtdAddStock = qtdAddStock;
    }

    public int getQtdInStock() {
        return qtdInStock;
    }

    public void setQtdInStock(int qtdInStock) {
        this.qtdInStock = qtdInStock;
    }

}
