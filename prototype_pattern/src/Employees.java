// Nama Program: Prototype Pattern
// Nama/NRP: 2072025/Sherly Santiadi

import java.util.ArrayList;
import java.util.List;
public class Employees implements Cloneable{
    List<String> employees;
    Employees() {
        employees = new ArrayList<>();
    }
    Employees(List<String> employees){
        this.employees = employees;
    }
    void loaddata(){
        employees.add("Employee 1");
        employees.add("Employee 2");
    }
    List<String> getEmpList(){
        return employees;
    }
    @Override
    protected Object clone()throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String s: this.getEmpList()){
            temp.add(s);
        }
        return new Employees(temp);
    }
}