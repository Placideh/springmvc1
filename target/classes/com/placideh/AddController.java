
package com.placideh;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request ,HttpServletRequest response) {
		int num1=Integer.parseInt(request.getParameter("t1"));
		int num2=Integer.parseInt(request.getParameter("t2"));
		AddService add=new AddService();
		
		int result=add.add(num1,num2);
		ModelAndView mv=new ModelAndView();
		mv.addObject("result",result);
		mv.setViewName("display.jsp");
		return mv;
	}
}
