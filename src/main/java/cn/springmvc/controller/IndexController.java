package cn.springmvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.springmvc.service.UserService;

@Controller
public class IndexController {
	
	@Autowired
	private UserService userService;
   @RequestMapping("/index")
   public String index(){
	   return "index";
   }
  
}
