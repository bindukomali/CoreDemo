import java.util.*;
public class StudentMarks {

	public static void main(String[] args) {
		int m1, m2 , m3 , m4, m5 ,total;
		double per;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of Subjects");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		total = m1 + m2 + m3 + m4 + m5;
		per=(total/500.0)*100;
		System.out.println("Total marks Obtained" +total);
		System.out.println("Percentage is "+per);
		
		
		
		

	}

}
