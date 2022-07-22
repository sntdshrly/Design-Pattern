// Nama Program: Decorator Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public abstract class Product {
    // deklarasi variabel
    String namaProduk = "";

    // getter
    public String getNamaProduk() {
        return namaProduk;
    }

    // method
    public abstract double getHarga();
}
