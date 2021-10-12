class InverterRunner{

public static void main(String[] values)
{
     Inverter inverter=new Inverter();
     System.out.println(inverter.make);// null
     System.out.println(inverter.price);//0.0
     System.out.println(inverter.capacity);//0.0
     System.out.println(inverter.weight);//0.0
     System.out.println(inverter.color);//null
     inverter.make="Amaron";
     inverter.price=8000.f;
     inverter.weight=10.0f;
     inverter.color="blue";
     inverter.capacity=20.0f;
     System.out.println(inverter.make);// Amaron
     System.out.println(inverter.price);//8000
     System.out.println(inverter.capacity);//20.0
     System.out.println(inverter.weight);//10.0
     System.out.println(inverter.color);//blue
     //allocate memory in instance memory
     //copies all instance variables
     //const --> default values instance variables
     //return address of the memory
     Inverter inverter1=new Inverter();
     System.out.println(inverter1.price);
     System.out.println(inverter1.color);
     Inverter inverter2=new Inverter();
     System.out.println(inverter2.price);
     System.out.println(inverter2.color);
     Inverter inverter3=new Inverter();
     System.out.println(inverter3.price);
     System.out.println(inverter3.color);
     Inverter inverter4=new Inverter();
     System.out.println(inverter4.price);
     System.out.println(inverter4.color);
     Inverter inverter5=new Inverter();
     System.out.println(inverter5.price);
     System.out.println(inverter5.color);
    inverter4.color="Red";

}


}
