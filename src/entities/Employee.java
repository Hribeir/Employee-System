package entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee (int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    public String toString() {
        return
               "ID: "  + getId() + " | " + "Nome: " + getName() + " | " + "Salário: " + String.format("%.2f", getSalary());

    }
}
