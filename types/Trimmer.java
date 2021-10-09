class Trimmer{

   String brand="MI";
// this === ref of current instance within class
// access variables,methods and Constructor
   Trimmer(String brand)//Syska
   {
   System.out.println("invoked Timmer no-arg const");
   System.out.println(this);//this is a keyword in java
  System.out.println(brand);//Syska
  System.out.println(this.brand);//MI
    this.brand=brand;//this.brand=Syska
  System.out.println("End of Constructor");

   }


}
