package array;

public class Hotel_Booking {
	
	int floor_no= 0;
	int room_no=0;
	 String AC_type=null;
	 String OC_type=null;
	 int TotalPrice=0;
	 int AC_price=1000;
	 public String roomDetails()
	 {
		 return  "floor number "+floor_no+ " room_NUMBER "+room_no + " AC_type"+AC_type+"occupancy"+ OC_type+"TotalPrice"+TotalPrice;
	 }


}
