import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathsToolsTest{

		@Test
		public void testNumberOneRaisedToNumberTwo(){
		
		//given
		MathsTools calculator = new MathsTools();
		
		//when
		double result = calculator.raisedToPower(-4, -4);

		//assert
		assertEquals(-0.00390625, result);

    }


}