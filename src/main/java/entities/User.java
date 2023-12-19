package entities;

import java.util.*;

public class User {
private Integer idUser;
private String login;
private String password;
private Integer connectionNumber;
private Set<Command> commandes= new HashSet<Command>();
public User() {}
public User(Integer idUser, String login, String password, Integer connectionNumber) {
	super();
	this.idUser = idUser;
	this.login = login;
	this.password = password;
	this.connectionNumber = connectionNumber;
}
public Integer getIdUser() {
	return idUser;
}
public void setIdUser(Integer idUser) {
	this.idUser = idUser;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Integer getConnectionNumber() {
	return connectionNumber;
}
public void setConnectionNumber(Integer connectionNumber) {
	this.connectionNumber = connectionNumber;
}
public Set<Command> getCommandes() {
	return commandes;
}
public void setCommandes(Set<Command> commandes) {
	this.commandes = commandes;
}


}
