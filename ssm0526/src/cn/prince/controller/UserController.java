package cn.prince.controller;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.Gson;

import cn.prince.common.Md5Util;
import cn.prince.pojo.User;
import cn.prince.service.UserService;

@Controller
public class UserController {
	@Resource
	UserService userService;
	
	
	
	@RequestMapping("login")
	@ResponseBody
	public String login(User user, HttpServletRequest request) {
		Map map = new HashMap();
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		String code = request.getParameter("code");
		String password = Md5Util.GetMD5(pwd);
		String code1 = (String) request.getSession().getAttribute("code");
		System.out.println("+++++++++++++++++++"+code1);
		user.setUsername(name);
		user.setPassword(password);
		System.out.println(name+"---"+password+"----"+code);
		User u = userService.login(user);
		request.getSession().setAttribute("user", u);
		if(code.equalsIgnoreCase(code1) &&u != null) {
			map.put("flag", "ok");
		}else {
			map.put("flag", "ng");
		}
		
		Gson gson = new Gson();
		String json = gson.toJson(map);
		System.out.println(json);
		return json;
		
	}
	
	
}
