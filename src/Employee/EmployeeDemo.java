package Employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;

        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for to find all");
            System.out.println("Please input 3 for find employee with ID ");
            System.out.println("Please input 4 for find employee with name of company ");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("please input name");
                    String name = scanner.nextLine();
                    System.out.println("please input surname");
                    String surname = scanner.nextLine();
                    System.out.println("please input employee ID");
                    String employeeID = scanner.nextLine();
                    System.out.println("please input salary of employee");
                    int salary = Integer.parseInt(scanner.nextLine());
                    System.out.println("please input the company where worked the employee");
                    String company = scanner.nextLine();
                    System.out.println("please input hte position of employee ");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name, surname, employeeID, salary, company, position);
                    employeeStorage.add(employee);
                    System.out.println("Employee is created");
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    employeeStorage.searchByID(keyword);
                    break;
                case "4":
                    System.out.println("Please input letter ");
                    String keywordCompany = scanner.nextLine();
                    employeeStorage.searchByCompanyName(keywordCompany);

                case "5":
                    System.out.println("Please input employee ID");
                    String ID = scanner.nextLine();
                    break;
                default:
                    System.out.println("Please try again");
                    break;

            }
        }
    }


}

