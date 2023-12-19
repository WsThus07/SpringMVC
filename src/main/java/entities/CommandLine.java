package entities;

import java.util.*;

public class CommandLine {
private Integer idCommandLine;
private Integer quantity;
private Command command;
private Article article= new Article();
public CommandLine() {
	super();
	// TODO Auto-generated constructor stub
}
public CommandLine(Integer idCommandLine, Integer quantity, Command command, Article article) {
	super();
	this.idCommandLine = idCommandLine;
	this.quantity = quantity;
	this.command = command;
	this.article = article;
}
public Integer getIdCommandLine() {
	return idCommandLine;
}
public void setIdCommandLine(Integer idCommandLine) {
	this.idCommandLine = idCommandLine;
}
public Integer getQuantity() {
	return quantity;
}
public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}
public Command getCommand() {
	return command;
}
public void setCommand(Command command) {
	this.command = command;
}
public Article getArticle() {
	return article;
}
public void setArticle(Article article) {
	this.article = article;
}


}
