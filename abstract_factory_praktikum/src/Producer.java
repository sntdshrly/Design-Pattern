import abstract_factory.AbstractFactory;
import fruit_factory.FruitFactory;
import wine_factory.WineFactory;

public class Producer {
    public static AbstractFactory getFactory(String type) {
        if (type.equals("Wine")) {
            return new WineFactory();
        }
        if (type.equals("Fruit")) {
            return new FruitFactory();
        }
        return null;
    }
}
