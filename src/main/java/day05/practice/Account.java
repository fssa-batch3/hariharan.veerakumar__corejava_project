package day05.practice;

public class Account {
String accNo;
double balance;
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
	Account acc = new Account();
	acc.setAccNo("Acc01");
	System.out.println(acc.getAccNo());
}
}

 interface ATM {
    boolean deposit(Account account, double amount);
    boolean withdraw(Account account,double amount) throws Exception;
    double getBalance();
}