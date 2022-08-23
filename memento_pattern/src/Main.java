// Nama Program: Memento Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class Main {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("Step1");
        careTaker.addMemento((originator.save()));
        printStep(originator);

        originator.setState("Step2");
        careTaker.addMemento((originator.save()));
        printStep(originator);

        originator.restore(careTaker.undo());
        printStep(originator);

        originator.restore(careTaker.redo());
        printStep(originator);


        originator.setState("Step3");
        careTaker.addMemento((originator.save()));
        printStep(originator);

        originator.setState("Step4");
        careTaker.addMemento((originator.save()));
        printStep(originator);


    }

    public static void printStep(Originator o){

        System.out.println("Current Step: " + o.getState());

    }
}