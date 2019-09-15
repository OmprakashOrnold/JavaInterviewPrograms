import java.util.Scanner;

public class CalculateAverageAndPercentage {

	public static void main(String[] args) {
	
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter marks obtained in  subjects");
      int sum=0;
      int marks[]=new int[5];
      for(int i=0;i<5;i++)
      {
    	marks[i]=scan.nextInt();
    	sum =sum+marks[i];
      }
      int avg =sum/5;
       int percent=(sum/500)*100;
      System.out.println("Average marks :"+avg);
      System.out.println("percentage marks  :"+percent);
	}

}
