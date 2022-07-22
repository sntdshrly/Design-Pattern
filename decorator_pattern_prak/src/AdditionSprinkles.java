// Nama Program: Decorator Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class AdditionSprinkles extends AdditionDecorator{

    public AdditionSprinkles(Product product){
        this.product = product;
    }

    @Override
    public String getNamaProduk() {
        return product.getNamaProduk() + " dengan topping sprinkles";
    }

    @Override
    public double getHarga() {
        return product.getHarga()+250;
    }
}
