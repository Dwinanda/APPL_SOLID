package detailprinter;

public class Employee {
    String name;
    
    public Employee(String name)
    {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public String ToString() {
        return this.name;
    }
}
