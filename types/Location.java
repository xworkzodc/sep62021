class Location{

  String startingPoint="BLR";
  float distance;
  String destination;// const
  int pincode;
  String travelType;// const
// Const a special method ---> Executed in Stack
  Location(String dest,String type)// init instance variables
  {
       System.out.println("invoked location const string and string");
       System.out.println("dest :"+dest);
       System.out.println("dest :"+type);
       destination=dest;
      travelType=type;
  }
Location()
{
  System.out.println("invoked location with no-arg const ");
}
// different parameter
Location(String dest)
{
  System.out.println("invoked location const string");
  destination=dest;
}
Location(float dest)
{
  System.out.println("invoked location const float");
  distance=dest;
}


}
