// Nama Program: Composite Pattern
// Nama/NRP: 2072025/Sherly Santiadi

import java.util.ArrayList;

public class Pack implements Component{

    private ArrayList<Component> components = new ArrayList<>();

    @Override
    public int calculatePrice() {

        int sum= 0;

        for (Component component :
                components) {
            sum+=component.calculatePrice();
        }
        return sum;
    }

    public void addComponent(Component component){
        components.add(component);
        System.out.println("Component added!");
    }

    public void removeComponent(Component component){
        components.remove(component);
        System.out.println("Component removed!");
    }
}