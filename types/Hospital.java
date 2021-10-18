class Hospital{

 String name;

Hospital()
{
System.out.println("Created Hospital");
}
Hospital(String name)
{
  this.name=name;
}
// return type or parameter == ref or null
String getName()// getter 
{
   System.out.println("invoked getName");
   return this.name;
}



}
