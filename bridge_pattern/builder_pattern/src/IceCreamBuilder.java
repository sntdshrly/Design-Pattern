// Nama Program: Builder Pattern
// Nama/NRP: 2072025/Sherly Santiadi
import java.util.ArrayList;
import java.util.List;

public abstract class IceCreamBuilder {
    String name;
    List<String> toppings = new ArrayList<String>();

    public abstract IceCreamBuilder addCaramelSauce();
    public abstract IceCreamBuilder addWhippedCream();
    public abstract IceCreamBuilder addSprinkles();
    public abstract IceCreamBuilder addChocolateSauce();

    public IceCream build() {
        IceCream iceCream = new IceCream();
        iceCream.setName(this.name);
        iceCream.addToppings(toppings);
        return iceCream;
    }
}