package disha;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a,n,s=0;
		System.out.println("enter the range");
		n=scn.nextInt();
		for(a=1;a<=n;a++)
		{
System.out.println(a);
s=s+a;
	}
		System.out.println("sum="+s);

}
}
