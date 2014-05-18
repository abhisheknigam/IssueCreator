package net.anigam.jmeter.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.anigam.jmeter.form.Login;
import net.anigam.jmeter.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({ "user" })
public class LoginController {

	@Autowired
	@Qualifier("loginSer")
	private LoginService loginService;
	
	 @RequestMapping(value = "/login", method = RequestMethod.POST)
	    public String addContact(@ModelAttribute("login")
	    Login login, BindingResult result, Model m,HttpServletResponse response, HttpServletRequest request) {
		 String val=request.getParameter("remember_me");
		 Login log = loginService.verifyLogin(login);
		 
		 if(log == null){
			 m.addAttribute("msg","Invalid Credentials");
			 return "../../index";
		 }
		 m.addAttribute("user", log);
		 request.getSession().setAttribute("user", log);
			if (val != null) {
				if (val.equals("1")) {
					Cookie my_cook = new Cookie("name",login.getUserName());
					my_cook.setMaxAge(30 * 60);
					response.addCookie(my_cook);
					System.out.println(my_cook.getValue());

				}
			}
	        return "redirect:/showAll";
	    }
	 
	 @RequestMapping("/index")
	    public String homePage(@ModelAttribute("login")
	    Login login, BindingResult result) {
	        return "login";
	    }
}
