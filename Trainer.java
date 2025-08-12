package com;

public class Trainer extends BePracticals implements DPracticals, TPracticals{
	@Override
	public void teachJava()
	{
		System.out.println("Teaching Java");
	}
	public void teachTesting()
	{
		System.out.println("Teaching testing related Technologies");
	}
	public static void main(String[] args)
	{
		
		Trainer t = new Trainer();
		t.teachJava();
		t.teachTesting();
		t.work();
	}
	

}
