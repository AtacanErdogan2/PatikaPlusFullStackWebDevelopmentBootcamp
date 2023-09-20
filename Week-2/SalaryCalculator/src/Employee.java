public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

    double bonus() {
        int extraHours = this.workHours - 40;
        if (this.workHours > 40) {
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    double raiseSalary() {
        if (2021 - this.hireYear < 10) {
            return this.salary * 0.05;
        } else if (2021 - this.hireYear >= 10 && 2021 - this.hireYear < 20) {
            return this.salary * 0.1;
        } else {
            return this.salary * 0.15;
        }
    }

    double withTaxBonus() {
        return this.salary + bonus() - tax();
    }

    double totalSalary() {
        return withTaxBonus() + raiseSalary();
    }

    public String toString() {
        return " Name : " + this.name
                + "\n Salary : " + this.salary + " TL"
                + "\n Work Hours : " + this.workHours
                + "\n Hire Year : " + this.hireYear
                + "\n Tax : " + tax() + " TL"
                + "\n Bonus : " + bonus() + " TL"
                + "\n Raise of Salary : " + raiseSalary() + " TL"
                + "\n Salary with tax and bonus : " + withTaxBonus() + " TL"
                + "\n Total Salary : " + totalSalary() + " TL";
    }
}
