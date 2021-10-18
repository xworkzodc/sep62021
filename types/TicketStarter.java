class TicketStarter{

public static void main(String[] values )
{

Ticket ticket=new Ticket("VIP",500);
String name=ticket.getName();
double price=ticket.getPrice();
if(name!=null)
{
System.out.println(name);
}
if(price>0)
{
System.out.println(price);
}
}
}
