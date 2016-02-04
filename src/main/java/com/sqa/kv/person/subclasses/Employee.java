/**
 * 
 */
package com.sqa.kv.person.subclasses;

/**
 * @author Kirill
 * 
 */
public class Employee extends Person
{
	private int employeeId;
	private String companyName;

	public Employee()
	{
		this.employeeId = 1;
		this.companyName = "No Name";
	}

	public Employee(String name, int age, double income, int employeeId, String companyName)
	{
		super(name, age, income);
		this.employeeId = employeeId;
		this.companyName = companyName;
	}

	@Override
	public double calcPaid()
	{
		return getIncome() * 3;
	}

	@Override
	public int calcStressLevel()
	{
		return super.calcStressLevel() / 2;
	}

	@Override
	public void doWork()
	{
		System.out.println("Yippie " + this.getName() + " is now working");
	}

	public String getCompanyName()
	{
		return this.companyName;
	}

	public int getEmployeeId()
	{
		return this.employeeId;
	}

	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}

	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}

	@Override
	public String toString()
	{
		String parentString = super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append(parentString);
		builder.append("Employee [employeeId=");
		builder.append(this.employeeId);
		builder.append(", companyName=");
		builder.append(this.companyName);
		builder.append("]");
		return builder.toString();
	}
}
