package clean_code_interest_calc_logger.interest_calc_logger;

import java.util.Scanner;
import java.io.IOException;  

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class client_side
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	
	public static void main(String[] args)throws IOException
	{
		int choice;
		
		App calculate = new App();
		
		Scanner scanner_var  = new Scanner(System.in);
		
		LOGGER.info("Interest Calculator...");
		System.out.println("1. Simple Interest");
		System.out.println("2. Compound Interest");
		System.out.println("Enter choice: ");
		
		choice = scanner_var.nextInt();
		
		System.out.println("Enter principle: ");
		double principle = scanner_var.nextDouble();
		
		System.out.println("Enter time: ");
		double time = scanner_var.nextDouble();
		
		System.out.println("Enter rate of interest: ");
		double rateOfInterest = scanner_var.nextDouble();
		
		if(choice == 1)
		{
			LOGGER.info("Simple Interest: "+calculate.simpleInterestCalculator(principle,time,rateOfInterest));
		}
		else
		{
			LOGGER.info("Compound Interest: "+calculate.compoundInterestCalculator(principle,time,rateOfInterest));
		}
		
		
	}
}