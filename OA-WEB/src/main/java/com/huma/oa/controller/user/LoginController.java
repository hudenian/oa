package com.huma.oa.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huma.oa.business.user.bean.User;
import com.huma.oa.business.user.service.UserService;


@Controller
@RequestMapping("/user")
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(User user,HttpServletRequest request){
		User resultUser=userService.login(user);
		if(null == resultUser){
			request.setAttribute("user", resultUser);
			request.setAttribute("errorMsg", "用户名密码错误！");
			return "index";
		}else{
			HttpSession session = request.getSession();
			session.setAttribute("currentUser", resultUser);
			return "redirect:/success.jsp";
		}
	}
	

}
