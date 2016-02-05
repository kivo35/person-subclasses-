/**
 * 
 */
package com.sqa.kv.person.subclasses;

/**
 * @author Kirill
 * 
 */
public class Teacher extends Employee
{
	private String teacherType;

	public Teacher()
	{
		this.teacherType = "Music teacher";
	}

	public Teacher(String name, int age, double income, int employeeId, String companyName, String teacherType)
	{
		super(name, age, income, employeeId, companyName);
		this.teacherType = teacherType;
	}

	public String getTeacherType()
	{
		return this.teacherType;
	}

	public void setTeacherType(String teacherType)
	{
		this.teacherType = teacherType;
	}

	@Override
	public String toString()
	{
		String employeeString = super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append(employeeString);
		builder.append("Teacher type = ");
		builder.append(this.teacherType);
		return builder.toString();
	}
}
