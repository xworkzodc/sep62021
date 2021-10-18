class Ticket{

      String name; // literals, ref , Constructor , method
      double price;

      Ticket(String name,double price)
      {
      this.name=name;
      this.price=price;
      System.out.println("Created ticket using string,double");
      }

 String getName()
 {
 return this.name;
 }

 double getPrice()
 {
 return this.price;
 }

 void setName(String name)
 {
   this.name=name;
 }

 void setPrice(double price){
   this.price=price;
 }

}
