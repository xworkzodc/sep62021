class InternetRunner{

public static void main(String[] values)
{


// variables
// static , non static(instance) , local , parameter
  Internet  internet= new Internet();// instance is created
  // allocate a memory in instance memory
  // copy of all instance variables
  //Constructor--- assign values to instance variables 
  //return the address
  String provider="Airtel";
  String pro=internet.provider;
System.out.println(provider);
System.out.println(pro);


}

}
