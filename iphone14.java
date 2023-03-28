class Mobile{
public Mobile()
{
System.out.println("Calling...");
}

public void MobileType()
{
System.out.println("Mobile Type: iphone");
}
}
class iphone extends Mobile{
public iphone()
{
System.out.println("IOS...");
}
public void brand()
{
System.out.println("Brand: Apple");
}
public void price()
{
System.out.println("Min:35k, Max:90k");
}
}
public class iphone14 extends iphone
{

public iphone14()
{
System.out.println("Iphone 14..");

}
public void price()
{
System.out.println("Min:35k, Max:90k");
}
public static void main(String args[])
{
iphone14 obj=new iphone14();
obj.MobileType();
obj.brand();
obj.price();
}
}