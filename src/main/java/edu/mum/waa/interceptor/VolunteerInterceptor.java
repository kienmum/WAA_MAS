package edu.mum.waa.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class VolunteerInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String userMessage = "Welcome to web security demo!";
		if(request.isUserInRole("ROLE_ADMIN")) {
			userMessage += " ROLE_ADMIN has extra 20% off!";
		} else if(request.isUserInRole("ROLE_USER")) {
			userMessage += " ROLE_USER has extra 10% off!";
		}
		request.setAttribute("userMessage", userMessage);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
