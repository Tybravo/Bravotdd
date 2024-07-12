

public class Multiplication{

	
	public int alternatemultiply(int numberOne, int numberTwo){
	
	int sum = 0;
	int toIncrease;
	for(toIncrease = 1; toIncrease <= numberOne;){
	
	sum = sum + numberTwo;

	toIncrease++;
	}

	
	if(numberOne < 0 && numberTwo > 0){
	for(toIncrease = 1; toIncrease <= numberTwo;){
	
	sum = sum + numberOne;

	toIncrease++;
	}
	}


	if(numberOne < 0 && numberTwo < 0){
	numberOne = numberOne / -1;
	numberTwo = numberTwo / -1;

	for(toIncrease = 1; toIncrease <= numberOne;){
	
	sum = sum + numberTwo;

	toIncrease++;
	}
	}

	return sum;
		
	}

}

