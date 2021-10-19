class StringStarter{

public static void main(String[] icecreams)
{
// variables or states or properties or attributes or fields
     String company="X-workz";

    String trainer=new String("X-workz");
     if(company==trainer)
     {
       System.out.println("both strings are P2SM");
     }
     else{
       System.out.println("strings are not P2SM");
     }


char ch=company.charAt(2);
System.out.println(ch);

boolean cont=company.contains("wt");
System.out.println(cont);

char[] countryName={'I','N','D','I','A'};

    String stringCountryName=  String.copyValueOf(countryName);
  System.out.println(stringCountryName);

String currency="Rupee";
String indianCurrency="IND"+currency;
System.out.println(indianCurrency);


String food="Biryani";
String chicken="chicken";
food=food.concat(chicken);// new value
System.out.println(food);
String foodwithAmp=food.replace('e','&');
System.out.println(food);//Birayanichicken
System.out.println(foodwithAmp);





}

}
