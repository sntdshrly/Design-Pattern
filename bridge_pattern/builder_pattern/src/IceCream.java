// Nama Program: Builder Pattern
// Nama/NRP: 2072025/Sherly Santiadi
import java.util.List;

public class IceCream {
    String name;
    List<String> toppings;

    public void setName(String name) {
        this.name = name;
    }
    public void addToppings(List<String> toppings){
        this.toppings = toppings;
    }

    void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    void scoop() {
        System.out.println("Scooping ice cream");
    }

    void serve() {
        System.out.println("Place ice cream in the cone");
    }
    public String toString() {
        return "Your "+this.name+" ready to eat!\n";
    }
}
