// Nama Program: Decorator Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class Main {
    public static void main(String[] args) {
        // Ice cream cone
        Product iceCreamCone = new IceCreamCone();
        System.out.println("Pesanan Anda "+iceCreamCone.namaProduk + " total harga " + String.format("%.2f", iceCreamCone.getHarga()));

        // Ice cream cone dengan topping oreo
        Product iceCreamConeOreo = new AdditionOreo(iceCreamCone);
        System.out.println("Pesanan Anda "+iceCreamConeOreo.getNamaProduk() + " total harga " + String.format("%.2f", iceCreamConeOreo.getHarga()));

        // Ice cream cone dengan topping sprinkle
        Product iceCreamConeSprinkle = new AdditionSprinkles(iceCreamCone);
        System.out.println("Pesanan Anda "+iceCreamConeSprinkle.getNamaProduk() + " total harga " + String.format("%.2f", iceCreamConeSprinkle.getHarga()));

        System.out.println("-------------------------------------------------------------------------");

        // Ice cream gelato
        Product iceCreamGelato = new IceCreamGelato();
        System.out.println("Pesanan Anda "+iceCreamGelato.namaProduk + " total harga " + String.format("%.2f", iceCreamGelato.getHarga()));

        // Ice cream gelato dengan topping oreo
        Product iceCreamCGelatoOreo = new AdditionOreo(iceCreamGelato);
        System.out.println("Pesanan Anda "+iceCreamCGelatoOreo.getNamaProduk() + " total harga " + String.format("%.2f", iceCreamCGelatoOreo.getHarga()));

        // Ice cream gelato dengan topping sprinkle
        Product iceCreamCGelatoSprinkle = new AdditionSprinkles(iceCreamGelato);
        System.out.println("Pesanan Anda "+iceCreamCGelatoSprinkle.getNamaProduk() + " total harga " + String.format("%.2f", iceCreamCGelatoSprinkle.getHarga()));


    }
}
