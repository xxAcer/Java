package cn.prince.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.prince.pojo.Menu;
import cn.prince.pojo.User;
import cn.prince.service.MenuService;

@Controller
public class MenuController {
	
	@Resource
	MenuService menuService;
	
	@RequestMapping("index")
	public String index(User user, HttpServletRequest request) {
		User u = (User) request.getSession().getAttribute("user");
		int id = u.getUserid();
		
		List<Menu> menus = menuService.findMenuById(id);
		System.out.println(menus);
		request.setAttribute("menus", menus);
		return "index";
		
	}
	
}
