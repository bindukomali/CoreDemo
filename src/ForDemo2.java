import java.util.Scanner;

public class ForDemo2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int sum=0;
		System.out.println("Enter a number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
		sum=sum + i;
		}
			System.out.println("the sum of series is :"+sum);
		}

	}


