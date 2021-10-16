class Money{

String country;// literals,ref var , const , method

Money()
{
this("NA");// Arg
System.out.println("invoked no-arg Constructor");

}
Money(String country)// NA
{ //init instance variable
  this.country=country;//NA
}
//ap* modifier* return-type methodname(parameters*)throws classname* { }
//can be accessed , using instances

void displayValue()
{
  System.out.println("invoked displayValue");
  System.out.println("Country is "+this.country);
}

}
