package Lab_2;

import java.util.Scanner;

//wap to check whether a single digit number is automorphic number or not .
//automorphic number is number whose square ends with number itself  i.e  5 * 5 =25 
//if automorphic display "its automorphic number else not automorphic .
//Q 3 wap to check any number is spy number or not 
//example 
//1124 is spy  i.e 1+1+2+4  =8 
//                    and 1*1*2*4=8 


public class Q2 {
	void spy(int b)
	{
		int r,sum=0,p=1;
		while (b!=0)
		{
			r =b%10;
			sum =sum+r;
			p=p*r;
			b=b/10;
			
		}
		if (sum ==p)
			System.out.println("this no is spy no");
		else
			System.out.println("this is not a spy no.");
	}

	void automorphic( int a)
	{
		int sq , p, num = a, r ,d  = 0;
		while (a!=0)
		{
			r = a%10;
			++d;
			a = a/10;
		}
		sq = num*num;
		p=(int )Math.pow(10, d);
		int k = sq%p;
		if (k==num)
			System.out.println("this is a automorphic num");
		else 
			System.out.println("this is not a automorphic num");
			
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		Q2 d = new Q2();
		System.out.println("Enter any num");
		int m = s.nextInt();
		d.automorphic(m);
		
		d.spy(m);
	}

}
