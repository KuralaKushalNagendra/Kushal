package multiples;

import java.util.Scanner;

public class tables {
	public static void main(String args[])
	{
		int num,range,i;
		Scanner k=new Scanner(System.in);
		System.out.println("Enter the multiple number:");
		num=k.nextInt();
		System.out.println("Enter the range:");
		range=k.nextInt();
		for(i=1;i<=range; i++)
		{
			
			System.out.println(num+ " X "+i+" = " +(num*i));
		}
		
	}

}
