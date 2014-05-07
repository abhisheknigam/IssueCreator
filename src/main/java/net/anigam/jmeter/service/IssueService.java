package net.anigam.jmeter.service;

import java.util.List;

import net.anigam.jmeter.form.Issue;

public interface IssueService {

	
	public void addIssue(Issue issue);
    public List<Issue> listIssues();
    public void removeIssue(Integer id);
}
