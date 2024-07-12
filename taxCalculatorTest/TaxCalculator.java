
public class TaxCalculator{

	public double calculateTax(double income){

	double tax = 0;
	if(income <= 30_000){
		tax = income * 0.15;
	}else {
		tax = income * 0.20;
	}
	return tax;

   }


	public double calculateTaxInvalid(double income){

	//double tax = 0;
	if(income < 0){
		RuntimeException exception = new RuntimeException("Invalid Input");
		throw exception;
	}
return income;
   }





}