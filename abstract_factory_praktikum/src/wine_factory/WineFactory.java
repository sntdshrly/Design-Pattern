package wine_factory;

import abstract_factory.AbstractFactory;
import fruit_factory.Fruit;

public class WineFactory extends AbstractFactory {
    @Override
    public Fruit getFruit(String type) {
        return null;
    }

    @Override
    public Wine getWine(String type) {

        if (type.equals("Red Wine")) {
            return new RedWine();
        }

        if (type.equals("White Wine")) {
            return new WhiteWine();
        }

        if (type.equals("Green Wine")) {
            return new GreenWine();
        }

        return null;
    }
}
