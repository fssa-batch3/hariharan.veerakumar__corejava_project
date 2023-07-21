package day10.practice;



class Email{
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

class EmailValidator {
	public static boolean isValidEmail(String email1) throws InvalidEmailException {
        if (email1 == null || !email1.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new InvalidEmailException("Invalid email format: " + email1);
        }
        return true;
	}
}

public class UsingCustomEmail {
	public static void main(String[] args) {
		String email1 = "hari@example.com";
        String email2 = "invalid.email.com";

        try {
            EmailValidator.isValidEmail(email1);
            System.out.println(email1 + " is a valid email.");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }

        try {
            EmailValidator.isValidEmail(email2);
            System.out.println(email2 + " is a valid email.");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
	}

}
