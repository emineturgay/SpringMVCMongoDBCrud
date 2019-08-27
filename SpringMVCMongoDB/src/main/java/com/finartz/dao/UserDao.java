package com.finartz.dao;

import java.util.List;
import com.finartz.model.User;

public interface UserDao {
	
    public List<User> listUser();
	
	public void add(User user);
	
	public void update(User user);
	
	public void delete(User user);
	
	public User findUserById(String id);

}
