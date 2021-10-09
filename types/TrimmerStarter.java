class TrimmerStarter{

public static void main(String[] amoeba)
{
Trimmer trimmer=new Trimmer("NOVA");// instantiation
System.out.println(trimmer);//string representation
System.out.println(trimmer.brand);


Trimmer trimmer1=new Trimmer("Syska");
System.out.println(trimmer1);//ClassName@Hexadecimal
System.out.println(trimmer1.brand);


ThisLocation location=new ThisLocation(45);
System.out.println(location);
System.out.println(location.distance);



}

}
