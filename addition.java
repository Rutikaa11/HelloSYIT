import java.util.*;
class prac
{
public ststic void main(String args[])
{
	Scanner ob = new Scanner(System.In);
	system.out.println("Enter the any number: ");
	String s = ob.nextLine();
	count(s);
}
punlic static void count(String str)
{
	int sum = 0;
	int d =0;
	char ch [] = str.toCharArray();
	for (int i = 0; i < str.length(); i++)
	{
	if(character.isDigit(ch[i]))
	{
		sum+= charcter.getNumericValue(ch[i]);
	}
	}
	System.out.println('Your addition is : "+sum);
	}
}