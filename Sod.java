import java.util.Scanner;

public class Sod {
	public static void main(String args[])
	{
		int range,i,odd=0;
		Scanner k=new Scanner(System.in);
		System.out.println("Enter the range:");
		range=k.nextInt();
		for(i=1;i<=range; i++)
		{
			if(i%2!=0)
			{
				odd= odd +i;
				System.out.println("Sum of Odd:" +odd);
			}
		}
	}

}
