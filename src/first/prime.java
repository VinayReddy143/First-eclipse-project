package first;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
	int num,i,count=0;
	Scanner sc =new Scanner(System.in);
	num = sc.nextInt();
	for(i=1;i<=num;i++)
	{
		if(num%i==0) {
			count=count+1;
			
		}
		
		
	}
	if(count==2)
	{
		System.out.println(num+" is prime");
	}
	else
	{
		System.out.println(num+ " is not prime");
	}

	}

}
