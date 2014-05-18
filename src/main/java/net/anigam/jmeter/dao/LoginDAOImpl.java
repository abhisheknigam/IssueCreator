package net.anigam.jmeter.dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.anigam.jmeter.form.Login;

@Repository("loginDao")
public class LoginDAOImpl implements LoginDAO,BeanFactoryAware{

	@Autowired
    private SessionFactory sessionFactory;
	
	private BeanFactory beanFactory;
	
	public Login verifyLogin(Login login){
		/*Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM Login where username = :username and password = :password");
		query.setParameter("password", login.getPassword());
		query.setParameter("username", login.getUserName());
		List<Login> logins = (List<Login>)query.list();
		
		if(logins != null && logins.size() == 1){
			return logins.get(0);
		}*/
		//Login log = beanFactory.getBean(Login.class);
		Login log = new Login();
		log.setUserName("abhi");
		log.setPassword("pass");
		return log;
	}


	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
		
	}
}
