import abstract_factory.AbstractFactory;
import fruit_factory.Fruit;
import wine_factory.Wine;

public class ClientTest {
    public static void main(String[] args) {

        AbstractFactory wineFactory = Producer.getFactory("Wine");
        Wine wine = wineFactory.getWine("Red Wine");
        wine.make();

        AbstractFactory fruitFactory = Producer.getFactory("Fruit");
        Fruit fruit = fruitFactory.getFruit("Red Grape");
        fruit.wash();

    }
}
