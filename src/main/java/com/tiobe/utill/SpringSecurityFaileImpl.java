package com.tiobe.utill;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

/**
* Title: SpringSecurityFaile
* Description: 
* Team: SSflow
* @author Ss
* @date 2017年2月9日
*
*/
public class SpringSecurityFaileImpl implements AuthenticationFailureHandler {

	@Override
	public void onAuthenticationFailure(HttpServletRequest paramHttpServletRequest,
			HttpServletResponse paramHttpServletResponse, AuthenticationException paramAuthenticationException)
					throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	}

}
