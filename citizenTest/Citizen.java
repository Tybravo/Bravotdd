
public class Citizen{

	private String name;

	private double yearlyEarnings;

	
	public void setName(String citizenName){
		name = citizenName;
	}

	public void setEarnings(double citizenEarnings){
		yearlyEarnings = citizenEarnings;
	}


	public double getYearlyIncomeTax(){
		TaxCalculator calculator = new TaxCalculator();
		double tax = calculator.calculateTax(yearlyEarnings);
		return tax;

   }


}


