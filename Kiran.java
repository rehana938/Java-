
public class Kiran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String days="weekdays";
		String seat="vip seat";
		boolean isBooked=false;
		if(days=="weekdays" && seat=="vip seat"&& isBooked==true)
		{
			System.out.println("price is 500");
		}else if(days=="weekdays"&& seat=="normal seat") {
			System.out.println("price is 300");
		}else if(days=="weekdays"&& seat=="vip seat") {
			System.out.println("price is 400");
		}else if(days=="weekdays"&&seat=="normal seat") {
			System.out.println("price is 200");
		}else {
			System.out.println("seat is already booked plase leave the movie");
		}

	}

}
