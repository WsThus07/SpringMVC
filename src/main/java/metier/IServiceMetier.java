package metier;

import java.util.List;

import entities.Article;
import entities.Command;
import entities.Payment;
import entities.User;

public interface IServiceMetier {
	public User getUserService(String login, String password);
	public boolean addUserMetier(User user);
	public boolean addArticleService(Article article);
	public boolean addArticleCommandeService(Integer idCommande, Integer idArticle, Integer quantity);
	public boolean addPaymentService(Command command,Payment payment);
	public List<Article> getArticlesService();
	public boolean deleteArticleService(int idArticle);
}
