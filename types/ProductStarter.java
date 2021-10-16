class ProductStarter{

public static void main(String[] chocolates)
{

Product product=new Product();//allocate memory,copy ,calls const,init
product.displayDetails();
product.name="Mobile";
product.price=15.0;
product.quality=true;
product.quantity=5;
product.isiMark=true;
product.displayDetails();

Product product1=new Product();
product1.displayDetails();
product1.name="TV";
product1.price=25.0;
product1.quality=true;
product1.quantity=5;
product1.isiMark=true;
product1.displayDetails();

product.displayTotalPrice();
product1.displayTotalPrice();

}


}
