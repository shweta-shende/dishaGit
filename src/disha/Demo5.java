package disha;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a,b,t;
		System.out.println("enter a number");
		 a=scn.nextInt();
		 b=scn.nextInt();
		System.out.println("before swapping");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("after swapping");
		
		
		t=a;
		a=b;
		b=t;
		System.out.println(a);
		System.out.println(b);
		
		
		
		
	}
	

}
