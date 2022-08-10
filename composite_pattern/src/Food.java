// Nama Program: Composite Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class Food implements Component{

    int price;

    public Food(int price){
        this.price = price;
    }

    @Override
    public int calculatePrice() {
        return price;
    }
}