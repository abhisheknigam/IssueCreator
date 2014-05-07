package net.anigam.jmeter.dao;

import java.util.List;

import net.anigam.jmeter.form.Issue;

public interface IssueDAO {

	public void addIssue(Issue issue);
    public List<Issue> listIssues();
    public void removeIssue(Integer id);
    
}
