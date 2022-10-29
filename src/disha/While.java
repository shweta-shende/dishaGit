package disha;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a=1,n,s=0;
		System.out.println("enter the range");
		n=scn.nextInt();
		while(a<=n)
		{
System.out.println(a);
s=s+a;
a++;
	}
		System.out.println("sum="+s);

}

	}


