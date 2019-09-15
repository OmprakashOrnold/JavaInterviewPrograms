import java.util.Scanner;

public class Digit_sum
{
 public static void main(String[] args)
 {
	 int sum=0;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter a number");
	 int m=s.nextInt();
	 int n;
	 while( m>0)
	 {
		
		 n=m%10;
		 sum=sum+n;
		 m=m/10;
	 }
	 System.out.println("sum of digits :"+sum);
 }
}
