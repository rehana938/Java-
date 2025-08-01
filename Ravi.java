
public class Ravi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distance=10;
		String day="weekday";
		if(distance<50)
		{
			System.out.println("fare $ 50..");
		}else if(distance>50 && distance<100)
		{
			System.out.println("fare $ 200...");
		}
		else {
			
				 switch(day){
			     case "Weekday":System.out.println("200");break;
			   case "weekend":System.out.println("300");break;
			}
		}

	}

}
