class student
{
int rollno;
String name;
student(int a, String b)
{
rollno = a; name = b;
}
void display()
{
System.out.println("Rollno="+rollno);
System.out.println("Name="+name);
}
}
class Library extends student
{
int member_no;
Library(int a,String b,int c)
{

super(a,b);
member_no=c;
}
void displayl()
{
display();
System.out.println("Member no="+member_no);

}

}
class innertest3
{
public static void main(String args[])
{
Library l=new Library(23,"Raksha",12);
l.displayl();
}
}
