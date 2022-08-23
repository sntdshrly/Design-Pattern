// Nama Program: Memento Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class Originator {
    private String state;

    public  Originator(){
    }

    public  void  setState(String state) {
        this.state = state;
    }

    public String getState(){
        return this.state;
    }

    public Memento save(){
        return  new Memento(state);
    }

    public void restore(Memento m) {
        this.state = m.getState();
    }
}