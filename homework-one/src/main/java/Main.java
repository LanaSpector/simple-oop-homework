import app.PersonAppl;
import dto.Employee;
import dto.Manager;
import dto.SaleManager;
import dto.WageEmployee;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Igor", 24, true, "ABC", "manager", 1230.00, 2);
        Manager manager2 = new Manager("Masha", 43, false, "ABC", "manager", 870.00, 4);
        Manager manager3 = new Manager("Masha", 43, false, "ABC", "manager", 870.00, 4);
        Manager manager4 = new Manager("Kirill", 38, true, "ABC", "manager", 900.00, 5);

        SaleManager saleManager1 = new SaleManager("Fedor", 30, false, "First_business_school", "saleManager", 1200.00, 12.00, 20);
        SaleManager saleManager2 = new SaleManager("Rita", 25, false, "First_business_school", "saleManager", 1000.00, 10.00, 5);
        SaleManager saleManager3 = new SaleManager("Anton", 40, true, "First_business_school", "saleManager", 2000.00, 15.00, 50);

        WageEmployee wageEmployee1 = new WageEmployee("Alfred", 35, true, "Factory", "turner", 700, 12, 17);
        WageEmployee wageEmployee2 = new WageEmployee("Sergei", 57, false, "Factory", "welder", 950, 12, 25);
        WageEmployee wageEmployee3 = new WageEmployee("Ivan", 25, false, "Factory", "picker", 500, 12, 10);

        Employee[] employees = new Employee[]{manager1, manager2, manager3, manager4, saleManager1, saleManager2, saleManager3, wageEmployee1, wageEmployee2, wageEmployee3};
        SaleManager saleManager4 = new SaleManager("Fedor", 30, false, "First_business_school", "saleManager", 1200.00, 12.00, 21);

        PersonAppl personAppl = new PersonAppl();
        personAppl.printEmployeeInfo(employees);
        System.out.println(personAppl.isEmployee(employees, saleManager4));

    }
}
