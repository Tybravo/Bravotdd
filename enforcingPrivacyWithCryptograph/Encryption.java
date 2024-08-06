import java.util.*;

public class Encryption{

	public int encrypt(int collectNum){
	
int firstDigit = 0;
int secondDigit = 0;
int thirdDigit = 0;
int fourthDigit = 0;

int isFirstDigit = 0;
int isSecondDigit = 0;
int isThirdDigit = 0;
int isFourthDigit = 0;

int getFirstDigit = 0;
int getSecondDigit = 0;
int getThirdDigit = 0;
int getFourthDigit = 0;

//int collectNum = Integer.valueOf(collectNum);


		firstDigit = collectNum / 1000 % 10;
		secondDigit = collectNum / 100 % 10;
		thirdDigit = collectNum / 10 % 10;
		fourthDigit = collectNum % 10;
		
		isFirstDigit = firstDigit + 7;
		isSecondDigit = secondDigit + 7;
		isThirdDigit = thirdDigit + 7;
		isFourthDigit = fourthDigit + 7;

		getFirstDigit = isFirstDigit % 10;
		getSecondDigit = isSecondDigit  % 10;
		getThirdDigit = isThirdDigit % 10;
		getFourthDigit = isFourthDigit % 10;

		
 		String getFirstDigit1 = String.valueOf(getFirstDigit); 
 		String getSecondDigit1 = String.valueOf(getSecondDigit); 
 		String getThirdDigit1= String.valueOf(getThirdDigit); 
 		String getFourthDigit1 = String.valueOf(getFourthDigit); 

		String encrypted = getThirdDigit1+getFirstDigit1+getFourthDigit1+getSecondDigit1;
		
		int isEncrypted = Integer.valueOf(encrypted);

		//String isEncrypted = (Arrays.toString(encrypted));
		
		//String isEncrypted = String.valueOf(getThirdDigitgetFirstDigitgetFourthDigitgetSecondDigit); 

		return isEncrypted;
		//return encrypted;
	
	}

}
	