import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest{

	@Test 
	public void testThatCalculatorCanAddTwoPositiveNumbers(){

		//given
		Calculator calculator = new Calculator();
		//when
		int result = calculator.add(2,3);
		//assert
		assertEquals(5, result);

	}

	
	@Test
	public void testThatCalculatorCanSubtractTwoPositiveNumbers(){
	
	//given
	Calculator  calculator = new Calculator();
	//when
	int result = calculator.subtract(3, 2);
	//assert
	assertEquals(1, result);

	}
	

	@Test
	public void testThatCalculatorCanDivideTwoPositiveNumbers(){
	
	//given
	Calculator  calculator = new Calculator();
	//when
	int result = calculator.divide(8, 2);
	//assert
	assertEquals(4, result);
	
	}


	@Test
	public void testThatCalculatorCanMultiplyTwoPositiveNumbers(){
	
	//given
	Calculator  calculator = new Calculator();
	//when
	int result = calculator.multiply(3, 2);
	//assert
	assertEquals(6, result);
	
	}



@Test 
	public void testCannotDivideFourByZero(){

		//given
		Calculator calculator = new Calculator();
		//when
		int result = calculator.divide(4,0);
		//assert
		assertThrows(ArithmeticException.class, ()->calculator.divide(4,0));

		}


}