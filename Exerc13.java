import java.lang.Math;
import java.util.Random;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc13{
	
	public static String obtainNumber(int card){
		
		switch(card){
			case 1:
				return "ACE of";
				
			
			case 2:
				return "TWO of";
			
			
			case 3:
				return "THREE of";
				
			
			case 4:
				return "FOUR of";
				
			
			case 5:
				return "FIVE of";
				
			
			case 6:
				return "SIX of";
				
			
			case 7:
				return "SEVEN of";
				
			
			case 8:
				return "EIGHT of";
				
			
			case 9:
				return "NINE of";
				
			
			case 10:
				return "TEN of";
			
			
			case 11:
				return "JACK of";
			
			
			case 12:
				return "QUEEN of";
			
			
			case 13:
				return "KING of";
			
			
			default:
				return "invalid Number";
		}
	}	
	
	public static String obtainClass(int classCard){
		
		switch(classCard){
			case 0:
				return " CLUB";
	
			
			case 1:
				return " HEART";
	
			
			case 2:
				return " SPADE";
	
			
			case 3:
				return " DIAMOND";
	
			default:
				return " Invalid Number";
		}
	}
	
	public static void main(String[] args){
		
		/*
		1)
		
		float num1 = 10.05f;
		float num2 = 20.34f;
	
		System.out.println("Max No. is: " + Math.max(num1, num2));
		System.out.println("Min No. is: " + Math.min(num1, num2));
		
		2)
		
		Random r = new Random();
		
		for(int i=0; i < 10; i++){
		
		int d10 = r.nextInt(10);
		
		System.out.println(d10);
		
		}
		
		3)
		
		DecimalFormat df = new DecimalFormat(".00");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal number: ");
		double d = input.nextDouble();
		
		System.out.println("Showing this number with 2 decimals place... ");
		System.out.println("Using Decimal Format method is " + df.format(d));
		System.out.printf("Using printf format is %.2f", d);
		
		4)

	final double BASIC_HOURLY_RATE = 29.39f;
	final double OVERTIME_HOURLY_RATE = 1.5f;
	double salary, basicSalary, overSalary, numTaxPayable;
	
	String employeeName, ppsNo, department, taxPayable;
	double basicHoursWorked, overtimeHoursWorked;

	Scanner input = new Scanner(System.in);
	
	System.out.println("Please provide yours details: ");
	System.out.print("Employee Name: ");
	employeeName = input.nextLine();
	
	System.out.print("PPS No: ");
	ppsNo = input.nextLine();
	
	System.out.print("Department: ");
	department = input.nextLine();
	
	System.out.print("Basic Hours Worked: ");
	basicHoursWorked = input.nextDouble();
	
	System.out.print("Overtime Hours Worked: ");
	overtimeHoursWorked = input.nextDouble();
	
	basicSalary = BASIC_HOURLY_RATE*basicHoursWorked;
	overSalary = OVERTIME_HOURLY_RATE*BASIC_HOURLY_RATE*overtimeHoursWorked;
	salary = basicSalary + overSalary;
	
	taxPayable = (salary > 2000)? "35%" : "20%";
	numTaxPayable = (salary > 2000)? .35 : .2;
	
	System.out.println("\n************************************************Salary Report***********************************************");
	System.out.println("***********************************************Employee Details*********************************************");
	System.out.println("Employee Name: " + employeeName);
	System.out.println("PPS No: " + ppsNo);
	System.out.println("Department: " + department +"\n");
	
	System.out.println("************************************************Hours Worked************************************************");
	
	System.out.println("No. of basic hours worked: " + basicHoursWorked);
	System.out.printf("The hourly rate of basic pay is at: %.2f euro.%n", BASIC_HOURLY_RATE);
	System.out.printf("Basic salary: %.2f%n", basicSalary);
	System.out.printf("No. of overtime hours worked: %.2f%n", overtimeHoursWorked);
	System.out.println("The hourly rate of overtime pay is at time and a half");
	System.out.printf("Overtime salary: %.2f%n", overSalary);
	
	System.out.println("\n***********************************************Take Home Pay***********************************************");
	
	System.out.printf("Gross Pay: %.2f%n", salary);
	System.out.printf("Income Tax Payable at: %s is: %.2f%n", taxPayable, numTaxPayable*salary);
	System.out.printf("Net Pay: %.2f%n",(salary - numTaxPayable*salary));
	
	System.out.println("\n***********************************************************************************************************");
				
			5)
*/

	Random r = new Random();
	int card1 = r.nextInt(13) + 1;
	int card2 = r.nextInt(13) + 1;
	int card3 = r.nextInt(13) + 1;
	
	int classCard1 = r.nextInt(4);
	int classCard2 = r.nextInt(4);
	int classCard3 = r.nextInt(4);
	
	System.out.println("Your cards: ");
	System.out.println(obtainNumber(card1) + obtainClass(classCard1));
	System.out.println(obtainNumber(card2) + obtainClass(classCard2));
	System.out.println(obtainNumber(card3) + obtainClass(classCard3));
		
	System.out.println("Your score: " + (card1 + card2 + card3));
	
	if (card1 + card2 + card3 <= 21){
	
		System.out.println("Result - Victory - You beat the house!");
	
	}else {
	
		System.out.println("Result - Defeat - house wins!");
	}
	
	}
}