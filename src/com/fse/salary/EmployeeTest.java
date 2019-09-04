package com.fse.salary;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeTest {
   public static void main(String[] args) {
        
       Employee employee1 = new Employee("first", "last", 0.0);
       Employee employee2 = new Employee("first", "last", 0.0);

   Scanner input = new Scanner(System.in);
        
       String firstName;
       String lastName;
       double monthlySalary;
       int increament;
       int increamentFrequency;
       int incValue;
       double dedution;
       int dedValue;
       int deductionFrequency;
       int preductionYear;

       System.out.println("Enter details of employee1:\n");
        
       System.out.print("Enter First Name: ");
       firstName = input.next();
       employee1.setFirstName(firstName);
       employee1.getFirstName();
       System.out.print("Enter Last Name: ");
       lastName = input.next();
       employee1.setLastName(lastName);
       employee1.getLastName();
       System.out.print("Enter Current Monthly Salary: ");
       monthlySalary = input.nextDouble();
       if(monthlySalary <1 ) {
    	   System.out.print(" Monthly Salary should be > 1, Please re enter ");
           monthlySalary = input.nextDouble();
       }
       
       System.out.print("Enter Expected Increament in Percentage: ");
       increament = input.nextInt();
       if(increament <0 ) {
    	   System.out.print(" Increament should be +ve value, Please re enter ");
    	   increament = input.nextInt();
       }
       
       System.out.print("Enter frequently is increment received (1 - quarterly, 2 - half-yearly, 3 - annually): ");
       increamentFrequency =input.nextInt();
       if(increamentFrequency <1  || increamentFrequency >3) {
    	   System.out.print(" Deduction frequency  should be 1 - quarterly, 2 - half-yearly, 3 - annually, Please re enter ");
    	   increamentFrequency = input.nextInt();
    	   
       }
       incValue =0;
       if(increamentFrequency ==1) {
		   incValue = 4;
		} else if( increamentFrequency == 2) {
			incValue = 2;
		}else if(increamentFrequency == 3) {
			incValue = 1;
		}
       
              
       System.out.print("Enter deduction in income" );
       dedution =input.nextDouble();
       if(dedution < 0) {
    	   System.out.print(" Dedution should be +ve value, Please re enter ");
    	   dedution = input.nextDouble();
       }
       
       System.out.print("Enter frequently is deduction received (1 - quarterly, 2 - half-yearly, 3 - annually): ");
       deductionFrequency =input.nextInt();
       if(deductionFrequency <1  || deductionFrequency >3) {
    	   System.out.print(" Deduction frequency should be 1 - quarterly, 2 - half-yearly, 3 - annually, Please re enter ");
    	   deductionFrequency = input.nextInt();
       } 
       dedValue =0;
	   if(deductionFrequency ==1) {
		   dedValue = 4;
		} else if( deductionFrequency == 2) {
			dedValue = 2;
		}else if(deductionFrequency == 3) {
			dedValue = 1;
		}
     
       System.out.print("Enter predection requested in years: ");
       preductionYear = input.nextInt();
       
       
       if (monthlySalary > 0) //if monthly salary is not positive do not set its value
           employee1.setmonthlySalary(monthlySalary);
       employee1.getmonthlySalary();

//       System.out.println();
//
//       System.out.println("Enter details of employee2:\n");
//
//       System.out.print("Enter First Name: ");
//       firstName = input.next();
//       employee2.setFirstName(firstName);
//       employee2.getFirstName();
//       System.out.print("Enter Last Name: ");
//       lastName = input.next();
//       employee2.setLastName(lastName);
//       employee2.getLastName();
//       System.out.print("Enter Monthly Salary: ");
//       monthlySalary = input.nextDouble();
//       if (monthlySalary > 0) //if monthly salary is not positive do not set its value
//           employee2.setmonthlySalary(monthlySalary);
//       employee2.getmonthlySalary();

//       System.out.println();

//       employee1.yearlySalary();
//       employee2.yearlySalary();

//       employee1.displayYearlySalary();

//       System.out.println();

//       employee2.displayYearlySalary();

//       System.out.println();

       employee1.yearlySalaryIncrease();
//       employee2.yearlySalaryIncrease();

//       System.out.printf("Congratulations to %s %s and %s %s. You just earned"
//               + " for yourselves a 10%c increase in your yearly salaries. "
//               + "\nYour new yearly salaries are:\n\n", employee1.getFirstName(),
//               employee1.getLastName(),  '%');

       employee1.displayYearlySalaryIncrease();

//       System.out.println();
       List<Output1> op1s= new ArrayList<Output1>();
       Output1 op;
       for(int i = 0; i < preductionYear; i++) {
    	   op = new Output1(i+1, monthlySalary,incValue,increament,dedution,dedValue);
    	   monthlySalary = monthlySalary+op.getIncreamentAmt();
    	   op1s.add(op);
        }
       
       // Print the list objects in tabular format.
       System.out.println("-----------------------------------------------------------------------------");
       System.out.printf("%10s %30s %20s %5s %5s", "YEAR", "Starting Salary", "Number of Increments", "Increment %", "Increment Amount");
       System.out.println();
       System.out.println("-----------------------------------------------------------------------------");
       for (Output1 op1: op1s){
           System.out.format("%10s %30s %20d %5d %5d",
        		   op1.getYear(), op1.getStartingSal(), op1.getNoIncrement(), op1.getPercentIncreament(), (int)op1.getIncreamentAmt());
           System.out.println();
       }
       System.out.println("-----------------------------------------------------------------------------");

       // Print the list objects in tabular format.
       System.out.println("-----------------------------------------------------------------------------");
       System.out.printf("%10s %30s %20s %5s %5s", "YEAR", "Starting Salary", "Number of Deduction", "Deduction %", "Deduction Amount");
       System.out.println();
       System.out.println("-----------------------------------------------------------------------------");
       for (Output1 op1: op1s){
           System.out.format("%10s %30s %20s %5d %5d",
        		   op1.getYear(), op1.getStartingSal(), op1.getNoDedt(), op1.getDedtPct() , (int)op1.getAnnualDedtAMt());
           System.out.println();
       }
       System.out.println("-----------------------------------------------------------------------------");

       // Print the list objects in tabular format.
       System.out.println("-----------------------------------------------------------------------------");
       System.out.printf("%10s %30s %20s %5s %5s", "YEAR", "Starting Salary", "Increment Amt", "Deduction Amt", "Salary Growth");
       System.out.println();
       System.out.println("-----------------------------------------------------------------------------");
       for (Output1 op1: op1s){
           System.out.format("%10s %30s %20s %5s %5s",
        		   op1.getYear(), op1.getStartingSal(), op1.getIncreamentAmt(), op1.getDedtAMt(), op1.getSalGrowth());
           System.out.println();
       }
       System.out.println("-----------------------------------------------------------------------------");

//       employee2.displayYearlySalaryIncrease();

   }
}

