
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=80;
		System.out.println("Shyam applies for health insurance");
		if(age>60)
		{
			System.out.println("premium is $5000");
		}
		else if(age>40 && age<60)
		{
			System.out.println("premium is $3000");
		}
		else if(age>30 && age<39)
		{
			System.out.println("premium is $ 1500");
		}
		else if(age<20)
		{
			System.out.println("premium is $1000 ");
		}else
		{
			System.out.println("calculate Shyam s insurance premium based on his age");
		}

	}

}
