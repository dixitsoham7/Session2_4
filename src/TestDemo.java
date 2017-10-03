import java.util.Scanner;

public class TestDemo {
	
	public static void testNumber(int number) //number passed as argument
	{
		if (number == 0) 
		{
			System.out.println("You Have Entered Zero"); // if number is zero
	    } 
		else if (number > 0 )
		{
			System.out.println("You Have Entered Positive Value"); // Condition for positive numbers
	    } 
		else 
		{
		    System.out.println("You Have Entered Negative Value"); // Condition for negative numbers
		}
	}
	
	public static void convertNumber(int number) //function to find ASCII value
	{
		char x;
		x=(char)number; //casting
		System.out.println("ASCII value : "+x);
	}
	
	public static void gradeStudent(float average)
	{
		if(average>70)
		{
			System.out.println("A Grade");
		}
		if(average>=61 && average<=70)
		{
			System.out.println("B Grade");
		}
		if(average<61)
		{
			System.out.println("C Grade");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------------------------------");
		
		System.out.println("Checking Number and ASCII value program");
		
		System.out.println("-------------------------------------------");
		System.out.println("Enter a number");
		int n;
		n=sc.nextInt(); //taking input as integer
		testNumber(n); //passing number as argument
		convertNumber(n);
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Students Grade Program");
		
		System.out.println("-------------------------------------------");
		
		float physics,chemistry,maths,average;
		System.out.println("Enter PHYSICS marks : ");
		physics=sc.nextFloat();
		System.out.println("Enter CHEMISTRY marks : ");
		chemistry=sc.nextFloat();
		System.out.println("Enter MATHS marks : ");
		maths=sc.nextFloat();
		average=(physics+chemistry+maths)/3;
		System.out.print("Grade Achieved : ");
		gradeStudent(average);
	}

}
