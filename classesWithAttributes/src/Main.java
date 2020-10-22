public class Main {

    public static void main(String[] args) {
        Product product = new Product(1,"laptos","w",2323,123,"df");
        product.setName("laptop");
        product.setId(2);
        product.setDescription("asus laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
		System.out.println(product.getKod());
    }
}
