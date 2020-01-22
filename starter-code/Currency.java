/*
Add your honor code statement here ...
*/
import java.util.Scanner;
public class Currency{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Currency Exchange Rate calculator ....");
		System.out.println("-------------------------------------");
		System.out.println("The following options should be used to define a currency in our tool:");
		System.out.println("1 for Chinese Yuan");		
		System.out.println("2 for Japanese Yen");
		System.out.println("3 for Indian Rupee");
		System.out.println("4 for United States Dollar");

		System.out.println("Tell us about the currency that you have by entering a number between 1 and 4?");
		int currencyOrigin = scan.nextInt();
		System.out.println("Tell us about the currency that you want by entering a number between 1 and 4?");
		int currencyDestination = scan.nextInt();
		System.out.println("How much is the amount?");
		int amount = scan.nextInt();
		double converted = 0.0;
		/*
		Implement the currency conversion rules here .... 
		*/
		
		

	}
}