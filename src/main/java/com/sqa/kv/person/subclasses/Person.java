package com.sqa.kv.person.subclasses;

public class Person
{
	private String name;
	private int age;
	private double income;
	private boolean happy;

	public Person()
	{
		super();
		this.name = "No name";
		this.age = 0;
		this.income = 0;
	}

	public Person(String name, int age, double income)
	{
		super();
		this.name = name;
		this.age = age;
		this.income = income;
	}

	public double calcPaid()
	{
		return this.income * 1;
	}

	public int calcStressLevel()
	{
		return 3;
	}

	public void doWork()
	{
		System.out.println(this.getName() + " is not doing any work");
	}

	public int getAge()
	{
		return this.age;
	}

	public double getIncome()
	{
		return this.income;
	}

	public String getName()
	{
		return this.name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void setIncome(double income)
	{
		this.income = income;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("PersonSubclasses [name=");
		builder.append(this.name);
		builder.append(", age=");
		builder.append(this.age);
		builder.append(", income=");
		builder.append(this.income);
		builder.append(", happy=");
		builder.append(this.happy);
		builder.append("]");
		return builder.toString();
	}
}
