package kg.charginov;

import java.util.Scanner;

public class LaunchProgram {
    private final Scanner in = new Scanner(System.in);
    public void start(){
        EmployeeManagement employeeManagement = new EmployeeManagement();
        while(true){
            System.out.print(
                    "Выберите функцию:\n" +
                            "1) Добавить нового сотрудника\n" +
                            "2) Удалить сотрудника\n" +
                            "3) Вывести список всех сотрудников\n" +
                            "4) Выйти из программы\n" +
                            "Ввод: "
            );
            int func = in.nextInt();
            if(func == 1) {
                employeeManagement.addEmployee();
            }
            else if(func == 2) {
                System.out.print("Введите ID для удаления: ");
                int id = in.nextInt();
                employeeManagement.removeEmployee(id);
            }
            else if(func == 3){
                employeeManagement.getAllEmployees();
            }else if(func == 4){
                System.out.println("Программа завершилась!");
                return;
            }else{
                System.out.println("Нет такой функции!");
            }
        }
    }
}
