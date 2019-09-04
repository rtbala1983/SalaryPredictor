package com.fse.salary;

public class Employee {
	  private String firstName; 
	   private String lastName; 
	   private double monthlySalary;

	   public Employee(String name, String name2, double salary) {
	       firstName = name;
	       lastName = name2;
	       monthlySalary = salary;
	   }

	   public void setFirstName(String name) {
	       firstName = name;
	   }

	   public String getFirstName() {
	       return firstName;
	   }

	   public void setLastName(String name) {
	       lastName = name;
	   }

	   public String getLastName() {
	       return lastName;
	   }

	   public void setmonthlySalary(double salary) {
	       monthlySalary = salary;
	   }

	   public double getmonthlySalary() {
	       return monthlySalary;
	   }

	   public double yearlySalary() {
	       double yearlySalary;
	       yearlySalary = (monthlySalary * 12);
	       return yearlySalary;
	   }

	   public double yearlySalaryIncrease() {
	       double yearlySalaryIncrease;
	       yearlySalaryIncrease = (((yearlySalary() * (0.1)) + yearlySalary()));
	       return yearlySalaryIncrease;
	   }

	   public void displayYearlySalary() {
	       System.out.printf("%s %s's Yearly Salary is $%.2f\n", firstName, lastName,
	          yearlySalary());
	   }

	   public void displayYearlySalaryIncrease() {
	       System.out.printf("%s %s = $%.2f\n", firstName, lastName, yearlySalaryIncrease());
	   }

	}

