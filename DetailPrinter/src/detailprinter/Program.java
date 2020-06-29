package detailprinter;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Employee employee = new Employee("name");
        Manager manager = new Manager("name", new ArrayList<String>());
        
        ArrayList<Employee> List = new ArrayList<Employee>();
        List.add(employee);
        List.add(manager);
        List.add(employee);
        List.add(employee);
        List.add(manager);
        
        DetailPrinter printer = new DetailPrinter(List);
        printer.printDetail();
    }
    
}
