package service;

import entities.Employee;

import java.util.List;
import java.util.ArrayList;

public class EmployeeService {
    List<Employee> list = new ArrayList<>();


    public void addEmployee(int id, String name, double salary) {
        list.add(new Employee(id, name, salary));
    }


    public void getEmployee() {
        for (Employee e : list) {
            System.out.println(e);
        }
    }


    public void increaseSalary(int idEmployee, double percentage) {
        for (Employee e : list) {
            if (e.getId() == idEmployee) {
                double newSalary = e.getSalary() + e.getSalary() * percentage / 100.0;
                e.setSalary(newSalary);
            }
        }
    }


    public boolean hasId(int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
