package org;

public class Student {
	String name;
	Student(String name)
	{
		this.name=name;
	}
	@Override
	public String toString()
	{
		return this.name;
	}
	public static void main(String[] args)
	{
		Student s = new Student("Deepak");
		Student s2 = new Student("Deepu");
		System.out.println(s+" "+s2);
	}

}
