package kg.charginov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement {

    private List<Employee> employees;

    private final Scanner in;

    private int count = 1;

    public EmployeeManagement() {
        this.employees = new ArrayList<>();
        in = new Scanner(System.in);
    }

    public void addEmployee(){
        System.out.print("Введите имя: ");
        String name = in.next();
        if(name.isEmpty() || name.isBlank()){
            System.out.println("Имя не должно быть пустым!");
            return;
        }
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        if(age < 18 || age > 120){
            System.out.println("Возраст должен быть больше 18 или меньше 120");
            return;
        }
        System.out.print("Введите позицию: ");
        String department = in.next();
        if(department.isEmpty() || department.isBlank()){
            System.out.println("Позиция не должна быть пустым!");
            return;
        }
        employees.add(new Employee(
                count++,name,age,department
        ));
        System.out.println(employees);
    }

    public void removeEmployee(int id){
        if(id < 0){
            System.out.println("ID должно быть больше 0!");
            return;
        }
        for(Employee employee:employees){
            if(employee.getId() == id){
                employees.remove(employee);
                return;
            }
        }
        System.out.println("Работник с ID '" + id + "' не существует!");
    }

    public void getAllEmployees(){
        if(employees.isEmpty()){
            System.out.println("Список пустой!");
            return;
        }
        for(Employee employee:employees){
            System.out.print("[" + employee.getId() + ": " + employee.getName() + ", " + employee.getAge() + ", " + employee.getDepartment() + "]\n");
        }
    }

}
