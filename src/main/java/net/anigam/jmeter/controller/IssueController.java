package net.anigam.jmeter.controller;

import java.util.Map;

import net.anigam.jmeter.form.Issue;
import net.anigam.jmeter.service.IssueService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IssueController {

	@Autowired
    private IssueService issueService;
 
    @RequestMapping("/index")
    public String listContacts(Map<String, Object> map) {
 
        map.put("issue", new Issue());
        map.put("issueList", issueService.listIssues());
 
        return "issue";
    }
 
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("issue")
    Issue issue, BindingResult result) {
 
    	issueService.addIssue(issue);
 
        return "redirect:/index";
    }
 
    @RequestMapping("/delete/{issueId}")
    public String deleteContact(@PathVariable("issueId")
    Integer issueId) {
 
    	issueService.removeIssue(issueId);
 
        return "redirect:/index";
    }
}
