package array;

import java.util.Scanner;

public class Clas {
	public class Main_Class {
		public static void main(String args[]) 
		{
			  Scanner sc= new Scanner(System.in);
			
			  List<Hotel_Service> roomlist= new ArrayList<Hotel_Service>();
			    System.out.println("please enter room details");
			    for (int i=1;i<=6;i++)
			    {
			Hotel_Booking h1 = new Hotel_Booking();
		System.out.println("*** please enter room"+ i+"details   ***");
			System.out.println("floor number");
			h1.floor_no=sc.nextInt();
			System.out.println("room number");
			h1.room_no=sc.nextInt();
			System.out.println(" Occupancy type should be given as -single, Double ,Triple");
			h1.AC_type=sc.nextInt();
			System.out.println("Ac type should be gicen as -AC,NAC");
			h1.OC_type=sc.next();
			
			if (h1.OC_type.equals("Single")&& h1.OC_type.equals("AC"))
			{
				h1.TotalPrice=3000;
			}
			else if(h1.OC_type.equals("Double")&& h1.OC_type.equals("AC"))
			{
				h1.TotalPrice=4000;
			}
				else if (h1.OC_type.equals("Triple") && h1.OC_type.equals("AC"))
				{
					h1.TotalPrice=5000;
				}
				
			if (h1.OC_type.equals("Single"))
			{
				h1.TotalPrice=2000;
			}
			else if(h1.OC_type.equals("Double"))
			{
			
			}h1.TotalPrice=3000;
				else if  (h1.OC_type.equals("Triple") )
				{
					h1.TotalPrice=4000;
				}
					
			System.out.println("room"+i+"details---->"+h1.roomDetails());
			
			System.out.println();
			
			roomlist.add(h1);
			
				}
			}
			}
		    	
		}
		
		

