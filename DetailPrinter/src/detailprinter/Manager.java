package detailprinter;

import java.util.ArrayList;
import java.util.Collection;

public class Manager extends Employee{
    private ArrayList<String> documents;
    
    public Manager(String name, ArrayList documents) {
        super(name);
        this.documents = new ArrayList<String>(documents);
    }
    
    public Collection<String> getDocuments() {
        return documents;
    }
    
    public void setDocuments(ArrayList<String> documents) {
        this.documents = documents;
    }
    
    public String ToString() {
        return this.name + " = " + this.documents.toString();
    }
}
