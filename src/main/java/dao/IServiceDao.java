package dao;

import entities.*;
import java.lang.*;
import java.util.List;

public interface IServiceDao {
public User getUser(String login, String password);
public boolean addUser(User user);
public boolean addArticle(Article article);
public boolean addArticleCommande(Integer idCommande, Integer idArticle, Integer quantity);
public boolean addPayment(Command command,Payment payment);
public List<Article> getArticles();
public boolean deleteArticle(int idArticle);

}
