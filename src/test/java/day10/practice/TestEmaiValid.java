package day10.practice;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestEmaiValid {
	@Test
	public void testValidEmail() {
		String email = "hari@gmail.com";
		try {
            boolean result = EmailValidator.isValidEmail(email);
            assertTrue(result);
        } catch (InvalidEmailException e) {
            fail("Expected a valid email, but an exception was thrown.");
        }
	}
	
	@Test
	public void testInvalidEmail() {
		String email = "invalid.email.com";
		try {
			boolean result = EmailValidator.isValidEmail(email);
            fail("Expected an exception for an invalid email, but the method returned: " + result);

		} catch (InvalidEmailException  e) {
			assertEquals("Invalid email format: " + email, e.getMessage());
		}
	}

}
