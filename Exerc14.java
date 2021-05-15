import java.util.*;

//importation for exerc 7)
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//importation for exerc 8) File and IOException had been imported for 7) - because of this we don't need
import java.io.FileReader;
import java.io.BufferedReader;

public class Exerc14{
	
	public static void main(String[] args){
			/*
		1)
		
		String value = "two";
		int parsedValue = 0;
	
		try{
			parsedValue = Integer.parseInt(value);
		
		}catch(NumberFormatException nfe){
			
			System.out.println("This number need to be formated as Int to use parseInt() method. Try again");
			
		}
	
		2)
	
	
		int num1 = 10, num2 = 0, result = 0;
		try{
			
			result = num1 / num2;
			
		} catch(ArithmeticException e) {
			
			System.out.println("You cannot divide a number to 0 (zero). Try again");
		}	
		
		3)
		
		int[] numbers = {6, 5, 4, 3, 2, 1};
			
		try{
			
			System.out.println(numbers[2500]);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Unable to access data - bad index.");
		}	
	
		4)
	
		String[] destinations = new String[5];
		
		// Initialise each element of the array.
		destinations[0] = "Cork";
		destinations[1] = "Athlone";
		destinations[2] = "Limerick";
		destinations[3] = "Sligo";
		destinations[4] = "Dublin";
		
		// Tell the user of the available holiday destinations
		System.out.println("The following holiday destinations are available.");
		
		
		// Output the contents of the array to the console.
		for(int i=0; i<destinations.length; i++){
			System.out.println((i+1) + ": " + destinations[i]);
		}// loop
		
		// Create a Scanner object
		Scanner scanner = new Scanner(System.in);
		
	    // Prompt the user for their selection
		// Display the appropriate String
		int userSelection = 0;
		boolean validDataEntry = false;
		
		do{
		  try{
		   System.out.print("Enter a number to make your selection: ");
           userSelection = scanner.nextInt();	   
		   System.out.println("You will have a great time in: " + destinations[userSelection-1] +"!");
           validDataEntry = true;		   
		 
			}catch(ArrayIndexOutOfBoundsException f){
		   System.out.println("A value from 1-5 should be entered");
		  }

		 catch(InputMismatchException e){
		   System.out.println("Incorrect data value entered.");
		   scanner.nextLine();
		 } 
		}while(validDataEntry == false);  
	
	5)	
		
	Scanner input = new Scanner(System.in);
	String text;
	int index = 0;
	boolean valid = false;
	
	System.out.print("Type a message: ");	
	text = input.nextLine();
	
	System.out.print("What position (index+1) do you want to capture?: ");	
	
	
	while(!valid){
	
		try{
			index = input.nextInt();
			System.out.println(text.charAt(index-1));
			valid = true;
			
		} catch(InputMismatchException e) {
			
			System.out.println("Please type a number between 1 and " + text.length());
			input.nextLine();
			}
	
	}
	
	6)
		
	new Exerc14().stringExtract();	
	
	7)
	
	
	new Exerc14().writeToFile();
		
	8)	
		
	new Exerc14().readToFile();	
	
	}
	9)
		
	ArrayList<Integer> intLines = new ArrayList<Integer>();	
	File file = new File("Sales.txt");
	int parsed = 0, numMonths = 0;
	double mean, totalSales = 0.00;
	
	try{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			
				while(line != null){
					String[] splitLine = line.split(" ");
					for(int i = 0; i < splitLine.length; i++){
						parsed = Integer.parseInt(splitLine[i]);
						intLines.add(parsed);
						numMonths++;
						totalSales += parsed;
						}
		
					line = br.readLine();
				}
			System.out.println("\nThe contents of the text have been successfully read!");
		
		}catch (IOException e){
			
			System.out.println("Unable to read from the file at this time");
		}
		
		mean = totalSales/numMonths;
		
		System.out.println("There are " + totalSales + " through " + numMonths + " months.");
		System.out.println("Therefore the mean of sales is " + mean);
		
	10)
	
	try {
		
		new Exerc14().methodA();
	
	}catch (IOException e){
		
		System.out.println("Unable to write to the file at this time");
	}
	
	11)

		new Exerc14().methodA();

	12)
	*/
		new Exerc14().methodA(); //if methodA() handle the exception, you don't need to handle a exception here.
		
	}//main

	/* Method used in Exerc 6
	public void stringExtract(){
		
	Scanner input = new Scanner(System.in);
	int extract;
	boolean valid = false;
	
	
	System.out.print("Enter a message: ");
	String message = input.nextLine();
	
	while (message.length() == 0){
	System.out.println("Type at least a character:");
	message = input.nextLine();
	}
	
	String[] split = message.split(" ");
	
	while(!valid){
	
		System.out.println("Enter the position of the Extract: For example: " + split.length + " :");
		
		try{
			
			extract = input.nextInt();
			System.out.println("The chosen word is: " + split[extract-1]);
			valid = true;
		
		}catch(InputMismatchException e){
			
			System.out.println("Type a number. For example: " + split.length + " :");
			input.nextLine();
		
		} catch(ArrayIndexOutOfBoundsException f){
			System.out.println("Type a number between 1 and " + split.length);
		}

	}
	}//stringExtract() method
	

	//Exer 7 method
	public void writeToFile(){

	File file = new File("My Poem.txt");
	
	try{
		FileWriter fw = new FileWriter(file,true);
		
		//Create a BufferedWriter object.
		//It requires a reference to a FileWriter object.
		BufferedWriter bw = new BufferedWriter(fw);
		
		//Create a PrintWriter object.
		//It requires a reference to a BufferedWriter object.
		PrintWriter pw = new PrintWriter(bw);
		
		//Use the PrintWriter object to write to the text file.
		pw.println("The quick brown fox jumped over the moon.");
		pw.println("As he leapt, he looked back over his shoulder and cried aloud, ");
		pw.println("Hello World!");
		pw.close();
		
		System.out.println("I have written my first txt through Java!");
		
		}catch(IOException e){
			
			System.out.println("Hoje sim, hoje sim!!!....");
			System.out.println("Hoje nao :( :( :( ....");
		}
	}//method

	public void readToFile(){
		File file = new File("My Poem.txt");
		
		try{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			 // Read in the first line
			String line = br.readLine();
			
			// Read in remaining lines (if any)
				while(line != null){
					System.out.println(line);
					line = br.readLine();
				}
			System.out.println("\nThe contents of the text have been successfully read!");
		
		}catch (IOException e){
			
			System.out.println("Unable to read from the file at this time");
		}
	}
		
		10)
		
		public void methodA() throws IOException{
			methodB();
		}

		public void methodB() throws IOException{
			
			File file = new File("Output.txt");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println("I am learning Java programming!");
			pw.close();
			System.out.println("Message written to text file");
		}
		
		11)
			
		public void methodA(){
			methodB();
		}

		public void methodB(){
			
			File file = new File("Output.txt");
			try{FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println("I am learning Java programming!");
			pw.close();
			System.out.println("Message written to text file");
			}catch (IOException e){
				
				System.out.println("Unable to write to the file at this time");
			}
			
		}
		
		12)
*/
		public void methodA(){
			methodB(); //You don't need to handle exception here if methodB() handle the exception
		}

		public void methodB(){
			//As you didn't handle exceptions in methdA() either main method, you need to handle exceptions here.
			//However, this exception is unchecked, so the code will compile even you don't handle the exception.
			//Athough the code compiles, we will receive a runtime exception (ArrayIndexOutOfBoundsException)
			
			int[] numbers = {10, 20, 40};
			System.out.println(numbers[100]);
		}//methodB()
}//class
























