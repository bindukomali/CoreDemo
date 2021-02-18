import java.util.Scanner;

public class GreatestThree {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a > b && a > c)
		{
			System.out.println("A is Greatest");
		}
		else if (b>c) {
			System.out.println("b is Greatest");
		}else {
				System.out.println("c is Greatest");
			}
		}
	}


