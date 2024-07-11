package app;

import dto.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class PersonAppl {


    public void printEmployeeInfo(Employee[] employees) {
        if (Objects.isNull(employees)) {
            return;
        }
        Arrays.stream(employees).filter(Objects::nonNull).forEach(Person::display);
    }

    public double employeesSalary(Employee[] employees) {
        if (Objects.isNull(employees)) {
            return -1;
        }
        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .mapToDouble(Employee::calculateSalary)
                .sum();
    }

    public boolean isEmployee(Employee[] employees, Employee employee) {
        if (Objects.isNull(employees) || Objects.isNull(employee)) {
            return false;
        }
        return Arrays.asList(employees).contains(employee);
    }

    public double getTotalSales(Employee[] employees) {
        if (Objects.isNull(employees)) {
            return -1;
        }
        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(employee -> employee.getClass().equals(SaleManager.class))
                .map(employee -> (SaleManager) employee)
                .mapToDouble(SaleManager::getTotalSales)
                .sum();
    }
}
