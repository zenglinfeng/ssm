package cn.springmvc.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.springmvc.model.User;
import cn.springmvc.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	private static final Logger log= Logger.getLogger(UserController.class);
  @Autowired 
  UserService userService ;
  
  /*@ModelAttribute
  public User findUser(@RequestParam(value="id",required=false) Integer id){
	  return userService.findUserById(id);
  }*/
  @RequestMapping(value="/list",method=RequestMethod.GET )
  public String getAll ( Map<String ,Object> map){
	  List<User> users = userService.findAll();
	  map.put("users", users);
	  return "users";
  }
  @RequestMapping( value = "/add" )
  public String input(Map<String,Object> map){
	  User user = new User();
	  map.put("user", user);
	  return "input";
  }
  @RequestMapping(value= "/save" ,method = RequestMethod.POST)
  public String save (User user,Map<String, Object> map){
	  if(user.getNickname() != null ){
	  userService.insertUser(user);
	  }else{
		  map.put("user", user);
		  return "add";
	  }
	  return "redirect:/user/list";
  }
  
  @RequestMapping(value ="/edit/{id}",method= RequestMethod.GET)

  public String editUser(@PathVariable ("id") Integer id ,Model model){
	  User user = userService.findUserById(id);
	  log.info("*****edit UserInfo,nickname："+user.getNickname());
	  model.addAttribute("user", user);
	  return "detail" ;
  }
  @RequestMapping(value= "/update/{id}",method=RequestMethod.PUT)
  public String update(@PathVariable ("id") Integer id,HttpServletRequest request ,HttpServletResponse response){
	  User user = userService.findUserById(id);
	  Integer state= Integer.parseInt(request.getParameter("state"));
	  String nickname = request.getParameter("nickname");
	  user.setNickname(nickname);
	  user.setState(state);
	  System.out.println(user.toString());
	  userService.updateUser(user);
	  return "redirect:/user/list";
  }
  @RequestMapping("delete/{id}")
  public String delete(@PathVariable ("id")Integer id){
	  User user = userService.findUserById(id);
	  userService.deleteUserById(id);	  
	  log.info("***** delete userInfo*****usernaem："+user.getNickname());
	  return "redirect:/user/list";
  }
}
