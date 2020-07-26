package clean_code_construct_cost_logger.logger_file;

/**
 * Hello world!
 *
 */
public class App 
{
	public double getCost(String materialStandard,double area,String automated)
	{	
		double cost = 0.0;
		
		if(materialStandard.equals("standard"))
		{
			cost= 1200.0*area;
		}
		else if(materialStandard.equals("above standard"))
		{
			cost = 1500.0*area;
		}
		else if(materialStandard.equals("high standard") && automated.equals("yes"))
		{
			cost = 2500.0*area;
		}
		else if(materialStandard.equals("high standard"))
		{
			cost = 1800.0*area;
		}
		
		return cost;
	}
}
