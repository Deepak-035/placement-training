package com;

public class Laptop {
	public int cost=75000;
	public void develop()
	{
		System.out.println("DEveloping");
	}
	public static void main(String args[]) {
		Laptop l= new Laptop();
		System.out.println(l.cost);
		l.develop();
	}

}
