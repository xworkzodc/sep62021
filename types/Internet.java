//data type
// Non Primitive
class Internet{
// primitive = 0,true
//non primitive = null 
  String provider=null;// copy is created in instance memory
  static int speed=0;// one copy

    Internet()
    {
      System.out.println("Invoked Internet Constructor");
    }

}
