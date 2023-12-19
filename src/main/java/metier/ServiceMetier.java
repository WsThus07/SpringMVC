package metier;

import java.util.List;

import dao.*;
import entities.Article;
import entities.Command;
import entities.Payment;
import entities.User;

public class ServiceMetier implements IServiceMetier {
    private ServiceDao dao;
	@Override
	public User getUserService(String login, String password) {
		// TODO Auto-generated method stub
		return dao.getUser(login, password);
	}

	@Override
	public boolean addUserMetier(User user) {
		// TODO Auto-generated method stub
		return dao.addUser(user);
	}

	@Override
	public boolean addArticleService(Article article) {
		// TODO Auto-generated method stub
		return dao.addArticle(article);
	}

	@Override
	public boolean addArticleCommandeService(Integer idCommande, Integer idArticle, Integer quantity) {
		// TODO Auto-generated method stub
		return dao.addArticleCommande(idCommande, idArticle, quantity);
	}

	@Override
	public boolean addPaymentService(Command command, Payment payment) {
		// TODO Auto-generated method stub
		return dao.addPayment(command, payment);
	}
	
	@Override
	public List<Article> getArticlesService() {
		// TODO Auto-generated method stub
		return dao.getArticles();
	}

	public ServiceDao getDao() {
		return dao;
	}

	public void setDao(ServiceDao dao) {
		this.dao = dao;
	}
	
	public boolean deleteArticleService(int idArticle) {
		return dao.deleteArticle(idArticle);
	}
}
