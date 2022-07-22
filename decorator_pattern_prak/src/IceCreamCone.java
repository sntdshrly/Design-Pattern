// Nama Program: Decorator Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class IceCreamCone extends Product{

    public IceCreamCone(){
        namaProduk = "Ice Cream Cone";
    }

    @Override
    public double getHarga() {
        return 10000;
    }
}
