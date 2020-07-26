package clean_code_interest_calc_logger.interest_calc_logger;

/**
 * Hello world!
 *
 */

public class App 
{
	
	
	/*
	 * To Calculate Simple Intrest
	 * @parameter principle
	 * @parameter time
	 * @parameter rateOfInterest
	 * Returns the simple interest
	 */
	
    public double simpleInterestCalculator(double principle, double time, double rateOfInterest)
    {
    	return (principle*time*rateOfInterest)/100.0;
    }
    /*
	 * To Calculate Compound Intrest
	 * @parameter principle
	 * @parameter time
	 * @parameter rateOfInterest
	 * Returns the compound interest
	 */
	
    public double compoundInterestCalculator(double principle, double time, double rateOfInterest)
    {
    	return principle* Math.pow(1.0+rateOfInterest/100.0,time) - principle;
    }
}
