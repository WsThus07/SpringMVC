package entities;

public class PaypalPayment extends Payment {
private String accountNumber;
public PaypalPayment() {}
public PaypalPayment(String accountNumber) {
	super();
	this.accountNumber = accountNumber;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}

}
