package entities;

import java.sql.Date;
import java.util.Objects;

public class Payment {
private Integer idPayment;
private float amount;
private Date paymentDate;
private Command command;
public Payment() {}
public Payment(Integer idPayment, float amount, Date paymentDate, Command cmd) {
	super();
	idPayment = idPayment;
	this.amount = amount;
	this.paymentDate = paymentDate;
	this.command = cmd;
}
public Integer getIdPayment() {
	return idPayment;
}
public void setIdPayment(Integer idPayment) {
	idPayment = idPayment;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
public Date getPaymentDate() {
	return paymentDate;
}
public void setPaymentDate(Date paymentDate) {
	this.paymentDate = paymentDate;
}
public Command getCmd() {
	return command;
}
public void setCmd(Command cmd) {
	this.command = cmd;
}
@Override
public String toString() {
	return "Payment [IdPayment=" + idPayment + ", amount=" + amount + ", paymentDate=" + paymentDate + ", command="
			+ command + "]";
}
@Override
public int hashCode() {
	return Objects.hash(idPayment, amount, command, paymentDate);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Payment other = (Payment) obj;
	return Objects.equals(idPayment, other.idPayment)
			&& Float.floatToIntBits(amount) == Float.floatToIntBits(other.amount)
			&& Objects.equals(command, other.command) && Objects.equals(paymentDate, other.paymentDate);
}


}
