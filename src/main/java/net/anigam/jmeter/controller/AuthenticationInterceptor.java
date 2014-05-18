package net.anigam.jmeter.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.anigam.jmeter.form.Login;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class AuthenticationInterceptor extends HandlerInterceptorAdapter
{
 @Override
 public boolean preHandle(HttpServletRequest request,
   HttpServletResponse response, Object handler) throws Exception
 {
  String uri = request.getRequestURI();
  if(!uri.endsWith("login.html") && !uri.endsWith("logout.html") && !uri.endsWith("index") && !uri.endsWith("index.html"))
  {
   Login userData = (Login) request.getSession().getAttribute("user");
   if(userData == null)
   {
    response.sendRedirect("index");
    return false;
   }   
  }
  return true;
 }
}
