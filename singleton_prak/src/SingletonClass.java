// Nama Program: Singleton Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class SingletonClass {
    private static final SingletonClass singleObject = new SingletonClass();
    String name;

    private SingletonClass() {}

    // getter
    public static SingletonClass getInstance() {
        return singleObject;
    }
    public String getDetailClass() {
        return "Ini adalah controh Singleton Class";
    }

    // tostring
    @Override
    public String toString() {
        return this.name;
    }
}
