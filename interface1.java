/*create two interfaces OLA and UBER both having a method public static Cab getCab()
which returns the Cab object where Cab is a nested class inside OLA and UBER.

Cab must have attributes cab_number and driver_name.
A user rides 5 times using cabs of OLA and UBER randomly which are stored in an array*/


interface ola
{
public static Cab getCab()
{
return new Cab(Driver_name,Cab_no);
}
class Cab
{
String Driver_name;
String Cab_name;
Cab(String Driver_name,String Cab_name)
{
this.Driver_name=Driver_name;
this.Cab_name=Cab_name;
}

}
}
interface Uber
{
public static Cab getCab()
{
return new Cab(Driver_name,Cab_no);
}
class Cab
{
String Driver_name;
String Cab_name;
Cab(String Driver_name,Stirng Cab_name)
{
this.Driver_name=Driver_name;
this.Cab_name=Cab_name;
}
}
}
class sample implements Ola,Uber
{
public static void main(String...args)
{
Scanner input=new Scanner(System.in)
ArrayList<Ola.Cab> alist=new ArrayList<Ola.Cab>();
}


}