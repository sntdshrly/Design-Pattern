public class Main {
    public static void main(String[] args) {

        Tuak tuak = new Tuak();
        System.out.println("\nServing tuak...");
        tuak.prepareRecipe();

        Arak arak = new Arak();
        System.out.println("\nServing arak...");
        arak.prepareRecipe();
    }
}
