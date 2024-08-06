
public class MathsTools{

		public double raisedToPower(double numberOne, double numberTwo){

		double result = 1;

		if(numberOne > 0 && numberTwo > 0){
		for(int index = 1; index <= numberTwo; index++){
		result = result * numberOne;
	   	}
		}

		if(numberOne < 0 && numberTwo > 0 && numberTwo % 2 == 1){
		for(int index = 1; index <= numberTwo; index++){
		result = result * numberOne;
		}
		}

		if(numberOne < 0 && numberTwo > 0 && numberTwo % 2 == 0){
		numberOne = numberOne * (-1);
		for(int index = 1; index <= numberTwo; index++){
		result = result * numberOne;
		}
		}

		if(numberOne > 0 && numberTwo < 0 ){
		numberTwo = numberTwo * (-1);
		for(int index = 1; index <= numberTwo; index++){
		result = result * numberOne;
	   	}
		result = 1 / result ;
		System.out.print(result);
		}

		if(numberOne < 0 && numberTwo < 0 ){
		numberOne = numberOne * (-1);
		numberTwo = numberTwo * (-1);
		for(int index = 1; index <= numberTwo; index++){
		result = result * numberOne;
		}
		result = -1 / result;
	   	System.out.print(result);
		}

		return result;



	}
}