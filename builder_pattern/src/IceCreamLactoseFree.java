public class IceCreamLactoseFree extends IceCreamBuilder{
    public IceCreamLactoseFree() {
        this.name = "Ice Cream Lactose Free";
    }

    @Override
    public IceCreamBuilder addCaramelSauce() {
        this.toppings.add("caramel sauce");
        return this;
    }

    @Override
    public IceCreamBuilder addWhippedCream() {
        // Karena LF maka tidak ada topping whipped cream
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
