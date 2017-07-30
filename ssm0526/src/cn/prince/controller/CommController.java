package cn.prince.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommController {
	
	@RequestMapping("/{path}")
	public String path(@PathVariable(value="path") String path) {
		return path;
	}
}
