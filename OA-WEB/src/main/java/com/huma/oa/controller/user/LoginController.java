package com.huma.oa.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {
	
//	@Autowired
//	private UserService userService;
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response,Model model){
		ModelAndView mv = new ModelAndView("/login");
		return mv;
	}
//	public String login(User user,HttpServletRequest request){
//		User resultUser=userService.login(user);
//		if(null == resultUser){
//			request.setAttribute("user", resultUser);
//			request.setAttribute("errorMsg", "用户名密码错误！");
//			return "index";
//		}else{
//			HttpSession session = request.getSession();
//			session.setAttribute("currentUser", resultUser);
//			return "redirect:/success.jsp";
//		}
//	}
	

}
