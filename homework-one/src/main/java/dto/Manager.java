package dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Manager extends Employee {
    int grade;

    public Manager(String name, int age, boolean married, String company, String position, double baseSalary, int grade) {
        super(name, age, married, company, position, baseSalary);
        setGrade(grade);
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 6) {
            this.grade = grade;
        }
    }

    public double calculateSalary() {
        return getBaseSalary() * grade;
    }
}
