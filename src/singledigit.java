import java.util.Scanner;

public class singledigit {

	public static void main(String[] args) 
	{
		int a;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		if(a>=-9 && a<=9)
		{
			System.out.println("the entered number "+a+"is single digit");
		}
		else{
			System.out.println("the entered number "+a+"is not a  single digit ");
		}
		

}}
