package net.anigam.jmeter.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import net.anigam.jmeter.form.Issue;
import net.anigam.jmeter.service.IssueService;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.BASE64Encoder;

@Controller
public class IssueController {

	@Autowired
	@Qualifier("issueSer")
    private IssueService issueService;
 
    @RequestMapping("/showAll")
    public String listContacts(Map<String, Object> map) {
 
        map.put("issue", new Issue());
        map.put("issueList", issueService.listIssues());
        try {
            URL url = new URL ("https://provenir.atlassian.net/rest/api/latest/issue/CL-3030?expand=names,renderedFields");
            byte[] encoding = Base64.encodeBase64("abhishekni:amayani1!".getBytes());
            String authStringEnc = new String(encoding);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setRequestProperty  ("Authorization", "Basic " + authStringEnc);
            InputStream content = (InputStream)connection.getInputStream();
            BufferedReader in   = 
                new BufferedReader (new InputStreamReader (content));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
 
        return "issueList";
    }
 
    @RequestMapping(value = "/addIssue", method = RequestMethod.GET)
    public String addIssue(@ModelAttribute("issue")
    Issue issue, BindingResult result) {
        return "issue";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("issue")
    Issue issue, BindingResult result) {
 
    	issueService.addIssue(issue);
 
        return "redirect:/showAll";
    }
    
 
    @RequestMapping("/delete/{issueId}")
    public String deleteContact(@PathVariable("issueId")
    Integer issueId) {
 
    	issueService.removeIssue(issueId);
 
        return "redirect:/showAll";
    }

}
