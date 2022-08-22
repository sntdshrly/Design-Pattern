// Nama Program: Builder Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class IceCreamOriginal extends IceCreamBuilder{

    public IceCreamOriginal() {
        this.name = "Ice Cream Original";
    }

    @Override
    public IceCreamBuilder addCaramelSauce() {
        this.toppings.add("caramel sauce");
        return this;
    }

    @Override
    public IceCreamBuilder addWhippedCream() {
        this.toppings.add("whipped cream");
        return this;
    }

    @Override
    public IceCreamBuilder addSprinkles() {
        this.toppings.add("sprinkles");
        return this;
    }

    @Override
    public IceCreamBuilder addChocolateSauce() {
        this.toppings.add("chocolate sauce");
        return this;
    }
}
