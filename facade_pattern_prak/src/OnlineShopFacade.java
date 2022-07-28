// Nama Program: Facade Pattern
// Nama/NRP: 2072025/Sherly Santiadi


public class OnlineShopFacade {
    Delivery delivery;
    Barang barang;
    Stock stock;
    Payment payment;

    public OnlineShopFacade(Delivery delivery, Barang barang, Stock stock, Payment payment) {
        this.delivery = delivery;
        this.barang = barang;
        this.stock = stock;
        this.payment = payment;
    }

    public void pesanBarang(String namaBarang){
        System.out.println("Sedang memproses pesanan");
        stock.cek();
        barang.kemasBarang();
        barang.kirimKepadaKurir();
        delivery.kirimBarang();
    }
    public void terimaBarang(){
        System.out.println("Barang sudah diterima");
        barang.terimaBarang();
        payment.bayar();
    }
}
