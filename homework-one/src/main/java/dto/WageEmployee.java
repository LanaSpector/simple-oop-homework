package dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class WageEmployee extends Employee {
    double hours;
    double wage;

    public WageEmployee(String name, int age, boolean married, String company, String position, double baseSalary, double hours, double wage) {
        super(name, age, married, company, position, baseSalary);
        this.hours = hours;
        this.wage = wage;
    }

    public double calculateSalary() {
        return getBaseSalary() + getHours() * getWage();
    }
}
