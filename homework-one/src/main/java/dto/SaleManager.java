package dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class SaleManager extends Employee {
    double totalSales;
    double bonus;


    public SaleManager(String name, int age, boolean married, String company, String position, double baseSalary, double totalSales, double bonus) {
        super(name, age, married, company, position, baseSalary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return getBaseSalary() + getTotalSales() * getBonus() / 100;
    }

}
