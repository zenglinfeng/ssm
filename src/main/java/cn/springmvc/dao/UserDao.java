package cn.springmvc.dao;

import java.util.List;

import cn.springmvc.model.User;

public interface UserDao {
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
  public int insertUser(User user);
  /**
   * 根据id查找用户
   * @param id
   * @return
   */
  public User findUserById(Integer id);
  
  public List<User> findAll();
  
  public int updateUser(User user);
  
  public int  deleteUserByid(Integer id);
}
