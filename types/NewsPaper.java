class NewsPaper{
  System.out.println("paper.name");
//noOfPage,price,headline,content
  String name=null; // const
  NewsPaperLang lang=NewsPaperLang.KANNADA;// non-primitive
  int noOfPages;//ref
  float price;//Constructor
  String headline;// ref
   NewsPaper(String name,float price)// no of paramr,sequence,datatype
   {
    this();//ref or value
    this.price=price;//assigning value to instance variable
    System.out.println("invoked string,flaor Constructor of news paper");
   }
   //name=NA , price, 3.5
   NewsPaper()
   {
     System.out.println("invoked no-arg Constructor of news paper");
     this.name="NA";
     this.price=1.0f;
   }
   // polymorphism --> same name , different forms
   // compile time(overloading) and run time polymorphism(overriding)
   // Constructor polymorphism or method polymorphism
   //Constructor
// over-loading -- no of parameters, sequence in parameters, datatype
NewsPaper(String name)
    {
      this.name=name;
      System.out.println("invoked string Constructor of news paper");
    }

NewsPaper(float price)
{
  this.price=price;
      System.out.println("invoked float Constructor of news paper");
}






}
