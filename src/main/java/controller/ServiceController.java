package controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import entities.*;
import metier.*;

@Controller
public class ServiceController {
	@Autowired 
    private IServiceMetier service;
	
	@RequestMapping(value="/")
	public String accueil(Model m,HttpSession session) {
		User user_session=(User) session.getAttribute("user");
		if(user_session!=null) {
			 m.addAttribute("login", user_session.getLogin());
			m.addAttribute("listeArticles",service.getArticlesService());
			return "redirect:/home";
		}
		//m.addAttribute("error","erreur");
		return "login";
		}
	
	@RequestMapping(value="/login")
	public String login(Model m,HttpSession session,String login,String password) {
		User user_session=(User) session.getAttribute("user");
		if(user_session!=null) {
			session.setAttribute("user", user_session);
			m.addAttribute("login",user_session.getLogin());

			m.addAttribute("login",service.getUserService(login, password));
			m.addAttribute("listeArticles",service.getArticlesService());
			return "redirect:/home";
		}
		
		User user =service.getUserService(login, password);
		if (user!=null) {
			session.setAttribute("user", user);
			m.addAttribute("login",user.getLogin());
			//m.addAttribute("login",service.getUserService(login, password));
			m.addAttribute("listeArticles",service.getArticlesService());
			return "redirect:/home";
		}else {
			//session.setAttribute("user", null);
		m.addAttribute("error","Login n'existe pas!");
		return "login";
		   }
		}
	@RequestMapping (value="/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:/";
	}
	
	@RequestMapping (value="/home")
	public String home(Model m,HttpSession session) {
		User user=(User)session.getAttribute("user");
		if (user==null) {
			return "redirect:/login";
		}
	    m.addAttribute("login",user.getLogin());
	    m.addAttribute("listeArticles",service.getArticlesService());
	    return "index";
	}
	
	@RequestMapping (value="/addArticle", method = RequestMethod.POST)
	public String addArticle(HttpSession session,Model m,
		@RequestParam String description,@RequestParam  float price,@RequestParam  String brand) {
		User user=(User) session.getAttribute("user");
		Article article= new Article(); 
		article.setDescription(description);
		article.setPrice(price);
		article.setBrand(brand);
	    service.addArticleService(article);
	    m.addAttribute("login", user.getLogin());
	    m.addAttribute("listeArticles",service.getArticlesService());
	    return "redirect:/home";
	}
	
	
	@RequestMapping (value="/articles/delete")
	public String deleteArticle(Model m,@RequestParam int code,HttpSession session) {
		// Retrieve user from the session
	    User user = (User) session.getAttribute("user");

	    // Check if the user is logged in
	    if (user == null) {
	        return "redirect:/login";
	    }
	    m.addAttribute("login", user.getLogin());
		m.addAttribute("listeArticles",service.getArticlesService());
		service.deleteArticleService(code);
		return "redirect:/home";
	}
	
}
