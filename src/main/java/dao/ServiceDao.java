package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.HibernateUtil;
import entities.*;



public class ServiceDao implements IServiceDao {

	@Override
	public User getUser(String login, String password) {
		try {
			
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query=session.createQuery("from User where login= :login and password= :password");
		query.setParameter("login", login);
		query.setParameter("password", password);
		return (User) query.uniqueResult();
		}catch(Exception e){
			System.out.println("MEssage: "+e.getMessage());
		}
		return null;
	}

	@Override
	public boolean addUser(User user) {
		try {
			Session session=HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			return true;
		}catch(Exception e) {
			System.out.println("message: "+e.getMessage());
		}
		return false;
	}

	@Override
	public boolean addArticle(Article article) {
		try {
			   	Session session=HibernateUtil.getSessionFactory().getCurrentSession();
			   	session.beginTransaction();
		        session.save(article);
		        session.getTransaction().commit();
		        return true;
		    } catch (Exception e) {
		        e.printStackTrace(); // Log or handle the exception as needed
		        }
		return false;
	}

	@Override
	public boolean addArticleCommande(Integer idCommande, Integer idArticle, Integer quantity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addPayment(Command command, Payment payment) {
		try {
		   	Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		   	session.beginTransaction();
	        session.save(payment);
	        session.getTransaction().commit();
	        return true;
	    } catch (Exception e) {
	        e.printStackTrace(); // Log or handle the exception as needed
	        }
	return false;
	
	} 
	@Override
	public List<Article> getArticles() {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query q=session.createQuery("from Article");
		List<Article> articles =q.list();
		return articles;	
		
	}
	
	@Override
	public boolean deleteArticle(int idArticle) {
		try{Session session=HibernateUtil.getSessionFactory().getCurrentSession();
	    session.beginTransaction();
	    Article a = (Article) session.load(Article.class, idArticle);
	    session.delete(a);  
	    session.getTransaction().commit();
		return true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		return false;
	}
	 

}
