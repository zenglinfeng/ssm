package cn.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.UserDao;
import cn.springmvc.model.User;
import cn.springmvc.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    
	@Autowired
	public UserDao userDao;
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}
	public User findUserById(Integer id) {
		
		return userDao.findUserById(id);
	}
	public int updateUser(User user) {
		
		return userDao.updateUser(user);
	}
	public int deleteUserById(Integer id) {
		
		return userDao.deleteUserByid(id);
	}
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}
