package fruit_factory;

import abstract_factory.AbstractFactory;
import wine_factory.Wine;

public class FruitFactory extends AbstractFactory {
    @Override
    public Fruit getFruit(String type) {

        if (type.equals("Red Grape")) {
            return new RedGrape();
        }

        if (type.equals("White Grape")) {
            return new WhiteGrape();
        }

        if (type.equals("Green Grape")) {
            return new GreenGrape();
        }

        return null;
    }

    @Override
    public Wine getWine(String type) {
        return null;
    }
}
