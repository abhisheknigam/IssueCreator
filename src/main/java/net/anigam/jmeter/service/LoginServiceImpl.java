package net.anigam.jmeter.service;

import net.anigam.jmeter.dao.LoginDAO;
import net.anigam.jmeter.form.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("loginSer")
public class LoginServiceImpl implements LoginService {

	@Autowired
	@Qualifier("loginDao")
    private LoginDAO loginDAO;
	
	@Transactional
	public Login verifyLogin(Login login){
		return loginDAO.verifyLogin(login);
	}
}
