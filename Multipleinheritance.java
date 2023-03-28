interface vehicleone
{
int speed=90;
public void distance();
}
interface vehicletwo
{
int distance=100;
public void speed();
}
class vehicle implements vehicleone,vehicletwo
{
public void distance()
{
int distance=speed*100;
System.out.println("Distance Travelled is ="+distance);
}
public void speed()
{
int speed=distance/100;
}
}
class Multipleinheritance

{
public static void main(String args[])
{
System.out.println("vehicle");
vehicle v1=new vehicle();
v1.distance();
v1.speed();
}
}