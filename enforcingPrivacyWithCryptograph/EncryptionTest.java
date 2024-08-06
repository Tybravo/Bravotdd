
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptionTest{

	@Test
	public void testToEncryptFourDigit(){

	//given
	Encryption encryption = new Encryption();

	//when
	int result = encryption.encrypt(4567);

	//assert
	assertEquals(3142, result);


	}

}