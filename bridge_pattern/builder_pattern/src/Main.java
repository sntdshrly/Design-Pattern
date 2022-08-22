// Nama Program: Builder Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class Main {

    public static void main(String[] args) {
        IceCreamBuilder iceCreamOriginal = new IceCreamOriginal();
        IceCream iceCream = iceCreamOriginal.addCaramelSauce().addChocolateSauce().addSprinkles().addWhippedCream().build();
        iceCream.prepare();
        iceCream.scoop();
        iceCream.serve();
        System.out.println(iceCream);

        IceCreamBuilder iceCreamLactoseFree = new IceCreamLactoseFree();
        IceCream iceCreamLF = iceCreamLactoseFree.addCaramelSauce().addChocolateSauce().addSprinkles().addWhippedCream().build();
        iceCreamLF.prepare();
        iceCreamLF.scoop();
        iceCreamLF.serve();
        System.out.println(iceCreamLF);

    }
}
