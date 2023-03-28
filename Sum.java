import java.util.Scanner;

class Sum
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 1st number: ");
	int x = sc.nextInt();
	System.out.print("Enter 2nd number: ");
	int y = sc.nextInt();
	int z = x+y;
	System.out.print("Sum of no. is: " );
	System.out.print(z);
}
}