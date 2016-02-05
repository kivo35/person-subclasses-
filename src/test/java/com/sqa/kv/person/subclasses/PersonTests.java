/**
 * 
 */
package com.sqa.kv.person.subclasses;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Kirill
 * 
 */
public class PersonTests
{
	@Ignore
	public void testEmployeeActions()
	{
		Person[] people = new Person[] { new Employee(), new Person(), new Employee("KV", 22, 5.0, 45, "SQA School"),
				new Person("KV", 22, 5.0), new Employee("Jack", 12, 0.0, 33, "Random company"),
				new Person("Jack", 12, 0.0) };
		for (Person p : people)
		{
			// Do Work
			p.doWork();
			// Determine Stress
			System.out.println("\tStress level: " + p.calcStressLevel());
			// Determine Pay
			System.out.println("\tPay amount: " + p.calcPaid());
			// call toString to get all details
			System.out.println(p.toString());
		}
	}

	@Ignore
	public void testPersonActions()
	{
		Person[] people = new Person[] { new Person(), new Person("KV", 22, 5.0), new Person("Jack", 12, 0.0) };

		for (Person p : people)
		{
			// Do Work
			p.doWork();
			// Determine Stress
			System.out.println("\tStress level: " + p.calcStressLevel());
			// Determine Pay
			System.out.println("\tPay amount: " + p.calcPaid());
			// call toString to get all details
			System.out.println(p.toString());
		}
	}

	@Test
	public void testTeacherActions()
	{
		Person[] people = new Person[] { new Person(), new Employee(), new Teacher(),
				new Employee("KV", 22, 5.0, 45, "SQA School"), new Person("KV", 22, 5.0),
				new Teacher("Jack", 45, 1000.23, 1235223, "Public school", "Math Teacher"),
				new Employee("Jack", 12, 0.0, 33, "Random company"), new Person("Jack", 12, 0.0) };
		for (Person p : people)
		{
			// Do Work
			p.doWork();
			// Determine Stress
			System.out.println("\tStress level: " + p.calcStressLevel());
			// Determine Pay
			System.out.println("\tPay amount: " + p.calcPaid());
			// call toString to get all details
			System.out.println(p.toString());
		}
	}
}
