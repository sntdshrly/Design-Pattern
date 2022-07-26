// Nama Program: Singleton Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class Main {
    public static void main(String[] args) {
        SingletonClass objek1 = SingletonClass.getInstance();
        SingletonClass objek2 = SingletonClass.getInstance();


        objek1.name="Nama objek";

        System.out.println(objek1);
        System.out.println(objek2);
        System.out.println(objek1.name);
        System.out.println(objek2.name);

        System.out.println("*********************************");
        System.out.println(objek1.getDetailClass());
        System.out.println(objek2.getDetailClass());

    }
}
