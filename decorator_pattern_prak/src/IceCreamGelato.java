// Nama Program: Decorator Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class IceCreamGelato extends Product{

    public IceCreamGelato(){
        namaProduk = "Ice Cream Gelato";
    }

    @Override
    public double getHarga() {
        return 20000;
    }
}
