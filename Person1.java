package org;

public class Person1 {
	
	@Override
	public String toString()
	{
		return "Tom";
	}
	public static void main(String[] args)
	{
		Person1 p = new Person1();
		System.out.println(p);
		System.out.println(p.toString());
	}

}
