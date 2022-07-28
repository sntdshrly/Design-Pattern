// Nama Program: Facade Pattern
// Nama/NRP: 2072025/Sherly Santiadi


public class Main {
    public static void main(String[] args) {
        Delivery delivery = new Delivery();
        Barang barang = new Barang();
        Stock stock = new Stock();
        Payment payment = new Payment();

        OnlineShopFacade onlineShop = new OnlineShopFacade(delivery,barang,stock,payment);
        onlineShop.pesanBarang("Buku Bacaan");
        onlineShop.terimaBarang();
    }
}
