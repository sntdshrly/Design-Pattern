// Nama Program: Composite Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class Main {
    public static void main(String[] args) {
        Pack pack1 = new Pack();
        Pack pack2 = new Pack();
        pack1.addComponent(pack2);
        pack2.addComponent(new Food(5000));

        Pack box3 = new Pack();
        pack1.addComponent(box3);

        box3.addComponent(new Food(4000));
        Pack box4 = new Pack();
        box3.addComponent(box4);

        System.out.println(pack1.calculatePrice());
        pack1.removeComponent(box3);
        System.out.println(pack1.calculatePrice());
        System.out.println(box3.calculatePrice());
    }
}