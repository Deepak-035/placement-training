package com;

public class Uma implements Person{
	@Override
	public void eat()
	{
		System.out.println("Eating");
	}
	public static void main(String[] args)
	{
		Uma u= new Uma();
		System.out.println(Person.age);
		u.eat();
	}

}
