// Nama Program: Iterator Pattern
// Nama/NRP: 2072025/Sherly Santiadi
public class Main {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggreagate=new ConcreteAggregate();
        Iterator iterator=concreteAggreagate.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
