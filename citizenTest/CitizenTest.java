import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;


public class CitizenTest{


	@Test
	public void testCalculateYearlyIncome(){

	//given
	Citizen citizen = new Citizen();
	citizen.setName("Ade Mike");
	citizen.setEarnings(30_000);

	//when
	double tax = citizen.getYearlyIncomeTax();

	//assert
	assertEquals(4_500, tax);

   }

}
