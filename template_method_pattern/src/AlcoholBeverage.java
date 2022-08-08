public abstract class AlcoholBeverage {
    final void prepareRecipe() {
        chooseFruit();
        grindFruit();
        addYeast();
        distillate();

    }

    abstract void chooseFruit();

    void grindFruit() {
        System.out.println("Grinding it with mortar");
    }

    void addYeast() {
        System.out.println("Pouring yeast and water into cup");
    }

    void distillate() {
        System.out.println("Distillate with boiled water");
    }
}
