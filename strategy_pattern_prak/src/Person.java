public abstract class Person {
    WriteBehaviour writeBehaviour;

    public Person () {}

    public void performWrite() {
        writeBehaviour.write();
    }

    public void setWriteBehaviour(WriteBehaviour writeBehaviour) {
        this.writeBehaviour = writeBehaviour;
    }
}
