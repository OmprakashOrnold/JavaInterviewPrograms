import java.util.Scanner;

public class CheckAlphabetOrNot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any character");
		char ch=scan.next().charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.println(ch +" is an alphabet");
		}else
		{
			System.out.println(ch +" is an not alphabet");
		}
	}

}
