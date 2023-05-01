import java.util.*;
public class Bill
{
	public static void main(String[] args) 
    {
        double unit, bill;
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter Units Consumed: "); 
		unit = scan.nextInt(); 
		if(unit<= 50)
		{ 
			bill=unit*2.5;
            System.out.println("Bill value is: "+bill);
		}
		else if(unit>50 && unit<=100)
		{ 
            bill=unit*3.5;
			System.out.println("Bill value is: "+bill);
		}
		else if(unit>100 && unit<=150)
		{ 
            bill=unit*3.5;
			System.out.println("Bill value is: "+bill);
		}
		
	}
}	