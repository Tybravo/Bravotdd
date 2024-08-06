import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;

public class SortFuncTest{
	@Test
	public void testSortAscendingOrder(){
		
		//given
		SortFunc ascend = new SortFunc();
		
		//when
		int[]element = {7, 4, 1, 15, 9};
		int[]result = ascend.ascendnumbers(element); 
		int[]sort = {1, 4, 7, 9, 15};

		//assert
		assertArrayEquals(sort, result);


   }

}