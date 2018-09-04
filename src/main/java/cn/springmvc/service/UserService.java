package cn.springmvc.service;



import java.util.List;

import cn.springmvc.model.User;

public interface UserService {
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
	/**
	 * 根据id更新用户
	 * @return
	 */
	public  int updateUser(User user);
	/**
	 * 根据id删除用户
	 * @param id
	 * @return
	 */
	public int deleteUserById(Integer id);
}
