// Nama Program: Factory Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class Samsung implements Mobile{
    private int ramSize;
    private String processor;
    public String name = Mobile.SAMSUNG;

    public Samsung(String processor){
        this.processor = processor;
        this.ramSize = 2;
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "ramSize=" + ramSize +
                ", processor='" + processor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
