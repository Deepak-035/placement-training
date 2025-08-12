package com;

public class Prime {
	public static void main()
	{
		int n=5;
		int count =0;
		System.out.print("Prime numbers are");
		for(int i=1;i<=n;i++)
		{
			if(i%1==0)
			{
				System.out.println(i+" ");
				count++;
			}
		}
		System.out.println("Total numbers are "+count);
	}
}
