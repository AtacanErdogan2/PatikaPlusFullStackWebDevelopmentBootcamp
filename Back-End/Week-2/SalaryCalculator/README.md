A program that calculates the salary of employees.

In Java, you need to write a class called "Employee" that represents the factory employees and calculates their salaries
with its methods. This class will have 4 properties and 5 methods.

***Class Properties***

name : Name and surname of the employee

salary : Employee's salary

workHours : Working hours per week

hireYear : Start year of employment

***Class Methods***

Employee(name,salary,workHours,hireYear) : Constructor method and will take 4 parameters.

tax() : will calculate the tax applied to the salary.

If the employee's salary is less than 1000 TL, the tax will not apply.

If the employee's salary is more than 1000 TL, a tax of 3% of the salary will be applied.

bonus() : If the employee has worked more than 40 hours per week, it will calculate bonus wages of 30 TL for each extra
hour worked.

raiseSalary() : It will calculate the salary increase according to the employee's starting year. Take the current year
as 2021.

If the employee has been working for less than 10 years, the salary will be increased by 5%.

If the employee has worked for more than 9 years and less than 20 years, the salary will be increased by 10%.

If the employee has worked more than 19 years, the salary will be increased by 15%.

toString() : It will print the information about the employee on the screen.