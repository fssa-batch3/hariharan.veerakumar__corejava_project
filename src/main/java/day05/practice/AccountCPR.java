package day05.practice;

public class AccountCPR {
    String accNo;
    double balance;

    public AccountCPR(String accNo, double balance) {
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

    public static void main(String[] args) {
        AccountCPR axisAccount = new AccountCPR("AXIS123", 6000.0);
        AccountCPR iciciAccount = new AccountCPR("ICICI456", 12000.0);

        ATM axisATM = new AxisATM();
        ATM iciciATM = new IciciATM();

        // Deposit
        axisATM.deposit(axisAccount, 2000.0);
        iciciATM.deposit(iciciAccount, 3000.0);

        System.out.println("Axis Account Balance: " + axisAccount.getBalance());
        System.out.println("ICICI Account Balance: " + iciciAccount.getBalance());

        // Withdraw
        try {
            axisATM.withdraw(axisAccount, 500.0);
            iciciATM.withdraw(iciciAccount, 1000.0);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("Axis Account Balance: " + axisAccount.getBalance());
        System.out.println("ICICI Account Balance: " + iciciAccount.getBalance());
    }
}

	
abstract class ATM {
    public abstract boolean deposit(AccountCPR account, double amount);

    public abstract boolean withdraw(AccountCPR account, double amount) throws Exception;

    public abstract double getBalance();
}

class AxisATM extends ATM {
    private static final double withdrawal = 5.0;

    @Override
    public boolean deposit(AccountCPR account, double amount) {
        account.setBalance(account.getBalance() + amount);
        return true;
    }

    @Override
    public boolean withdraw(AccountCPR account, double amount) throws Exception {
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

class IciciATM extends ATM {
    private static final double withdrawal = 10.0;

    @Override
    public boolean deposit(AccountCPR account, double amount) {
        account.setBalance(account.getBalance() + amount);
        return true;
    }

    @Override
    public boolean withdraw(AccountCPR account, double amount) throws Exception {
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

