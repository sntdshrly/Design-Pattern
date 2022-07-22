// Nama Program: Factory Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class Sony implements Mobile{
    private int ramSize;
    private String processor;
    public String name = Mobile.SONY;

    public Sony(int ramSize, String processor){
        this.ramSize = ramSize;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Sony{" +
                "ramSize=" + ramSize +
                ", processor='" + processor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}