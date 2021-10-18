class HospitalStarter{

public static void main(String[] values )
{

Hospital hospital=new Hospital("Sagar Apollo");
System.out.println(hospital.name);
String name=hospital.getName();// null pointer exception
if(name==null){//null check
  System.out.println("name is not pointing to any memory");
}
else{
  System.out.println("Hospital name :"+name);
}
Hospital hospital1=new Hospital();
System.out.println(hospital1.name);
String name1=hospital1.getName();
if(name1!=null)// not null check
{
System.out.println("Hospital name1 :"+name1);
}



}


}
