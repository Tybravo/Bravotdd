
public class GasMileageCalculator {


	public double computeMilesPerGallon(double numberOfMilesDriven, double numberOfGallons){

	double result = numberOfMilesDriven / numberOfGallons;

	return result;
	
	//return 1.5;

	}




	public static void main(String[] args){

	double milesPerGallonForAllTrips = 0;
	double numberOfMilesDriven = 0;
	double numberOfGallons = 0

	GasMileageCalculator calculator = new GasMileageCalculator();

	Scanner scanner = new Scanner(System.in);

	String sentinel = "";

	System.out.print("Enter number of miles driven on trips");
	double numberOfMilesDriven = Scanner.nextDouble();	

	System.out.print("Enter number of gallons used for trip");
	double numberOfGallons = Scanner.nextDouble();	

	while(!sentinel.equals("no"){
	double milesPerGallon = calculator.computeMilesPerGallon(numberOfMilesDriven, numberOfGallons);
	
}


   }

	
}