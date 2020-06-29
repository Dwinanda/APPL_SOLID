package detailprinter;

import java.util.ArrayList;
import java.util.List;

public class DetailPrinter {
    private ArrayList<Employee> employees;
    
    public DetailPrinter (ArrayList<Employee> employees) {
        this.employees = employees;
    }
    
    public void printDetail() {
        for(Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
    