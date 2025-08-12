package com;

public class Program3 {
	public static void main(String[] args)
	{
		int num = 1221;
		int temp = num;
		int rem =0;
		int ans =0;
		
		while(num>0){
			rem=num%10;
			ans=ans*10+rem;
			num=num/10;
		}
		System.out.println(ans);
		if(ans==temp)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
