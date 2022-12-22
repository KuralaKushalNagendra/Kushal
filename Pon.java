import java.util.Scanner;

public class Pon {
	public static void main(String args[])
	{
		int num,product=1,i;
		Scanner k=new Scanner(System.in);
		System.out.println("Enter the range of natural number:");
		num=k.nextInt();
		for(i=1;i<=num;i++)
		{
			product=product*i;
			System.out.println("Product of natural numberr:" +product);
			
		}
			
	}


}
