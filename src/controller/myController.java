package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//控制器


import domain.user;
@Controller
public class myController {
	@RequestMapping("/login")
	public String login(user use,Model model,HttpServletRequest request)
	{
		
		//session只能通过request获取，这里注意session的顺序
		HttpSession hs=request.getSession();	
		//利用Model设置其他属性
		model.addAttribute("");
		//利用controller控制方法
		System.out.println(use.getUserName());
		return "success.jsp";
	}
	@RequestMapping("/loginServlet")
	public String loginServlet()
	{
		return "success.jsp";
	}
}
