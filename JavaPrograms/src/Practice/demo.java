package Practice;

import java.util.Scanner;

public class demo 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num = sc.nextInt();
		System.out.println(num);
		int count =0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		
		if(count==2)
		{
		System.out.println(num+"is a prime number");
		}
		else
			System.out.println("not a prime");
		
	}
	
			
}
