package clean_code_construct_cost_logger.logger_file;

import java.util.Scanner;
import java.io.IOException;  

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class client_side
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	
	public static void main(String[] args)throws IOException
	{
		
		App calculate = new App();
		
		Scanner scanner_var  = new Scanner(System.in);
		
		LOGGER.info("Construction Cost Calculator...");
		
		String materialStandard;
		double area;
		String automated;
		
		LOGGER.info("Enter Material Standard: ");
		materialStandard = scanner_var.nextLine();
		
		LOGGER.info("Enter total area of house: ");
		area = scanner_var.nextInt();
		
		scanner_var.nextLine();
		
		LOGGER.info("Do you want it fully automated? ");
		automated = scanner_var.nextLine();
		
		LOGGER.info("Total Cost: "+calculate.getCost(materialStandard, area, automated));
		
	}
}