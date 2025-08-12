package org;

public class Emp {
	String name;
	int id;
	Emp(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString()
	{
		return id+" "+this.name;
	}
	public static void main(String[] args)
	{
		Emp e = new Emp("Deepak",35);
		System.out.println(e);
	}

}
