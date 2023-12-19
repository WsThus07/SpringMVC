package entities;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class Command {
private Integer idCommand;
private Date commandDate;
private User user ;
private Payment payment;
private Set<CommandLine> cmdLines= new HashSet<CommandLine>();
public Command() {}
public Command(Integer idcommand, Date commandDate, User user, Set<CommandLine> cmdLines) {
	super();
	this.idCommand = idcommand;
	this.commandDate = commandDate;
	this.user = user;
	this.cmdLines = cmdLines;
}
public Integer getIdCommand() {
	return idCommand;
}
public void setIdCommand(Integer idCommand) {
	this.idCommand = idCommand;
}
public Date getCommandDate() {
	return commandDate;
}
public void setCommandDate(Date commandDate) {
	this.commandDate = commandDate;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Payment getPayment() {
	return payment;
}
public void setPayment(Payment payment) {
	this.payment = payment;
}
public Set<CommandLine> getCmdLines() {
	return cmdLines;
}
public void setCmdLines(Set<CommandLine> cmdLines) {
	this.cmdLines = cmdLines;
}


}

