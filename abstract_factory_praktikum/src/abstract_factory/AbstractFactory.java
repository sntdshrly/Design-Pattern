package abstract_factory;

import fruit_factory.Fruit;
import wine_factory.Wine;

public abstract class AbstractFactory {
    public abstract Wine getWine(String type);

    public abstract Fruit getFruit(String type);
}
