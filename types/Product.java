class Product{

boolean quality;
double price;
int quantity;
boolean isiMark;
String name;
static double totalOfAllProduct;
Product()
{
System.out.println("invoked Product Constructor");
}
void displayDetails()
{
System.out.println("invoked displayDetails");
System.out.println(this.name);//null
System.out.println(this.quantity);//0
System.out.println(this.price);//0.0
System.out.println(this.quality);//false
System.out.println(this.isiMark);//false
}

void displayTotalPrice()
{
  System.out.println("invoked displayTotalPrice");
  double totalPrice=this.quantity*this.price;
  System.out.println(totalPrice);
  Product.totalOfAllProduct=Product.totalOfAllProduct+totalPrice;
  System.out.println(Product.totalOfAllProduct);
}

}
