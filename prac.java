import java.util.*;
public class prac
{
public static void main(String args[])
{
	Scanner ob = new Scanner(System.In);
	System.out.println("Enter the any number: ");
	String s = ob.nextLine();
	count(s);
}
public static void count(String str)
{
	int sum = 0;
	int d =0;
	char ch [] = str.toCharArray();
	for (int i = 0; i < str.length(); i++)
	{
	if(Character.isDigit(ch[i]))
	{
		sum+= Character.getNumericValue(ch[i]);
	}
	}
	System.out.println("Your addition is : "+sum);
	}
}