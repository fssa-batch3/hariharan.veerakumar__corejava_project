package day05.practice;

public class Account {
String accNo;
double balance;

public Account(String accNo, double balance) {
    this.accNo = accNo;
    this.balance = balance;
}

public String getAccNo() {
	return accNo;
}
public void setAccNo(String accNo) {
	this.accNo = accNo;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

Account axisAccount = new Account("AXIS123", 6000.0);
Account iciciAccount = new Account("ICICI456", 12000.0);

ATM axisATM = new AxisATM();
ATM iciciATM = new IciciATM();

//// Deposit
//axisATM.deposit("axisAccount", 2000.0);
//iciciATM.deposit(iciciAccount, 3000.0);
//
//System.out.println("Axis Account Balance: " + axisAccount.getBalance());
//System.out.println("ICICI Account Balance: " + iciciAccount.getBalance());
//
//// Withdraw
//try {
//    axisATM.withdraw(axisAccount, 500.0);
//    iciciATM.withdraw(iciciAccount, 1000.0);
//} catch (Exception e) {
//    System.out.println("Exception occurred: " + e.getMessage());
//}
//
//System.out.println("Axis Account Balance: " + axisAccount.getBalance());
//System.out.println("ICICI Account Balance: " + iciciAccount.getBalance());

}

 interface ATM {
	 
    boolean deposit(Account account, double amount);
    boolean withdraw(Account account,double amount) throws Exception;
    double getBalance();
}
 
 class AxisATM implements ATM {
	    private static final double withdrawal = 5.0;

	    @Override
	    public boolean deposit(Account account, double amount) {
	        account.setBalance(account.getBalance() + amount);
	        return true;
	    }

	    @Override
	    public boolean withdraw(Account account, double amount) throws Exception {
	        if (account.getBalance() < 5000) {
	            throw new Exception("Insufficient balance");
	        }
	        double totalAmount = amount + withdrawal;
	        if (totalAmount <= account.getBalance()) {
	            account.setBalance(account.getBalance() - totalAmount);
	            return true;
	        }
	        return false;
	    }

	    @Override
	    public double getBalance() {
	        return 0;
	    }
	}
 class IciciATM implements ATM {
	    private static final double withdrawal = 10.0;

	    @Override
	    public boolean deposit(Account account, double amount) {
	        account.setBalance(account.getBalance() + amount);
	        return true;
	    }

	    @Override
	    public boolean withdraw(Account account, double amount) throws Exception {
	        if (account.getBalance() < 10000) {
	            throw new Exception("Insufficient balance");
	        }
	        double totalAmount = amount + withdrawal;
	        if (totalAmount <= account.getBalance()) {
	            account.setBalance(account.getBalance() - totalAmount);
	            return true;
	        }
	        return false;
	    }

	    @Override
	    public double getBalance() {
	        return 0;
	    }
	}
 
 