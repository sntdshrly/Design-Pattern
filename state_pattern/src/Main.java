public class Main {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(5);

        System.out.println(vendingMachine);

        vendingMachine.insertQuarter();
        vendingMachine.turnCrank();

        System.out.println(vendingMachine);

        vendingMachine.insertQuarter();
        vendingMachine.ejectQuarter();
        vendingMachine.turnCrank();

        System.out.println(vendingMachine);

        vendingMachine.insertQuarter();
        vendingMachine.turnCrank();
        vendingMachine.insertQuarter();
        vendingMachine.turnCrank();
        vendingMachine.ejectQuarter();

        System.out.println(vendingMachine);

        vendingMachine.insertQuarter();
        vendingMachine.insertQuarter();
        vendingMachine.turnCrank();
        vendingMachine.insertQuarter();
        vendingMachine.turnCrank();
        vendingMachine.insertQuarter();
        vendingMachine.turnCrank();

        System.out.println(vendingMachine);
    }
}
