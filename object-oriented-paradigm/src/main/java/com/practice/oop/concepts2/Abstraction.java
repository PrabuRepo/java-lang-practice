package com.practice.oop.concepts2;

/*
 * In Java, abstraction is achieved by Interfaces and Abstract classes. We can achieve 100% abstraction using Interfaces.
 * Let's understand Abstraction concept with Java programming examples.
 * Eg: Employee, Contractor, and FullTimeEmployee Example:
 *  In this example, we create an abstract Employee class and which contains abstract calculateSalary() method. Let the subclasses extend Employee class 
 *  and implement a calculateSalary() method.
 *  Let's create Contractor and FullTimeEmployee classes as we know that the salary structure for a contractor and full-time employees are different so 
 *  let these classes to override and implement a calculateSalary() method.
 */
public class Abstraction {

	public static void main(String[] args) {

		Employee contractor = new Contractor("contractor", 10, 10);
		Employee fullTimeEmployee = new FullTimeEmployee("full time employee", 8);
		System.out.println(contractor.calculateSalary());
		System.out.println(fullTimeEmployee.calculateSalary());
	}

}

abstract class Employee {

	private String name;
	private int paymentPerHour;

	public Employee(String name, int paymentPerHour) {
		this.name = name;
		this.paymentPerHour = paymentPerHour;
	}

	public abstract int calculateSalary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPaymentPerHour() {
		return paymentPerHour;
	}

	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}
}

class Contractor extends Employee {

	private int workingHours;

	public Contractor(String name, int paymentPerHour, int workingHours) {
		super(name, paymentPerHour);
		this.workingHours = workingHours;
	}

	@Override
	public int calculateSalary() {
		return getPaymentPerHour() * workingHours;
	}
}

class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String name, int paymentPerHour) {
		super(name, paymentPerHour);
	}

	@Override
	public int calculateSalary() {
		return getPaymentPerHour() * 8;
	}
}
