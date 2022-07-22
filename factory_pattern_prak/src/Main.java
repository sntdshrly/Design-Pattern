// Nama Program: Factory Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class Main {
    public static void main(String[] args) {
        Mobile mobile = MobileFactory.createMobile(Mobile.SAMSUNG);
        System.out.println(mobile);
        Mobile mobile2 = MobileFactory.createMobile(Mobile.SONY);
        System.out.println(mobile2);
    }
}
