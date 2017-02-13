package com.tiobe.utill;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
* Title: SpringSecuritySuccess
* Description: 
* Team: SSflow
* @author Ss
* @date 2017年2月9日
*
*/
public class SpringSecuritySuccessImpl implements AuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest paramHttpServletRequest,
			HttpServletResponse paramHttpServletResponse, Authentication paramAuthentication)
					throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	}

}
