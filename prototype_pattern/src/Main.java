// Nama Program: Prototype Pattern
// Nama/NRP: 2072025/Sherly Santiadi

import java.util.List;

public class Main {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        Employees employees = new Employees();
        employees.loaddata();

        Employees employees1 = (Employees) employees.clone();
        Employees employees2 = (Employees) employees.clone();
        List<String> list = employees1.getEmpList();
        list.add("Employee 3");

        employees2.getEmpList().remove("Employee 1");

        System.out.println("First employees list: "+employees.getEmpList());
        System.out.println("Clone employees list with additional employee: "+list);
        System.out.println("Clone employees list with removal employee: "+employees2.getEmpList());

    }
}