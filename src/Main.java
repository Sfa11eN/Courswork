
public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        System.out.println("Курсовая");

        Employee svetlana = new Employee("Svetlana", 1, 30000);
        Employee igor = new Employee("Igor", 3, 70000);
        Employee vazgen = new Employee("Vazgen", 2, 60000);
        Employee marina = new Employee("Marina", 2, 45000);
        Employee vladimir = new Employee("Vladimir", 3, 90000);
        Employee sergey = new Employee("Sergey", 1, 37000);

        employees[0] = svetlana;
        employees[1] = igor;
        employees[2] = vazgen;
        employees[3] = marina;
        employees[4] = vladimir;
        employees[5] = sergey;
        getAllEmployees();
        getSumSalary();
        lowSalary();
        highSalary();
        averageSalary();
        getAllEmployeeName();
        indexSalary(1.1);
    }


    private static void getAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }

    }

    private static void getSumSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }


        }
        System.out.println("Зарплаты в  текущем месяце составляют " + sum);
    }

    private static void lowSalary() {
        int lowSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < lowSalary) {
                    lowSalary = employees[i].getSalary();

                }
            }

        }
        System.out.println("Минимальная зарплата = " + lowSalary);
    }

    private static void highSalary() {
        int highSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > highSalary) {
                    highSalary = employees[i].getSalary();

                }
            }

        }
        System.out.println("Максимальная зарплата = " + highSalary);
    }

    private static void averageSalary() {
        int averageSalary = 0;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
                count = count + 1;
            }


        }
        averageSalary = sum / count;

        System.out.println("Средняя зарплата  сотрудников= " + averageSalary);

    }

    private static void getAllEmployeeName() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }

    }

    private static void indexSalary(double r) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].setSalary((int) (r * employees[i].getSalary()));
                System.out.println(employees[i].getSalary());


            }

        }
    }
    private static void departmentLowSalary(double p) {
    }


}