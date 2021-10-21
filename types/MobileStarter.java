class MobileStarter{

public static void main(String[] drinks)
{
//String akashFavDrink="Coke";

String shashankFavDrink="Black Dog";
String akashFavDrink="Black Dog";
String vikrantFavDrink=new String("Black Dog");
String vinayFavDrink=new String("Black Dog");
String rajShekar=vikrantFavDrink;
if(shashankFavDrink==vikrantFavDrink)
{
System.out.println("pointing to same memory");
}
else{
System.out.println("pointing to different memory");
}
// equals--> contents--> every class you write
boolean same=vikrantFavDrink.equals(shashankFavDrink);//
System.out.println(same);
  char[] chars=rajShekar.toCharArray();
  System.out.println(chars.length);
  for(int box=0;box<chars.length;box++)
  {
    char c=chars[box];
    System.out.println(c);
  }
}

}
