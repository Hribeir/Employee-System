package application;

import service.EmployeeService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        EmployeeService service = new EmployeeService();

        int n;
        do {
            System.out.println(" 1 - Cadastrar funcionários\n 2 - Listar funcionarios\n 3 - Aumentar salários\n 0 - sair");
            System.out.print(" Digite: ");
            n =  sc.nextInt();

            switch (n) {
                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                case 1:
                    System.out.print("Id: ");
                    int id = sc.nextInt();

                    while(service.hasId(id)) {
                        System.out.println("ID já está em uso. Por favor, tente outro.");
                        id = sc.nextInt();
                    }
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String name = sc.nextLine();
                    System.out.print("Salário: ");
                    double salary = sc.nextDouble();
                    service.addEmployee(id, name, salary);
                    break;


                    case 2:
                        System.out.println("----------------------");
                        service.getEmployee();
                        System.out.println("----------------------");
                        break;

                case 3:
                    System.out.print("Insira o ID do funcionário que terá aumento salarial: ");
                    int idEmployee = sc.nextInt();
                    System.out.print("Insira a porcentagem: ");
                    double percentage = sc.nextDouble();
                    service.increaseSalary(idEmployee, percentage);
                    break;

                    default:
                        System.out.println("Não existe!");

            }
        } while (n != 0);

        sc.close();

    }
}
