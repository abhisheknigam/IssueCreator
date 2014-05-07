package net.anigam.jmeter.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.anigam.jmeter.form.Issue;

@Repository
public class IssueDAOImpl implements IssueDAO	 {

	@Autowired
    private SessionFactory sessionFactory;
	
	public void addIssue(Issue issue) {
		sessionFactory.getCurrentSession().save(issue);
		
	}

	public List<Issue> listIssues() {
		return sessionFactory.getCurrentSession().createQuery("from Contact")
                .list();
	}

	public void removeIssue(Integer id) {
		Issue issue = (Issue) sessionFactory.getCurrentSession().load(
				Issue.class, id);
        if (null != issue) {
            sessionFactory.getCurrentSession().delete(issue);
        }
 
		
	}

}
