
public class SortFunc{


	public int[] ascendnumbers(int[] numbers){

		for(int index = 0; index < numbers.length-1; index++){
			for(int count = index + 1; count < numbers.length; count++){
				if(numbers[count] < numbers[index]){

				numbers[count] = numbers[count] + numbers[index];
				numbers[index] = numbers[count] - numbers[index];
				numbers[count] = numbers[count] - numbers[index];
			}
		}
	}
	
	return numbers;
	
  }




}