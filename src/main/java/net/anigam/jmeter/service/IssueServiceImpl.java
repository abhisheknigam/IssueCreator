package net.anigam.jmeter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.anigam.jmeter.dao.IssueDAO;
import net.anigam.jmeter.dao.LoginDAO;
import net.anigam.jmeter.form.Issue;
import net.anigam.jmeter.form.Login;

@Service("issueSer")
public class IssueServiceImpl implements IssueService {
	
	@Autowired
	@Qualifier("issueDao")
    private IssueDAO issueDAO;
	
	
	
	@Transactional
	public void addIssue(Issue issue) {
		issueDAO.addIssue(issue);
		
	}

	@Transactional
	public List<Issue> listIssues() {
		return issueDAO.listIssues();
	}

	@Transactional
	public void removeIssue(Integer id) {
		issueDAO.removeIssue(id);
	}
	
	

}
