import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TaxCalculatorTest{


	@Test
	public void testCalculatteTax(){

	//given
	TaxCalculator taxCalculator = new TaxCalculator();

	//when
	double tax = taxCalculator.calculateTax(30_000);

	//assert
	assertEquals(4_500, tax);

   }


	
	@Test
	public void testCalculatteTaxForInvaidAmountFails(){

	//given
	TaxCalculator taxCalculator = new TaxCalculator();

	//when
	//double tax = taxCalculator.calculateTax(-30_000);

	//assert
	assertThrows(RuntimeException.class, ()->taxCalculator.calculateTaxInvalid(-30_000));



   }


}
   