// Nama Program: Decorator Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class AdditionOreo extends AdditionDecorator{

    public AdditionOreo(Product product){
        this.product = product;
    }

    @Override
    public String getNamaProduk() {
        return product.getNamaProduk() + " dengan topping oreo";
    }

    @Override
    public double getHarga() {
        return product.getHarga()+500;
    }
}
